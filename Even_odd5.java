/*wap print total odd even no from 201 to 400
  
*/
class Even_odd5
{
	public static void main(String[] args)
	{

	int num=201;
	int ce=0;//count for even
	int co=0;//count for odd
	int total_e=0;
 	int total_o=0;
	int diff_t=0;
	int diff_c=0;
	while(num<=400)
	{
	if(num%2==0)
	total_e=total_e+num;
	if(num%2==1)
	total_o=total_o+num;
	diff_t=total_e-total_o;
	
	
	ce++;
	co++;
	
	num++;
	}
	System.out.print("\n\t\tTotal Even Numbers="+total_e);
	System.out.print("\n\t\tTotal odd Numbers="+total_o);
	System.out.print("\n\t\t========================");
	System.out.print("\n\t\tDifferece of Even and odd="+diff_t);
	
	System.out.print("\n\t\t========================");
        System.out.print("\n\t\tCount of Even Numbers="+ce);
	System.out.print("\n\t\tCount of Odd Numbers="+co);
	diff_c=ce-co;
	System.out.print("\n\t\tDifferece of Count="+diff_c);
	}
}