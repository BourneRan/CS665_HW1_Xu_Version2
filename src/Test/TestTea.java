/**
 * Date:2023/2/12
 * Time:15:20
 * Author: Zhuoran Xu
 * Description:
 */
package Test;
import Assignment1_Version2.VendingTea;
import org.junit.Test;

public class TestTea {

    @Test
    public void testCreateTea(){

        VendingTea myDrink =  new VendingTea();

        myDrink.CreateTea("Black Tea");
        myDrink.payment("Black Tea");
        System.out.println("\n");
        myDrink.getName();
        myDrink.getType();

        myDrink.CreateTea("Green Tea");
        myDrink.payment("Green Tea");
        System.out.println("\n");

        myDrink.CreateTea("Yellow Tea");
        myDrink.payment("Yellow Tea");
        System.out.println("\n");

        //Wrong Type
        myDrink.CreateTea("Pink Tea");
    }


}
