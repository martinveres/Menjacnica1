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
		if(ime!=null)
		this.ime = ime;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		if(skracenica!=null)
		this.skracenica = skracenica;
	}
	public Kurs[] getKursevi() {
		return kursevi;
	}
	public void setKursevi(Kurs[] kurs, int brojKurseva) {
		if(kurs!=null)
		this.kursevi = kurs;
		this.brojKurseva = brojKurseva;
	}
	public int getBrojKurseva() {
		return brojKurseva;
	}
	public void setBrojKurseva(int brojKurseva) {
		if(brojKurseva>0)
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
