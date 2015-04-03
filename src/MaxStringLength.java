class MaxStringLength implements FoldOperation<String,Integer>
{	
	public Integer join(String t1, Integer t2)
	{	
		if (t1.length() > t2)
			return t1.length();
		else 
			return t2;
	}
}