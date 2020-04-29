/**
 * @program: 20200429
 * @description: 多态
 * @author: Zhang Baolu
 * @create: 2020-04-29 20:28
 **/

class Shape {
    public void draw() {
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}

class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个△");
    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}

public class TestDemo {

    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);
        Shape shape3 = new Triangle();
        drawMap(shape3);
    }

    public static void drawShapes1() {
        React rect = new React();
        Cycle cycle = new Cycle();
        Triangle flower = new Triangle();
        String[] shapes = {"cycle", "react", "cycle", "react", "triangle"};
        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("triangle")) {
                flower.draw();
            }
        }
    }

    public static void drawShapes() {
        int[] array = {1,2,3,46,7};
        for (int a :array) {
        }
        Shape[] shapes = {new Cycle(), new React(), new Cycle(),
                new React(), new Triangle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}