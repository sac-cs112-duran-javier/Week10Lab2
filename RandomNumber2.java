public class RandomNumber2 {
	private int num=0;
	
	private int max=0;
	
	private int min=0;
	 
	public int GetANumber()
	{		
		GetANumber(min, max);
		return num;
	}
	public void SetLowNumber(int low)
	{
		min= low;
	}
	public void SetHighNumber(int high)
	{
		max=high;
	}
	private void GetANumber(int lo,int hi)
	{
		num=(int)(Math.floor(Math.random() * ((hi-lo)+1) + lo));
	}

}