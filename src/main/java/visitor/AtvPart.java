package visitor;

public interface AtvPart {

    double calculateShipping();

    void accept(AvtPartVisitor visitor);
}
