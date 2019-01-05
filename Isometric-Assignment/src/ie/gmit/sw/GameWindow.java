package ie.gmit.sw;

import java.awt.*;
import javax.swing.*;

public class GameWindow {
	private static GameWindow window_instance = null;

	// scene default size
	private static final int DEFAULT_SIZE = 1280;
	private static final int VERTCIALCELLS = 15;
	private static final int HORIZONTINALCELLS = 15;
	private static final int TILEHEIGHT = 128;
	private static final int TILEWIDTH = 64;

	/*
	 * 2 grids declared in GridView for ground and objects
	 */
	
	private GridView g1 = new GridViewImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 0);
	private GridView g2 = new GridViewImpl(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 10);

	private GameView view;

	public GameWindow() {

		try {

			view = new GameView();

			Dimension d = new Dimension(DEFAULT_SIZE, DEFAULT_SIZE / 2);

			view.setPreferredSize(d);
			view.setMinimumSize(d);
			view.setMaximumSize(d);

			JFrame f = new JFrame();

			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setLayout(new FlowLayout());
			f.add(view);
			f.addKeyListener(view);
			f.setSize(1000, 1000);
			f.setLocation(50, 50);
			f.pack();
			f.setVisible(true);

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