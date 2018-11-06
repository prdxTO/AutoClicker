import javax.swing.SwingWorker;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClickWorker extends SwingWorker <Integer, Integer> {
  @Override
  protected Integer doInBackground() throws Exception {
    while (Main.toggle) {
      Thread.sleep(500);
      click();
    }

    return 0;
  }

  private static void click() throws AWTException {
    Robot bot = new Robot();
    bot.mousePress(InputEvent.BUTTON1_MASK);
    bot.mouseRelease(InputEvent.BUTTON1_MASK);
  }
}
