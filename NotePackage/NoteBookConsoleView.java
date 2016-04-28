package NotePackage;

import java.util.ArrayList;

public class NoteBookConsoleView {
	
	ArrayList<Note> noteArray = new ArrayList<Note>();
	
	
	public void print(Note note){
		System.out.println(note);
	}
	
	public void print(NoteBook notebook){
		System.out.println(notebook);
	}
	
	public void print(ArrayList<Note> noteArray){
		System.out.println(noteArray);
	}
}
