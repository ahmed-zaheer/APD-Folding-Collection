import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestFoldingNumber {

	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		System.out.println("Enter some numbers (terminate with an empty line):");

		String line = in.nextLine();
		while(line.length() > 0)
		{
			String[] numbers;
			
			numbers = line.split(" ");
			for(String num: numbers)
            	numList.add(new Integer(num));
            
			line = in.nextLine();
		}

		FoldOperation<Integer,Integer> trans = new  AddNumber();	
		Integer num = fold(trans, numList, 0);		
		System.out.println("Adding numbers gives:\n");
		System.out.println(num);
		
		trans = new  MaxNumber();
		Integer largest = fold(trans, numList, 0);
		System.out.println("Larger numbers gives:\n");
		System.out.println(largest);
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
