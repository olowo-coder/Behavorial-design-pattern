package visitor;

public class Wheel implements AtvPart{
    @Override
    public double calculateShipping() {
        return 500;
    }

    @Override
    public void accept(AvtPartVisitor visitor) {
        visitor.visit(this);
    }
}
