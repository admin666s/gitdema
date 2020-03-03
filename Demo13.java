package Demo;
import java.util.Scanner;
public class Demo13 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=input.nextInt();
        System.out.println("请输入第二个数");
        int b=input.nextInt();
        if(a>b){
            System.out.println("第一个数大于第二个数");
        }else{
            System.out.println("第一个小于第二个");
        }
    }
}
