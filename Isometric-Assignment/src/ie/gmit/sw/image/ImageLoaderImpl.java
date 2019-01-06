package ie.gmit.sw.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;

public class ImageLoaderImpl implements ImageLoader {

	/*
	 * class using iterator return
	 */
	public Iterator<BufferedImage> loadImages(String directory) {

		File dir = new File(directory); // directory
		File[] files = dir.listFiles(); // list files

		List<BufferedImage> images = new ArrayList<>(); // array list

		// for loop
		for (File f : files) {
			try { // try catch
				BufferedImage image = ImageIO.read(f);
				images.add(image);
			} catch (IOException e) {
			}
		}
		// iterator
		return images.iterator();
	}

}
