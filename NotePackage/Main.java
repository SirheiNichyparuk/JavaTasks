package NotePackage;

public class Main {

	public static void main(String[] args) {
		
		Note emptynote = new Note();
		Note note1 = new Note("First note", "24.04.2016");
		NoteBook emptyNotebook = new NoteBook();
		NoteBook notebook1 = new NoteBook("Second note", "25.04.2016", "Siarhei");
		
		NoteBookConsoleView nbcv = new NoteBookConsoleView();
		nbcv.print(note1);
		nbcv.print(notebook1);
		//nbcv.print(noteArray);
	

	}

}
