import java.util.ArrayList;
        
public class Start {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		ArrayList<String> entrees=new ArrayList<String>();
		entrees=lecture();
		Shopping shop=new Shopping(entrees);
		shop.calculQte();
		shop.calculPrixNormal();
		shop.calculPrixPromo();
	}
	public static  ArrayList<String> lecture(){
		//fonction prevue pour lire les entree venant du scanner du super marché !!!
		//pour des testes,nous allons remplire un tablea de maniere aléatoire !!!
		ArrayList<String> entrees=new ArrayList<String>();
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("Pomme");
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("riendebon");
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("Pomme");
		entrees.add("Pomme");
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("riendebon");
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("Pomme");
		entrees.add("Pomme");
		entrees.add("Pomme");
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("riendebon");
		entrees.add("Pomme");
		entrees.add("Orange");
		entrees.add("Pomme");
		return entrees;

	   }
}
