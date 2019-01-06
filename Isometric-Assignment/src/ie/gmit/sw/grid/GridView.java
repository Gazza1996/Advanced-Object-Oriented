package ie.gmit.sw.grid;

import java.util.ArrayList;

import ie.gmit.sw.Tile;
import ie.gmit.sw.ground.GroundTile;
import ie.gmit.sw.item.ItemTile;
import ie.gmit.sw.player.Position;

/*
 * interface for grid methods
 */
public interface GridView {
	// array list
	ArrayList<Tile> getTiles();
	void setTiles(ArrayList<Tile> t);
	void addTile(Tile t);
	
	// position
	Position[][] getPositions();
	void setPositions(Position[][] p);
	Position position(int down, int across);
	int[] getIndex(Position p);
	
	// tiles
	GroundTile getGroundTile(int a, int b);
	ItemTile getItemTile(int a, int b);
	
	// occupied
	boolean ocupied(int a, int b);

}
