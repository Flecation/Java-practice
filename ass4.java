
import java.util.Scanner;
public class ass4 {

    public static void main(String[] args) {
        String [] wordArray = {"wind","leer","pushy","lade","size","sob","borrowing","list","perish","hoax","sticks","seed","impel","large","male","silent","quilt","sobbed","remarkable","fantastic","wire","reflective","putrid","pushover","swing"};
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        while(c){
            c = true;
            System.out.print("Enter a word or 1 to exit:: ");
            String input = sc.nextLine();
            System.out.println("-------------------------------------------------");
            if(input.equals("1")){
                c = false;
            }else{
                int count =0;
                String [] checklength = new String[wordArray.length];
                int index = 0;
                for (int i = 0; i < wordArray.length; i++) {
                    if(wordArray[i].charAt(0)==input.charAt(0)){
                        System.out.println(wordArray[i]);
                        count++;
                        checklength[index] = wordArray[i];
                        index++;
                    }
                }
                System.out.println(count+" word(s) begin with "+input.charAt(0));
                System.out.println("-------------------------------------------------");

                count =0;
                        for (int i = 0; i < wordArray.length; i++) {
                            if(wordArray[i].contains(input)){
                                System.out.println(wordArray[i]);
                                count++;
                                checklength[index] = wordArray[i];
                                index++;
                            }
                        }
                        System.out.println(count+" word(s) contain "+input);
                        System.out.println("-------------------------------------------------");
                
                longshort(checklength,index);

                index =0;
        }
    }

    }

    static void longshort(String[] a,int b){
      String l = a[0];
      String s = a[0];

      for (int i = 0; i < b; i++) {
        if(a[i].length()>l.length()){
            l = a[i];
        }else if(a[i].length()==l.length()){
            String accept = a[i];
            for(int j =0;j<l.length();j++){
               if(accept.charAt(j)>l.charAt(j)){
                    l = accept;
                    break;
               }
            }
        }else{
            continue;
        }
        
          
      }
      for (int i = 0; i < b; i++) {
            if(a[i].length()<s.length()){
                s = a[i];
            }else if(a[i].length()==s.length()){
                String accept = a[i];
                for(int j =0;j<s.length();j++){
                    if(accept.charAt(j)<s.charAt(j)){
                        s = accept;
                        break;
                    }
                }
            }else{
                continue;
            }
        }
      System.out.println("The longest word has "+l.length()+" letters");
      System.out.println("The shortest word has "+s.length()+" letters");
      System.out.println("The longest word is "+l);
      System.out.println("The shortest word is "+s);

    }
    
}
