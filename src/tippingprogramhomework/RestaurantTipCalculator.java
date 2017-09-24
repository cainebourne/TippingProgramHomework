
package tippingprogramhomework;

/**
 *
 * @author Cainebourne
 */
public class RestaurantTipCalculator implements TipCalculator {
    private double tipPercent;
    private double billAmt;
    
    public RestaurantTipCalculator(double billAmt, double tipPercent ){
        this.billAmt = billAmt;
        this.tipPercent = tipPercent;
        
    }
    
    @Override
    public double calcTip(){
        return billAmt * tipPercent;
    }

    public final double getTipPercent() {
        return tipPercent;
    }

    public final void setTipPercent(double tipPercent) {
        if(tipPercent <= 0){
            throw new IllegalArgumentException("tip percentage is required");
        }
        this.tipPercent = tipPercent;
    }

    public final double getBillAmt() {
        return billAmt;
    }

    public final void setBillAmt(double billAmt) {
        if(billAmt <= 0){
            throw new IllegalArgumentException("bill amount is required");
        }
        this.billAmt = billAmt;
    }
    
    
}
