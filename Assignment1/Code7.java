import java.util.*;

public class Code7
{
	public static void main(String []args)
	{
		Integer n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		double sum = 0,mul=1;
		for(int i=1;i<=n;++i)
		{
			sum += 1/(double)mul;
			mul = mul*i;
		}
        System.out.println(sum);
        input.close();
	}
}
