import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

  public static boolean toggle = false;

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame jFrame = new JFrame("Prdx's Auto Clicker");
      JButton startButton = new JButton("Click All Day!");
      startButton.setBounds(140, 175, 115, 30);

      jFrame.add(startButton);
      jFrame.setSize(400, 400);
      jFrame.setLayout(null);
      jFrame.setVisible(true);
      jFrame.setResizable(false);
      jFrame.setFocusable(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      startButton.addActionListener(new AutoClickActionListener());
      startButton.addKeyListener(new ExitKeyListener());
      jFrame.addKeyListener(new ExitKeyListener());
    });

  }
}
