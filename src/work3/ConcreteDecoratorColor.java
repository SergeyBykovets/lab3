package work3;
/**
 * Class {@code ConcreteDecoratorColor} extends {@link Decorator}
 * and adds color to a graphic element and adds that information to the description.
 * Has fields type of {@link Element} inherited from class {@link Decorator}
 * <p>
 * In the template, this element is ConcreteDecorator.
 * </p>
 *
 * @author Bykovets Sergey
 */
public class ConcreteDecoratorColor extends Decorator{
    /**
     * The color to be applied to the decorated element.
     */
    private String color;
    /**
     * Сreates a {@code ConcreteDecoratorColor} with a specified {@link Element} and a color to be applied.
     *
     * @param element the {@code Element} to be decorated
     * @param color the color to be applied to the element
     */
    public ConcreteDecoratorColor(Element element, String color) {
        super(element);
        this.color = color;
    }
    /**
     * Draws the decorated element with the selected color and writes about it
     */
    @Override
    public void draw() {
        System.out.println("Обраний колір: " + color);
        super.draw();

    }
    /**
     * Returns a description of the decorated element with the applied color.
     * @return a {@code String} representing the description of the element with the applied color
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " " + color.substring(0, color.length() - 2) + "ого" + " кольору";
    }
}
