
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;


public class ProductHQLDelete {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		
		Query qry=session.createQuery("delete from Product p where p.proId=:java");
		qry.setParameter("java", 100);
		int res=qry.executeUpdate();
		System.out.println("Object deleted...");
		session.close();
		factory.close();

	}

}
