import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        int[] arr={3,0,4,5,0,1,2};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
}
public static void moveZeros(int[] arr){
    int index=0;
   for(int num:arr){
    if(num!=0){
        arr[index++]=num;
    }
   }
   while(index<arr.length){
    arr[index]=0;
    index++;
   }
}
}
