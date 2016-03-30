package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.kurs.Kurs;
import menjacnica.Valute;
public class Menjacnica implements MenjacnicaInterfejs {
	private Kurs[] kursevi = new Kurs[1000];
	int brojKurseva=0;
	@Override
	public void dodajKursZaNekiDan(Kurs kurs) {
		kursevi[brojKurseva] = kurs;
		brojKurseva++;
		
	}

	@Override
	public void obrisiKursZaNekiDan(Kurs dan) {
		for (int i = 0; i < brojKurseva; i++) {
			if(kursevi[i].equals(dan)) {
				kursevi[i]=null;
			}
		}
		
	}

	@Override
	public Kurs vratiKursZaNekiDan(Kurs dan) {
		for (int i = 0; i < brojKurseva; i++) {
			if(kursevi[i].equals(dan)) {
				return kursevi[i];
			}
		}
		return null;
	}
	

}
