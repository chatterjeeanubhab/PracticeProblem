import java.util.ArrayList;
import java.util.Scanner;
public class Stringformat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        System.out.println(str);
        ArrayList<Character>list=new ArrayList<>();
        int n=str.length();
        for(int i=0;i<n;i++)
            {
                if(str.charAt(i)<=57 && str.charAt(i)>48)
                    {   
                        int val=str.charAt(i)-48;
                        while(val>1)
                            {
                                System.out.print(str.charAt(i-1));
                                val--;
                            }
                        
                        
                    }
                    else  
                        {
                             System.out.print(str.charAt(i));
                        }
            }
           
    }
    
}
