package visitor;

public class Fender implements AtvPart{
    @Override
    public double calculateShipping() {
        return 10;
    }

    @Override
    public void accept(AvtPartVisitor visitor) {
        visitor.visit(this);
    }
}
