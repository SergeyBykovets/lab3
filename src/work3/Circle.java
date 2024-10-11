package work3;
/**
 * Class {@code Circle} implements the {@link Element} interface and represents circle in a graphics editor.
 * It provides methods to draw the circle and to get its description.
 * <p>
 * In the template, this element is ConcreteComponent
 * </p>
 * @author Bykovets Sergey
 */
public class Circle implements Element{
    /**
     * Draws the circle and print message - circle has been added
     */
    @Override
    public void draw(){
        System.out.println("Додано коло");
    }
    /**
     * Returns a description of the circle.
     * @return a {@code String} representing the description of the circle
     */
    @Override
    public String getDescription() {
        return "Опис: Коло";
    }
}
