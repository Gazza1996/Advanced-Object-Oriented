package ie.gmit.sw.image;

import java.awt.image.BufferedImage;
import java.util.Iterator;

/*
 * load images from directory
 * */
public interface ImageLoader {
	public Iterator<BufferedImage> loadImages(String directory);
}
