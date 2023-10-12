package DroidProject01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

class RoundButton extends JButton {
    private Color backgroundColor;
    private Color hoverColor;
    private Color borderColor;
    private int cornerRadius;

    public RoundButton(String text) {
        this(text, new Color(252, 212, 0), new Color(227, 186, 0), Color.black, 60);    }

    public RoundButton(String text, Color bgColor, Color hoverColor, Color borderColor, int cornerRadius) {
        super(text);
        this.backgroundColor = bgColor;
        this.hoverColor = hoverColor;
        this.borderColor = borderColor;
        this.cornerRadius = cornerRadius;

        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Set the button background color
        if (getModel().isPressed()) {
            g2d.setColor(backgroundColor.darker());
        } else if (getModel().isRollover()) {
            g2d.setColor(hoverColor);
        } else {
            g2d.setColor(backgroundColor);
        }

        // Create a rounded rectangle
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));

        // Set the border color
        g2d.setColor(backgroundColor);
        g2d.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius));

        super.paintComponent(g2d);
        g2d.dispose();
    }
}
