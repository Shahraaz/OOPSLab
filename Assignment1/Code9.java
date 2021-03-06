import java.util.*;

public class Code9
{
	static void partition(int idx,int arr[],int sum1,int sum2,int sum3,List<Integer> l1,List<Integer> l2,List<Integer> l3)
	{
		int n1 = l1.size(),n2 = l2.size(),n3 = l3.size();
		if(idx == arr.length)
		{
			if(sum1 == sum2 && sum2 == sum3 && n1 > 0 && n2 > 0 && n3 > 0)
			{
				System.out.println(Arrays.toString(l1.toArray()));
				System.out.println(Arrays.toString(l2.toArray()));
				System.out.println(Arrays.toString(l3.toArray()));
				System.exit(0);
			}
			return;
		}
		l1.add(arr[idx]);
		partition(idx+1,arr,sum1+arr[idx],sum2,sum3,l1,l2,l3);
		l1.remove(n1);

		l2.add(arr[idx]);
		partition(idx+1,arr,sum1,sum2+arr[idx],sum3,l1,l2,l3);
		l2.remove(n2);

		l3.add(arr[idx]);
		partition(idx+1,arr,sum1,sum2,sum3+arr[idx],l1,l2,l3);
		l3.remove(n3);
	}
	public static void main(String []args)
	{
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int arr[],sum = 0;
		arr = new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i] = input.nextInt();
			sum += arr[i];		
		}
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		if(sum%3 == 0)
			partition(0,arr,0,0,0,l1,l2,l3);
        System.out.println("No");
        input.close();
	}
}
