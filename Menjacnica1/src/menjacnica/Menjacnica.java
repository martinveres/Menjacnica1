package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.kurs.Kurs;
import menjacnica.Valute;
public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	
	@Override
	public void dodajKursZaNekiDan(Kurs kurs) {
		kursevi.add(kurs);
		
	}

	@Override
	public void obrisiKursZaNekiDan(Kurs dan) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).equals(dan)) {
				kursevi.remove(i);
			}
		}
		
	}

	@Override
	public Kurs vratiKursZaNekiDan(Kurs dan) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).equals(dan)) {
				return kursevi.get(i);
			}
		}
		return null;
	}
	
}
