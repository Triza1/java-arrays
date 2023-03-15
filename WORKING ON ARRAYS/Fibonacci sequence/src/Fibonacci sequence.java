public class Fibonacci {
    public static void main(String[] args) {
        int figure1=10;
       int figure=0;
        int precede1=1;
        int precede2=2;
        System.out.println(precede1+""+precede2+"");
        int curr=precede1+precede2;
        System.out.println(curr+"");
        precede1=precede2;
        precede2=curr;

    }

}
