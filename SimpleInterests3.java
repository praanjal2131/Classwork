import java.util.*;
class SimpleInterests3
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);

System.out.print("\n\t\t\tEnter the principal amount:");
double p= sc.nextDouble();

System.out.print("\n\t\t\tEnter the rate of interest :");
double r=sc.nextDouble();
int t=3;

int i=1;
while(i<=3)
{
if(i==1)
{
System.out.println("\n\t\t\ttime in years=1");

double si=(p*r*1)/100;

System.out.print("\n\t\t\tthe principal amount ="+p);
System.out.print("\n\t\t\tthe rate of interest ="+r);
System.out.print("\n\t\t\tSimple Interest is =" +si);

double pa=p+si;
System.out.print("\n\t\t\t================================");

System.out.print("\n\t\t\tthe rate of payable amount ="+pa);
}


else if(i==2)
{
System.out.print("\n\t\t\ttime in years=2");

double si=(p*r*2)/100;

System.out.print("\n\t\t\tthe principal amount ="+p);
System.out.print("\n\t\t\tthe rate of interest ="+r);
System.out.print("\n\t\t\tSimple Interest is =" +si);

double pa=p+si;
System.out.print("\n\t\t\t================================");

System.out.print("\n\t\t\tthe rate of payable amount ="+pa);
}

else if(i==3)
{
System.out.print("\n\t\t\ttime in years=3");

double si=(p*r*3)/100;

System.out.print("\n\t\t\tthe principal amount ="+p);
System.out.print("\n\t\t\tthe rate of interest ="+r);
System.out.print("\n\t\t\tSimple Interest is =" +si);

double pa=p+si;
System.out.print("\n\t\t\t================================");

System.out.print("\n\t\t\tthe rate of payable amount ="+pa);
}
i++;
}
}
}