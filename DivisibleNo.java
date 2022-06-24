/*wap print all numbers from 22 to 400 which is divisible by 11 */





class DivisibleNo
{
	public static void main(String[] args)
	{
	System.out.print("\n\t\tNumbers divisible by 11 from 22 to 400 are:");
	int i=22;
	while(i<=400)
	{
		if(i%11==0)
		System.out.print("\n\t\t"+i);
		i++;
	}
	}
}