
public class UtilitaireTrie {

	
	private ListeChainee listeChainee;
	private double num1;
	private double num2;
	
	public void trieGeneral(ListeChainee liste, boolean type, int sort) {

		listeChainee = liste;
		
		listeChainee.positionCouranteDebut();	
		for(int i = 0; i < listeChainee.getNbElement();i++){
			System.out.println(((Forme)listeChainee.affichePositionCourante()).getNom());
			listeChainee.positionCouranteSuivant();
		}

		for (int i = 0; i < listeChainee.getNbElement()-1; i++) {
			listeChainee.positionCouranteDebut();
			for (int j = 0; j < listeChainee.getNbElement()-1; j++) {
				
				switch(sort){
				case 1 : 
					num1 = (int)((Forme)listeChainee.affichePositionCourante()).getNseq();
					listeChainee.positionCouranteSuivant();
					num2 = (int)((Forme)listeChainee.affichePositionCourante()).getNseq();
					break;
				case 2 :
					num1 = ((Forme)listeChainee.affichePositionCourante()).getAire();
					listeChainee.positionCouranteSuivant();
					num2 = ((Forme)listeChainee.affichePositionCourante()).getAire();
					break;
				case 3 :
					num1 = ((Forme)listeChainee.affichePositionCourante()).getDistance();
					listeChainee.positionCouranteSuivant();
					num2 = ((Forme)listeChainee.affichePositionCourante()).getDistance();
					break;
				case 4 :
					num1 = ((Forme)listeChainee.affichePositionCourante()).getCode();
					listeChainee.positionCouranteSuivant();
					num2 = ((Forme)listeChainee.affichePositionCourante()).getCode();
				}
				
				//System.out.println("****"+((Forme)listeChainee.affichePositionCourante()).getNseq());
				
				if(type == true){
					if (num1 > num2) {
						listeChainee.positionCouranteDebut();
						for(int g = 0; g< j; g++){
							listeChainee.positionCouranteSuivant();
						}
						listeChainee.echangerElements();
						listeChainee.positionCouranteSuivant();
					}
				}
				else{
					if (num1 < num2) {
						listeChainee.positionCouranteDebut();
						for(int g = 0; g< j; g++){
							listeChainee.positionCouranteSuivant();
						}
						listeChainee.echangerElements();
						listeChainee.positionCouranteSuivant();
					}			
				}
			}
		}
		
		changerCooordonnees();
		
		listeChainee.positionCouranteDebut();	
		System.out.println("=============================================");
		for(int i = 0; i < listeChainee.getNbElement();i++){
				System.out.println(((Forme)listeChainee.affichePositionCourante()).getNom());
				listeChainee.positionCouranteSuivant();
		}
	}
	
	
	public void changerCooordonnees(){
		
		int x = 0;
		int y = 0;
		listeChainee.positionCouranteDebut();
		
		for(int i=0; i<listeChainee.getNbElement();i++){
			((Forme)listeChainee.affichePositionCourante()).setX(x);
			((Forme)listeChainee.affichePositionCourante()).setY(y);
			listeChainee.positionCouranteSuivant();
			x+=40;
			y+=40;
		}
	}
	
	
	
}
