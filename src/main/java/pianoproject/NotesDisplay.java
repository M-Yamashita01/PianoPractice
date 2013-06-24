package pianoproject;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author yamashita
 * @version $Revision$, 2013/06/09
 */
public class NotesDisplay {

	private JFrame frame;
	private File[] files;
	private int fileCount = 0;

	/**
	 * 新しく生成された<code>NotesDisplay</code>オブジェクトを初期化します。
	 */
	public NotesDisplay() {
		this.frame = new JFrame("ピアノ練習アプリ"); //$NON-NLS-1$
		this.frame.setSize(600, 500);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButton();
		File dir = new File("./src/main/resources/"); //$NON-NLS-1$
		this.files = dir.listFiles();
		shuffleFiles();
		setNotesDisplay();
		this.frame.setVisible(true);
	}

	private void shuffleFiles() {
		for (int i = 0; i < this.files.length; i++) {
			int dst = (int) Math.floor(Math.random() * (i + 1));
			File tmp = this.files[i];
			this.files[i] = this.files[dst];
			this.files[dst] = tmp;
		}
	}

	private void setNotesDisplay() {
		JPanel p = new JPanel();
		String filePath = this.files[this.fileCount].getAbsolutePath();
		this.fileCount++;
		ImageIcon notes = new ImageIcon(filePath);
		JLabel label = new JLabel(notes);
		p.add(label);
		Container con = this.frame.getContentPane();
		con.add(p, BorderLayout.CENTER);
	}

	private void setButton() {
		JPanel p = createButton();
		Container con = this.frame.getContentPane();
		con.add(p, BorderLayout.SOUTH);

	}

	private static JPanel createButton() {
		JPanel p = new JPanel();
		JButton noteDo = new JButton("ド"); //$NON-NLS-1$
		JButton noteRe = new JButton("レ"); //$NON-NLS-1$
		JButton noteMi = new JButton("ミ"); //$NON-NLS-1$
		JButton noteFa = new JButton("ファ"); //$NON-NLS-1$
		JButton noteSo = new JButton("ソ"); //$NON-NLS-1$
		JButton noteRa = new JButton("ラ"); //$NON-NLS-1$
		JButton noteShi = new JButton("シ"); //$NON-NLS-1$
		noteDo.addActionListener(new ButtonActionListener(noteDo.getText()));
		noteRe.addActionListener(new ButtonActionListener(noteRe.getText()));
		noteMi.addActionListener(new ButtonActionListener(noteMi.getText()));
		noteFa.addActionListener(new ButtonActionListener(noteFa.getText()));
		noteSo.addActionListener(new ButtonActionListener(noteSo.getText()));
		noteRa.addActionListener(new ButtonActionListener(noteRa.getText()));
		noteShi.addActionListener(new ButtonActionListener(noteShi.getText()));
		p.add(noteDo);
		p.add(noteRe);
		p.add(noteMi);
		p.add(noteFa);
		p.add(noteSo);
		p.add(noteRa);
		p.add(noteShi);
		return p;
	}

	public void showNotes() {

	}

	public void showNextNotesDisplay() {
		if (this.files.length <= this.fileCount) {
			shuffleFiles();
		}
		setNotesDisplay();
		this.frame.setVisible(true);
	}

}
