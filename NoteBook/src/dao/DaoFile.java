package dao;

import bean.NoteBook;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DaoFile {
     NoteBook readFile(String path) throws IOException, ClassNotFoundException;
     void writeFile(String path) throws IOException;
}
