package com.swathi;

public class Main {

    public static void main(String[] args) {
        // -----------------------------coding exercise Simple Calculator ----------------------------------------------
	SimpleCalculator calculator = new SimpleCalculator();
	calculator.setFirstNumber(5.0);
	calculator.setSecondNumber(4);
        System.out.println("add= "+ calculator.getAdditionResult());
        System.out.println("subtract= "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply=  "+ calculator.getMultiplicationResult());
        System.out.println("divide= "+ calculator.getDivisionResult());
        // -----------------------------coding exercise Person ----------------------------------------------
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= "+ person.getFullName());
        System.out.println("teen= "+ person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= "+ person.getFullName());
        System.out.println("teen= "+ person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= "+person.getFullName());
        person.setAge(101);
        System.out.println(person.getAge());

        // -----------------------------coding exercise Wall Area ----------------------------------------------

        Wall wall = new Wall(5,4);
        System.out.println("area= "+wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= "+ wall.getWidth());
        System.out.println("height= "+wall.getHeight());
        System.out.println("area= "+ wall.getArea());

        // -----------------------------coding exercise Wall Area ----------------------------------------------

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= "+ first.distance());
        System.out.println("distance(second)= "+ first.distance(second));
        System.out.println("distance(2,2)= "+ first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= "+point.distance());

        // -----------------------------coding exercise Carpet Cost Calculator ----------------------------------------------

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculate = new Calculator(floor, carpet);
        System.out.println("total= "+calculate.getTotalCost());
        carpet= new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        calculate = new Calculator(floor, carpet);
        System.out.println("total= "+calculate.getTotalCost());

        // -----------------------------coding exercise Carpet Cost Calculator ----------------------------------------------

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real= "+one.getReal());
        System.out.println("one.imaginary = "+ one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= "+ one.getReal());
        System.out.println("one.imaginary = "+ one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= "+number.getReal());
        System.out.println("number.imaginary= "+number.getImaginary());
        // -----------------------------coding exercise Circle cylinder ----------------------------------------------

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius"+ circle.getRadius());
        System.out.println("circle.area"+ circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("Cylinder.radius"+ cylinder.getRadius());
        System.out.println("Cylinder.height"+ cylinder.getHeight());
        System.out.println("Cylinder.aarea"+ cylinder.getArea());
        System.out.println("Cylinder.volume"+ cylinder.getVolume());

        // -----------------------------coding exercise Rectangle Cuboid ----------------------------------------------

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Rect.width "+ rectangle.getWidth());
        System.out.println("Rect.len "+ rectangle.getLength());
        System.out.println("Rect.area "+ rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width "+ cuboid.getWidth());
        System.out.println("cuboid.length "+ cuboid.getLength());
        System.out.println("cuboid.area "+ cuboid.getArea());
        System.out.println("cuboid.height "+ cuboid.getHeight());
        System.out.println("cuboid.vol "+ cuboid.getVolume());
    }
}
