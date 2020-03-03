package Demo;
import java.util.*;
public class Demo3 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        System.out.println("我行我素购物管理系统>幸运抽奖\n");
        System.out.println("请输入号码");
        Scanner input = new Scanner(System.in);
        int huiyuan = input.nextInt();
        int baiwei = huiyuan / 100 % 10;
        //判断会员是否是幸运会员
        if (baiwei ==random) {
            System.out.println(huiyuan+"幸运会员");
        }else{
            System.out.println(huiyuan+"不是会员");
        }
    }
}