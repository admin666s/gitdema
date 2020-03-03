package Demo;
import java.util.Scanner;
public class Demo14 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("压岁钱");
        int qian=input.nextInt();
        if(qian>1000){
            System.out.println("捐助儿童");
        }else if(qian>=500){
            System.out.println("买航模");
        }else if(qian<500){
            System.out.println("买书");
        }
    }
}
