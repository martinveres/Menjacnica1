package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.kurs.Kurs;
import menjacnica.Valute;
public class Menjacnica implements MenjacnicaInterfejs {
	private Valute[] valute = new Valute[1000]; 
	private int brojValuta = 0;
	@Override
	public void dodajKursZaNekiDan(Kurs kurs) {
		valute[brojValuta].dodajKurs(kurs);;
		
	}

	@Override
	public void obrisiKursZaNekiDan(Kurs kurs) {
		for(int i=0;i<brojValuta;i++) {
			for (int j = 0; j < valute[i].getBrojKurseva(); j++) {
				if(kurs.equals(valute[i].getKursevi()[j])) {
					valute[i].getKursevi()[j]=null;
				}
			}
		}
		
	}

	@Override
	public Kurs vratiKursZaNekiDan(Kurs kurs) {
		for(int i=0;i<brojValuta;i++) {
			for (int j = 0; j < valute[i].getBrojKurseva(); j++) {
				if(kurs.equals(valute[i].getKursevi()[j])) {
					return valute[i].getKursevi()[j];
				}
			}
		}
		return null;
	}

}
