public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int k=1;k<=row;k++){
                System.out.print("*");
            }
            System.out.println();
    }
 }
}