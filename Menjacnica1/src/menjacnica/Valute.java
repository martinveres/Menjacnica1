package menjacnica;

import menjacnica.kurs.Kurs;

public class Valute {
	private String ime;
	private String skracenica;
	private Kurs[] kurs = new Kurs[365];
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	public Kurs[] getKurs() {
		return kurs;
	}
	public void setKurs(Kurs[] kurs) {
		this.kurs = kurs;
	}
	
}
