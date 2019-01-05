package ie.gmit.sw;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.Model.*;
import ie.gmit.sw.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {
	private static final long serialVersionUID = 777L;
	private Timer timer;

	/*
	 * grid1 will be our ground tiles grid2 will be for our other sprites and
	 * objects
	 */
	private GridView grid1;
	private GridView grid2;
	// player character
	private static SpriteTile player;

	public GameView() {

		setBackground(Color.WHITE);
		setDoubleBuffered(true);
		
		JOptionPane.showMessageDialog(null,
				"Control the player using arrow keys", null,
				JOptionPane.DEFAULT_OPTION);

		// new timer start
		timer = new Timer(100, this);
		// timer start
		timer.start();

	}

	public void actionPerformed(ActionEvent e) { // This is called each time the timer reaches zero
		this.repaint();
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		paint(g2, grid1);
		paint(g2, grid2);

	}

	public void paint(Graphics2D g2, GridView grid) {
		for (Tile t : grid.getTiles()) {
			g2.drawImage(t.getImage(), t.getPos().getX(), t.getPos().getY(), null);
		}
	}

	// source add getters/setters

	public GridView getGrid1() {
		return grid1;
	}

	public void setGrid1(GridView grid1) {
		this.grid1 = grid1;
	}

	public GridView getGrid2() {
		return grid2;
	}

	public void setGrid2(GridView grid2) {
		this.grid2 = grid2;
	}

	public static SpriteTile getPlayer() {
		return player;
	}

	public static void setPlayer(SpriteTile p) {
		p.setDirection(Direction.RIGHT);
		player = p;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		try {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				player.setDirection(Direction.RIGHT);
				PlayerMovement.move(grid2.getPositions()[player.getX()][player.getY() + 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				player.setDirection(Direction.LEFT);
				PlayerMovement.move(grid2.getPositions()[player.getX()][player.getY() - 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				player.setDirection(Direction.UP);
				PlayerMovement.move(grid2.getPositions()[player.getX() - 1][player.getY()], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				player.setDirection(Direction.DOWN);
				PlayerMovement.move(grid2.getPositions()[player.getX() + 1][player.getY()], player, grid1, grid2, this);
			} else {
				return;
			}
		} catch (Exception ex) {
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}