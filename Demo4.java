package Demo;
import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args){
        System.out.println("我行我素购物系统>客户信息管理>添加客户信息");
        Scanner input =new Scanner(System.in);
        System.out.println("请输入会员");
        int custNo=input.nextInt();
        System.out.println("会员生日");
        int custBirth=input.nextInt();
        System.out.println("积分");
        int custScore=input.nextInt();
        if(custNo>=1000) {
            System.out.println("已录入的会员信息是\n" + custNo + "\t" + custBirth + "\t" + custScore);
        }else{
            System.out.println("信息录入失败");
        }
    }
}
