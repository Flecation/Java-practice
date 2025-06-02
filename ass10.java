public class ass10 {
    public static void main(String[] args) {
        int [][] list_1f  = { { 2010, 8 }, { 4800, 11 }, { 2011, 4 }, { 5000, 9 } };
        double assistantSalary = 1000.00;
        for (int i = 0; i < list_1f.length; i++) {
            if(list_1f[i][0]>5000 || list_1f[i][1] >=10){
                double result = assistantSalary+(assistantSalary*0.1);
                System.out.println((i+1)+" day of bonus is 10% of salary");
                System.out.println("Salary : "+result);
            }else if(list_1f[i][0]>2000 && list_1f[i][1] >=5){
                double result = assistantSalary+(assistantSalary*0.05);
                System.out.println((i+1)+" day of bonus is 5% of salary");
                System.out.println("Assistant Salary : "+result);
            }else{
                System.out.println((i+1)+" day of bonus is 0% of salary");
                System.out.println("Assistant Salary : "+assistantSalary);
            }
        }
    }
}
