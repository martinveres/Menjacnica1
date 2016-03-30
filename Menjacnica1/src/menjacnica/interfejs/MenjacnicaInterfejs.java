package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.kurs.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKursZaNekiDan(Kurs kurs);
	public void obrisiKursZaNekiDan(Kurs dan);
	public Kurs vratiKursZaNekiDan(Kurs dan);
}
