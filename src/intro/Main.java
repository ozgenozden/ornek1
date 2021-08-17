package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String internetSubeButonu="internet Þubeye gir";
		double dolarDun=8.20;
        double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=true;
		
		System.out.println(internetSubeButonu);

		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1="Hýzlý Kredi";
		String kredi2="Mutlu Emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="Çiftçi Kredisi";
		String kredi5="Msb Kredisi";
		
		
		String[] krediler= {
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi"
				};
		
		for(String kredi:krediler) {
			
			System.out.println("krediler:"+ kredi);
			
		}
		
		
		for(int i=0;i<krediler.length;i++ ){
			
			System.out.println("krediler:"+ krediler[i]);
			
		}
		
		
		//referans tipe örnek bir küçük uygulama kýsmý
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println("Sayilar1 0. elemaný : "+sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="Istanbul";
		sehir1=sehir2;
		sehir2="Ýzmir";
		System.out.println(sehir1);
		
	  char grade='A';
	  switch(grade){
		  case 'G':
			  System.out.println("Mükemmel geçtiniz.");
			  break;
			  
		  case 'B':
			  System.out.println("Çok iyi geçtiniz.");
		  case 'C':
			  System.out.println("Ýyi Geçtiniz.");
		  case 'D':
			  System.out.println("Fena Deðil");
		  case 'F':
			  System.out.println("Malesef Kaldýnýz.");
			  
		  default:
			  System.out.println("Geçersiz bir not girdiniz.");
	  }
		
		
	  String mesaj="OZGEN OZDEN";
	  System.out.println( mesaj.split(" ")[0]);
	  int sayim =6;
	  boolean asal=true;
	  
	  for(int i=2;i<sayim;i++) {
		  if(sayim%i==0) {
			  asal=false;
			  break;
		  }
		  else {
			  asal=true;
		  }
			  
	  }
	 // String bb=asal? "asaldýr" : "asal deðildir";
	  //let girisIzni = yas > 18 ? true : false;
	  System.out.println("Sayýmýz  "+( asal? "asaldýr" : "asal deðildir"));
	  
	  int toplam=0;
	  for(int j=1;j<sayim;j++) {
		  if(sayim%j==0)
			  toplam+=j;
	  }
	  if(toplam==sayim) {
		  System.out.println("Bu sayý mükemmel sayýdýr.");
	  }
	  
	}

}
