package work3;
/**
 *  Interface {@code Element} specifies the methods that must be implemented
 * <p>
 * This interface provides the ability to draw the element and to retrieve a description of the element, which may include its attributes and features
 * </p>
 * In the template, this element is Component
 * @author Bykovets Sergey
 */
public interface Element {
    /**
     * Draws the graphical element.
     */
    void draw();
    /**
     * Returns a description of the graphical element
     * @return a {@code String} representing the description of the element
     */
    String getDescription();
}

