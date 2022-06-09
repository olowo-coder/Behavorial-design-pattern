package state;

public abstract class State {

    public void handleRequest(){
        System.out.println("Shouldn't get here");
    }
}
