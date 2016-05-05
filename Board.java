

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

    private Image blankboard;

    public Board() {

        initBoard();
    }
    
    private void initBoard() {
        
        loadImage();
        
        int w = blankboard.getWidth(this);
        int h =  blankboard.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
    
    private void loadImage() {
        
        ImageIcon ii = new ImageIcon("blankboard.png");
        blankboard = ii.getImage();        
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(blankboard, 0, 0, null);
    }
}
