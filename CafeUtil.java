import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public int getStreakGoal(){
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            return sum;
    }
    // overload getStreakGoal()
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 0; i < numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    // get order total
    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for (int i=0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    //display menu 
    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }
    //add customer
    public void addCustomer(ArrayList<String> customers){
        System.out.print("Enter customer name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are"+" "+  customers.size() + " customers ahead of you.");
        customers.add(userName);
        for (int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i)+" is in line.");
        }
    }
    //print the price chart 
    public void printPriceChart(String product, double[] price, int maxQuantity){
        System.out.println(product);
        for (int i = 0; i < maxQuantity; i++){
            //-0.5 saving for each max quantity

            System.out.println(i+1 + " - $" + price[i]);
        }
        
    }
}