/**
 * Date:2023/2/12
 * Time:13:53
 * Author: Zhuoran Xu
 * Description:
 */
package Assignment1_Version2;

public class VendingMachine {

    String Type;

    String BeverageName;


    public void getType(){
        System.out.println("Your order is " + this.Type);
    }


    public void getName(){
        System.out.println("Your order is " + this.BeverageName);
    }

}
