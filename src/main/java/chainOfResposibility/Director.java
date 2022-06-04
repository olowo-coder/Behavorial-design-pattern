package chainOfResposibility;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("chainOfResposibility.Director can approve conferences");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
