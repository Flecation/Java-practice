public class ass11 {
    public static void main(String[] args) {
        String emails[]= {"Ursa.Collins.@anuverplaice.co.uk","George.Green.+anuverplaice.com","Leanne.Young.@newmail1919.co.uk","Mary.Ulrich.%sumwere19.com","Zane.Quaid.&myschul2018.co.uk","Nancy.Oakley.@anuverplaice.com",	"Aaron.Zachary.@somewer2000.co.uk","Francis.Ulrich.%newmail1919.co.uk","Thomas.Adams.@newmail1919.co.uk","Zane.Adams.*myschul2018.co.uk","Zane.Pearson.@anuverplaice.co.uk","Wilma.Lawrence.%anuverplaice.com",	"Zane.Montgomerie.@anuverplaice.co.uk","Victoria.Drew.+newmail1919.co.uk","Mary.Rawson.@newmail1919.co.uk","Mary.Winston.@newhere2019.com","Wilma.Rawson.@myschul2018.co.uk","Thomas.Evans.@mycoleg2010.co.uk",		"Yvette.Turner.@sumwere19.com","Aaron.Valdez.%anuverplaice.co.uk","Jason.Pearson.@sumwere19.com",		"Yvette.King.@mycoleg2010.co.uk","Thomas.Green.@newmail1919.co.uk","Nancy.Turner.&sumwere19.com",		"Mary.Green.%sumwere19.com","Karla.Turner.@anuverplaice.com","Colin.Oakley.@newhere2019.com",		"Thomas.Xiong.@newmail1919.co.uk","Ursa.King.@mycoleg2010.co.uk","Leanne.Zachary.@newhere2019.com",		"Zane.Lawrence.@sumwere19.com","Zane.Oakley.@myschul2018.com","Xavier.Ulrich.@myschul2018.co.uk",
		"Steven.Zachary.@mycoleg2010.co.uk","Ursa.Collins.@newmail1919.co.uk","Colin.Nelson.@somewer2000.co.uk","Colin.Turner.@newmail1919.co.uk","Olive.Rawson.@newhere2019.com","Yvette.Hiatt.+somewer2000.co.uk","Jason.Forrest.*mycoleg2010.co.uk"};

        String check = "@";
        int count =0;
        for( int i =0; i<emails.length;i++){
            if(emails[i].contains(check)){
                continue;
            }else{
                System.out.println(emails[i]);
                count++;
            }
        }
        System.out.println();
        System.out.println("Total number of invalid email is "+count);
    }
}
