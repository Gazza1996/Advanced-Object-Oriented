package ie.gmit.sw;

import java.awt.*;
import javax.swing.*;

import ie.gmit.sw.grid.GridView;
import ie.gmit.sw.grid.GridViewImpl;

public class GameWindow {

	private static GameWindow window_instance = null;

	/*
	 * variables for sizes down and accross and tiles
	 */
	private static final int DEFAULT_SIZE = 1280;
	private static final int VERTCIAL = 10;
	private static final int HORIZONTINAL = 10;
	private static final int TILEHEIGHT = 128;
	private static final int TILEWIDTH = 64;

	/*
	 * grids 1 and 2
	 */
	private GridView g1 = new GridViewImpl(DEFAULT_SIZE, VERTCIAL, HORIZONTINAL, TILEWIDTH, TILEHEIGHT, 0);
	private GridView g2 = new GridViewImpl(DEFAULT_SIZE, VERTCIAL, HORIZONTINAL, TILEWIDTH, TILEHEIGHT, 10);
	private GameView view;

	public GameWindow() {

		try {

			view = new GameView();

			view.setGrid1(g1);
			view.setGrid2(g2);

			/*
			 * dimensions
			 */
			Dimension d = new Dimension(DEFAULT_SIZE, DEFAULT_SIZE / 2);

			view.setPreferredSize(d);
			view.setMinimumSize(d);
			view.setMaximumSize(d);

			// name on frame
			JFrame f = new JFrame("Gary Mannion");

			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default
			f.getContentPane().setLayout(new FlowLayout());
			f.add(view); // view game
			f.addKeyListener(view); // listener
			f.setSize(1000, 1000); // frame size
			f.setLocation(100, 100); // location
			f.pack();
			f.setVisible(true); // make visible

			/*
			 * objects and tiles from other class to create game
			 */
			OrigGameDesign.addGroundTiles(VERTCIAL, HORIZONTINAL, g1);
			OrigGameDesign.addObjects(VERTCIAL, HORIZONTINAL, g2);
			view.setPlayer(OrigGameDesign.addPlayer(VERTCIAL, HORIZONTINAL, g2));
	

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, null, "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}
	// singleton
	public static GameWindow getInstance() {
		if (window_instance == null)
			window_instance = new GameWindow();

		return window_instance;
	}

}