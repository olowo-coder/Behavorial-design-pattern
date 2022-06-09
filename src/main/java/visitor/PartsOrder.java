package visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart{

    private final List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts(){
        return Collections.unmodifiableList(parts);
    }

    public double calculateShipping(){
        return parts.stream().mapToDouble(AtvPart::calculateShipping).sum();
    }

    @Override
    public void accept(AvtPartVisitor visitor) {
        parts.forEach(x -> x.accept(visitor));
        visitor.visit(this);
    }
}
