public class SuperMarket {
    static String name="Reiance Mall";
    String pname;
    int price;
    int discount;
   //global variables,non-static variable,fields
   SuperMarket()
   {
    System.out.println("i am hello");
   }

     SuperMarket(String pname, int price, int discount) {
        this.pname = pname;
        this.price = price;
        this.discount = discount;
    }
   
   public static void main(String[] args) {
    SuperMarket product1=new SuperMarket();
   }
}
