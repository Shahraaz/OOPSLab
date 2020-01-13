import java.util.*;

public class Code2
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
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if(entry.getValue()%2 == 1) 
				System.out.println("Key = " + entry.getKey() + ", Count = " + entry.getValue()); 
        }
        input.close();
    }
    
}
