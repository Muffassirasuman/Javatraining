public class Scenario {
    public static void main(String[] args) {
        String s1=new String("ABC");
        // String s2=new String("ABC");
        String s2=s1;
        s2="ABC";
        // if(s1.equals(s2))
        if(s1==s2){
            System.out.println("s1 s2 are equals");
        }else
        {
            System.out.println("s1 s2 are not equals");
        }
    }
}