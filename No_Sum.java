import java.util.*;
class No_Sum
{
public static void main(String [] args)
{
long n=34567834;
long rem=0;
long i=n; long sum=0;
while(i!=0)
{
	rem=i%10;
	System.out.print("\n\tThe number is =34567834" );
	System.out.print("\t"+rem+ " ");
	i=i/10;
	sum=sum+rem;

}
	System.out.print("\n\tThe value of i = "+i);
	System.out.print("\n\tThe sum of number is = "+sum);

}
}
