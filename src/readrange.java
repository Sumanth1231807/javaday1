import java.util.Scanner;

public class readrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lower range");
        Integer Lower_range=sc.nextInt();
        System.out.println("enter the upper range");
        Integer upper_range=sc.nextInt();
        while (Lower_range<=upper_range){
            if(Lower_range%2!=0)
                System.out.println(Lower_range);
            Lower_range++;

        }
    }
}
