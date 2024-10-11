package work3;
/**
 * Class {@code ConcreteDecoratorBorder} extends {@link Decorator}
 * and adds a border to a graphic element and adds that information to the description.
 * Has fields type of {@link Element} inherited from class {@link Decorator}
 *  <p>
 *  In the template, this element is ConcreteDecorator.
 *  </p>
 * @author Bykovets Sergey
 */
public class ConcreteDecoratorBorder extends Decorator{
    /**
     * The width of the border to be applied to the decorated element.
     */
    private int width;
    /**
     * Сreates a {@code ConcreteDecoratorBorder} with a specified {@link Element} and a border width.
     *
     * @param element the {@code Element} to be decorated
     * @param width the width of the border to be applied, in pixels
     */
    public ConcreteDecoratorBorder(Element element, int width) {
        super(element);
        this.width = width;
    }
    /**
     * Draws the decorated element with the border and writes about it
     */
    @Override
    public void draw() {
        System.out.println("Додано рамку шириною " + width + " пікселі");
        super.draw();
    }
    /**
     * Returns a description of the decorated element with the applied border.
     *
     * @return a {@code String} representing the description of the element with the applied border
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " з рамкою шириною " + width + " пікселі";
    }
}
