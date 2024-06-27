import geometry.lib.Rectangle;
import geometry.lib.Triangle;
import geometry.lib.Сircle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5, 6, 4);

        System.out.println("Площадь" + "---" + triangle.area());
        System.out.println("Перимитр" + "---" + triangle.perimeter());
        Сircle сircle = new Сircle(5);
        System.out.println("Площадь" + "---" + сircle.area());
        System.out.println("Перимитр" + "---" + сircle.perimeter());
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Площадь" + "---" + rectangle.area());
        System.out.println("Перимитр" + "---" + rectangle.perimeter());
        Cone cone = new Cone(10, 5, 6);

        TransformationOfFigures transformationOfFigures = new TransformationOfFigures();
        System.out.println(transformationOfFigures.comparingFigures(сircle, rectangle).area());
        transformationOfFigures.addFigureList(cone);
        transformationOfFigures.getFigureList().stream().map(e -> e.area()).forEach(System.out::println);
    }
}
