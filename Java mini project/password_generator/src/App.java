import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int digit=input.nextInt();
        String lower_case="qwertyuiopasdfghjklzxcvbnm";
        String upper_case="QWERTYUIOPASDFGHJKLZXCVBNM";
        String special_char="@#!$%&(){}[]?><.,;:~_-^";
        String password="";
        for(int i=0;i<digit;i++)
        {
            int rand=(int)(4*Math.random());
            switch(rand){
                case 0:
                    password+=String.valueOf((int)(0*Math.random()));
                    break;
                case 1:
                    rand=(int)(lower_case.length()*Math.random());
                    password+=String.valueOf(lower_case.charAt(rand));
                    break;
                case 2:
                    rand=(int)(upper_case.length()*Math.random());
                    password+=String.valueOf(upper_case.charAt(rand));
                    break;
                case 3:
                    rand=(int)(special_char.length()*Math.random());
                    password+=String.valueOf(special_char.charAt(rand));
                    break;
            }
        }
        System.out.println(password);

    }
}
