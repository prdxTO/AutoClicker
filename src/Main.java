import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    JFrame jFrame = new JFrame("Prdx's Auto Clicker");
    JButton startButton = new JButton("Click All Day!");
    startButton.setBounds(40, 80, 115, 30);

    jFrame.add(startButton);
    jFrame.setSize(200 , 200);
    jFrame.setLayout(null);
    jFrame.setVisible(true);
    jFrame.setResizable(false);

    startButton.addActionListener(new AutoClickActionListener());

  }
}
