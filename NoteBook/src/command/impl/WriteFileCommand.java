package command.impl;

import bean.Note;
import bean.Request;
import bean.Response;
import command.Command;
import service.ServiceFactory;
import view.NoteBookConsoleView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class WriteFileCommand implements Command {
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().writeFile(request.getParameter1());
            response.setMessage("File was written");
            return response;
        } catch (FileNotFoundException e) {
            response.setErrorMessage("File was not found");
            return response;
        } catch (IOException e) {
            response.setErrorMessage("IOException");
            return response;
        }
    }
}
