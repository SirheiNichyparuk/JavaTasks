package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import service.ServiceFactory;
import view.NoteBookConsoleView;

public class GetNoteBookCommand implements Command {
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        NoteBookConsoleView.print(ServiceFactory.getInstance().getNoteBookService().getNoteBook());
        response.setMessage("NoteBook is shown on console");
        return response;
    }
}
