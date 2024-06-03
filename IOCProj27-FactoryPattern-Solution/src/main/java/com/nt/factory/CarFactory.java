package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;

public class CarFactory
{
 
    //Factory having factory pattern logic (Logic to create and return one of several releated classes obj) 
     public static  Car createCar(String type, String regNo)
     {
      if(type.equalsIgnoreCase("sports"))
           return new SportsCar(regNo);
      if(type.equalsIgnoreCase("Budget"))
          return new BudgetCar(regNo);
      if(type.equalsIgnoreCase("Luxory"))
          return new LuxoryCar(regNo);
      else
          throw new IllegalArgumentException("Invalid car type");
     }
}
