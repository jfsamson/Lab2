import java.awt.Graphics;

/******************************************************
Cours:   LOG121
Session: H2015
Groupe:  2
Projet: Laboratoire #1
Étudiant(e)s: Marion Briot
              
*******************************************************
Historique des modifications
*******************************************************
2013-01-21 Version initiale (et1)
*******************************************************/

public abstract class Forme{
	protected double aire;
	protected double distance;
	protected String nom;
	protected int nseq;

	abstract void dessiner(Graphics g);

	abstract double getAire();
	
	abstract double getDistance();
	
	abstract void setX(int x);
	
	abstract void setY(int y);
	
	public int getNseq(){
		return nseq;
	}
	
	public String getNom(){
		return nom;
	}
	
	public int getCode() {
		int code = 0;
		switch (nom) {
			case "CAREE":
				code = 0;
				break;
			case "RECTANGLE":
				code = 1;
				break;
			case "CERCLE":
				code = 2;
				break;
			case "OVALE":
				code = 3;
				break;
			case "LIGNE":
				code = 4;
				break;
		}
		return code;
	}
}



