public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        System.out.println("prime numbers up to "+ N+ ":");
        
        int count=primes(N);
        System.out.println("There are "+ count+"primes between 2 and "+N+ ". ("+(int)(((double)count/N)*100)+"% are primes)");
    }

    public static int primes(int N) {
        if (N < 2) {
            System.out.println("No prime numbers in this range.");
            return 0;
        }

        boolean[] isPrime= new boolean[N+1];
        int i= 2;
        while (i <= N) {
            isPrime[i]=true;
            i++;
        }
        int p=2;
        while (p*p<=N){
            if (isPrime[p]){
                int checked=p*p;
                while (checked<=N){
                    isPrime[checked]=false;
                    checked+=p;
                    

                }
            }
            p++;
        }
        int count=0;
        int j=2;
        while(j<=N){
            if (isPrime[j]){
                count++;
                System.out.println(j);
            }
            j++;
        }
        return count;
    }
}