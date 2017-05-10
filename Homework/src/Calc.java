import java.util.Scanner;

public class Calc
{
public static void main( String arg[] )
{
   int num1;
   int num2;
   Scanner input = new Scanner(System.in);
   System.out.print( "Enter first integer: ");
   num1 = input.nextInt();
   System.out.print( "Enter second integer: ");
   num2 = input.nextInt();
   
   System.out.printf( "µ¡¼À: %d" , num1+num2);
   System.out.printf( "»¬¼À : %d" , num1-num2 );
   System.out.printf( "°ö¼À : %d" , num1*num2 );

   }
}