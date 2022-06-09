package visitor;

public interface AvtPartVisitor {


    void visit(Wheel wheel);

    void visit(Oil oil);

    void visit(Fender fender);

    void visit(PartsOrder partsOrder);
}
