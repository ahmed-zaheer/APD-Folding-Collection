import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestFoldingOrderList {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number to be inserted: ");
		Integer nNumber = new Integer(in.nextLine());
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		System.out.println("Enter sorted numbers (terminate with an empty line):");

		String line = in.nextLine();
		while(line.length() > 0)
		{
			String[] numbers;
			
			numbers = line.split(" ");
			for(String num: numbers)
            	numList.add(new Integer(num));
            
			line = in.nextLine();
		}		
		
		ArrayList<Integer> orderedList = new ArrayList<Integer>();
		FoldOperation<Integer, List<Integer>> f = new  OrderList(nNumber);
		fold(f, numList, orderedList);
		
		System.out.println("Order List gives:\n");
		System.out.println(orderedList);
	}


	public static <T1,T2> T2 fold(FoldOperation<T1,T2> tr,List<T1> a, T2 d)
	{
		T2 result = d;
		
		for(T1 val: a)
		{
			result = tr.join(val, result);
		}
		
		return result;
	}

}
