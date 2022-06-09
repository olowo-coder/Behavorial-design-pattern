package visitor;

public class Oil implements AtvPart{
    @Override
    public double calculateShipping() {
        return 45;
    }

    @Override
    public void accept(AvtPartVisitor visitor) {
        visitor.visit(this);
    }
}
