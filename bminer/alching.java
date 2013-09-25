package bMiner;

import java.awt.Point;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.input.Mouse;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.api.methods.Inventory;
import org.rev317.api.wrappers.hud.Item;
import org.rev317.api.wrappers.hud.Tab;

public class alching implements Strategy{
	
	 Point alchSpell = new Point(666, 338);
	 public static final int[] ROCKID = { 434, 436, 438, 440, 442, 453, 444, 447, 449, 451, 1436, 7936 } ;

	@Override
	public boolean activate() {
		// TODO Auto-generated method stub
		return Inventory.getCount(ROCKID) > 0 && bMiner.alching == true;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		if(!Tab.MAGIC.isOpen()){ 
            Tab.MAGIC.open();
            Time.sleep(500);
		}
		
		if (alchSpell != null) {
			
			Mouse.getInstance().click(alchSpell);
            Time.sleep(750);
            
            for (Item i : Inventory.getItems(ROCKID)) {
    			i.interact("Cast High level alchemy on");
    			Time.sleep(1750);

		

	}

}
}
}