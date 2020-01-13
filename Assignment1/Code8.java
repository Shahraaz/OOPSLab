import java.util.*;

public class Code8
{
	public static void main(String []args)
	{
		Integer n,x;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int xor = 0;
		for(int i=1;i<=n;++i)
			xor = xor^i;
		for(int i=1;i<n;++i)
		{	
			x = input.nextInt();
			xor = xor^x;
		}
        System.out.println(xor);
        input.close();
	}
}
