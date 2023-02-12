package Test;

import Assignment1_Version2.VendingCoffee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Date:2023/2/12
 * Time:15:51
 * Author: Zhuoran Xu
 * Description:
 */
public class TestCoffee {
    @Test
    public void testCreateCoffee(){

         VendingCoffee myDrink = new VendingCoffee();

         myDrink.CreateCoffee("Americano");
         myDrink.payment("Americano");

         myDrink.addSugar();
         myDrink.addSugar();
         myDrink.addSugar();
         myDrink.addSugar();

         myDrink.addMilk();
         myDrink.addMilk();

         myDrink.getType();
         myDrink.getName();

         assertEquals(myDrink.getTotalNumberOfCondiments() ,5);
    }



}
