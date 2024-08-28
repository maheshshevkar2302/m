package Return_type;

public class return_type_5 
{
	public static void main(String[] args) 
	{
		int num1=addition(10,20);
		int num2=50;
		System.out.println(num1+num2);
		
	}
	public static int addition (int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}

}
