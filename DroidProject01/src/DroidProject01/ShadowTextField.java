package DroidProject01;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

class ShadowTextField extends JTextField {
    private Color shadowColor = new Color(192, 192, 192); 

    public ShadowTextField() {
        setOpaque(false); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setColor(shadowColor);
        g2.setFont(getFont());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int shadowOffsetX = 2; 
        int shadowOffsetY = 2; 

        g2.setTransform(AffineTransform.getTranslateInstance(shadowOffsetX, shadowOffsetY));
        g2.drawString(getText(), 0, g.getFontMetrics().getAscent());

        g2.dispose();
    }
}