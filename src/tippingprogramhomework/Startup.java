
package tippingprogramhomework;

/**
 *
 * @author Cainebourne
 */
public class Startup {

    public static void main(String[] args) {
       // initialize worker object
      // RestaurantTipCalculator calc = new RestaurantTipCalculator(100, .10);
      BartenderTipCalculator calc = new BartenderTipCalculator(10, .10);
      TipService tipService = new TipService(calc);
       double tip = tipService.calcTip();
       
        System.out.println("The Tip is: " + tip);
    }
    
}
