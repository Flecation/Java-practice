import java.util.Scanner;
public class ass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("code must be \nFist 3 upper case letters \nAnd then must be 5 digits not including 0 \nThe last character is that, the sum of all digits is even 'e' or odd 'o'");
        System.out.print("Enter a code : ");
        String input = sc.nextLine();
        
        if(isValid(input)){
            System.out.println("Your code ("+input+") is valid");
        }else{
            System.out.println("Your code ("+input+") is not valid");
        }
    }

    public static boolean isValid(String input){
        int sum =0;
          if(input.length() !=10){
                return false;
            }
        for(int i =0; i<3;i++){
          
            if(Character.isUpperCase(input.charAt(i))){
                continue;
            }else{
                return false;
            }
        }

        String c = "123456789";
        for(int i =3;i<9;i++){
            if(c.contains(String.valueOf(input.charAt(i)))){
                sum += Integer.valueOf(input.charAt(i))-0;
            }else{
                return false;
            }
        }
        System.out.println(sum);
        char last;
        if(sum%2 ==0){
            last = 'e';
        }else{
            last ='o';
        }

        if(last == input.charAt(9)){
            return true;
        }else{
            return false;
        }
        
       
    
}

    }

