package bMiner;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.api.methods.Bank;
import org.rev317.api.methods.Inventory;
import org.rev317.api.methods.SceneObjects;
import org.rev317.api.methods.Walking;
import org.rev317.api.wrappers.scene.SceneObject;
import org.rev317.api.wrappers.scene.Tile;
import org.rev317.api.wrappers.walking.TilePath;

public class EastBank implements Strategy {
	
	final SceneObject[] Banker = SceneObjects.getNearest(2213);
    final SceneObject Banks = Banker[0];
	
	private final Tile[] to_Bank = { new Tile(1111,1111,0), new Tile(1111,1111,0) };

	@Override
	public boolean activate() {
		// TODO Auto-generated method stub
		return Inventory.isFull();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		TilePath path = new TilePath(to_Bank);
        if(!path.hasReached() && Walking.readyForNextTile()) {
           path.traverse();
      }
        if(path.hasReached() && !Bank.isOpen()) {
        	Banks.interact("Use-quickly");
            Time.sleep(400);
    } else {
            if (Bank.isOpen());
            Bank.depositAllExcept(1275);
        }
        
     }
 

	}


