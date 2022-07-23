package it.epicode.multimedia;

public class audio extends multimedia implements IVolume {
	private int volume;
	private int durata;

	public audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}

	public void play() {

		String volCode = "";
		String dur = "";
		// In base al valore che passo del volume stampa tot "!" -- vedi esempio in fondo
		for (int i = 0; i < this.volume; i++) {
			volCode += "!";
		}
		// In base al valore che passo della durata stampa tot "il titolo che abbiamo
		// dato all'oggetto" -- vedi esempio in fondo
		for (int i = 0; i < this.durata; i++) {
			dur += getTitolo() + "///";
		}
		System.out.println(getTitolo() + " volume" + volCode + " durata: " + dur);
	}

//========================== METODI VOLUME ==========================
	@Override
	public void piuVol() {
		this.volume++;
		play();
	}

	@Override
	public void menoVol() {
		this.volume--;
		play();
	}
	
	
	//========================== PROVA ==========================
//	public static void main(String[] args) {
//		audio a = new audio("audioaaa", 4, 3);
//		 a.piuVol();
//		a.play();
//	}
}
