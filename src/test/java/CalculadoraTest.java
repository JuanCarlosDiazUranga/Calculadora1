import Entities.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void calculadoraSuma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(2,1);
        assertEquals(3,resultado);



    }
    @Test
    public  void calculadoraResta(){
        Calculadora calculadora = new Calculadora();
        int resultado= calculadora.resta(2,1);
        assertEquals(1,resultado);
    }
    @Test
    public void  calculadoraMultiplicacion(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicacion(2,2);
        assertEquals(4,resultado);
    }
}
