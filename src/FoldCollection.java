import java.util.List;


public class FoldCollection {

	public static <T1,T2> T2 fold(FoldOperation<T1,T2> func,List<T1> list, T2 r)
	{
		T2 result = r;
		
		for(T1 val: list)
		{
			result = func.join(val, result);
		}
		
		return result;
	}
}
