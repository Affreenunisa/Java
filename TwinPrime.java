
class TwinPrime
{
    public static void main (String[] args)
    {
        int i, num;
        String primeNumbers = "";
        String twinPrimes = "";
        int previousPrime = -1;

        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num = i; num >= 1; num--)
            {
                if(i % num == 0)
                {
                    counter++;
                }
            }

            if (counter == 2)
            {
                primeNumbers += i + " ";

                if (previousPrime != -1 && (i - previousPrime) == 2)
                {
                    twinPrimes += "(" + previousPrime + ", " + i + ") ";
                }

                previousPrime = i;
            }
        }

        System.out.println("Twin prime numbers are:");
        System.out.println(twinPrimes);
    }
}