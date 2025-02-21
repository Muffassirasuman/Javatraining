
public class multiThread1{
    public static void main(String[] args) throws InterruptedException {
        ChildThread1 ct1 =new ChildThread1();
          ct1.start();
        //   ct1.getState();
          System.out.println(ct1.getState());
          System.out.println(ct1.getName());
        //   Thread.yield();
         ct1.interrupt();
         ct1.join();
        for(int i=1;i<=5;i++){
            System.out.println("mainThread" +i);
    }
    System.out.println(ct1.getState());
}
}
// class ChildThread1 extends Thread{
//     @Override
//     public  void run(){
//         Thread.yield();
//         for(int i=1;i<=5;i++){
//             System.out.println("childThread" +i);
//         }
        
//     }
// }
