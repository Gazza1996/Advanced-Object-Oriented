package ie.gmit.sw;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.Timer;
//import javax.swing.text.Position;
import javax.imageio.*;
import java.io.*;
import java.util.*;

import ie.gmit.sw.Model.*;
import ie.gmit.sw.ground.GroundBuilder;
import ie.gmit.sw.ground.GroundTile;
import ie.gmit.sw.ground.GroundType;
import ie.gmit.sw.Tile;

public class GameView extends JPanel implements ActionListener, KeyListener {
	private static final long serialVersionUID = 777L;

	private static final int DEFAULT_IMAGE_INDEX = 0; // change

	// Encapsulate the things that vary...
	public static final int DEFAULT_SIZE = 1280;
	private static final int TILE_WIDTH = 128;
	private static final int TILE_HEIGHT = 64;

	private Position pos = new Position(DEFAULT_SIZE / 2, 0);

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

		// new timer start
		timer = new Timer(100, this);
		// timer start
		timer.start();

	}

	private void offsetPositions(int i, int offset) {
		// TODO Auto-generated method stub
		pos.setX(((DEFAULT_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset);
		pos.setY((TILE_HEIGHT * i) / 2 - offset);

	}

	public void nextPosition() {
		// TODO Auto-generated method stub
		pos.setX(pos.getX() + TILE_WIDTH / 2);
		pos.setY(pos.getY() + TILE_HEIGHT / 2);
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

	public static void setPlayer(SpriteTile player) {
		player.setDirection(Direction.RIGHT);
		player = player;
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