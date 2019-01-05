package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import ie.gmit.sw.GameWindow;
import ie.gmit.sw.ground.GroundType;

public class Runner {
	
	public static void main(String[] args) throws Exception {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
                try {
                	
                	//Loads the tile images so they only need to be buffered once when the game starts
                	loadResources();
                	//Using the Game window as a Singleton
                	GameWindow.getInstance();
					
				} catch (Exception e) {
					//If the GUI fails to load
					JOptionPane.showMessageDialog(null, null, "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
	}
	
	public static void loadResources() {
		ImageLoad g = new ImageImpl();
		Iterator<BufferedImage> itr = g.loadImages("./resources/images/ground");
		EnumSet.allOf(GroundType.class).forEach(type -> (type).setImg(itr.next()));
		/*Iterator<BufferedImage> itr2 = g.loadImages("./resources/images/objects");
		EnumSet.allOf(ItemType.class).forEach(type -> (type).setImg(itr2.next()));*/

		// Load image files for the player
		Iterator<BufferedImage> playerImages = g.loadImages("./resources/images/sprites/default");
		List<BufferedImage> images = new ArrayList<>();
		playerImages.forEachRemaining(images::add);
		SpriteType.standard.setImg(images);

		// Load image files for the green guy
		Iterator<BufferedImage> greenGuy = g.loadImages("./resources/images/sprites/green");
		images = new ArrayList<>();
		greenGuy.forEachRemaining(images::add);
		SpriteType.green.setImg(images);

		// Load image files for a knight
		Iterator<BufferedImage> knight = g.loadImages("./resources/images/sprites/knight");
		images = new ArrayList<>();
		knight.forEachRemaining(images::add);
		SpriteType.knight.setImg(images);

		// Load image files for person
		Iterator<BufferedImage> person = g.loadImages("./resources/images/sprites/person");
		images = new ArrayList<>();
		person.forEachRemaining(images::add);
		SpriteType.person.setImg(images);
		
	}
}