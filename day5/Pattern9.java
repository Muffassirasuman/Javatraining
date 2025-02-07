public class Pattern9 {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<n*2;row++){
            int totalcolsInRows=row>n?2*n-row:row;
            int space=n-totalcolsInRows;
            for(int col=1;col<=space;col++){
                System.out.print(" ");
            }
            for(int k=totalcolsInRows;k>0;k--){
                System.out.print(k);
            }
            for(int l=2;l<=totalcolsInRows;l++){
                System.out.print(l);
            }
            System.out.println();
         }
         
        }
    }


