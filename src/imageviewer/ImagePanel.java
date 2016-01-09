package imageviewer;

import imageviewer.model.Image;
import imageviewer.view.ImageDisplay;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Universidad
 */
public class ImagePanel extends JPanel implements ImageDisplay{
    private Image image;

    public ImagePanel(Image image) {
        this.image = image;
    }
       
    @Override
    public Image image() {
        return this.image;
    }

    @Override
    public void show(Image image) {
        this.image = image;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage((BufferedImage) image.bitmap(), 0, 0, this);
    }
    
}
