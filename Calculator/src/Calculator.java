public class Calculator
{
   private int result;
   public void add(int n)
  {
	result=result+n;
   }
   public void substract(int n)
   {
	   result=result-n;
   }
   public void multiply(int n)
   {
	   result=result*n;
   }
   public void divide(int n)
   {
	   result=result/n;
   }
   public int getResult()
   {
	   int temp=result;
	   result=0;
	   return temp;
   }
}
