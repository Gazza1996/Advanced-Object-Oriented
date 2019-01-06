package ie.gmit.sw;

import ie.gmit.sw.grid.GridView;
import ie.gmit.sw.ground.GroundBuilder;
import ie.gmit.sw.ground.GroundTile;
import ie.gmit.sw.ground.GroundType;
import ie.gmit.sw.item.ItemBuilder;
import ie.gmit.sw.item.ItemType;
import ie.gmit.sw.sprite.SpriteFactory;
import ie.gmit.sw.sprite.SpriteTile;
import ie.gmit.sw.sprite.SpriteFactory.Type;

public class OrigGameDesign {

	/*
	 * class that displays the game the same way as the demo from John
	 * Slightly updated by myself and designed differently
	 */
	private static int VERTCIAL; // v
	private static int HORIZONTINAL; // h

	// ground
	private static GroundBuilder rockBuilder = new GroundBuilder();
	private static GroundBuilder sandBuilder = new GroundBuilder();
	private static GroundBuilder waterBuilder = new GroundBuilder();
	private static GroundBuilder beachBuilder = new GroundBuilder();
	private static GroundBuilder gravelBuilder = new GroundBuilder();

	// items
	private static ItemBuilder treeBuilder = new ItemBuilder();
	private static ItemBuilder signBuilder = new ItemBuilder();
	private static ItemBuilder chestBuilder = new ItemBuilder();

	private static Tile tile = null;

	// all ground tiles
	public static void addGroundTiles(int v, int h, GridView g) {

		HORIZONTINAL = h;
		VERTCIAL = v;

		rockTiles(g);
		sandTiles(g);
		waterTiles(g);
		beachTiles(g);
		gravelTiles(g);

		fillBlankTilesWithGrass(g);

	}

	// all object tiles
	public static void addObjects(int v, int h, GridView g) {
		HORIZONTINAL = h;
		VERTCIAL = v;

		addTrees(g);
		addSigns(g);
		addChests(g);

	}

	// chests
	private static void addChests(GridView g2) {
		tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(9, 9)).setIndex(9, 9).build();
		g2.addTile(tile);
	/*	tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(4, 9)).setIndex(4, 9).build();
		g2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(9, 5)).setIndex(9, 5).build();
		g2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPos(g2.position(5, 0)).setIndex(5, 0).build();
		g2.addTile(tile);*/
	}

	// one sign post
	private static void addSigns(GridView g2) {
		tile = signBuilder.setType(ItemType.signPost).setPos(g2.position(3, 2)).setIndex(3, 2).build();
		g2.addTile(tile);
	}

	// trees
	private static void addTrees(GridView g2) {

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

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(4, 7)).setIndex(4, 7).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(4, 8)).setIndex(4, 8).build();
		g2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(0, 9)).setIndex(5, 8).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(1, 9)).setIndex(5, 8).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(2, 9)).setIndex(5, 8).build();
		g2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPos(g2.position(3, 9)).setIndex(5, 8).build();
		g2.addTile(tile);

	}

	// player
	public static SpriteTile addPlayer(int v, int h, GridView g) {
		HORIZONTINAL = h;
		VERTCIAL = v;

		Tile player = SpriteFactory.create(Type.player, 0, 0);
		player.setPos(g.position(0, 0));
		g.addTile(player);

		return (SpriteTile) player;
	}

	// gravel
	private static void gravelTiles(GridView g1) {
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 7)).setIndex(9, 7).build();
		g1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 8)).setIndex(9, 8).build();
		g1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPos(g1.position(9, 9)).setIndex(9, 9).build();
		g1.addTile(tile);
	}

	// beach
	private static void beachTiles(GridView g1) {
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 0)).setIndex(6, 0).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 1)).setIndex(6, 1).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 2)).setIndex(6, 2).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(6, 3)).setIndex(6, 3).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(7, 3)).setIndex(7, 3).build();
		g1.addTile(tile);
		tile = beachBuilder.setType(GroundType.beach).setPos(g1.position(8, 4)).setIndex(8, 4).build();
		g1.addTile(tile);
	}

	// water
	private static void waterTiles(GridView g1) {
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 4)).setIndex(9, 4).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 3)).setIndex(9, 3).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 2)).setIndex(9, 2).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 1)).setIndex(9, 1).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(9, 0)).setIndex(9, 0).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 3)).setIndex(8, 3).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 2)).setIndex(8, 2).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 1)).setIndex(8, 1).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(8, 0)).setIndex(8, 0).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 2)).setIndex(7, 2).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 1)).setIndex(7, 1).build();
		g1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPos(g1.position(7, 0)).setIndex(7, 0).build();
		g1.addTile(tile);
	}

	// sand
	private static void sandTiles(GridView g1) {
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(6, 4)).setIndex(6, 4).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(7, 4)).setIndex(7, 4).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(6, 5)).setIndex(8, 4).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(7, 5)).setIndex(7, 5).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(8, 5)).setIndex(8, 5).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPos(g1.position(9, 5)).setIndex(9, 5).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 0)).setIndex(5, 0).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 1)).setIndex(5, 1).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 2)).setIndex(5, 2).build();
		g1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPos(g1.position(5, 3)).setIndex(5, 3).build();
		g1.addTile(tile);
	}

	// rocks
	private static void rockTiles(GridView g1) {
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(0, 0)).setIndex(0, 0).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(1, 1)).setIndex(1, 1).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(2, 2)).setIndex(1, 1).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(3, 3)).setIndex(3, 3).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(4, 4)).setIndex(4, 4).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 5)).setIndex(5, 5).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 4)).setIndex(5, 4).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(5, 6)).setIndex(5, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 6)).setIndex(6, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(7, 6)).setIndex(7, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(8, 6)).setIndex(8, 6).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(9, 6)).setIndex(9, 6).build();
		g1.addTile(tile);
	
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 9)).setIndex(6, 9).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 8)).setIndex(6, 9).build();
		g1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPos(g1.position(6, 7)).setIndex(6, 9).build();
		g1.addTile(tile);
	}

	// empty tiles to be filled with just grass
	private static void fillBlankTilesWithGrass(GridView g1) {

		GroundBuilder tBuilder = new GroundBuilder();
		GroundTile tile;

		for (int i = 0; i < VERTCIAL; i++) {
			for (int j = 0; j < HORIZONTINAL; j++) {
				if (!g1.ocupied(i, j)) {
					tile = tBuilder.setType(GroundType.grass).setPos(g1.position(i, j)).setIndex(i, j).build();
					g1.addTile(tile);
				}
			}
		}
	}
}
