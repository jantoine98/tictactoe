package tictactoe;

public class Manche 
{
	private int nbManches;
	private int point;
	
	public Manche(int nbManches, int point)
	{
		this.nbManches = 3;
		this.point = point;
	}
	
	public int getNbManches()
	{
		return nbManches;
	}
	
	public int getPoint()
	{
		return point;
	}
	
	public void setNbManches(int nbManches)
	{
		this.nbManches = nbManches; 
	}
	
	public void setPoint(int point)
	{
		this.point = point;
	}
	
	
}
