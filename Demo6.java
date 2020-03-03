package Demo;
import java.util.Scanner;
public class Demo6 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
         System.out.println("请输入积分");
      int x=input.nextInt();
      double a=0.9;    //小于2000的折扣
      double b=0.8;    //2000到4000的折扣
      double c=0.7;    //4000到8000的折扣
      double d=0.6;   //大于8000的折扣
      if(x<2000) {
          System.out.println("该会员享受的折扣" + a);
            }else if(x>2000&&x<=4000)
          {
              System.out.println("该会员享受的折扣"+b);}
              else if (x>4000&&x<=8000){
                  System.out.println("该会员享受的折扣"+c);}
                  else{
                      System.out.println("给会员享受的折扣"+d);
      }
   }
}
