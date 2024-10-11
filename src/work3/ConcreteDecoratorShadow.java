package work3;
/**
 * Class {@code ConcreteDecoratorShadow} extends {@link Decorator}
 * and adds shadow to a graphic element and adds that information to the description.
 * Has fields type of {@link Element} inherited from class {@link Decorator}
 *  <p>
 *  In the template, this element is ConcreteDecorator.
 *  </p>
 * @author Bykovets Sergey
 */
public class ConcreteDecoratorShadow extends Decorator{
    /**
     * Create a {@code ConcreteDecoratorShadow} with a specified {@link Element}.
     *
     * @param element the {@code Element} to be decorated
     */
    public ConcreteDecoratorShadow(Element element) {
        super(element);
    }
    /**
     * Draws the decorated element with the shadow effect and writes about it
     */
    @Override
    public void draw() {
        System.out.println("Додано тінь");
        super.draw();
    }
    /**
     * Returns a description of the decorated element with the shadow effect.
     *
     * @return a {@code String} representing the description of the element with the applied shadow
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " і тінню";
    }
}

