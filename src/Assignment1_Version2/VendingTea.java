package Assignment1_Version2;
import java.util.HashMap;
import java.util.Locale;

/**
 * Date:2023/2/12
 * Time:14:05
 * Author: Zhuoran Xu
 * Description:
 */
public class VendingTea extends VendingMachine{

    private String[] TeaMenu;

    private HashMap<String, Double> TeaPrice;

    public VendingTea(){
        this.Type = "Tea";
        TeaMenu = new String[]{"Black Tea", "Green Tea", "Yellow Tea"};
        TeaPrice = new HashMap<>();
        TeaPrice.put("Black Tea", 2.99);
        TeaPrice.put("Green Tea", 3.99);
        TeaPrice.put("Yellow Tea", 4.99);
    }

    public void payment(String tea){
        System.out.println("Please pay " + TeaPrice.get(tea) + "$ for " + tea);
    }

    public void CreateTea(String tea){
        boolean orderApproved = false;
        for(String teamenu : TeaMenu){
            if(teamenu.toLowerCase().equals(tea.toLowerCase())){
                orderApproved = true;
                this.BeverageName = tea;
            }
        }
        if(orderApproved){
            System.out.println(tea + " is ready!");
        }
        else{
            System.out.println("Sorry, we don't have " + tea + "!");
        }


    }
}
