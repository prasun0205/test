import java.applet.Applet;
import java.awt.*;

public class smilingface extends Applet {
   public void paint(Graphics g) {
      setBackground(Color.white);
      g.setColor(Color.yellow);
      g.fillOval(100, 100, 200, 200);
      g.setColor(Color.black);
      g.fillOval(155, 175, 10, 20);
      g.fillOval(230, 175, 10, 20);
      g.drawArc(150, 220, 100, 50, 180, 180);
   }

   public static void main(String[] args) {
      Frame frame = new Frame("smilingface Frame");
      smilingface applet = new smilingface();
      frame.add(applet);
      applet.init();
      frame.setSize(400, 400);
      frame.setVisible(true);
      frame.addWindowListener(new java.awt.event.WindowAdapter() {
         @Override
         public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            System.exit(0);
         }
      });
   }
}
/*<applet code =smilingface.java height=400 width=400>
</applet>*/
