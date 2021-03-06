package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import service.NoteBookService;
import service.ServiceFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddNoteCommand implements Command {

    @Override
    public Response execute(Request request) {
        Response response = new Response();

        Date date = new Date();
        if (request.getParameter2() != null) {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = format.parse(request.getParameter2());
            } catch (ParseException e) {
                response.setErrorMessage("Date is wrong");
            }
        }

        NoteBookService service = ServiceFactory.getInstance().getNoteBookService();
        service.addNote(request.getParameter1(), date);
        response.setMessage("Note added");
        return response;
    }
}
