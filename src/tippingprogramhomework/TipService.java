
package tippingprogramhomework;

/**
 *
 * @author Cainebourne
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        this.calc = calc;
    }
    
    public double calcTip(){
        return calc.calcTip();
    }

    public final TipCalculator getCalc() {
        return calc;
    }

    public final void setCalc(TipCalculator calc) {
        this.calc = calc;
    }
    
    
}
