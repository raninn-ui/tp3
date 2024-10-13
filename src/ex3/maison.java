package ex3;

public class maison {
	private String type;
	private String adresse;
	private int nbchambre;
	private float surface;
	
	public maison(String adr,String t, int n) {
		this.adresse=adr;
		this.type=t;
		this.nbchambre=n;
	}
	
	public maison(String adr,String t, int n,float s) {
		this.adresse=adr;
		this.type=t;
		this.nbchambre=n;
		this.surface=s;
	}
	
	public void setSurface(float s) {
		this.surface=s;
	}
	
	public float calculprix(float pmc) {
		return this.surface+pmc;
	}
	
	public float calculprix() {
		return this.surface*2100;
	}
	
	public String toString()
	{
		return adresse;
		
	}

	public String tochain() {
		return this.type+" de "+this.surface+" m2 à "+this.adresse+" avec "+this.nbchambre+" chambres.";
	}
	
	public static void main(String[] args) {
		maison m1=new maison("Tunis","duplex",4,210);
		maison m2=new maison("Nabeul","villa",5);
		System.out.println(m1.tochain());
		System.out.println(m2.tochain());
		m2.setSurface(230);
		System.out.println("prix m1 m1: "+m1.calculprix(500));
		System.out.println("prix m1 m2: "+m1.calculprix());
		System.out.println("prix m2 m1: "+m2.calculprix(3000));
		System.out.println("prix m2 m2: "+m2.calculprix());
	}
	
}
