import java.util.Scanner;

public class ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 50 and then \nI will display the square and cube of you inputed.");

        System.out.print("Enter a number : ");
        int input = Integer.parseInt(sc.nextLine());
        if(input>50){
            System.out.println("Your number ("+input+") is grater than 50");
        }else if(input<1){
            System.out.println("Your number ("+input+") is less than 1");
        }else{
            System.out.println("The number \t\t: "+input);
            System.out.println("the square of number : "+Math.pow(input,2));
            System.out.println("The cube of number   : "+Math.pow(input,3));
        }
    }

}
