import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer n1,n2,n3;
        System.out.println("entyer 1st number");
        n1=input.nextInt();
        System.out.println("Enter 2nd number");
        n2=input.nextInt();
        n3=n1+n2;
        System.out.println(n3);
    }
}
