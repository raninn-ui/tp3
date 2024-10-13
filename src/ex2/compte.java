package ex2;

public class compte {
	private int num;
	private int solde;
	public static int count =0;
	
	public int getnum() {
		return this.num;
	}
	
	public int getsolde() {
		return this.solde;
	}
	
	public compte() {
		count++;
		this.num=count;
		solde=0;
	}
	public void deposer(float m) {
		this.solde+=m;
	}
	public void retirer(float m) {
		this.solde-=m;
	}
	public float avoirSolde() {
		return this.solde;
	}
	public void transferer(float m,compte acc) {
		acc.solde+=m;
		this.solde-=m;
	}
}
