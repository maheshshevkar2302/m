package Return_type;

public class return_type_1 
{
	public static void main(String[] args) 
	{
		int num1=addition(20,30);
		System.out.println(num1);
		
		int num2=20;
		System.out.println(num1*num2);
	}
	
	public static int addition(int q,int w) 
	{
		int sum=q+w;
		System.out.println(sum);
		return sum;
		
	}

}
