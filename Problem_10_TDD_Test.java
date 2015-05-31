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
    public void testSolve() {
        System.out.println("Testowanie metody Solve");
        long expResult = 142913828922L;
        long result = Problem_10.Solve();
        assertEquals(expResult, result);

    }
 

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
        System.out.println("2 Test metody isPrime");
        int n = 95891;
        Problem_10 instance = new Problem_10();
        boolean expResult = true;
        boolean result = instance.isPrime(n);
        assertEquals(expResult, result);
       
    }
	   @Test
    public void testIsPrime() {
        System.out.println("3 Test metody isPrime");
        int n = 15472789;
        Problem_10 instance = new Problem_10();
        boolean expResult = true;
        boolean result = instance.isPrime(n);
        assertEquals(expResult, result);
       
    }
	
}
