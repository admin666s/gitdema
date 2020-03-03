package Demo;
import java.util.Scanner;
public class Demo11 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入成绩");
        double score=input.nextDouble();
        if(score==100) {
            System.out.println("爸爸给比买辆车");
        }else if(score>=90) {
            System.out.println("老娘给你买个笔记本电脑");
        }else if(score>=60){
            System.out.println("老娘给你买个手机");
        }else{
            System.out.println("一瓦斯给你");
        }

    }
}
