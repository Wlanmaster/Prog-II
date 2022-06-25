package demo009.misc;
import java.util.Iterator;
import java.util.List;

import demo009.ApplicationContext;
import demo009.model.Lager;
import demo009.model.Niederlassung;
import demo009.model.Warenart;

public class DisplayService {
	public static void anzeigeNiederlassung(ApplicationContext ac ) {
		

		
		System.out.println("Ort   Warenart   Status Anforderung   gesendete Fuhrwerke   Arbeiter");
		
		
		for(int i = 0; i < ac.getNiederlassungen().size(); i++) {
			Niederlassung nl = ac.getNiederlassungen().get(i);
			System.out.println("" + nl.getOrt() + "\t" + nl.getWarenartString() +"\t" + (nl.wurdeAngefordert()?"angefordert" : "nicht angefordert")+"\t"+ ac.getGeplanteFuhrwerke()+ "\t"+ nl.getArbeiter());
			
			
		}
		
		
	} public static void anzeigeLager(ApplicationContext ac ) {
		System.out.println("============LAGER=======");
		Lager l = ac.getLager();
		for (Warenart wa: l.getEingelagerteWaren()) {
			System.out.println(wa.toString()+"\t"+ l.getBestand(wa)); 
			
		}
	}
	public static void anzeigenGuthaben(ApplicationContext ac) {
		System.out.println("============Finanzen");
		System.out.println("Guthaben in Talern \t" +ac.getGuthaben());
	}

}
