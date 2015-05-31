package problem_10;


public class Problem_10 {

public static void main(String [] args)
{
        //zwiekszenie koncowej liczny o 2 
         System.out.println("Liczba wynosi: " +Solve());
    }
	
public static long Solve()
 {
    
        Problem_10 prob_10Obj = new Problem_10();
         
        //Suma typu Long
        long Sum = 0;
         
        //  licznik ustawiamy na 1 
        int counter = 1;
         
        // dopoki licznik bedzie mniejszy niz 2 miliony
        while (counter < 2000000) {
             
            // sprawdzenei czy licznik jest liczba pierwsza, jesli tak, dodaj go do sumy
            if (prob_10Obj.isPrime(counter)) {
                Sum += counter;
            }
            // zwiekszanie licznika o 2
            counter += 2;
        }
        
       //zwroc Sume
        return Sum+2;
}
		
    public boolean isPrime(int n)
        {
            //sprawdzenie czy n-testowana liczba, wynosi 1 
        if (n == 1){
            return false;
        }
        //sprawdzenie czy liczba jest pierwsza
        int k = (int) Math.sqrt(n);
            for (int i = 2; i <= k; i++)
            {
                //jesli n jest podzielna przez i nie jest liczba pierwsza
                if (n % i == 0)
                    return false;
            }
            //w innym wypadku zwroc true
            return true;
        }
 
}
    

