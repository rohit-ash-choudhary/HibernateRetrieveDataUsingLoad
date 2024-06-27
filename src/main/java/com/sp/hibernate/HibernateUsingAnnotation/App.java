package com.sp.hibernate.HibernateUsingAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sp.beans.Account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        Configuration cfg= new Configuration();
        cfg.configure("/com/sp/resource/hibernate.cfg2.xml");
        
        
        SessionFactory sesionfact=cfg.buildSessionFactory();
        
        Session session=sesionfact.openSession();
       
        try {
        	
        	Account acc=session.load(Account.class, 1);
        	System.out.println(acc);
        	System.out.println("Accoout number :" + acc.getAccount_num());
        	System.out.println("First Name :" + acc.getFirst_name());
        	System.out.println("Last Name :" + acc.getLast_name());
        	//System.out.println("Accoout number :" + acc.getAccount_num());
        }
        catch(Exception e)
        {	
        	
        	e.printStackTrace();
        }
        finally {
        	
        	session.close();
        }
    }
}
