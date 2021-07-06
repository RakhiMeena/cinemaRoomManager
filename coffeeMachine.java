package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        
        makingOfCoffee();
        inputs();
    }

public static void makingOfCoffee() {
        int noOfCoffee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println("Write how many cups of coffee you will need: ");
        noOfCoffee = sc.nextInt();

        System.out.println("For " +noOfCoffee+ " cups of coffee you will need:");
        System.out.println((noOfCoffee * 200)+ " ml of water");
        System.out.println((noOfCoffee * 50)+ " ml of milk");
        System.out.println((noOfCoffee * 15)+ " g of coffee beans");

}
public static void inputs() {
        int  amtOfWater , amtOfMilk , amtOfBeans , coffeeCups , water, milk , beans , minimum , minCoffeeCups;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        amtOfWater = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        amtOfMilk = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        amtOfBeans = scan.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        coffeeCups = scan.nextInt();
        
             water = amtOfWater / 200;
             milk = amtOfMilk / 50;
             beans = amtOfBeans / 15;
             minimum = min(water , milk , beans);
             if (minimum == coffeeCups)
             {
                 System.out.println("Yes, I can make that amount of coffee");
             } else if (minimum > coffeeCups)
             {
                 minCoffeeCups = minimum - coffeeCups;
                 System.out.println("Yes, I can make that amount of coffee (and even " +minCoffeeCups+ " more than that)");
             } else 
             {
                 System.out.println("No, I can make only " +minimum+ " cup(s) of coffee");
             }
}
public static int min(int water , int milk , int beans) {
     int minimum;  
     if (water < milk && water < beans)
             {
                 minimum = water;
             } else if (milk < beans)
             { 
               minimum = milk;  
             } else
             {
              minimum = beans;    
             }
         return minimum;    
} 
}