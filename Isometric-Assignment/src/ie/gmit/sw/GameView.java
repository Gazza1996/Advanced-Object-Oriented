package ie.gmit.sw;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.grid.GridView;
import ie.gmit.sw.player.Direction;
import ie.gmit.sw.player.PlayerMovement;
import ie.gmit.sw.sprite.SpriteTile;

public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;

	private Timer timer;
	
	private GridView grid1;
	private GridView grid2;
	private static SpriteTile player;
	private boolean gameOver = false;
	private int chest = 1;

	public GameView() {

		setBackground(Color.WHITE);
		setDoubleBuffered(true);

		JOptionPane.showMessageDialog(null,
				"Use arrow keys to control player", null,
				JOptionPane.DEFAULT_OPTION);

		// 1/10
		timer = new Timer(100, this);
		// timer start
		timer.start();

	}

	public void actionPerformed(ActionEvent e) {
				if (chest == 0)
					gameOver = true;

				if (gameOver) {
					JOptionPane.showMessageDialog(null, "You Win!!!!!", null, JOptionPane.DEFAULT_OPTION);
					System.exit(0);
				}
		this.repaint();
	}

	public void paintComponent(Graphics g) {
		// super class
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		paint(g2, grid1);
		paint(g2, grid2);
	}

	/*
	 * draw our tiles
	 */
	public void paint(Graphics2D g2, GridView grid) {
		for (Tile t : grid.getTiles()) {
			g2.drawImage(t.getImage(), t.getPos().getX(), t.getPos().getY(), null);
		}
	}

	/*
	 * getters/setters for grid an player
	 */
	public GridView getGrid1() {
		return grid1;
	}

	public void setGrid1(GridView g1) {
		this.grid1 = g1;
	}

	public GridView getGrid2() {
		return grid2;
	}

	public void setGrid2(GridView g2) {
		this.grid2 = g2;
	}

	public SpriteTile getPlayer() {
		return player;
	}

	public void setPlayer(SpriteTile p) {
		p.setDirection(Direction.RIGHT);
		player = p;
	}

	@Override
	public void keyPressed(KeyEvent e) {

		/*
		 * movements of player in each direction
		 * moves player one tile each key press
		 */
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
	
	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public int getChest() {
		return chest;
	}

	public void setChest(int chest) {
		this.chest += chest;
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}