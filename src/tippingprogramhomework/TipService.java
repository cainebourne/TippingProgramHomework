
package tippingprogramhomework;

/**
 *
 * @author Cainebourne
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        setCalc(calc);
    }
    
    public final double calcTip(){
        return calc.calcTip();
    }

    public  TipCalculator getCalc() {
        return calc;
    }

    public final  void setCalc(TipCalculator calc) {
        if(calc == null){
            throw new IllegalArgumentException("No tip calculator provided");
        }
        this.calc = calc;
    }
    
    
}
