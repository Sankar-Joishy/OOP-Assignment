// GeometricObject class implementing Comparable interface
abstract class GeometricObject implements Comparable<GeometricObject> {
    // Abstract methods to be implemented by subclasses
    public abstract double getArea();
    public abstract double getVolume();

    // Implementing Comparable interface based on volume
    @Override
    public int compareTo(GeometricObject o) {
        // Compare volumes of two geometric objects
        double thisVolume = this.getVolume();
        double otherVolume = o.getVolume();

        if (thisVolume < otherVolume) {
            return -1;
        } else if (thisVolume > otherVolume) {
            return 1;
        } else {
            return 0;
        }
    }

    // Static method to find the larger of two GeometricObjects
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        if (obj1.compareTo(obj2) > 0) {
            return obj1;
        } else {
            return obj2;
        }
    }
}

// Circle subclass of GeometricObject
class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        // Circles do not have volume, so returning 0
        return 0;
    }

    public double getRadius() {
        return radius;
    }
}

// Cylinder subclass of GeometricObject
class Cylinder extends GeometricObject {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

// ComparableCylinder class extending Cylinder and implementing Comparable
class ComparableCylinder extends Cylinder implements Comparable<GeometricObject> {

    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public int compareTo(GeometricObject o) {
        // Compare cylinders based on volume
        double thisVolume = this.getVolume();
        double otherVolume = o.getVolume();

        if (thisVolume < otherVolume) {
            return -1;
        } else if (thisVolume > otherVolume) {
            return 1;
        } else {
            return 0;
        }
    }
}

// TestMaxGeometricObjects class to test the max method
public class GeometricObjects {
    public static void main(String[] args) {
        // Test max method with circles
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);
        Circle maxCircle = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println("Larger circle: Radius = " + maxCircle.getRadius());

        // Test max method with cylinders
        Cylinder cylinder1 = new Cylinder(5.0, 10.0);
        Cylinder cylinder2 = new Cylinder(3.0, 8.0);
        Cylinder maxCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
        System.out.println("Larger cylinder: Radius = " + maxCylinder.getRadius() +
                ", Height = " + maxCylinder.getHeight());

        // Test ComparableCylinder
        ComparableCylinder compCylinder1 = new ComparableCylinder(4.0, 8.0);
        ComparableCylinder compCylinder2 = new ComparableCylinder(3.0, 10.0);
        GeometricObject maxCompCylinder = GeometricObject.max(compCylinder1, compCylinder2);
        if (maxCompCylinder instanceof ComparableCylinder) {
            ComparableCylinder maxComparableCylinder = (ComparableCylinder) maxCompCylinder;
            System.out.println("Larger comparable cylinder: Radius = " + maxComparableCylinder.getRadius() +
                    ", Height = " + maxComparableCylinder.getHeight());
        }
    }
}
