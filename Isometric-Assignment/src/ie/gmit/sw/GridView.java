package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.Model.Position;

public interface GridView {
	ArrayList<Tile>[][] getGrid();
	void setGrid(ArrayList<Tile>[][] gridTiles); 
	
	ArrayList<Tile> getTiles();
	
	int getHeight();
	void setHeight(int height);
	int getWidth();
	void setWidth(int width);
	
	void moveTileLeft();
	void moveTileRight();
	void moveTileUp();
	void moveTileDown();
	
	void emptyTile();
	Object[][] getPositions();
	Position position(int i, int j);
	void addTile(Tile tile);


}
