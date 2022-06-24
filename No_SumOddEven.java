import java.util.*;
class No_SumOddEven
{
	public static void main(String [] args)
	{
		long n=34567834;
		long rem=0;
		long i=n; long sum=0;
		long evensum=0;
		long oddsum=0;
		while(i!=0)
		{
	
			rem=i%10;
	
			if(rem%2==0)
			{
				evensum=evensum+rem;
				System.out.print("\t"+rem+ " ");
			}
			else
	
				oddsum=oddsum+rem;
	
		i=i/10;
	
		sum=sum+rem;

		}
		System.out.print("\n\tThe sum of odd no is=" +oddsum);
		System.out.print("\n\tThe sum of even no is=" +evensum);
		System.out.print("\n\tThe value of i = "+i);
		System.out.print("\n\tThe sum of number is = "+sum);

	}
}
