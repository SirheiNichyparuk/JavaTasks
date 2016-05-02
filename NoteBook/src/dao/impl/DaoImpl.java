package dao.impl;

import bean.NoteBook;
import dao.DaoFile;
import service.NoteBookProvider;

import java.io.*;

public class DaoImpl implements DaoFile {
    @Override
    public NoteBook readFile(String path) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream oin = new ObjectInputStream(fis)) {
            return (NoteBook) oin.readObject();
        }
    }

    @Override
    public void writeFile(String path) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(NoteBookProvider.getInstance());
        }
    }
}
