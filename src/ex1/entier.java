package ex1;

public class entier {
	
	public static int i=0;
	
	public static int factoriel(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else {
			return n*factoriel(n-1);
		}
	}
	
	public static int absolu(int n) {
		if(n<=0) {
			return -n;
		}
		else
			return n;
	}
	
	public static void comparer(int e1,int e2) {
		if(e1>e2) {
			System.out.println(e1+" est superieur a "+e2);
		}
		else if(e1<e2) {
			System.out.println(e1+" est inferieur "+e2);
		}
		else {
			System.out.println(e1+" et "+e2+" sont egales");
		}
	}
	
	public static void premier (int n) {
		if (n<=1) {
			System.out.println(n+"n'est pas un nombre premier");
		}
		for (int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				System.out.println(n+"n'est pas un nombre premier");
			}
			else 
				System.out.println(n+"est premier");
		}
	}
	
}
 
