
import org.hibernate.*;
import org.hibernate.cfg.*;

public class InsertObject {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		
		Product p=new Product();
		p.setProId(100);
		p.setProName("iPhone");
		p.setPrice(25000);
		
		Transaction tx=session.beginTransaction();
		session.save(p);
		
		System.out.println("Object saved");
		tx.commit();
		session.close();
		factory.close();

	}

}
