package menjacnica.kurs;

import java.util.GregorianCalendar;

public class Kurs {
	GregorianCalendar datum;
	private double kupovni;
	private double prodajni;
	private double srednji;
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	@Override
	public String toString() {
		return "" + datum.get(GregorianCalendar.YEAR) + " " +   datum.get(GregorianCalendar.MONTH) + " "
	+  datum.get(GregorianCalendar.DAY_OF_WEEK) + " "+ kupovni + " " + " " + srednji + " " + prodajni;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Kurs) {
			if((((Kurs) obj).getDatum().get(GregorianCalendar.YEAR)==getDatum().get(GregorianCalendar.YEAR))&&
					((Kurs) obj).getDatum().get(GregorianCalendar.MONTH)==getDatum().get(GregorianCalendar.MONTH)
					&&((Kurs) obj).getDatum().get(GregorianCalendar.DAY_OF_WEEK)==getDatum().get(GregorianCalendar.DAY_OF_WEEK)) {
					 
				return true;
			}
		}
		return false;
	}
}
