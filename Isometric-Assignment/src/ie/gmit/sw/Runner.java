package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import ie.gmit.sw.ground.GroundType;
import ie.gmit.sw.image.ImageLoader;
import ie.gmit.sw.image.ImageLoaderImpl;
import ie.gmit.sw.item.ItemType;
import ie.gmit.sw.sprite.SpriteType;

/*
 * runner class 
 */

public class Runner {

	public static void main(String[] args) throws Exception {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				try {
					loadResources(); // load resources(down below)
					// singleton
					GameWindow.getInstance();

				} catch (Exception e) {
				}

			}
		});
	}

	public static void loadResources() {
		// images for ground tiles
		ImageLoader g = new ImageLoaderImpl();
		Iterator<BufferedImage> itr = g.loadImages("./resources/images/ground");
		EnumSet.allOf(GroundType.class).forEach(type -> (type).setImg(itr.next()));
		
		// images for items
		Iterator<BufferedImage> itr2 = g.loadImages("./resources/images/objects");
		EnumSet.allOf(ItemType.class).forEach(type -> (type).setImage(itr2.next()));

		// player image
		Iterator<BufferedImage> playerImages = g.loadImages("./resources/images/sprites/default");
		List<BufferedImage> images = new ArrayList<>();
		playerImages.forEachRemaining(images::add);
		SpriteType.standard.setImg(images);
	}

}