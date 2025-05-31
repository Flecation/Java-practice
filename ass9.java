import java.util.Scanner;
public class ass9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the car registeration code ,\ncode must be two upper case letters followed by two numbers and\nthen three upper case letters.(e.g YH62KLV, EY09VPB and CK53PRJ are valid codes) ");
        boolean c;
        String input;
        do{
            c = true;
            System.out.print("==>");
            input = sc.nextLine();
            if(input.length()!=7){
                c = false;
                System.out.println("Your code range must be 7 ");
                System.out.println("Try again");
            }
        }while(!c);
        String checkletter = "ABCDEFGHIJKLMNOPQRSTVUPWXYZ";
        String checkint = "0123456789";

        if(checkletter.contains(String.valueOf(input.charAt(0))) && 
        checkletter.contains(String.valueOf(input.charAt(1)))
        ){
                if(checkint.contains(String.valueOf(input.charAt(2))) &&
                    checkint.contains(String.valueOf(input.charAt(3)))
                    ){
                    if (
                        checkletter.contains(String.valueOf(input.charAt(4))) && 
                        checkletter.contains(String.valueOf(input.charAt(5))) &&
                        checkletter.contains(String.valueOf(input.charAt(6)))
                    ) {
                        System.out.println(input + " is valid"); 
                    }else{
                        System.out.println(input +" is not valid");
                    }
                }else{
                    System.out.println(input+ " is not valid");
                }
        }else{
            System.out.println(input +" is not valid");
        }
    }
}
