/*wap print total sum of square from 1 to 100.
  number        square
    4             16

  total         value 
*/
class SquareSum
{
	public static void main(String[] args)
	{

	int num=1,sum=0;
	System.out.print("\n\t\tNumber\tsquare");
	while(num<=10)
	{
	 int square=num*num;
	System.out.print("\n\t\t"+num+"         "+square);
	sum=sum+square;
	
	num++;
	}
	//System.out.print("\n\t\t========================");
	
        System.out.print("\n\t\tTotal\t\t"+sum);
	}
}