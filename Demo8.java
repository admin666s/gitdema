package Demo;
import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("年龄");
        int name=input.nextInt();
        System.out.println("性别");
        char sex=input.next().charAt(0);
        int a=7;
        int b=5;
        char c='男';
        if((7>=name||(name>=5)&&sex=='男')) {
            System.out.println("可以搬动");
        }else{
            System.out.println("不可以搬动");
        }
    }

}
