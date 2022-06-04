package chainOfResposibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibility {

    private static final Logger logger = Logger.getLogger(ChainOfResponsibility.class.getName());

    public static void main(String[] args) {

        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }



    static void firstExample(){
        //leve to log at
        logger.setLevel(Level.FINE);
        ConsoleHandler handler = new ConsoleHandler();
        //level to publish at

        handler.setLevel(Level.FINE);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); //this won't print
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but as fine as finer or finest");
        System.out.println("Yeah....");
    }
}
