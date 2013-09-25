package bMiner;

import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.api.methods.Inventory;
import org.rev317.api.wrappers.hud.Item;
import org.rev317.api.wrappers.hud.Tab;

public class Bardrop implements Strategy {

	public static final int[] BarID = { 434, 436, 438, 440, 442, 453, 444, 447, 449, 451, 1436, 7936 } ;
	
	@Override
	public boolean activate() {
		// TODO Auto-generated method stub
		return Inventory.isFull() && bMiner.bardrop == true; 
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		if(!Tab.INVENTORY.isOpen()){ 
            Tab.INVENTORY.open();

             
        } 
              
            for(final Item i : Inventory.getItems(BarID)){ 
                i.interact("Drop"); 

                  
                    } 
		} 
}

