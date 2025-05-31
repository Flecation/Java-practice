import java.util.Scanner;
public class ass6 {
    public static void main(String[] args) {
        int[] questions = { 1, 2, 3, 4, 5 ,6 ,7 ,8, 9 };
        String[] countries = { "England", "France", "Spain", "Italy", "Germany", "Scotland", "Wales", "United Arab Emirates", "China" };
        String[] capitals = { "London", "Paris", "Madrid", "Rome", "Berlin", "Edinburgh", "Cardiff", "Abu Dhabi", "Beijing" };
        
        Scanner sc = new Scanner(System.in);
        int choice;
        //for user name
        String playerName = " ";
        int score =0;
        int qchoice =0;
        do{
            System.out.println("\t\tMenu");
            System.out.println("====================================================");

            System.out.println("[1] Add Player Name\n"+"[2] Play guess the Capital City\n"+"[3] End game");
            System.out.println("====================================================");
            
            do{
                System.out.print("Input your menu choice: ");
                choice = Integer.parseInt(sc.nextLine());

                if(choice>3){
                    System.out.println("Invalid number");
                    System.out.println("!!Try again!!");
                    System.out.println("====================================================");
                }
            //not to choice over 3
            }while(choice>3);
            
            if(choice ==1){
                System.out.print("Enter your name: ");
                playerName = sc.nextLine();
                System.out.println("Hello ,"+playerName+"!");
                System.out.println("====================================================");
            }else if(choice ==2){
                
                if(playerName.trim().isEmpty()){
                    System.out.println("Please add your name first before playing.");
                    System.out.println();

                    //if play the game player name must include
                    System.out.print("Enter your name: ");
                    playerName = sc.nextLine();
                    System.out.println("Hello ,"+playerName+"!");
                    System.out.println("====================================================");
                }
                System.out.println("Welcome " + playerName + "\n! Let's play 'Guess the Capital City'!");

                do{
                    System.out.print("Enter number between 1 to "+questions.length +": ");
                    qchoice = Integer.parseInt(sc.nextLine())-1;

                    if(qchoice>=questions.length){
                        System.out.println("Your choice is out of question \n!!Try again!!");
                        System.out.println("====================================================");
                        continue;
                    }
                //to check the number that is not to be out of bound
                }while(qchoice>=questions.length);

                score += playing(countries, capitals, qchoice);

            }else{
                System.out.println("Name \t: "+playerName);
                System.out.println("Score\t: "+score);
            }





        //for game end
    }while(choice != 3);
    }
    
    public static int playing(String[] country,String[] capital,int index){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the capital of " +country[index] +" ?");
        System.out.print("==>");
        String ans = sc.nextLine();
        
        if(ans.equalsIgnoreCase(capital[index])){
            System.out.println("Your answer is correct !!");
            return 1;
        }else{
            System.out.println("Your answer isn't correct !!");
            System.out.println("Correct answer is "+capital[index]);
            return 0;
        }
        
        
    }
}
