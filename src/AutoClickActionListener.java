import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class AutoClickActionListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      while (true) {
        Thread.sleep(1000);
        click();
      }

    } catch (AWTException | InterruptedException e1) {
      e1.printStackTrace();
    }
  }

  private static void click() throws AWTException {
    Robot bot = new Robot();
    bot.mousePress(InputEvent.BUTTON1_MASK);
    bot.mouseRelease(InputEvent.BUTTON1_MASK);
    System.out.println("click!");
  }
}
