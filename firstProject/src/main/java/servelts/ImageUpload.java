package servelts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import DAO.ImagesDAO;
import entities.UploadImages;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;

@WebServlet("/ImageUpload")
public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//path dove le immagini vengono storate (locale per il momento)
	public String path = "c:/images/";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Prende parametri dai files jsp, action del form, richiama il metodo corrispondente
		String action = request.getParameter("action");
		
		switch(action) {
		//ImageUpload.java action del form
		case "filesUpload":
			filesUpload(request, response);
			break;
		case "updateInformation":
			updateInformation(request, response);
			break;
		//upload.java action del form
		/*case "listingImages":
			listingImages(request, response);
			break;*/
		default:
			//in caso action sia vuota, reindirizza alla pagina di upload (index)
			request.getRequestDispatcher("upload.jsp").forward(request, response);;
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Prende parametri dai files jsp, action del form, richiama il metodo corrispondente
		String action = request.getParameter("action");
		
		switch(action) {
		//ImageUpload.java action del form
		/*case "filesUpload":
			filesUpload(request, response);
			break;*/
		//upload.java action del form
		case "listingImages":
			listingImages(request, response);
			break;
		default:
			request.getRequestDispatcher("upload.jsp").forward(request, response);;
		}
	}
	
	private void updateInformation(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int fileId = Integer.parseInt(request.getParameter("fileId"));
		String label = request.getParameter("label");
		String caption = request.getParameter("caption");
		
		UploadImages image = new UploadImages(fileId, label, caption);
		new ImagesDAO().updateInformation(image);
		listingImages(request, response);
	}

	private void listingImages(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//richiama metodo da ImagesDAO per query
		List <UploadImages> images = new ImagesDAO().listFiles();
		//setta attributi
		request.setAttribute("images", images);
		request.setAttribute("path", path);
		//reindirizza a pagina listImages
		request.getRequestDispatcher("listImages.jsp").forward(request, response);
	}

	public void filesUpload (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//metodo che uploada i files, copiandoli nel path selezionato
		//up multiplo consentito
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
	      try {
			List<FileItem> images = upload.parseRequest(request);
			for(FileItem image: images) {
				String name = image.getName();
				try{name = name.substring(name.lastIndexOf("\\")+1);
				} catch(Exception e) {
					System.err.println(e);
				}
				System.out.println(name);
				File file = new File (path+name);
				if(!file.exists()) {
					new ImagesDAO().addFileDetails(new UploadImages(name));
					image.write(file);
				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	    listingImages(request, response);
	}
}
