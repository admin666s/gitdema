package Demo;
import java.util.Scanner;
public class Demo1 {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("我是你爸爸");
        System.out.println("请输入数字");
        int a=input.nextInt();
        if(a>=20) {
            a--;
            System.out.println("a=" +a);
        }else{
            a++;
            System.out.println("a="+a);
        }
    }
}
