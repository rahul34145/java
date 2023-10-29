import java.util.Scanner;

class Car{
    String color;
    float price;
}

class Maruthi extends Car{
    String brand;
    void brandPrint(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of your car");
        System.out.println("Brand Name:");
        String brand=sc.nextLine();
        System.out.println("Color:");
        String color=sc.nextLine();
        System.out.println("Price:");
        String price=sc.nextLine();
        System.out.println(brand+"  "+color+"  "+price);

    }
}


public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     Car c1 =new Car();
     c1.color="blue";
     System.out.println(c1.color);   
     Maruthi m1=new Maruthi();
    //  m1.brand="TATA";
    //  m1.color="red";
    //  m1.price=1200;
     m1.brandPrint();
    }
}
