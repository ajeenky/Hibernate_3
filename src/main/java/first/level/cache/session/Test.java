package first.level.cache.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();

		Student student = (Student) session.get(Student.class, 1);
		System.out.println(student.getId()+" "+student.getFirstName()+" "+student.getLastName());
		
		Student student1 = (Student) session.get(Student.class, 1);
		System.out.println(student1.getId()+" "+student1.getFirstName()+" "+student1.getLastName());
		
		session.close();
	}

}
