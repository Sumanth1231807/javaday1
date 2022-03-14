public class largest {
    public static void main(String[] args) {
        double n1=4.5,n2=8,n3=10;

        if(n1>=n2&&n1>=n3)
            System.out.println(n1+"is largest");
        else if(n2>=n1&&n2>=n3)
            System.out.println(n2+"largest");
        else
            System.out.println(n3+"largest");
    }
}
