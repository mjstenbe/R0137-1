import java.util.Scanner;

public class JuomaAutomaatti {

	  private int teeta;
	  private int kahvia;
	  private int kaakaota;
	   
	   
	   public JuomaAutomaatti() {
		this.teeta = 50;
		this.kahvia = 50;
		this.kaakaota = 50;
	}

	   
	public int getTeeta() {
		return teeta;
	}

	public void setTeeta(int teeta) {
		this.teeta = teeta;
	}
	
	

	public int getKahvia() {
		return kahvia;
	}

	public void setKahvia(int kahvia) {
		this.kahvia = kahvia;
	}

	
	
	public int getKaakaota() {
		return kaakaota;
	}

	public void setKaakaota(int kaakaota) {
		this.kaakaota = kaakaota;
	}

	
	
	public void valmistaKahvi() {
		
		if (this.kahvia <= 0) {
			System.out.println("Kahvi loppu, täytä säiliö.");
		}
		
		else {
		System.out.println("Odota hetki, kahvisi valmistuu.");
		this.kahvia-=10;
		}
		System.out.print(toString());
		}
		
	
	public void valmistaTee() {
		
		if (teeta <= 0) {
			System.out.println("Tee loppu, täytä säiliö.");
		}
		
		else {
		System.out.println("Odota hetki, teesi valmistuu.");
		this.teeta-=10;
		}
		System.out.print(toString());
		}
	   

	public void valmistaKaakao() {

		if (kaakaota <= 0) {
			System.out.println("Kaakao loppu, täytä säiliö.");
		}
		   
		else {
		System.out.println("Odota hetki, kaakaosi valmistuu.");
		this.kaakaota-=10;
		}
		System.out.print(toString());
		
		}
	   

	public boolean brew() {
	int random = (int)(Math.random() * 100+1);
	if (random <= 25 && random > 0) {
		return false;
	}
	
	else return true;
	}
	

	public String toString() {
		
		return "Kahvia jäljellä: " + this.kahvia + ", Teetä jäljellä: " + this.teeta + ", kaakaota jäljellä: " + this.kaakaota +"\n";
		
	}
	

	

public static void main(String[] args){
	
	JuomaAutomaatti omaKone = new JuomaAutomaatti();
	
	Scanner lukija = new Scanner(System.in);
	
	int juoma = 0;

	
	while (juoma <= 3) {
		System.out.println("");
		System.out.println("*******Juoma-Automaatti*******");
		System.out.println("");
		System.out.println("1. Kahvi");
		System.out.println("2. Tee");
		System.out.println("3. Kaakao");
		System.out.println("4. Lopeta");
		System.out.println("");
		System.out.println("******************************");
		
		juoma = lukija.nextInt();

		if (omaKone.brew() == false) {
			System.out.println("Ei onnistu, kiitos kuitenkin maksustasi");
			break;
		}
		

			if (juoma == 1) {
					omaKone.valmistaKahvi();
}


			else if (juoma == 2) {
					omaKone.valmistaTee();
}

			else if (juoma == 3) {
					omaKone.valmistaKaakao();
}



			else if (juoma == 4) {
				break;

}

	}	


}
}