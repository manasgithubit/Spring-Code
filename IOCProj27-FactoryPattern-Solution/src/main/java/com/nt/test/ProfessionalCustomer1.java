package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class ProfessionalCustomer1
{
 public static void main(String[] args)
 {
    //get Car obj using factory
       Car car = CarFactory.createCar("Luxory","OD10 kk 5656");
       car.drive();
       System.out.println("==========================");
 }
}
