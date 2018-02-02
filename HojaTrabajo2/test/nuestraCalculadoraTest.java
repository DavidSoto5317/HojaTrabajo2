/**
 * Clase JUnit que realiza pruebas con los metodos de la clase que implementa el programa y la clase pila.
 * @author: Oscar Juarez - 17315 / David Soto - 17551
 * @version: 2/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

import hojatrabajo2.Stack;
import hojatrabajo2.StackArrayList;
import hojatrabajo2.nuestraCalculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class nuestraCalculadoraTest {
    
    private nuestraCalculadora Calcu = new nuestraCalculadora();
    Stack<Double> miStack = new StackArrayList<Double>();
    
    public nuestraCalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    /**
     * Prueba que demuestrala funcionalidad de la calculadora en cuanto al operar una expresion.
     */
    public void testOperar1() {
        
        String expresion = "3 2 + 2 - 5 * 2 + 4 / 3 * 5 - 2 /";
        double respuesta = 3.875;
        
        double resultado = Calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.9);
    }
    
    @Test
    /**
     * Prueba que demuestra que la calculadora evita un resulta indefinido al intentar dividir entre 0.
     */
    public void testOperar2() {
        
        String expresion = "3 3 + 0 /";
        
        double respuesta = 0.0;
        
        double resultado = Calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.1);
    }
    
    @Test
    /**
     * Prueba que demuestra que la calculadora evita tomar una variable como un numero.
     */
    public void testOperar3() {
        
        String expresion = "3 3 + a / 9 + 4 -";
        
        double respuesta = 0.0;
        
        double resultado = Calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.1);
    }
    
    @Test
    /**
     * Prueba que demuestra que la calculadora evita tener un tercer operando o la ausencia de un signo.
     */
    public void testOperar4() {
        
        String expresion = "3 3 + 6 + 5 4 - 1 *";
        
        double respuesta = 0.0;
        
        double resultado = Calcu.operar(expresion);
        
        assertEquals(respuesta,resultado, 0.1);
    }
    
    @Test
    /**
     * Prueba que permite ver el ultimo elemento agregado a la pila.
     */
    public void testPeek() {
        
        double valor1 = 2.0;
        double valor2 = 3.0;
        double valor3 = 4.0;
        
        miStack.push(valor1);
        miStack.push(valor2);
        miStack.push(valor3);
        
        double respuesta = miStack.peek();
        double resultado = valor3;
        
        assertEquals(respuesta,resultado, 0);
    }
    
    @Test
    /**
     * Prueba que permite verificar el tamano de la pila.
     */
    public void testSize() {
        
        double valor1 = 8.0;
        double valor2 = 9.0;
        double valor3 = 4.0;
        double valor4 = 5.0;
        
        miStack.push(valor1);
        miStack.push(valor2);
        miStack.push(valor3);
        miStack.push(valor4);
        
        int respuesta = miStack.size();
        int resultado = 4;
        
        assertEquals(respuesta,resultado);
    }
    
}
