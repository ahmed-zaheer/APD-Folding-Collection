import java.util.*;


public class TestFoldingString 
{	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> text = new ArrayList<String>();
		System.out.println("Enter some text (terminate with an empty line):");

		String line = in.nextLine();
		while(line.length() > 0)
		{
			String[] words = line.split(" ");
			for(String word: words)
				text.add(word);
			line = in.nextLine();
		}
		
		FoldOperation<String,Integer> trans = new  MaxStringLength();	
		Integer largestStrLen = FoldCollection.fold(trans, text, 0);
		System.out.println("longest string length in the collection gives:\n");
		System.out.println(largestStrLen);		
	}


//	public static <T1,T2> T2 fold(FoldOperation<T1,T2> tr,List<T1> a, T2 d)
//	{
//		T2 result = d;
//		if (a.size() > 0)
//		{
//			for(T1 val: a)
//			{
//				result = tr.join(val, result);
//			}
//		}
//		return result;
//	}
}


//class LargerStringLength implements Fold<String,Integer>
//{	
//	public Integer join(String x, Integer y)
//	{	
//		if (x.length() > y)
//			return x.length();
//		else 
//			return y;
//	}
//}