package ie.gmit.sw;

import java.util.ArrayList;
import ie.gmit.sw.Model.*;
import ie.gmit.sw.ground.GroundTile;
import ie.gmit.sw.GridView;

public class GridViewImpl implements GridView {
	
	private static int DEFAULT_SIZE;
	private int offset;
	private int TILE_HEIGHT;
	private int TILE_WIDTH;
	private Position pos = new Position(DEFAULT_SIZE / 2, 0);
	private Position positions[][];
	private ArrayList<Tile> tiles = new ArrayList<>();
	
	
	public GridViewImpl(int size, int down, int across, int tileH, int tileW, int offset) {
		// set the array size
		positions = new Position[down][across];

		DEFAULT_SIZE = size;
		TILE_HEIGHT = tileH;
		TILE_WIDTH = tileW;
		this.offset = offset;

		createStartingPositions(down, across);

	}

	private void createStartingPositions(int down, int across) {

		for (int i = 0; i < down; i++) {

			offsetPositions(i, this.offset);

			for (int j = 0; j < across; j++) {
				this.positions[i][j] = new Position(this.pos.getX(), this.pos.getY());
				nextPosition();
			}
		}
	}

	public Position position(int down, int across) {
		return positions[down][across];
	}

	public void offsetPositions(int i, int offset) {
		pos.setX(((DEFAULT_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset);
		pos.setY((TILE_HEIGHT * i) / 2 - offset);
	}

	public void nextPosition() {
		pos.setX(pos.getX() + TILE_WIDTH / 2);
		pos.setY(pos.getY() + TILE_HEIGHT / 2);
	}
	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<Tile> t) {
		tiles = t;
	}

	public void addTile(Tile t) {
		tiles.add(t);
	}

	
	public boolean ocupied(int a, int b) {
		return tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().isPresent();
	}

	
	public GroundTile getGroundTile(int a, int b) {

		return (GroundTile) tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().get();
	}

	public ItemTile getItemTile(int a, int b) {

		if (tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().isPresent()) {

			return (ItemTile) tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().get();

		}

		return null;
	}

	public Position[][] getPositions() {
		return this.positions;
	}

	public void setPositions(Position[][] p) {
		this.positions = p;
	}

	public int[] getIndex(Position p) {

		int[] index = { 0, 0 };

		for (int i = 0; i < positions.length; i++) {

			index[0] = i;

			for (int j = 0; j < positions[0].length; j++) {

				index[1] = j;

				if (p.getX() == positions[i][j].getX() && p.getY() == positions[i][j].getY()) {
					return index;
				}
			}

		}

		return index;
	}
	
	// getters/setters

	@Override
	public ArrayList<Tile>[][] getGrid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGrid(ArrayList<Tile>[][] gridTiles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTileLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTileRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTileUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTileDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emptyTile() {
		// TODO Auto-generated method stub
		
	}
}
