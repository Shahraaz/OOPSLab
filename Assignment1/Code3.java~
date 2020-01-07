import java.util.*;

public class Code3
{
	public static void main(String []args)
	{
		Integer n,x;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
		for(int i=0;i<n;++i)
		{	
			x = input.nextInt();
			Integer temp = count.get(x);
			count.put(x,(temp == null ? 0 : temp) + 1);
		}
		int cnt = 0;
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			cnt = cnt + Math.min(2,entry.getValue());
		}
		System.out.println(cnt);
	}
}
