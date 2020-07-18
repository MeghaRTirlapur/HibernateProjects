package com.mphasis.training;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

//import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Department;
import com.mphasis.training.entities.Employee;
import com.mphasis.training.entities.Job;
import com.mphasis.training.entities.Location;
//import com.mphasis.training.entities.SavingsAccount;
import com.mphasis.training.util.HibernateUtil;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
    	     
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//    	Location l=new Location();
//    	l.setLcode("11");
//    	l.setLname("Bangalore");
//    	
//    	Job j=new Job();
//    	j.setJcode(21);
//    	j.setJname("trainee");
    	
//    	Job j1=new Job();
//    	j1.setJcode(22);
//    	j1.setJname("manager");
//    	
//    	Job j2=new Job();
//    	j1.setJcode(23);
//    	j1.setJname("manager");
    	
//    	
//    	Department d=new Department();
//    	d.setDcode(31);
//    	d.setDname("sales");
//    	d.getLoc().setLcode("11");
    	
//    	Department d1=new Department();
//    	d1.setDcode(32);
//    	d1.setDname("Finance");
//    	d1.getLoc().setLcode("11");
//   	
//    	
    	Employee e=new Employee();
    	e.setEid(41);
    	e.setEname("avishkaar");
    	e.setDoj(new Date(2019-11-11));
    	e.setBonus(1000);
    	e.setSalary(50000);
    	e.setManager(e);
    	e.getDep().setDcode(31);
    	e.getJobs().setJcode(22);
    	
    	Employee e1=new Employee();
    	e1.setEid(42);
    	e1.setEname("aarya");
    	e1.setDoj(new Date(2018-02-01));
    	e1.setBonus(2000);
    	e1.setSalary(65000);
    	e1.setManager(e1);
    	e1.getDep().setDcode(32);
    	e1.getJobs().setJcode(23);
    	
    	Employee e2=new Employee();
    	e2.setEid(44);
    	e2.setEname("anjali");
    	e2.setDoj(new Date(2029-12-01));
    	e2.setBonus(1000);
    	e2.setSalary(30000);
    	e2.setManager(e1);
    	e2.getDep().setDcode(32);
    	e2.getJobs().setJcode(23);
    	
    	Employee e3=new Employee();
    	e3.setEid(45);
    	e3.setEname("maanvi");
    	e3.setBonus(1000);
    	e3.setSalary(34000);
    	e3.setManager(e);
    	e3.getDep().setDcode(31);
    	e3.getJobs().setJcode(22);
    	
    	
    	
  	
    	


	    
	    Session sn=sessionFactory.openSession();
	    sn.beginTransaction();
//	    sn.save(l);
//	    sn.save(d1);
//	    sn.save(j1);
//	    sn.save(j2);
	     sn.save(e);
	     sn.save(e1);
	     sn.save(e2);
	     sn.save(e3);
	     
	    sn.getTransaction().commit();
	    sn.close();
//	    
//	    Session session1=sessionFactory.openSession();
//	    
//	    Query query=session1.createQuery("FROM Employee WHERE eid=:eid");
//   	query.setInteger("eid", 42);
//    Employee ee=(Employee) query.uniqueResult();
//    System.out.println(ee);
//    
//	    session1.close();
//    	
//    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//    	Session session=sessionFactory.openSession();
//    	List<Account> accounts=session.createCriteria(Account.class).list();
//    	for(Account a:accounts) {
//    		System.out.println(a.getAcc_holder_name()+" "+a.getAccnum()+" "+a.getBalance());
//    	}
//    	session.close();
//    	
//    	//HQL from 
//    	Session session1=sessionFactory.openSession();
//    	Query query=session1.createQuery("FROM Account");
//    	query.list().forEach(System.out::println);
//    	
//    	//HQL
//    	Query query1=session1.createQuery("SELECT a.accnum FROM Account a");
//    	query1.list().forEach(System.out::println);
//    	
//    	Query query2=session1.createQuery("FROM Account A WHERE A.accnum=:acc");
//    	query2.setParameter("acc", 123);
//    Account ac=(Account) query2.uniqueResult();
//    System.out.println(ac);
//    	//hql
//     	session1.beginTransaction();
//    	Query qd=session1.createQuery("DELETE FROM Account WHERE accnum=:acc");
//    	qd.setParameter("acc", 123);
//    	qd.executeUpdate();
//    	session1.getTransaction().commit();
//    	System.out.println("deleted");
//    	
//    	session1.close();
//    	
//    	//sql
//    	Session session2=sessionFactory.openSession();
//    	SQLQuery sqlQuery=session2.createSQLQuery("select acc_holder_name,acc_num from account");
//    	List<Object[]> objs=sqlQuery.list();
//    	for(Object[] row:objs) {
//    		Account a=new Account();
//    		a.setAcc_holder_name(row[0].toString());
//    		a.setAccnum(Integer.parseInt(row[1].toString()));
//    		System.out.println(a.getAcc_holder_name()+" "+a.getAccnum());
//    		
//    	}
//    	session2.close();
//    		
//    
    	}
    }

