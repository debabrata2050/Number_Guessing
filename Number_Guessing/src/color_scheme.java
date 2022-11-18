import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class color_scheme {
    
    public static void close_setcolor(JPanel panel)
    {
        panel.setBackground(new Color(249,177,122));
    }
    
    public static void close_resetcolor(JPanel panel)
    {
        panel.setBackground(new Color(66,71,105));
    }
    
    public static void close_setcolor(JLabel label)
    {
        label.setForeground(new Color(255,255,255));
    }
    
    public static void close_resetcolor(JLabel label)
    {
        label.setForeground(new Color(103,111,157));
    }
    
}
