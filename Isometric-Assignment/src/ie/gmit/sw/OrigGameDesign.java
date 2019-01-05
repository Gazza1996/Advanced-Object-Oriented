package ie.gmit.sw;

import ie.gmit.sw.Model.SpriteTile;
import ie.gmit.sw.ground.GroundBuilder;

public class OrigGameDesign {

	// the number of tiles across
	private static int VERTCIALCELLS;
	// the number of tiles down
	private static int HORIZONTINALCELLS;

	private static GroundBuilder rockBuilder = new GroundBuilder();
	private static GroundBuilder weedBuilder = new GroundBuilder();
	private static GroundBuilder sandBuilder = new GroundBuilder();
	private static GroundBuilder waterBuilder = new GroundBuilder();
	private static GroundBuilder beachBuilder = new GroundBuilder();
	private static GroundBuilder mudBuilder = new GroundBuilder();
	private static GroundBuilder gravelBuilder = new GroundBuilder();

	private static ItemBuilder treeBuilder = new ItemBuilder();
	private static ItemBuilder signBuilder = new ItemBuilder();
	private static ItemBuilder ladderBuilder = new ItemBuilder();
	private static ItemBuilder chestBuilder = new ItemBuilder();

	private static Tile tile = null;

	public static void addGroundTiles(int v, int h, GridView g) {

		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		// set the different ground tiles
		rockTiles(g);
		weedTiles(g);
		sandTiles(g);
		waterTiles(g);
		beachTiles(g);
		mudTiles(g);
		gravelTiles(g);

		fillBlankTilesWithGrass(g);

	}

	private static void fillBlankTilesWithGrass(GridView g) {
		// TODO Auto-generated method stub
		
	}

	private static void gravelTiles(GridView g) {
		// TODO Auto-generated method stub
		
	}

	private static void mudTiles(GridView g) {
		// TODO Auto-generated method stub
		
	}

	private static void beachTiles(GridView g) {
		// TODO Auto-generated method stub
		
	}

	private static void waterTiles(GridView g) {
		// TODO Auto-generated method stub
		
	}

	private static void sandTiles(GridView g) {
		// TODO Auto-generated method stub
		
	}

	private static void weedTiles(GridView g) {
		// TODO Auto-generated method stub
		
	}

	private static void rockTiles(GridView g) {
		// TODO Auto-generated method stub
		
	}

	public static void addObjects(int v, int h, GridView g) {
		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		addTrees(g);
		addLadder(g);
		/*addSigns(g);
		addChests(g);
*/
	}

	private static void addLadder(GridView g2) {
		// TODO Auto-generated method stub
		tile = ladderBuilder.setType(ItemType.ladder).setPos(g2.position(2, 9)).setIndex(2, 9).build();
		g2.addTile(tile);
	}

	private static void addTrees(GridView g2) {
		// TODO Auto-generated method stub
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 0)).setIndex(1, 0).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 0)).setIndex(2, 0).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 0)).setIndex(3, 0).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 1)).setIndex(2, 1).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 1)).setIndex(3, 1).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 3)).setIndex(0, 3).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 4)).setIndex(0, 4).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 5)).setIndex(0, 5).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 6)).setIndex(0, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 7)).setIndex(0, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 8)).setIndex(0, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 4)).setIndex(1, 4).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 5)).setIndex(1, 5).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 6)).setIndex(1, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 7)).setIndex(1, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 8)).setIndex(1, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 5)).setIndex(2, 5).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 6)).setIndex(2, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 7)).setIndex(2, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 8)).setIndex(2, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 6)).setIndex(3, 6).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 7)).setIndex(3, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 8)).setIndex(3, 8).build();
		g2.addTile(tile);
	}

	public static SpriteTile addPlayer(int v, int h, GridView g2) {
		// TODO Auto-generated method stub
		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		Tile player = SpriteFactory.create(Type.player, 0, 0);
		player.setPos(g.position(0, 0));
		g.addTile(player);

		return (SpriteTile) player;
	}

}
