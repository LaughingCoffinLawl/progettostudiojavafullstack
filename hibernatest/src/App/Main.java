package App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory myFactory = new Configuration()
								   .configure("hibernate.cfg.xml")
								   .addAnnotatedClass(Users.class)
								   .buildSessionFactory();
		
		Session mySession = myFactory.getCurrentSession();

		try {
			
			//CRATE A NEW ROW
			/*
			// Create object of entity class type
			Users myUser = new Users("test", "test");
			// Start transaction
			mySession.beginTransaction();
			// Perform operation
			mySession.save(myUser);		
			// Commit the transaction
			mySession.getTransaction().commit();
			*/
			
			//SELECT A ROW
			/*
			Users myUser = new Users();
			mySession.beginTransaction();
			myUser = mySession.get(Users.class, 2);
			mySession.getTransaction().commit();
			System.out.println(myUser);
			*/
			
			//UPDATE A ROW
			/*
			Users myUser = new Users();
			mySession.beginTransaction();
			myUser = mySession.get(Users.class, 2);
			myUser.setName("admin");
			mySession.getTransaction().commit();
			System.out.println(myUser);
			*/
			
			//DELETE A ROW
			Users myUser = new Users();
			mySession.beginTransaction();
			myUser = mySession.get(Users.class, 1);
			mySession.delete(myUser);
			mySession.getTransaction().commit();
			System.out.println(myUser);
			
		} finally {
			mySession.close();
			myFactory.close();
			System.out.println("Operation executed!");
		}	
	}
}
