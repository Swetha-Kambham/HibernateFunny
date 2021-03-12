package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien alien=new Alien();
        alien.setName("Swetha");
        alien.setColor("White");
        alien.setId(1162);
        //
        Configuration con=new Configuration();
        con.configure().addAnnotatedClass(Alien.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();

        //If we wanna to Store the data

       Transaction tn=session.beginTransaction();

        session.save(alien);
       tn.commit();

    }
}
