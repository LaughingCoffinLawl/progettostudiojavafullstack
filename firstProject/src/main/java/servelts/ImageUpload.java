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
		//upload.java action del form
		/*case "listingImages":
			listingImages(request, response);
			break;*/
		default:
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
	
	private void listingImages(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		List <UploadImages> images = new ImagesDAO().listFiles();
		request.setAttribute("images", images);
		request.setAttribute("path", path);
		request.getRequestDispatcher("listImages.jsp").forward(request, response);
	}

	public void filesUpload (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
				listingImages(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
