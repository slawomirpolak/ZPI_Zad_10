package problem_10;


public class Problem_10 {

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
    

