
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class ProductHQLRuntimeValue {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		
		/* using label */
		
		//Query qry=session.createQuery("from Product p where p.proId=:java");
		//qry.setParameter("java", 100);
		
		/* using "?" */
		Query qry=session.createQuery("from Product p where p.proId=?");
		qry.setParameter(0, 100);
		
		List l=qry.list();
		System.out.println("Total Size :"+l.size());
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			Object o=(Object)itr.next();
			Product p=(Product)o;
			
			System.out.println("Product ID :"+p.getProId());
			System.out.println("Product Name : "+p.getProName());
			System.out.println("Product Price :"+p.getPrice());
		}
		
		session.close();
		factory.close();
	}

}
