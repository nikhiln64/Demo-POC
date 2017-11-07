
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class ProductHQL {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		
		/* selecting all object(records)START-------*/
		
		/*Query qry=session.createQuery("from Product p");
		List l=qry.list();
		System.out.println("total size is :"+l.size());
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			Object o=(Object)itr.next();
			Product p=(Product)o;
			System.out.println("Product Id :"+p.getProId());
			System.out.println("Product Name :"+p.getProName());
			System.out.println("Product price :"+p.getPrice());
		}*/
		
		/* selecting all object(records)END------- */
		
		System.out.println("-----------------------------------");
		
		/* selecting partial object(more than one object)START-------*/
		
		/*Query qry=session.createQuery("select p.proId,p.proName from Product p");
		List l=qry.list();
		System.out.println("total size is :"+l.size());
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			Object o[]=(Object[])itr.next();
			System.out.println("Product ID :"+o[0]);
			System.out.println("Product Name :"+o[1]);
		}*/
		
		
		/* selecting all object(more than one object)END------- */
		System.out.println("-----------------------------------");
		
		/* selecting partial object( one object)START-------*/
		Query qry=session.createQuery("select p.price from Product p");
		List l=qry.list();
		System.out.println("total size is :"+l.size());
		Iterator itr=l.iterator();
		
		while(itr.hasNext()){
			Double i=(Double)itr.next();
			System.out.println("Product Price :"+i.doubleValue());
		}
		
		
		/* selecting partial object( one object)START-------*/
		
		session.close();
		factory.close();

	}

}
