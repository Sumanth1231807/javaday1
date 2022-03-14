public class revofnum {
    public static void main(String[] args) {
        Integer number = 7689,reverse=0;
        while(number !=0){
            Integer digit =number%10;
            reverse =reverse*10+digit;
            number=number /10;


        }
        System.out.println("Reversed Number is"+reverse);
    }
}
