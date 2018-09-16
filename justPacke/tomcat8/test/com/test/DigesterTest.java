package com.test;

import org.apache.tomcat.util.digester.Digester;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class DigesterTest {
    public static void main(String[] args) throws Exception{
        String path = "E:\\workspace\\github\\tomcat8SourceCode\\justPacke\\tomcat8\\test\\com\\test\\";
        File file = new File(path, "emp.xml");

        Digester digester = new Digester();
        digester.setValidating(false);
        digester.setRulesValidation(true);
        digester.addObjectCreate("employee","com.test.Employee");
        /*digester.addSetProperties("employee");
       // digester.addSetNext("employee", "addOffices","");
        digester.addObjectCreate("employee/office","com.test.Office");
        digester.addSetProperties("employee/office");
        digester.addSetNext("employee/office", "addOffices","");
        digester.addObjectCreate("employee/office/address", "com.test.Address");
        digester.addSetProperties("employee/office/address");*/
        //digester.addCallMethod("employee", "toString");
        try {
            Employee e = (Employee) digester.parse(file);
            //System.out.println(e.getFirstName());
           // System.out.println(e.getLastName());
            System.out.println("employee:"+e.toString());
            ArrayList<Office> offices = e.getOffices();
            Iterator<Office> it = offices.iterator();
            while(it.hasNext()){
                Office o = it.next();
                System.out.println("\nOffice:"+o.toString());
                ArrayList<Address> adress = o.getAddress();
                Iterator<Address> it2 = adress.iterator();
                while(it2.hasNext()){
                    Address a =it2.next();
                    System.out.println("\nAddress:"+a.toString());
                    //System.out.println(a.getStreetName());
                   // System.out.println(a.getStreetNumber());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //digester.addCallMethod("employee", "toString");
        //digester.endDocument();
        /*
        Digester digester = new Digester();
        digester.addObjectCreate("employee", "com.test.Employee");
        digester.addSetProperties("employee");
        digester.addObjectCreate("employee/office", "com.test.Office");
        digester.addSetProperties("employee/office");
        digester.addSetNext("employee/office", "addOffices","");
        digester.addObjectCreate("employee/office/address", "com.test.Address");
        digester.addSetProperties("employee/office/address");
        digester.addSetNext("employee/office/address", "addAddress","");
//      digester.addCallMethod("employee", "toString");
        try {
            Employee e = (Employee) digester.parse(file);
            System.out.println(e.getFirstName());
            System.out.println(e.getLastName());
            System.out.println(e.toString());
            ArrayList<Office> offices = e.getOffices();
            Iterator<Office> it = offices.iterator();
            while(it.hasNext()){
                Office o = it.next();
                System.out.println(o.getName());
                ArrayList<Address> adress = o.getAddress();
                Iterator<Address> it2 = adress.iterator();
                while(it2.hasNext()){
                    Address a =it2.next();
                    System.out.println(a.getStreetName());
                    System.out.println(a.getStreetNumber());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }



}
