package it.epicode.multimedia;

public class video extends multimedia implements ILuminosità,IVolume {
	
	private int volume;
	private int luminosita;
	private int durata;
	public video(String titolo, int volume, int luminosita, int durata) {
		super(titolo);
		this.volume=volume;
		this.luminosita=luminosita;
		this.durata=durata;
	}
	
public void play() {
		
		String volCode="";
		String lumCode="";
		String dur="";
		
		//In base al valore che passo del volume stampa tot "!" -- vedi esempio in fondo
		
		for(int i=0; i< this.volume; i++) {
		 volCode += "!";
		 }

		//In base al valore che passo della durata stampa tot "il titolo che abbiamo dato all'oggetto" -- vedi esempio in fondo
		for(int i=0; i< this.durata; i++) {
			 dur += getTitolo() + "///";
			 }

		//In base al valore che passo alla luminosità stampa tot "*" -- vedi esempio in fondo
		for(int i=0; i< this.luminosita; i++) {
		 lumCode += "*";
		 }
		
		//stampo TITOLO - volume(!) - luminosità(*) - durata(ripetizioni di TITOLO//) 
		System.out.println(getTitolo() + " VOLUME: " + volCode
				+ " LUMINOSITà: " + lumCode
				+ " DURATA: " + dur);
	}
	
	//========================== METODI VOLUME ==========================
	@Override
	public void piuVol() {
		this.volume++;
	}

	@Override
	public void menoVol() {
		this.volume--;
	}

	
	//========================== METODI LUMINOSITà ==========================
	@Override
	public void piuLum() {
		this.luminosita++;
	}

	@Override
	public void menoLum() {
		this.luminosita--;
		
	}
	
	
	
	//========================== PROVA ==========================
// 		public static void main(String[] args) {
//		video ss = new video("SalvamiOSignore", 3, 4, 5);
//			ss.play();
//	}
	
}
