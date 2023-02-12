package Assignment1_Version2;

import java.util.HashMap;

/**
 * Date:2023/2/12
 * Time:14:05
 * Author: Zhuoran Xu
 * Description:
 */
public class VendingCoffee extends VendingMachine{
    private String[] CoffeeMenu;

    private HashMap<String, Double> CoffeePrice;

    private int unitmilk;

    private int unitsugar;

    public VendingCoffee(){
        this.Type = "Coffee";
        CoffeeMenu = new String[]{"Espresso", "Americano", "Latte Macchiato"};
        CoffeePrice = new HashMap<>();
        CoffeePrice.put("Espresso", 5.39);
        CoffeePrice.put("Americano", 5.49);
        CoffeePrice.put("Latte Macchiato", 5.59);
        unitsugar = 0;
        unitmilk = 0;

    }

    public void payment(String coffee){
        System.out.println("Please pay " + CoffeePrice.get(coffee) + " $ for " + coffee + "\n");
    }

    public void CreateCoffee(String coffee) {
        boolean orderApproved = false;
        for (String coffeemenu : CoffeeMenu) {
            if (coffeemenu.toLowerCase().equals(coffee.toLowerCase())) {
                orderApproved = true;
                this.BeverageName = coffee;
            }
        }
        if (orderApproved) {
            System.out.println(coffee + " is ready!");
        } else {
            System.out.println("Sorry, we don't have " + coffee + "!");
        }
    }

    public void addSugar(){
        if (0 <= unitsugar && unitsugar < 3) {
            unitsugar += 1;
            System.out.println("Add Sugar Successfully!");
            System.out.println("You have " + unitsugar + " unit sugar!\n");
        } else
            System.out.println("You are only allowed to add 3 unit sugar!\n");
    }

    public void addMilk(){
        if (0 <= unitmilk && unitmilk < 3) {
            unitmilk += 1;
            System.out.println("Add Milk Successfully!");
            System.out.println("You have " + unitmilk + " unit milk!\n");
        } else
            System.out.println("You are only allowed to add 3 unit milk!");
    }

    public int getUnitMilk() {
        return unitmilk;
    }

    public int getUnitSugar() {
        return unitsugar;
    }

    public int getTotalNumberOfCondiments(){
        return unitmilk + unitsugar;
    }
}
