/*1. Display a Welcome Message Problem: Write an Applet that displays "Welcome to Java Applet Programming!"
 in the paint() method. Hint: Use drawString() inside the paint(Graphics g) method. */
 import java.applet.Applet;
import java.graphics.Graphics;

public class WelcomeApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet Programming!", 20, 20); // [cite: 7]
    }
}