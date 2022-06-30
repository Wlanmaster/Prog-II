package demo009.menu.impl;

import java.util.Scanner;

import demo009.ApplicationContext;
import demo009.menu.Command;
import demo009.model.Fuhrpark;
import demo009.model.Niederlassung;


public class CommandFuhrparkVerkaufen implements Command{
	
	@Override
	public String menuItemName() {
		return "Fuhrwerk Verkaufen";
		 
	}
	@Override
	public void execute(ApplicationContext context) {
		Fuhrpark fp = new Fuhrpark(0,0 ); 
		System.out.println("Sollen Fahrzeuge verkauft werden?");
		Scanner myScanner = new Scanner(System.in);
		String s = myScanner.next();
		if(s.equals("y")) {
			System.out.println("Wie viele Fahreuge sollen verkauft werden?");
			int i = myScanner.nextInt();
			fp.setAnzahlFuhrwerke(-i);
			System.out.println("Anzahl Fuhrpark:"+ fp.getAnzahlFuhrwerke());
			
		}
		

	}
}


