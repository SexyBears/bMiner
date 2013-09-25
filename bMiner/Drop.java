package bMiner;

import org.parabot.environment.scripts.framework.Strategy; 
import org.rev317.api.methods.Inventory; 
import org.rev317.api.wrappers.hud.Item; 
import org.rev317.api.wrappers.hud.Tab; 
  
public class Drop implements Strategy { 
       
    public static final int[] DropID = { 434, 436, 438, 440, 442, 453, 444, 447, 449, 451, 1436, 7936 } ;
    static String status;
      
    @Override
    public boolean activate() { 
            // TODO Auto-generated method stub 
             
             
            return Inventory.isFull() && bMiner.drop == true; 
             
    } 
  
    @Override
    public void execute() { 
            // TODO Auto-generated method stub 
  
             
            if(!Tab.INVENTORY.isOpen()){ 
            Tab.INVENTORY.open();
            status = "Opening Inventory...";
             
        } 
              
//copper ore 436 / tin ore 438 / iron ore 440 / coal ore 453 / gold ore 444 / mithril ore 447 / adamant ore 449 / runite ore 451 
              
            for(final Item i : Inventory.getItems(DropID)){ 
                i.interact("Drop"); 
                status = "Dropping all the Ores...";
                  
                    } 
    } 
      
} 