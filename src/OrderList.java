import java.util.List;

class OrderList implements FoldOperation<Integer, List<Integer>>
{
	boolean isInserted = false;
	private Integer myNumber;
	
	public OrderList(Integer aNumber)
	{
		myNumber = aNumber;
	}
	
	public List<Integer> join(Integer x, List<Integer> y)
	{
		if (x > myNumber && !isInserted)
		{
			y.add(myNumber);
			isInserted = true;
			myNumber = x;
			join(myNumber, y);			
		}
		else
			y.add(x);
		
		return y;
	}
}