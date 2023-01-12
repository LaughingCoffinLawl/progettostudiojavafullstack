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
	
	public void addFileDetails(UploadImages file) {
		Session session = myFactory.getCurrentSession();
		session.beginTransaction();
		session.save(file);
		session.getTransaction().commit();
		System.out.println(file.getFileName()+" Image got added!");
	}
	public List<UploadImages> listFiles() {
		Session mySession = myFactory.getCurrentSession();
		mySession.beginTransaction();
		@SuppressWarnings("unchecked")
		List<UploadImages> images = mySession.createQuery("from images_upload").getResultList();
		//mySession.getTransaction().commit();
		return images;
	}
}
