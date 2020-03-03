package Demo;
import java.util.Scanner;
public class Demo9 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("输出A的值");
        int a=input.nextInt();
        System.out.println("输出B的值");
        int b=input.nextInt();
        System.out.println("输出C的值");
        int c=input.nextInt();
        if(a<b){
            //默认
        }else {
            int d=a;
                a=b;
                b=d;
        }
        if(a<c){
            //默认
        }else {
            int d = c;
            c = a;
            a = d;
        }
        if(b<c){
            //默认
        }else{
            int d=b;
                b=c;
                c=d;


        }
        System.out.println("abc的值a的值"+a+"B的值"+b+"C的值"+c);
        }
    }

