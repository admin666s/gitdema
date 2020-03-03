package Demo;
import java.util.Scanner;
public class Demo2 {
    public static void main(String []args){
         Scanner input =new Scanner(System.in);
         System.out.println("输入成绩");
         int zhang =input.nextInt();
         if (zhang>=98){

             System.out.println("奖励奥特曼一个");
        }else{
             System.out.println("一瓦斯给你");

         }

    }
}
