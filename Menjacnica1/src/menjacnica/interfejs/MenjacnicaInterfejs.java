package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.kurs.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKursZaNekiDan(Kurs kurs);
	public void obrisiKursZaNekiDan(GregorianCalendar dan);
	public Kurs vratiKursZaNekiDan(GregorianCalendar dan);
}
