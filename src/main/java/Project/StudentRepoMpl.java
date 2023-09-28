package Project;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StudentRepoMpl implements StudentRepo {

	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.config.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory sfactory=meta.buildSessionFactory();

	@Override
	public void deleteStudent(Student S) {
		// TODO Auto-generated method stub
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(S);
		transaction.commit();
		
	}

	@Override
	public void insertStudent(Student S) {
		// TODO Auto-generated method stub
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
	    session.save(S);
		transaction.commit();
		
	}

	@Override
	public void updateStudent(Student S) {
		// TODO Auto-generated method stub
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
	    session.save(S);
		transaction.commit();
		
	}

	@Override
	public void selectStudent() {
		Session session = sfactory.openSession();
		Query q = session.createQuery("from Student");
		List<Student> list = q.getResultList();
		Iterator<Student> i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		Query q1 = session.createQuery("select Sname from Student");
		List<Student> names = q1.getResultList();
		Iterator<Student> itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Query q2 = session.createQuery("select count(Sname) from Student");
		List<Integer> count = q1.getResultList();
		Iterator<Integer> itr1 = count.iterator();
			System.out.println("Records updated"+count);
			
		Query q3 = session.createQuery("select max(Fee) from Student");
		List<Integer> M = q3.getResultList();
		Iterator<Integer> itr2 = M.iterator();
		System.out.println("Maximum Fee of Student is "+M);
		
		
		Query q4 = session.createQuery("select min(Fee) from Student");
		List<Integer> m = q4.getResultList();
		Iterator<Integer> itr3 = m.iterator();
		System.out.println("Minimum Fee of Student is "+m);
		
		
		Query q5 = session.createQuery("select avg(Fee) from Student");
		List<Integer> Avg = q5.getResultList();
		Iterator<Integer> itr4 = Avg.iterator();
		System.out.println("Average Fee of sailors is "+Avg);
	}

	
		
	}


