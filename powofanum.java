import java.util.Scanner;

public class powofanum {
        public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        System.out.println("Enter power");
        int power=sc.nextInt();
        int pow=1
                for(int i=0;i<power;i++)
                  pow=pow*num;
        System.out.println("Power is: "+ power);
        }
    
}
