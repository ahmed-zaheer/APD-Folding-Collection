class MaxNumber implements FoldOperation<Integer,Integer>
{

	public Integer join(Integer t1, Integer t2) 
	{
		
		return t1 > t2 ? t1 : t2;
		
	}
	
}