package pianoproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author yamashita
 * @version $Revision$, 2013/06/11
 */
public class ButtonActionListener implements ActionListener {

	String note;
	private NotesDisplay notesDisplay;

	/**
	 * 新しく生成された<code>ButtonActionListener</code>オブジェクトを初期化します。
	 * 
	 * @param text
	 * @param notesDisplay
	 */
	public ButtonActionListener(String text, NotesDisplay notesDisplay) {
		this.note = text;
		this.notesDisplay = notesDisplay;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AnswerChecker checker = new AnswerChecker();
		checker.showWindow(this.note, this.notesDisplay);
	}
}
