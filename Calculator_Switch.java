import java.util.*;
class Calculator_Switch
{
        public static void main(String[] args)
          {
                Scanner sc=new Scanner(System.in);

                System.out.print("\n\t\t\t    Calculator  ");
                System.out.print("\n\t\t\t================\n\n");

                System.out.print("\n\t\t\t+:ADDITION ");
                System.out.print("\n\t\t\t-:SUBSTRACTION ");
                System.out.print("\n\t\t\t*:MULTIPLICATION ");
                System.out.print("\n\t\t\t/:DIVISION ");
                System.out.print("\n\t\t\t================");

                System.out.print("\n\t\t\tEnter the choice: ");
                char c=sc.next().charAt(0);

                System.out.print("\n\t\t\tEnter number1=");
                int num1=sc.nextInt();
          
                System.out.print("\n\t\t\tEnter number2=");
                int num2=sc.nextInt();


                switch(c)
                 {
                       case '+':
                        {
                              int result =num1+num2;
                              System.out.print("\n\t\t\tAddition Result= "+result);
                       break;
                        }

                       case '-' :
                        {
                              int result =num1-num2;
                              System.out.print("\n\t\t\tSubstraction Result= "+result);
                       break;
                        }

                       case '*' :
                        {
                               int result =num1*num2;
                               System.out.print("\n\t\t\tMultiplication Result= "+result);
                       break;
                         }

                       case '/' :
                         {
                                double result =num1/num2;
                                System.out.print("\n\t\t\tDivision Result= "+result);
                       break;
                          }

                       default :
                         {
                                System.out.print("\n\t\t\tEntered wrong choice.....");
                        break;
                          }
                   }

          }
}
