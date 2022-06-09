package visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AvtPartVisitor{

    double shippingAmount;
    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 65;
        System.out.println("Wheels are bulky");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 90;
        System.out.println("Oil is hazardous");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 10;
        System.out.println("Fenders are light");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more than 3 things then, discount");
        List<AtvPart> parts = partsOrder.getParts();
        if (parts.size() > 3){
            shippingAmount -= 5;
        }
        System.out.println("Shipping Amount: " + shippingAmount);
    }
}
