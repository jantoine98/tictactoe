package tictactoe;

public class Case 
{
	private int x;
	private int y;
	private boolean devoile;
	private String contenu;
	
	public Case(int x, int y, String contenu)
	{
		this.x = x;
		this.y = y;
		this.devoile = false;
		this.contenu = contenu;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public boolean getDevoile()
	{
		return devoile;
	}
	
	public String getContenu()
	{
		return contenu;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setDevoile(boolean devoile)
	{
		this.devoile = devoile;
	}
	
	public void setContenu(String contenu)
	{
		this.contenu = contenu;
	}
	
	public String toString()
	{
		return "(" + getX() + "," + getY() + ")" + " contenu: " + getContenu() + " , devoile : " + getDevoile();
	}

}
