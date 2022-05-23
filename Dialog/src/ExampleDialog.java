/*

*/
/////////////////////////////////////////////////////////////////////
// Imports
import javax.swing.*;
import java.util.*;
import java.text.*;


/////////////////////////////////////////////////////////////////////
public class ExampleDialog {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 300);
        jFrame.setTitle("Example");
        jFrame.setVisible(true);

//        JOptionPane.showMessageDialog(jFrame, "Not null");  // center of jFrame
//        JOptionPane.showMessageDialog(null, "null");  // center of screen

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        JOptionPane.showMessageDialog(jFrame, sdf.format(today));
    }
}
