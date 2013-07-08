package pianoproject;

public class Notes2Katakana {

	public static String getKatakanaNotes(String note) {
		if (note.equals("do")) {
			return "ド";
		}
		if (note.equals("re")) {
			return "レ";
		}
		if (note.equals("mi")) {
			return "ミ";
		}
		if (note.equals("fa")) {
			return "ファ";
		}
		if (note.equals("so")) {
			return "ソ";
		}
		if (note.equals("ra")) {
			return "ラ";
		}
		if (note.equals("shi")) {
			return "シ";
		} else {
			return "";
		}

	}
}
