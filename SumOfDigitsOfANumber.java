import java.util.*;
class SumOfDigits
{	int sum=0,rem;
	public int sum(int num)
	{	while(num>0){
		rem=num%10;
		sum=sum+rem;
		num=num/10;
	}

		return sum;
	}
}
class SumOfDigitsOfANumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
			int num=sc.nextInt();
			SumOfDigits digit=new SumOfDigits();
				int value=digit.sum(num);
			System.out.println("The sum of digits of "+num+" is "+value);
	}
}
