package demo009.menu.impl;

import java.util.Scanner;

import demo009.ApplicationContext;
import demo009.menu.Command;
import demo009.model.Niederlassung;

public class CommandEinstellen implements Command {

	@Override
	public String menuItemName() {
		return "Arbeitende einstellen";
	}

	@Override
	public void execute(ApplicationContext context) {
		// TODO Auto-generated method stub
		System.out.println("========== "+menuItemName());
		System.out.println("Sollen neue Arbeiter eingestellt werden? ");
		Scanner myScanner = new Scanner (System.in);
		String s = myScanner.next();
		
		if (s.equals("y")) {
			System.out.println("Wie viele Arbeiter sollen eingestellt werden?");
			int i = myScanner.nextInt(); 
			Niederlassung nl = new Niederlassung(null, null, 0);  
			nl.einstellen(i);
			System.out.println("Anzahl Arbeiter:" +  nl.getArbeiter());
			
			System.out.println("Sollen Arbeiter entlassen werden?");
			String a = myScanner.next();
			if(s.equals("y")) {
				System.out.println("Wie viele arbeiter sollen entlassen werden=");
				int r = myScanner.nextInt();
				nl.entlassen(r);
				System.out.println("Anzahl Arbeiter:" + nl.getArbeiter());
				
				
				
			}
			
			
			
			 
		}
		

	
	}

}
