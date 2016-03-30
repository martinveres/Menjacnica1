package menjacnica;

import menjacnica.kurs.Kurs;

public class Valute {
	private String ime;
	private String skracenica;
	private Kurs[] kursevi = new Kurs[365];
	private int brojKurseva=0;
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
	public Kurs[] getKursevi() {
		return kursevi;
	}
	public void setKurs(Kurs[] kurs, int brojKurseva) {
		this.kursevi = kurs;
		this.brojKurseva = brojKurseva;
	}
	@Override
	public String toString() {
		
		String s = ime + " " + skracenica + " ";
		for(int i = 0;i<brojKurseva; i++) {
			s+= kursevi[i].toString();
		}
		return s;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Valute) {
			if(((Valute) obj).getIme().equals(getIme())) {
				return true;
			}
		}
		return false;
	}
	
}
