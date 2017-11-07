import org.hibernate.*;
import org.hibernate.cfg.*;

public class UpdateObject {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		
		Object o=session.load(Product.class, new Integer(100));
		Product s=(Product)o;
		
		Transaction tx=session.beginTransaction();
		s.setPrice(30000);
		
		tx.commit();
		System.out.println("Object updated....");
		session.close();
		factory.close();

	}

}
