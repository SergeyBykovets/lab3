package work3;
/**
 * Abstract class {@code Decorator} implements the {@link Element} interface and serves as a base class for all decorators
 *  <p>
 * This class holds а field of type {@link Element}
 * </p>
 * In the template, this element is Decorator
 * @author Bykovets Sergey
 */
public abstract class Decorator implements Element{
    /**
     * Field of type {@code Element}
     */
    protected Element element;
    /**
     *  Constructs a {@code Decorator} with a specified {@link Element}.
     */
    public Decorator(Element element) {
        this.element = element;
    }
    /**
     * Draws the decorated element
     */
    @Override
    public void draw() {
        element.draw();
    }

    /**
     * Returns a description of the decorated element {@link Element}.
     * @return a {@code String} representing the description of the element
     */
    @Override
    public String getDescription() {
        return element.getDescription();
    }
}
