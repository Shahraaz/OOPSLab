import java.util.*;

public class Code1
{
	public static void main(String []args)
	{
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int arr[];
		arr = new int[n];
		for(int i=0;i<n;++i)
			arr[i] = input.nextInt();
		int sum = input.nextInt();
		int cnt = 0;
		for(int i=0;i<n;++i)
			for(int j = i+1;j<n;++j)
				if((arr[i] + arr[j]) == sum)
				{
					if(cnt == 0)
						System.out.println("Found the pairs whose sum is " + sum  +  " are");									
					System.out.println(arr[i] + "," + arr[j]);
					cnt = cnt + 1;
				}
		if(cnt == 0)
		{
			System.out.println("No pairs Found");			
		}
		
	}
}
