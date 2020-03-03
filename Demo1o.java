package Demo;
import java.util.Scanner;
public class Demo1o {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输出整数");
        int a = input.nextInt();
        int b = 3;
        int c = 5;

        if ( a%b==0 ||a%c==0) {
            System.out.println("该数是3和5的的倍数");
        }else{
            System.out.println("该数不是3和5的倍数");
        }
    }
}