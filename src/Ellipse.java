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

class Ellipse extends Forme{
	private int centreX;
	private int centreY;
	private int rayonH;
	private int rayonV;
	private Color couleurCercle= new Color(255, 120, 120, 171);
	private Color couleurOvale= new Color(0, 175, 255, 171);

	Ellipse(int nseq, String nom, int centreX, int centreY, int rayonH, int rayonV){
		this.nseq = nseq;
		this.centreX = centreX;
		this.centreY = centreY;
		this.rayonH = rayonH;
		this.rayonV = rayonV;
		super.nom = nom;
	}

	void setX(int x){
		this.centreX = x;
	}
	
	void setY(int y){
		this.centreY = y;
	}
	
	/**
	 * Déssine un cercle ou un oval de couleur différente
	 */
	@Override
	void dessiner(Graphics g) {
		if(rayonH == rayonV){
			g.setColor(couleurCercle);
		} else {
			g.setColor(couleurOvale);
		}
		g.fillOval(centreX, centreY, rayonV, rayonH);
	
		float pointille[] = {5.0f};
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bordurePointillee =
		        new BasicStroke(1.0f,
		                        BasicStroke.CAP_BUTT,
		                        BasicStroke.JOIN_MITER,
		                        10.0f, pointille, 0.0f);
		g2d.setStroke(bordurePointillee);
		g2d.setColor(Color.BLACK);
		g.drawRect(centreX, centreY, rayonV, rayonH);
	}

	@Override
	double getAire() {
		if(rayonH == rayonV){
			this.aire = Math.PI * rayonH * rayonH ;
		} else {
			this.aire = Math.PI * rayonH * rayonV;
		}

		return aire;
	}

	@Override
	double getDistance(){
		if(rayonH > rayonV){
			this.distance = rayonH * 2;
		} else {
			this.distance = rayonV * 2;
		}
		return distance;
	}




}
