import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;

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

class Rectangle extends Forme{

	private int x1;
	private int x2;
	private int y1;
	private int y2;

	int largeur;
	int longeur;

	private Color couleurCarre= new Color(86,255,86,255);
	private Color couleurRect= new Color(255,0,0,171);


	Rectangle( int nseq, String nom, int x1, int x2, int y1, int y2){
		super.nom = nom;
		this.nseq = nseq;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

	}
	
	void setX(int x){
		this.x1 = x;
	}
	
	void setY(int y){
		this.y1 = y;
	}
	
	/**
	 * D�ssine un carr� ou un rectangle de couleur diff�rente
	 */
	@Override
	void dessiner(final Graphics g) {
		
		largeur = x2 - x1;
		longeur = y2 - y1;
		if(longeur == largeur){
			g.setColor(couleurCarre);
		} else {
			g.setColor(couleurRect);
		}
		g.fillRect(x1, y1, largeur, longeur);
		
		float pointille[] = {5.0f};
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bordurePointillee =
		        new BasicStroke(1.0f,
		                        BasicStroke.CAP_BUTT,
		                        BasicStroke.JOIN_MITER,
		                        10.0f, pointille, 0.0f);
		g2d.setStroke(bordurePointillee);
		g2d.setColor(Color.BLACK);
		g.drawRect(x1, y1, largeur, longeur);

	}
	
	@Override
	double getAire() {
		this.aire = longeur * largeur;
		return aire;
	}
	@Override
	double getDistance() {
		this.aire = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		return 0;
	}
}