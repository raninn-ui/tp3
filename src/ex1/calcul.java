package ex1;

public class calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factoriel de 4: "+entier.factoriel(4));
		entier e = new entier();
		System.out.println("factoriel de 5 :"+e.factoriel(5));
		
		System.out.println("valeur absolu de -4: "+entier.absolu(-4));
		System.out.println("valeur absolu de -10 :"+e.absolu(-10));
		
		entier.comparer(10, 20);
		e.comparer(5, 1);
		
		entier.premier(7);
		e.premier(25);
		
		entier.i++;
		System.out.println("1er incrementationn: "+entier.i);
		e.i++;
		System.out.println("2eme incrementation: "+e.i);
	}

}
