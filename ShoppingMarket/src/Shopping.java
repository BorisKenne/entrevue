import java.util.ArrayList;

public class Shopping {
	
private	int pommes=0;
private	int oranges=0;
private	 ArrayList<String> entrees;
private	double prixNormal=0;
private	double prixPromo=0;

public Shopping(ArrayList<String> entrees) {
	this.entrees=entrees;
	 System.out.println("la taille de l'entr�e est :"+entrees.size());
}
public void calculPrixNormal() {
	   prixNormal=(pommes*0.60)+(oranges*1.25);
	   System.out.println("le prix normal est de : "+ prixNormal);
   }
public void calculPrixPromo() {
	   int po=(pommes/2+pommes%2);
	   int or=(oranges/3+oranges%3);
	   
	   System.out.println("qt� prix pomme :"+pommes/2+" la quantit� restant est "+pommes%2);
	   System.out.println("qt� prix orange :"+oranges/3+" la quantit� restant est "+oranges%3);
	   
	   prixPromo=(po*0.60 + or*1.25);
	   System.out.println("le prix promo est :"+ prixPromo);
   }
public  void calculQte(){
	   int taille=entrees.size();
	   String pomme=new String("Pomme");
	   String orange=new String("Orange");
	   System.out.println("--- calcule de la quantit� ---");
	   for(int i=0;i<taille;i++){
		   if(entrees.get(i).equals(pomme)) {this.pommes++;}
		   if(entrees.get(i).equals(orange)) {this.oranges++;}
		   else {
System.out.println("marchandise inconutooo !! Warniiing !! Danger de mort");
		}
	   }
 System.out.println("La quantite de pomme est de :"+this.pommes);
 System.out.println("La quantite d'orange est de :"+this.oranges);
   }
}
