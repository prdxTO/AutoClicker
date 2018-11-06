import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ExitKeyListener implements KeyListener {
  @Override
  public void keyTyped(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
      System.out.println("Exit");
      Main.toggle = false;
      System.exit(0);
    }
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
      System.out.println("Exit");
      Main.toggle = false;
      System.exit(0);
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
      System.out.println("Exit");
      Main.toggle = false;
      System.exit(0);
    }
  }
}
