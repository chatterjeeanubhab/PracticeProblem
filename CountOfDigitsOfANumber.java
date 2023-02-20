package MYPACK.CountOfDigitsOfANumber;
import java.util.*;
class SumOfDigits
{	int sum=0,count=0;
	public int sum(int num)
	{	while(num>0){
		count=count+1;
		num=num/10;
	}

		return count;
	}
}
class CountOfDigitsOfANumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
			int num=sc.nextInt();
			SumOfDigits digit=new SumOfDigits();
				int count=digit.sum(num);
			System.out.println("The number of digits of "+num+" is "+count);
	}
}
