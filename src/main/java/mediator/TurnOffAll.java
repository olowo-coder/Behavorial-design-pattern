package mediator;

public class TurnOffAll implements Command{

    private Mediator mediator;

    public TurnOffAll(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
