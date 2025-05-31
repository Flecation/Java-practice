import java.util.Random;
import  java.util.Scanner;
public class ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("we will generate a product code for you");
        System.out.print("Enter the product name: ");
        String productName = sc.nextLine().toLowerCase().trim();
        
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 3; i++) {
           name.append(productName.charAt(i));
        }
       // System.out.println(name.toString());

        int [] num = new int[21];
        for(int i =0;i<num.length;i++){
            num[i] = 10+i;
            //System.out.println(num[i]);
        }

        System.out.println("Your product code is: " + combine(name, num));
        
    }
    public static String combine(StringBuilder name, int[] num){
        StringBuilder result = new StringBuilder();
        result.append(name.toString());
        Random ra = new Random();
        int rad = num[ra.nextInt(num.length)];
        result.append(rad);
        return result.toString();
    }
}
