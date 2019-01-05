package ie.gmit.sw;

import java.awt.*;
import javax.swing.*;

public class GameWindow {
	private static GameWindow window_instance = null;

	// scene default size
	private static final int DEFAULT_SIZE = 1280;
	private static final int VERTCIAL_CELLS = 10;
	private static final int HORIZONTINAL_CELLS = 10;
	private static final int TILE_HEIGHT = 128;
	private static final int TILE_WIDTH = 64;

	/*
	 * 2 grids declared in GridView for ground and objects
	 */
	
	private GridView g1 = new GridViewImpl(DEFAULT_SIZE, VERTCIAL_CELLS, HORIZONTINAL_CELLS, TILE_WIDTH, TILE_HEIGHT, 0);
	private GridView g2 = new GridViewImpl(DEFAULT_SIZE, VERTCIAL_CELLS, HORIZONTINAL_CELLS, TILE_WIDTH, TILE_HEIGHT, 10);

	private GameView view;

	public GameWindow() {

		try {

			view = new GameView();
			
			view.setGrid1(g1);
			view.setGrid2(g2);

			Dimension d = new Dimension(DEFAULT_SIZE, DEFAULT_SIZE / 2);

			view.setPreferredSize(d);
			view.setMinimumSize(d);
			view.setMaximumSize(d);
			JFrame f = new JFrame("Gary Mannion");

			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setLayout(new FlowLayout());
			f.add(view);
			f.addKeyListener(view);
			f.setSize(1000, 1000);
			f.setLocation(100, 100);
			f.pack();
			f.setVisible(true);
	
			OrigGameDesign.addGroundTiles(VERTCIAL_CELLS, HORIZONTINAL_CELLS, g1);
			OrigGameDesign.addObjects(VERTCIAL_CELLS, HORIZONTINAL_CELLS, g2);
			GameView.setPlayer(OrigGameDesign.addPlayer(VERTCIAL_CELLS, HORIZONTINAL_CELLS, g2));
			//OrigGameDesign.addSprites(VERTCIALCELLS, HORIZONTINALCELLS, g2);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, null, "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static GameWindow getInstance() {
		// TODO Auto-generated method stub
		if (window_instance == null)
			window_instance = new GameWindow();

		return window_instance;

	}
}