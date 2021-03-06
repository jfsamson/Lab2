import java.awt.Color;
import java.awt.Graphics;
/******************************************************
Cours:   LOG121
Session: H2015
Groupe:  2
Projet: Laboratoire #1
�tudiant(e)s: Marion Briot

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

	Ellipse(int nseq, int centreX, int centreY, int rayonH, int rayonV){
		this.nseq = nseq;
		this.centreX = centreX;
		this.centreY = centreY;
		this.rayonH = rayonH;
		this.rayonV = rayonV;

		nom = "Ellipse";
	}

	/**
	 * D�ssine un cercle ou un oval de couleur diff�rente
	 */
	@Override
	void dessiner(Graphics g) {
		if(rayonH == rayonV){
			g.setColor(couleurCercle);
		} else {
			g.setColor(couleurOvale);
		}
		g.fillOval(centreX, centreY, rayonV, rayonH);
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
