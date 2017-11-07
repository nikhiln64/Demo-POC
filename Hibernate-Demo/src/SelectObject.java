import org.hibernate.*;
import org.hibernate.cfg.*;

public class SelectObject {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		
		Object o=session.load(Product.class, new Integer(100));
		Product s=(Product)o;
		
		//transaction is not necessary
		System.out.println(s.getProName());
		System.out.println("Object loaded");
		session.close();
		factory.close();

	}

}
