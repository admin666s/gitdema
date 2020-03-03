package Demo;
import javax.swing.text.Style;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Demo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biao = 5000;
        System.out.println("你出行的月份1-12");
         int yue = input.nextInt();
        if (yue > 12 || yue < 0) {
            System.out.println("请输入合法月份");
        } else if (yue >= 4 && yue < 11) {
            System.out.println("请输入什么仓：头等舱输入1，经济舱输入2");
            int a = input.nextInt();
            if (a == 1) {
                System.out.println("你的机票" + biao * 0.9);
            } else if (a == 2) {
                System.out.println("你的机票" + biao * 0.8);
            }
        } else if (yue < 4 || yue > 10) {
            System.out.println("请输入什么仓：头等舱输入1，经济舱输入2");
            int a = input.nextInt();
            if (a == 1) {
                System.out.println("你的机票" + biao * 0.5);
            } else if (a == 2) {
                System.out.println("你的票" + biao * 0.4);
            }
        }
    }
}






