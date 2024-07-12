package com.nt.test;

import java.util.ArrayList;
import java.util.Date;

import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class AppTest 
{
   public <T> T showDetails(Class<T> clazz) throws Exception
   {
      return (T) clazz.getDeclaredConstructor(new Class[] {}).newInstance();
   }
   
   
   public <T extends Person> T showDetails1(Class<T> clazz) throws Exception
   {
      return (T) clazz.getDeclaredConstructor(new Class[] {}).newInstance();
   }
   
   public static void main(String[] args) throws Exception
   {
      AppTest app = new AppTest();
      Student st = app.showDetails(Student.class);
      System.out.println(st);
      System.out.println("==================");
      Employee emp = app.showDetails(Employee.class);
      System.out.println(emp);
      System.out.println("==================");
      ArrayList list = app.showDetails(ArrayList.class);
      System.out.println(list);
      System.out.println("==================");
      Date date = app.showDetails(Date.class);
      System.out.println(date);
      System.out.println("================================");
      
      AppTest app1 = new AppTest();
      Student st1 = app1.showDetails1(Student.class);
      System.out.println(st1);
      System.out.println("==================");
      Employee emp1 = app1.showDetails1(Employee.class);
      System.out.println(emp1);
      System.out.println("==================");
      ArrayList list1 = app1.showDetails(ArrayList.class);
      System.out.println(list1);
      System.out.println("==================");
      Date date1 = app1.showDetails(Date.class);
      System.out.println(date1);
   }
}
