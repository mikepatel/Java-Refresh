/*

*/
/////////////////////////////////////////////////////////////////////
// Imports
import javax.swing.*;


/////////////////////////////////////////////////////////////////////
public class ExampleDialog {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 300);
        jFrame.setTitle("Example");
        jFrame.setVisible(true);

        JOptionPane.showMessageDialog(jFrame, "Not null");  // center of jFrame
        JOptionPane.showMessageDialog(null, "null");  // center of screen
    }
}
