package pianoproject;

import java.io.File;

import javax.swing.JOptionPane;

/**
 * @author yamashita
 * @version $Revision$, 2013/06/11
 */
public class AnswerChecker {

	/**
	 * @param selectedNote
	 * @param notesDisplay
	 * 
	 */
	public void showWindow(String selectedNote, NotesDisplay notesDisplay) {
		File file = notesDisplay.getCurrentDisplayFile();
		String displayNote = file.getName().substring(0,
				file.getName().length() - 4);

		displayNote = Notes2Katakana.getKatakanaNotes(displayNote);
		if (selectedNote.equals(displayNote)) {
			JOptionPane.showMessageDialog(null, "正解！"); //$NON-NLS-1$			
		} else {
			JOptionPane.showMessageDialog(null, "ハズレ・・・"); //$NON-NLS-1$			
		}

		notesDisplay.showNextNotesDisplay();
	}
}
