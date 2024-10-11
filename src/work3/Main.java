package work3;
/**
 * Class {@code Main} which consists of method {@link #main(String[])}
 * It creates an instance of a {@link Circle} and applies multiple decorators
 *
 * @author Bykovets Sergey
 */
public class Main {
    /**
     * The main method, it creates an instance of {@link Circle} applies decorators to the circle, and then calls the  {@link Element#draw()} method to render the figure
     * <p>
     * It also prints the description of the graphic element.
     * </p>
     */
    public static void main(String[] args) {
        Element circle = new Circle();

        circle = new ConcreteDecoratorColor(circle, "червоний");

        circle = new ConcreteDecoratorBorder(circle, 2);

        circle = new ConcreteDecoratorShadow(circle);

        circle.draw();
        System.out.println(circle.getDescription());
    }
}