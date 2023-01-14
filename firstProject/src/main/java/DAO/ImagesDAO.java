package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entities.UploadImages;

public class ImagesDAO {
	SessionFactory myFactory = new Configuration()
							   .configure("hibernate.cfg.xml")
							   .addAnnotatedClass(UploadImages.class)
							   .buildSessionFactory();
	
	public void addFileDetails(UploadImages image) {
		//aggiunge i dettagli dei files nel DB
		Session session = myFactory.getCurrentSession();
		session.beginTransaction();
		session.save(image);
		session.getTransaction().commit();
		System.out.println(image.getFileName()+" Image got added!");
	}
	public List<UploadImages> listFiles() {
		//richiede la lista dei file inseriti a DB
		Session mySession = myFactory.getCurrentSession();
		mySession.beginTransaction();
		@SuppressWarnings("unchecked")
		List<UploadImages> images = mySession.createQuery("from images_upload").getResultList();
		//mySession.getTransaction().commit();
		return images;
	}
	
	/*public void updateInformation(UploadImages image) {
		Session session = myFactory.getCurrentSession();
		session.beginTransaction();
		session.update(image);
		session.getTransaction().commit();
	}*/
	
	public void updateInformation(int id, String label, String caption) {
		Session session = myFactory.getCurrentSession();
		session.beginTransaction();
		UploadImages image = session.get(UploadImages.class, id);
		image.setLabel(label);
		image.setCaption(caption);
		session.getTransaction().commit();
	}
	
	public UploadImages getFile(int fileId) {
		Session session = myFactory.getCurrentSession();
		session.beginTransaction();
		UploadImages image = session.get(UploadImages.class, fileId);
		session.getTransaction().commit();
		return image;
	}
	public void deleteFile(int fileId) {
		Session session = myFactory.getCurrentSession();
		session.beginTransaction();
		UploadImages image = session.get(UploadImages.class, fileId);
		session.delete(image);
		session.getTransaction().commit();
	}
	
}
