package demo009.menu.impl;
import java.util.Scanner;

import demo009.ApplicationContext;
import demo009.menu.Command;
import demo009.model.Fuhrpark;
import demo009.model.Niederlassung;


public class CommandFuhrwerkKaufen implements Command{
	
	@Override
	public String menuItemName() {
		return "Fuhrwerk Kaufen";
		 
	}
	@Override
	public void execute(ApplicationContext context) {
		System.out.println("Sollen Fahrzeuge gekauft werden?");
		Scanner myScanner = new Scanner(System.in);
		String s = myScanner.next();
		
		if (s.equals("y")) {
			System.out.println("Wie viele Fahrzeuge sollen gekauft werden?");
			int i = myScanner.nextInt();
			Fuhrpark fp = new Fuhrpark( 0, 0); 
			fp.setAnzahlFuhrwerke(i);
			System.out.println("Aktueller Fuhrpark bestand:"+ fp.getAnzahlFuhrwerke()); 



}
		
	}
}
