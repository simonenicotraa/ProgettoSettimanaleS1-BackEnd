package it.epicode.multimedia;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String titolo;
		multimedia[] arr = new multimedia[5];
		int n;

		// istruzioni per l'utente
		for (int i = 0; i < 5; i++) {
			System.out.println("===============================================");
			System.out.println("DIGITA UN NUMERO DA 1 A 3");
			System.out.println("1 - STAMPA IMMAGINE");
			System.out.println("2 - STAMPA VIDEO");
			System.out.println("3 - STAMPA AUDIO");

			// prendo il dato passato dall'utente
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
			System.out.println(n);

			switch (n) {
			case 1: {
				System.out.println("====== stampa immagine ======");

				System.out.println("Inserisci Titolo");
				Scanner scanner1 = new Scanner(System.in);
				String t1 = scanner1.nextLine();

				System.out.println("Inserisci Luminosità");
				Scanner scanner2 = new Scanner(System.in);
				int nimg2 = scanner2.nextInt();

				immagine image = new immagine(t1, nimg2);
				arr[i] = image;
				image.show();

				break;
			}
			case 2: {
				System.out.println("====== stampa video ======");

				System.out.println("Inserisci Titolo");
				Scanner scan = new Scanner(System.in);
				String t1 = scan.nextLine();

				System.out.println("Inserisci volume");
				Scanner scanner1 = new Scanner(System.in);
				int nv = scanner1.nextInt();

				System.out.println("Inserisci Luminosità");
				Scanner scanner2 = new Scanner(System.in);
				int nv1 = scanner2.nextInt();

				System.out.println("Inserisci durata");
				Scanner scanner3 = new Scanner(System.in);
				int nv2 = scanner3.nextInt();

				video video = new video(t1, nv, nv1, nv2);
				arr[i] = video;
				video.play();

				break;
			}
			case 3: {
				System.out.println("====== stampa video ======");

				System.out.println("Inserisci Titolo");
				Scanner scan = new Scanner(System.in);
				String t1 = scan.nextLine();

				System.out.println("Inserisci volume");
				Scanner scanner1 = new Scanner(System.in);
				int nv = scanner1.nextInt();

				System.out.println("Inserisci durata");
				Scanner scanner3 = new Scanner(System.in);
				int nv2 = scanner3.nextInt();

				audio listen = new audio(t1, nv, nv2);
				arr[i] = listen;
				listen.play();

				break;
			}
			default:
				System.err.println("Devi inserire numeri da 1 a 3");
			}
		}
		
		System.out.println("I file multimediali presenti sono:");
		System.out.println("Seleziona un file:");
		int x = 1;
		for (multimedia media : arr) {			
			System.out.println("File: " + x  + "=> " + media.getTitolo());
			x++;
		}
		System.out.println("digita 0 per uscire: exit");
		// prendo il dato passato dall'utente
		int men2;
					Scanner scanne = new Scanner(System.in);
					men2 = scanne.nextInt();
					System.out.println(men2);
					
					switch (men2) {
					case 1: {
						System.out.println("Hai selezionato " +  arr[0].getTitolo());
						break;
					}
					case 2: {
						System.out.println("Hai selezionato " +  arr[1].getTitolo());
						break;
					}
					case 3: {
						System.out.println("Hai selezionato " +  arr[2].getTitolo());
						break;
					}
					case 4: {
						System.out.println("Hai selezionato " +  arr[3].getTitolo());
						break;
					}
					case 5: {
						System.out.println("Hai selezionato " +  arr[4].getTitolo());
						break;
					}
					case 0: { 
						System.out.println("EXIT");
						break;
					}
					default:
						System.out.println("devi inserire un numero da 1 a 5 oppure exit per uscire");
					}
	}

}
