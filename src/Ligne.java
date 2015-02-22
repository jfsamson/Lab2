import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/******************************************************
Cours:   LOG121
Session: H2015
Groupe:  2
Projet: Laboratoire #1
Étudiant(e)s: Marion Briot

 *******************************************************
Historique des modifications
 *******************************************************
2013-0X-XX Version initiale (et1)
2013-0X-XX Ajout de la fonction (et2)
 *******************************************************/

class Ligne extends Forme{
	private int x1;
	private int x2;
	private int y1;
	private int y2;

	private Color couleurLigne= new Color(0,0,0,220);
	
	Ligne(int nseq, String nom, int x1, int x2, int y1, int y2){
		this.nseq = nseq;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		super.nom = nom;
	}
	
	void setX(int x){
		this.x1 = x;
	}
	
	void setY(int y){
		this.y1 = y;
	}

	/**
	 * Déssine une ligne 
	 */
	@Override
	void dessiner(Graphics g) { 
		g.setColor(couleurLigne);
		g.drawLine(x1, y1, x2, y2);
		
		float pointille[] = {5.0f};
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bordurePointillee =
		        new BasicStroke(1.0f,
		                        BasicStroke.CAP_BUTT,
		                        BasicStroke.JOIN_MITER,
		                        10.0f, pointille, 0.0f);
		g2d.setStroke(bordurePointillee);
		g2d.setColor(Color.BLACK);
		if (x2 < x1){
			if (y2 < y1){
			g.drawRect(x2, y2, x1 - x2,
			y1 - y2);
			}
			else {
			g.drawRect(x2, y2, x1 - x2,
			y2 - y1);
			}
			}
			else {
			if (y2 < y1){
			g.drawRect(x1, y2, x2 - x1,
			y1 - y2);
			}
			else{
			g.drawRect(x1, y1,
			x2 - x1, y2 - y1);
			}
			}
		
	}
	
	@Override
	double getAire() {
		//distance entre deux points 
		this.aire = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		return aire;
	}


	@Override
	double getDistance() {
		this.distance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		return 0;
	}

}