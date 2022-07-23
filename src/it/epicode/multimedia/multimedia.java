package it.epicode.multimedia;

public abstract class multimedia {
	private String titolo;

	public multimedia(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}
