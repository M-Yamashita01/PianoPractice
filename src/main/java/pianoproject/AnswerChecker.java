package pianoproject;

import javax.swing.JOptionPane;


/**
 * @author yamashita
 * @version $Revision$, 2013/06/11
 */
public class AnswerChecker {

  /**
   * 新しく生成された<code>AnswerChecker</code>オブジェクトを初期化します。
   */
  public AnswerChecker() {

  }

  /**
   * @param note
   * 
   */
  public void showWindow(String note) {
    JOptionPane.showMessageDialog(null, note + "が押されました"); //$NON-NLS-1$
  }

}
