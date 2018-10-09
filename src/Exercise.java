
public class Exercise {
	
	private String name = "";
	private int score_Received = 0 ;
	private int total_Point = 0 ;
	
	Exercise()
	{
		
	}
	Exercise(String str, int sR, int tP)
	{
		name = str;
		score_Received = sR;
		total_Point = tP;
	}
	
	public String getName()
	{
		return name;
	}
	public int getScoreReceived()
	{
		return score_Received;
	}
	public int getTotalPoint()
	{
		return total_Point;
	}
	public void setName(String str)
	{
		name = str;
	}
	public void setScoreReceived(int n)
	{
		score_Received = n;
	}
	public void setTotalPoint(int n)
	{
		total_Point = n;
	}
	
	public String toString() 
	{
		return String.format("%-30s%-10d%-10d", name, score_Received, total_Point);
	}

}
