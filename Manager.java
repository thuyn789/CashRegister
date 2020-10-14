import java.io.*;
import java.util.*;
/**
 * Author: Trung-Tin Huynh
 * Purpose: Build a Manager Class that will create CashRegister objects
 */
public class Manager
{
  public static void main(String[] args)
  {
    //hard code the data to simplify coding
    //Hire Kim is a cashier;//the program will come to CashRegister.java and find constructors CashRegister(), and run it
    CashRegister kim = new CashRegister(); //"new" means hire Kim as CashRegister
    //System.out.println("100");
    //Kim scans my shoe
    //kim.addItem(39.99);
    //Kim scans my shirt
    //kim.addItem(10);
    //#1 Will be on the test; Write a statement to set Kim's item to 20
    kim.setItemCount(20);
    //#2 Will be on the test; Write a statement to print Kim's item
    System.out.println(kim.getItemCount());
    //Print the receipt for the item sold
    //System.out.println("Item sold: " + kim.getItemCount());
    //Hire Jenny is another cashier
    //CashRegister jenny = new CashRegister();
    //Create another cashier
    CashRegister mary = new CashRegister(3,2.00,"11");
    //System.out.println("Kim's item: " + kim.getItemCount());
    //System.out.println("Mary's item: " + mary.getItemCount());
    //#3 Write a statement to set Mary's total price to 10
    mary.setTotalPrice(10);
    //#4 Write a statement to print Mary's total price
    System.out.println(mary.getTotalPrice());
  }
}