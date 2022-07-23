package it.epicode.multimedia;

import java.util.Iterator;

public class immagine extends multimedia implements ILuminosità{
	

	int luminosita;
	
	public immagine(String titolo, int luminosità) {
		super(titolo);
		this.luminosita=luminosità;
	}
	


	public void show() {
		
		String lumCode = "";
		//In base al valore che passo alla luminosità stampa tot "*" -- vedi esempio in fondo
		for (int i = 0; i < this.luminosita; i++) {
			lumCode += "*";
		}
		System.out.println(getTitolo() + " " + lumCode);
	}
	//========================== METODI LUMINOSITà ==========================
	@Override
	public void piuLum() {
		this.luminosita++;
		show();
	}
	@Override
	public void menoLum() {
		this.luminosita--;
		show();
	}
	//========================== PROVA ==========================
//	public static void main(String[] args) {
//		immagine a = new immagine("ciao", 4);
//		a.menoLum();		
//		a.show();
//	}
}
