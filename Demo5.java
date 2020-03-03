package Demo;
import java.util.Scanner;
public class Demo5 {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("请输入会员：是（Y）否（x）");
        String identity=input.next();
        System.out.println("请输入购物金额");
        int a=input.nextInt();
        double zhe=0.9;
        double zhe1=0.8;
        double zhe2=0.7;
        if(identity.equals("Y")) {
            if (a >= 200) {
                System.out.println("实际支付" + zhe2 * a);
            } else {
                System.out.println("实际支付" + zhe1 * a);
            }
        }else{
            if(a>100){
                System.out.println("实际支付"+a*zhe);
            }
            }
        }

    }


