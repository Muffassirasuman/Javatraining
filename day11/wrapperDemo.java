public class wrapperDemo {
    public static void main(String[] args) {
        String s="abc";
        //NumberFormatException
        int w=1;
        Integer result=Integer.valueOf(s);
        System.out.println(result+w);


        int a=1234;
        String r=String.valueOf(a);
        System.out.println(a=12);
    }
}
