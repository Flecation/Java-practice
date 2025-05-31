

public class ass1 {
    public static void main(String[] args){
        String passwords[]= {"Jhzsledx2","Kbwwasyaa","Emti9mkxx","Oewdbekh7","ffuy8ntf8",		"Aejahczx7","Blmqgpjn5","Ndjehzbz5","Dslcfvxw","Dbjipyhv8","Pesdhqaf2","Znmotmow9","Hkcoqkkz9","hjroeomx6","Wknimqip4",		"Pfudlmcd8","Eodmjxky0","Nreozcvmr","Xykhsnqp8","Isrhydgq8","Vtwoitwe0","Mnmdekrl5","Fxxegcno4","Uvybymbx9",		"Azggugnb6","Qugfvntn5","Ymnxibhl5","Essnfuhy7","Qrrvgbbt8","Sgfgzzod9","5rmlowuyy9"};
        int count=0;
        for(int i =0;i<passwords.length;i++){
            String check = passwords[i];
            boolean char_check,int_check;
            char_check = BoldletterCheck(check);
            int_check =  findInt(check);
            if(!char_check || !int_check){
                System.out.println(passwords[i]);
                count++;
            }
        }
        System.out.println("Total incorrect password is "+ count);
        
    }

    static boolean BoldletterCheck(String a){
        char Bold = a.charAt(0);
        char []  letter = "ABCDEFGHIJKLMANOPQRSTUVWXYZ".toCharArray();
        for(int i =0;i<letter.length;i++){
            if(letter[i]==Bold){
                return true;
            }
        }
        return false;
    }

    static boolean findInt(String a){
        char[] check = a.toCharArray();
        char [] Integer = "123456789".toCharArray();
        for(int i =0;i<check.length;i++){
            for(int j =0;j<Integer.length;j++){
                if(check[i] == Integer[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
