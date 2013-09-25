package bMiner;

import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.api.methods.Inventory;
import org.rev317.api.methods.Walking;
import org.rev317.api.wrappers.scene.Tile;
import org.rev317.api.wrappers.walking.TilePath;

public class EastMine implements Strategy {
	
	private final Tile[] to_Mine = { new Tile(1111,1111,0), new Tile(1111,1111,0) };

	@Override
	public boolean activate() {
		// TODO Auto-generated method stub
		return !Inventory.isFull();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		TilePath path = new TilePath(to_Mine);
        if(!path.hasReached() && Walking.readyForNextTile()) {
           path.traverse();
          
      }
     }
 }
	
