package state;

public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off");
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is med";
    }
}
