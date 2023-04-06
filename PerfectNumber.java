import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int ip = sc.nextInt();

		if(checkPerfectNo(ip))
		{
			System.out.println("It's a Perfect Number");
		}
		else
		{
			System.out.println("It's not a Perfect Number");
		}
	}


	public static boolean checkPerfectNo(int num)
	{
		int sum = 0;

		for(int i=1; i<num; i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}

		if(sum == num)
		{
			return true;
		}

		return false;
	}

}
