package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String internetSubeButonu="internet �ubeye gir";
		double dolarDun=8.20;
        double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=true;
		
		System.out.println(internetSubeButonu);

		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		String kredi1="H�zl� Kredi";
		String kredi2="Mutlu Emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="�ift�i Kredisi";
		String kredi5="Msb Kredisi";
		
		
		String[] krediler= {
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"Msb Kredisi"
				};
		
		for(String kredi:krediler) {
			
			System.out.println("krediler:"+ kredi);
			
		}
		
		
		for(int i=0;i<krediler.length;i++ ){
			
			System.out.println("krediler:"+ krediler[i]);
			
		}
		
		
		//referans tipe �rnek bir k���k uygulama k�sm�
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println("Sayilar1 0. eleman� : "+sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="Istanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		System.out.println(sehir1);
		
	  char grade='A';
	  switch(grade){
		  case 'G':
			  System.out.println("M�kemmel ge�tiniz.");
			  break;
			  
		  case 'B':
			  System.out.println("�ok iyi ge�tiniz.");
		  case 'C':
			  System.out.println("�yi Ge�tiniz.");
		  case 'D':
			  System.out.println("Fena De�il");
		  case 'F':
			  System.out.println("Malesef Kald�n�z.");
			  
		  default:
			  System.out.println("Ge�ersiz bir not girdiniz.");
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
	 // String bb=asal? "asald�r" : "asal de�ildir";
	  //let girisIzni = yas > 18 ? true : false;
	  System.out.println("Say�m�z  "+( asal? "asald�r" : "asal de�ildir"));
	  
	  int toplam=0;
	  for(int j=1;j<sayim;j++) {
		  if(sayim%j==0)
			  toplam+=j;
	  }
	  if(toplam==sayim) {
		  System.out.println("Bu say� m�kemmel say�d�r.");
	  }
	  
	}

}
