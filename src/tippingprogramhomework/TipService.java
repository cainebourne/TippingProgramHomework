
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

    public  TipCalculator getCalc() {
        return calc;
    }

    public  void setCalc(TipCalculator calc) {
        this.calc = calc;
    }
    
    
}
