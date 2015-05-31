package problem_10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Slawek
 */
public class Problem_10Test {
   
  
 

    @Test
    public void testIsPrime() {
        System.out.println("Testowanie metody isPrime");
        int n = 7;
        Problem_10 instance = new Problem_10();
        boolean expResult = true;
        boolean result = instance.isPrime(n);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testIsPrime() {
        System.out.println("Testowanie metody 2 isPrime");
        int n = 95891;
        Problem_10 instance = new Problem_10();
        boolean expResult = true;
        boolean result = instance.isPrime(n);
        assertEquals(expResult, result);
       
    }
}
