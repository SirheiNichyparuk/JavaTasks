package command.impl;

import bean.Note;
import bean.Request;
import bean.Response;
import command.Command;
import service.ServiceFactory;
import view.NoteBookConsoleView;

import java.util.List;

public class SearchByTextCommand implements Command {
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        List<Note> listNote = ServiceFactory.getInstance().getNoteBookService().searchByText(request.getParameter1());
        if (listNote.size() > 0) {
            NoteBookConsoleView.print(listNote);
            response.setMessage("Note found");
            return response;
        }else{
            response.setMessage("Note did not find");
            return response;
        }
    }
}
