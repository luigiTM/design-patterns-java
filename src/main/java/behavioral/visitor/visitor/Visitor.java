package behavioral.visitor.visitor;

import behavioral.visitor.shapes.impl.Circle;
import behavioral.visitor.shapes.impl.CompoundShape;
import behavioral.visitor.shapes.impl.Dot;
import behavioral.visitor.shapes.impl.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
