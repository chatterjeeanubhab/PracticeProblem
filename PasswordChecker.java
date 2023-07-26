//Mr. Robot is making a website, in which there is a tab to create a password. As with other websites, there are rules so that the password gets complex and none can predict the password for another. So he gave some rules like:At least one numeric digit/ At Least one Small/Lowercase Letter/At Least one Capital/Uppercase Letter/Must not have space /Must not have slash (/)/At least 6 characters .If someone inputs an invalid password, the code prints: “Invalid password, try again”.Otherwise, it prints: “password valid”.
//Input Format:A line with a given string as a password
//Output Format:If someone inputs an invalid password, the code prints: “Invalid password, try again”.
//Otherwise, it prints: “password valid”, without the quotation marks.
//Constraints:
//Number of characters in the given string <=10^9
//Sample input 1:abjnlL09
//Sample output 1:password valid
//Sample input 2: jjnaskpk
//Sample output 2: Invalid password, try again
Mr. Robot is making a website, in which there is a tab to create a password. As with other websites, there are rules so that the password gets complex and none can predict the password for another. So he gave some rules like:At least one numeric digit/ At Least one Small/Lowercase Letter/At Least one Capital/Uppercase Letter/Must not have space /Must not have slash (/)/At least 6 characters .If someone inputs an invalid password, the code prints: “Invalid password, try again”.Otherwise, it prints: “password valid”.
Input Format:A line with a given string as a password
Output Format:If someone inputs an invalid password, the code prints: “Invalid password, try again”.
Otherwise, it prints: “password valid”, without the quotation marks.
Constraints:
Number of characters in the given string <=10^9
Sample input 1:abjnlL09
Sample output 1:password valid
Sample input 2: jjnaskpk
Sample output 2: Invalid password, try again

import java.util.*;
class PasswordChecker{
    public static void main(String[] args) {
        //String str="";
        System.out.println("Enter password");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
        int count1=0,count2=0,count3=0,count=0;
       System.out.println("password is:"+str);
        int len=str.length();
        if(len<6)
            {
                
                System.out.println("password invalid");
               
            }
            else{
                for(int i=0;i<len;i++)
                    {       
                            if(str.charAt(i)==' ' || str.charAt(i)=='/' ){
                        
                                  System.out.println("Password invalid");
                                    break;
                            
                            }
                            else  
                                {
                                    for(int j=0;j<len;j++){
                                    if(str.charAt(j)<123 && str.charAt(j)>96){
                                       count1=1;
                                    }
                                    else if(str.charAt(i)<91 && str.charAt(i)>64)
                                    {
                                        count2=1;
                                    }
                                    else if( str.charAt(i)<58 && str.charAt(i)>47)
                                        {
                                            count3=1;
                                        }
    
                                }
                                 count=(count1+count2+count3);
                                
                                }
                            
                    }
                    if(count==3)
                         {
                         System.out.println("password valid");
                        }
                         else
                         {
                          System.out.println("Password invalid");
                           
                         }
                
            }
           

    }
}
