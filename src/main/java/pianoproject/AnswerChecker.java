package pianoproject;

import javax.swing.JOptionPane;


/**
 * @author yamashita
 * @version $Revision$, 2013/06/11
 */
public class AnswerChecker {

  /**
   * @param note
   * 
   */
  public void showWindow(String note) {
    JOptionPane.showMessageDialog(null, note + "が押されました"); //$NON-NLS-1$
  }

}
