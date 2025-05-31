
import java.util.Scanner;
public class ass3 {

    public static void main(String[] args){
        int[] denaryPlaceholders = { 128, 64, 32, 16, 8, 4, 2, 1 };
        StringBuilder binaryPattern = new StringBuilder("10");
        int denaryNumber = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String input;
        boolean c ;

        do { 
            c = true;
            System.out.print("Enter the 8-bits code :");
            input = sc.nextLine();

            if(input.length()!=8){
                c = false;
                System.out.println(" Your binary code must be 8 digit ");
                   
            }
            for (int i = 0; i < input.length(); i++) {
               if(binaryPattern.indexOf(String.valueOf(input.charAt(i)))==-1){
                c = false;
                System.out.println("The binary number must be 1 or 0");
                break;
               } 
            }
            if(!c){
                System.out.println("try again");
            }
            
        } while (!c);

        
        int[] binary_number = new int[8];
         for(int i = 0;i<8;i++){
            binary_number[i] = input.charAt(i) -'0';
            
        }

        

        System.out.print("Denary placeholder \t | ");
        for(int i = 0;i<8;i++){
            System.out.print(denaryPlaceholders[i]+"\t | ");
        }
        System.out.println();

        System.out.print("Binary Number \t\t | ");
        for(int i = 0;i<8;i++){
            System.out.print(binary_number[i]+"\t | ");
        }
        System.out.println();


        int[] denary_number = new int[8];
        System.out.print("Denary Number \t\t | ");
        for(int i = 0;i<8;i++){
            denary_number[i] = denaryPlaceholders[i]*binary_number[i];
            System.out.print(denary_number[i]+"\t | ");
            denaryNumber +=denary_number[i];
        }
        System.out.println();

        System.out.println(input+" of denary number is "+denaryNumber);
    }


    
}