package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import service.ServiceFactory;

import java.io.IOException;

public class ReadFileCommand implements Command {
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().readFile(request.getParameter1());
            response.setMessage("File was read");
            return response;
        } catch (IOException e) {
            response.setErrorMessage("File was not read");
            return response;
        } catch (ClassNotFoundException e) {
            response.setErrorMessage("ClassNotFoundException");
            return response;
        }

    }
}
