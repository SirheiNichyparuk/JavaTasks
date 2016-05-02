package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import service.ServiceFactory;

public class CreateNoteBookCommand implements Command{
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        ServiceFactory.getInstance().getNoteBookService().createNoteBook();
        response.setMessage("Notebook created");
        return response;
    }
}
