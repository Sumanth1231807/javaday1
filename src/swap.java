public class swap {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("before swapping");
        System.out.println("x="+x);
        System.out.println("y="+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("after swapping");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
