
import javax.swing.JFrame;
 
public class JavaWindow {
 
    public static void main(String[] args) {
     
        MyWindow window = new MyWindow("Hello");
 
        // Set the program to close when the window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}