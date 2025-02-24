public class Bank {
    private int minbalance=2000;
    private int balance=10000;
    
    public Bank(){
        System.out.println("welcome to bank");
    }
    //getter
    public int getminbalanc(){
     
        return this.minbalance;
    }
    //getter()
    public int getbalanc(){
     
        return this.balance;
    }
    //setter()
    public void set(int amount){
     this.balance=this.balance+amount;
    }
}
