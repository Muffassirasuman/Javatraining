import java.util.*;

public class Demo{
    public static void main(String[] args) {

        //multidimensional array
        // int a[]={1,2,3,4};
        Scanner sc=new Scanner(System.in);
        // int b[]=new int[5];
        // for(int i=0;i<b.length;i++){
        //     b[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(b));

        //  int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        //  System.out.println(a[2][1]);
        // System.out.println(a.length);
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        // }

        // int a[][]=new int[3][3];
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<a.length;i++){
        //         for(int j=0;j<a.length;j++){
        //             System.out.print(a[i][j]+" ");
        //         }
        //         System.out.println();
        //     }

        //jagged array
        int a[][]=new int[3][];

        a[0]=new int[3];
        a[1]=new int[2];
        a[2]=new int[1];
        for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<a.length;i++){
                    for(int j=0;j<a.length;j++){
                        System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                }
    }
}