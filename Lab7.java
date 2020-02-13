import java.util.Scanner;
public class Lab7
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in);
  Customer c1 = new Customer();
  Car car1 = new Car();
  ServiceQuote service1 = new ServiceQuote();
  
  System.out.print("enter customer's name:");
  String name=keyboard.nextLine();
  System.out.print("enter customer's address:");
  String address=keyboard.nextLine();
  System.out.print("enter customer's phone number:");
  String phone=keyboard.nextLine();
  System.out.println(" ");
  
  c1.setName(name);
  c1.setAddress(address);
  c1.setPhone(phone);
  
  System.out.print("enter car make:");
  String make=keyboard.nextLine();
  System.out.print("enter car model:");
  String model=keyboard.nextLine();
  System.out.print("enter car year:");
  double year=keyboard.nextDouble();
  
  
  car1.setMake(make);
  car1.setModel(model);
  car1.setYear(year);
  
  System.out.print("enter the parts charges:");
  double pcharges=keyboard.nextDouble();
  System.out.print("enter the labor charges:");
  double lcharges=keyboard.nextDouble();
  service1.setPartsCharges(pcharges);
  service1.setPartsLabor(lcharges);
  
  System.out.println("Joe's automotive Shop");
  System.out.println("Service estimate");
  System.out.println("");
  
  System.out.println("Customer name\t\t"+ c1.getName());
  System.out.println("Customer Address\t\t"+ c1.getAddress());
  System.out.println("Custome phone\t\t"+c1.getPhone());
  System.out.println("");
  
  System.out.println("Car make\t\t"+car1.getMake());
  System.out.println("CAr model\t\t"+car1.getModel());
  System.out.println("Car year\t\t"+ car1.getYear());
  System.out.println("");
  
  System.out.println("Parts Charges\t\t"+ service1.getPartsCharges());
  System.out.println("labor Charges\t\t"+ service1.getLaborCharges());
  System.out.println("Sales Tax\t\t"+ service1.getSalesTax());
  System.out.println("Total charges\t\t"+ service1.getTotalCharges());
  
 }
} 
  