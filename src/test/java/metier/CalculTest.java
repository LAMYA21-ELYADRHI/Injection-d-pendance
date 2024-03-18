package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;

    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=3; double b=8;
        double expected=11;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
