
package tippingprogramhomework;

/**
 *
 * @author Cainebourne
 */
public class BartenderTipCalculator implements TipCalculator {
    private int drinkQty;
    private double tipPerDrink;

    public BartenderTipCalculator(int drinkQty, double tipPerDrink) {
        setdrinkQty(drinkQty);
        settipPerDrink(tipPerDrink);
        
    }
    
    @Override
      public double calcTip(){
        return drinkQty * tipPerDrink;
    }

    public final int getDrinkQty() {
        return drinkQty;
    }

    public final void setDrinkQty(int drinkQty) {
        if(drinkQty <= 0){
            throw new IllegalArgumentException("drink quantity is required");
        }
        this.drinkQty = drinkQty;
    }

    public final double getTipPerDrink() {
        return tipPerDrink;
    }

    public final void setTipPerDrink(double tipPerDrink) {
        if(tipPerDrink <= 0){
            throw new IllegalArgumentException("tip per drink is required");
        }
        this.tipPerDrink = tipPerDrink;
    }
    
    
}
