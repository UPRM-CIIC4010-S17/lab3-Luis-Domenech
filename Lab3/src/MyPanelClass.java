import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
//                        //Paint the background
//                        g.setColor(Color.BLACK);
//                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw a border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw 2nd border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((x2 - 55)/2, (y2 - 55) / 2, 55, 55);
//                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.drawPolygon(p);
//                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                        Polygon blue = new Polygon();
                        blue.addPoint(0, 0);
                        blue.addPoint(125, 75);
                        blue.addPoint(0, 150);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(blue);
                        
                        Polygon red1 = new Polygon();
                        red1.addPoint(0, 0);
                        red1.addPoint(210, 0);
                        red1.addPoint(210, 33);
                        red1.addPoint(55, 33);
                        g.setColor(Color.RED);
                        g.fillPolygon(red1);
                        
                        Polygon red2 = new Polygon();
                        red2.addPoint(100, 60);
                        red2.addPoint(210, 60);
                        red2.addPoint(210, 75);
                        red2.addPoint(125, 75);
                        g.setColor(Color.RED);
                        g.fillPolygon(red2);
                        
                        Polygon red3 = new Polygon();
                        red3.addPoint(100, 90);
                        red3.addPoint(210, 90);
                        red3.addPoint(210, 75);
                        red3.addPoint(125, 75);
                        g.setColor(Color.RED);
                        g.fillPolygon(red3);
                        
                        Polygon red4 = new Polygon();
                        red4.addPoint(0, 150);
                        red4.addPoint(210, 150);
                        red4.addPoint(210, 150 - 33);
                        red4.addPoint(55, 150 - 33);
                        g.setColor(Color.RED);
                        g.fillPolygon(red4);
                        
                        Polygon star = new Polygon();
                        star.addPoint(x1 + 25, y1 + 73);
                        star.addPoint(x1 + 41, y1 + 73);
                        star.addPoint(x1 + 47, y1 + 58);
                        star.addPoint(x1 + 53, y1 + 73);
                        star.addPoint(x1 + 69, y1 + 73);
                        star.addPoint(x1 + 56, y1 + 83);
                        star.addPoint(x1 + 61, y1 + 98);
                        star.addPoint(x1 + 47, y1 + 88);
                        star.addPoint(x1 + 34, y1 + 98);
                        star.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(star);
                        
                        
            }
}