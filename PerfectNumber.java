import java.util.*;
class checkPerfect
{	int sum=0,rem;
	public void check(int num)
	{	int sum=0;
		for(int i=1;i<(num-1);i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("Not perfect");
		}
	}
}

class PerfectNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
			int num=sc.nextInt();
			checkPerfect obj=new checkPerfect();
				obj.check(num);
			
	}
}
