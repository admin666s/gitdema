package Demo;
import java.util.Scanner;
public class Demo7 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("用户名");
        char ming=input.next().charAt(0);
        System.out.println("密码");
        int mi=input.nextInt();
        char a='青';
        int b=123;
        if(ming==a&&mi==b) {
            System.out.println("欢迎你青");
        }else{
            System.out.println("对不起青");
        }
    }
}
