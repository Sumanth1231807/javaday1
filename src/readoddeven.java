import java.util.Scanner;

public class readoddeven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        Integer a=input.nextInt();

        if(a%2==0)
        {
            System.out.println("its even");
        }
        else
        {
            System.out.println("its odd");
        }




    }
}
