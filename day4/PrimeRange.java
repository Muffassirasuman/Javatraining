public class PrimeRange {
    
        public static void main(String[] args) {
            for(int i=2;i<=25;i++){
                int div=2;
                boolean isprime=true;
                // while(div<=i/2)
                for(int j=2;j<=i/2;j++){
                    // if(i%div==0)
                    if(i%j==0)
                    {
                        isprime=false;
                        break;
                    }
                    // div++;
                
                }
                System.out.println(isprime?i+" ":"");
            }
        }
    }

