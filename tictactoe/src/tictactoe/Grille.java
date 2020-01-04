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
		longueur = 9;
		largeur = 9;
		
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
}

