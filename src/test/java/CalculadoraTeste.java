import org.junit.Assert;
import org.junit.Test;
import com.meuprojeto.Calculadora;

public class CalculadoraTeste {

    @Test
    public void testSomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(5, 3);

        Assert.assertEquals(8, resultado);
    }
}
