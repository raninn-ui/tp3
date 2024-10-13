package ex2;

public class banque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compte co1 = new compte();
		compte co2 = new compte();
		System.out.println("numero de compte1: "+co1.getnum()+" le solde: "+co1.getsolde());
		System.out.println("numero de compte2: "+co2.getnum()+" le solde: "+co2.getsolde());
		co1.deposer(1200);
		co2.deposer(500);
		System.out.println("solde de compte1: "+co1.getsolde());
		System.out.println("solde de compte2: "+co2.getsolde());
		co2.transferer(700, co1);
		if(co1.getsolde()<0)
			System.out.println("compte1 est en rouge: "+co1.getsolde());
		else if (co2.getsolde()<0)
			System.out.println("compte2 est en rouge: "+co2.getsolde());
		else
			System.out.println("pas de rouge");
		
		
	}

}
