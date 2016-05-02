package controller;

import bean.Request;
import bean.Response;
import command.Command;

public class Controller {
    private final CommandHelper helper = new CommandHelper();

    public Controller(){}


    public Response doAction(Request request){
        String commandName = request.getCommandName();
        Command command = helper.getCommand(commandName);
        if (command == null) {
            Response responseHelp = new Response();
            responseHelp.setErrorMessage("Invalid command");
            return responseHelp;
        }
        Response response = command.execute(request);
        return response;
    }

}
