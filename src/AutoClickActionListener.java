import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutoClickActionListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    Main.toggle = true;
    new AutoClickWorker().execute();
  }

}
