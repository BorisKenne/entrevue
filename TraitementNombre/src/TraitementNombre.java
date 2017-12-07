import java.util.Scanner;

public class TraitementNombre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int str = sc.nextInt();
		
		int longueur=(int)(Math.log10(str)+1);
		int[] tableau=new int[longueur];
		int a=str;
		int comp=0;
//
		while (a!=0) {
			System.out.println("swhile");
			int r=(a%10);
			a=(a-r)/10;
			tableau[(longueur-1)-comp]=r;
			comp++;
		}
//
		for(int i=longueur-1;i>0;i--) {
			System.out.println("for");
			int b;
			if(tableau[i]>tableau[i-1]) {
				 b=tableau[i];
				 tableau[i]=tableau[i-1];
				 tableau[i-1]=b;
				 break;
			}
		}
//     
		int retour=0;
		for(int i=0;i<longueur;i++){
			System.out.println("for2");
			retour=(retour*10)+tableau[i];
		}
//
		System.out.println("le nombre donné est :"+str);
		System.out.println("le retour est :"+retour );
		
	}

}
