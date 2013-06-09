package pianoproject;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * @author yamashita
 * @version $Revision$, 2013/06/09
 */
public class NotesDisplay {

  private JFrame frame;

  /**
   * 新しく生成された<code>NotesDisplay</code>オブジェクトを初期化します。
   */
  public NotesDisplay() {
    this.frame = new JFrame("ピアノ練習アプリ"); //$NON-NLS-1$
    this.frame.setVisible(true);
    this.frame.setSize(200, 200);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setNotesDisplay();
  }

  private void setNotesDisplay() {
    JPanel p = new JPanel();
    ImageIcon notes = new ImageIcon("./Notes.gif"); //$NON-NLS-1$
    JLabel label = new JLabel(notes);
    p.add(label);
    Container con = this.frame.getContentPane();
    con.add(p,BorderLayout.CENTER);
  }

  public void showNotes() {

  }

}
