package tictactoe;

import java.util.ArrayList;

import tictactoe.Case;

public class Grille 
{
	private ArrayList<Case> cases;
	private int longueur;
	private int largeur;
	
	public Grille()
	{
		cases = new ArrayList<Case>();
		longueur = 3;
		largeur = 3;
		
	}
	
	public int getLongueur()
	{
		return longueur;
	}
	
	public int getLargeur()
	{
		return largeur;
	}
	
	public ArrayList<Case> getCases()
	{
		return cases;
	}
	
	public void setLongueur(int longueur)
	{
		this.longueur = longueur;
	}
	
	public void setLargeur(int largeur)
	{
		this.largeur = largeur;
	}
	
	public void setCases(ArrayList<Case> cases)
	{
		this.cases = cases;
	}
	
	public String toString(boolean devoile)
	{
		String grilleString = "";
		
		for(int i = 0; i < this.longueur; i++)
		{
			for(int j = 0; j < this.largeur; j++)
			{
				if(devoile == true || this.getCase(i, j).getDevoile())
				{
					grilleString += this.getCase(i, j).getContenu() + " ";
				}
				else
				{
					grilleString += "X ";
				}
			}
			
			grilleString += "\n";
		}
		
		return grilleString;
	}

	private Object getCase(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}

