package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.Model.Position;
import ie.gmit.sw.ground.GroundTile;

public interface GridView {
	ArrayList<Tile> getTiles();
	void setTiles(ArrayList<Tile> t);
	void addTile(Tile t);
	Position[][] getPositions();
	void setPositions(Position[][] p);
	Position position(int down, int across);
	boolean occupied(int i, int j);
	int[] getIndex(Position p);
	GroundTile getGroundTile(int a, int b);
	ItemTile getItemTile(int a, int b);
}
