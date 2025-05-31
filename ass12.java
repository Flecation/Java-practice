public class ass12 {
    public static void main(String[] args) {
        String[][] libraryRecord =  {{"105MS" , "Marcus", "Smith", "25"},
                                     {"103AZ" , "Anthony" , "Zarrent" , "5" },
                                     {"108MW" , "Matt" , "White" , "12" },
                                     {"112DB" , "Denise" , "Bilton" , "58" },
                                     {"124MK" , "Malcolm" , "Kelly" , "26" },
                                     {"116UK" , "Uzere" , "Kevill" , "29" },
                                     {"127AL" , "Abduraheim" , "Leahy" , "94" },
                                     {"124LS" , "Laura" , "Sampras" , "50" },
                                     {"121AP" , "Azra" , "Potter" , "61" },
                                     {"115AC" , "Anthony" , "Calik" , "10" },
                                     {"117PI" , "Pablo" , "Iilyas" , "49" },
                                     {"113MM" , "Mark" , "Montgomerie" , "67" },
                                     {"130FH" , "Felicity" , "Heath" , "11" },
                                     {"132JA" , "Jill" , "Alexander" , "61" },
                                     {"123SG" , "Sara" , "Grimstow" , "9" },
                                     {"134KD" , "Kevin" , "Dawson" , "74" },
                                     {"122AB" , "Andrew" , "Bertwistle" , "42" },
                                     {"125JF" , "Jaide" , "Feehily" , "55" },
                                     {"128JS" , "Justin" , "Slater" , "68" },
                                     {"126CG" , "Colleen" , "Grohl" , "39" }};
        double total =0;
        double numBook=0 ;
        String [] lessReader = new String[libraryRecord.length];
        int less =0;
        // String[][] gr = new String[libraryRecord.length][4];
        // String [][] sr = new String[libraryRecord.length][4];
        // String[][] br = new String[libraryRecord.length][4];
        int gold =0,silver=0,bronze=0;

        // int check1 =0,check2 =0,check3 =0;//for gold silver bronze
        for (int i = 0; i < libraryRecord.length; i++) {
            int num = Integer.parseInt(libraryRecord[i][3]);
            total +=num;
        
             if(i ==libraryRecord.length-1){
                numBook = total;
                total = total/libraryRecord.length;
            }

            if(num<10){
                lessReader[less] = libraryRecord[i][0];
                less++;
            }else{
                if(num>gold){
                    bronze = silver;
                    silver = gold;
                    gold = num;
                }else if(num>silver){
                    bronze = silver;
                    silver = num;
                }else if(num>bronze){
                    bronze = num;
                }       
            }
        }

        //result
        System.out.println("Total number of books : "+ numBook+" books");
        System.out.println("Average number of books : "+total+" bpp");
        System.out.println("The id of pupils who read less then 10 books are");
        for(int i =0; i<less;i++){
            System.out.println("==>"+lessReader[i]);
        }

        System.out.println("Details of gold medals winner(s) is(are)");
        for(int i =0; i<libraryRecord.length;i++){
            if(Integer.parseInt(libraryRecord[i][3])==gold){
                System.out.println("Id: "+libraryRecord[i][0]);
                System.out.println("Name: "+libraryRecord[i][1]+" "+libraryRecord[i][2]);
                System.out.println("Number of books readed: "+libraryRecord[i][3]);
                System.out.println();
            }
        }
        

        System.out.println("Details of silver medals winner(s) is(are)");
        for(int i =0; i<libraryRecord.length;i++){
            if(Integer.parseInt(libraryRecord[i][3])==silver){
                System.out.println("Id: "+libraryRecord[i][0]);
                System.out.println("Name: "+libraryRecord[i][1]+" "+libraryRecord[i][2]);
                System.out.println("Number of books readed: "+libraryRecord[i][3]);
                System.out.println();
            }
        }
        

        System.out.println("Details of bronze medals winner(s) is(are)");
        for(int i =0; i<libraryRecord.length;i++){
            if(Integer.parseInt(libraryRecord[i][3])==bronze){
                System.out.println("Id: "+libraryRecord[i][0]);
                System.out.println("Name: "+libraryRecord[i][1]+" "+libraryRecord[i][2]);
                System.out.println("Number of books readed: "+libraryRecord[i][3]);
                System.out.println(); 
            }
        }
              

    }

    
}


    

