/**
 * Author: Trung-Tin Huynh
 * Purpose: Build a cashier class
 */
public class CashRegister //99% of class is public; if a class is private, it will be useless b/c no one can access it
{
  private int itemCount; //private means only this class can access itemCount variable
  private double totalPrice;
  private String cashier_id; //those private variable MUST be initialize inside of a constructor
  public CashRegister() //contructor, must match the class's name; a contructor is a very special method
  {
    itemCount = 0;
    totalPrice = 0.0;
    //System.out.println("200");
    cashier_id = "";
  }
  public CashRegister(int pItem, double pPrice, String pCash)
  {
    itemCount = pItem;
    totalPrice = pPrice;
    cashier_id = pCash;
  }
  public void addItem(double price) //99% of method is public;
  {
    itemCount++;
    totalPrice += price;
  }
  public int getItemCount()//getter or accessor
  {
    return itemCount;
  }
  public double getTotalPrice()//getter or accessor
  {
    return totalPrice;
  }
  public String getCashier_id()//getter or accessor
  {
    return cashier_id;
  }
  public void setItemCount(int pItem)//setter or mutator
  {
    itemCount = pItem;
  }
  /*
   public void setItemCount(int itemCount)//setter or mutator
  {
    this.itemCount = itemCount; //"this" means the private variable created above (private itemCount)
  }
  */
  public void setTotalPrice(double pPrice)//setter or mutator
  {
    totalPrice = pPrice;
  }
  public void setCashier_id(String pId)//setter or mutator
  {
    cashier_id = pId;
  }
  /*
  public static void main(String[] args)
  {
    // hard code the data to simplify coding
    //Hire Kim is a cashier
    CashRegister kim = new CashRegister(); //"new" means hire Kim as CashRegister
    //Kim scans my shoe
    kim.addItem(39.99);
    //Kim scans my shirt
    kim.addItem(10);
    //Print the receipt for the item sold
    System.out.println("Item sold: " + kim.getItemCountCountCountCount());
    //Hire Jenny is another cashier
    //CashRegister jenny = new CashRegister();
   }
  
  ------------------
   A class can have any number of constructors, as far as they are having different parameters or different number of parameters.
   For example, a class A can have following constructors & even more:
  
   A() -the default constructor
   A(A objectA) -the copy constructor
   A(int p)
   A(int p1, int p2)
   A(int[] p1, float p2)
   A(double p1, double p2, int p3)
   A(A objA, int[] p)
   A(B objB)
   */
}