package command.impl;

import bean.Note;
import bean.Request;
import bean.Response;
import command.Command;
import service.ServiceFactory;
import view.NoteBookConsoleView;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class SearchByDateCommand implements Command {
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        List<Note> listNote;
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            listNote = ServiceFactory.getInstance().getNoteBookService().searchByDate(format.parse(request.getParameter1()));
        } catch (ParseException e) {
            response.setMessage("Date is wrong");
            return response;
        }
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
