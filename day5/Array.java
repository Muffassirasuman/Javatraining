public class Array {
    public static void main(String[] args) {
        
        int a[]={2,4,6,8,10};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
       for(int number:a){
       if(number%2==0){
        System.out.println("even");
       }
       else{
        System.out.println("odd");
       }
       
        }
    }
}

