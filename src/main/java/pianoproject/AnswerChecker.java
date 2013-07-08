package pianoproject;

import java.io.File;
import java.nio.file.Files;

import javax.swing.JOptionPane;


/**
 * @author yamashita
 * @version $Revision$, 2013/06/11
 */
public class AnswerChecker {

  /**
   * @param note
   * @param notesDisplay
   * 
   */
  public void showWindow(String note, NotesDisplay notesDisplay) {
    File file = notesDisplay.getDisplayFile();
    System.out.println(file.getName());
    JOptionPane.showMessageDialog(null, note + "が押されました"); //$NON-NLS-1$
    notesDisplay.showNextNotesDisplay();
  }

}
