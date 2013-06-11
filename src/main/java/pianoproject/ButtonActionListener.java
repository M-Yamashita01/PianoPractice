
package pianoproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author yamashita
 * @version $Revision$, 2013/06/11
 */
public class ButtonActionListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Button pressed"); //$NON-NLS-1$
    AnswerChecker checker = new AnswerChecker();
  }

}
