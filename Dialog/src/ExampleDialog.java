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

        // display datetime information
//        Date today = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        JOptionPane.showMessageDialog(jFrame, sdf.format(today));

        // get input information
//        String name = JOptionPane.showInputDialog(jFrame, "What is your name?");
//        JOptionPane.showMessageDialog(jFrame, "Hello, " + name);

        // Input: full name, Output: initials
        String name = JOptionPane.showInputDialog(jFrame, "What is your name?");
        System.out.println("Name (input): " + name);

        // split string into list
        List<String> names = new ArrayList<>(Arrays.asList(name.split(" ")));
        System.out.println("Names: " + names);

        // iterate over list to get initials
        List<Character> initials = new ArrayList<>();
        for(String n : names){
            char initial = n.charAt(0);
            initials.add(initial);
        }
        System.out.println("Initials: " + initials);

        // join characters to form a string
        StringBuilder sb = new StringBuilder(initials.size());
        for(Character c: initials){
            sb.append(c);
        }
        String monogram = sb.toString().toUpperCase();
        System.out.println("Mongram: " + monogram);

        // display output
        JOptionPane.showMessageDialog(jFrame, "Initials are: " + monogram);

        // clean up
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
