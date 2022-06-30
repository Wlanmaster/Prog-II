package demo009.menu.impl;
import demo009.ApplicationContext;
import demo009.menu.Command;
import demo009.misc.DisplayService;
import demo009.model.Lager;




	public class CommandLagerBestand implements Command {

		@Override
		public String menuItemName() {
			return "Lager ausgeben";
		}

		@Override
		public void execute(ApplicationContext context) {
			
	
			DisplayService.anzeigeLager(context);
		}

}
