
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class ProductHQLUpdate {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		
		Query qry=session.createQuery("update Product p set p.proName=? where p.proId=101");
		qry.setParameter(0, "Android");
		int res=qry.executeUpdate();
		System.out.println("record affected "+res);
		session.close();
		factory.close();

	}

}
