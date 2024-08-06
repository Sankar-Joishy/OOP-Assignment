// Chair.java
interface Chair {
    void create();
}

// Sofa.java
interface Sofa {
    void create();
}

// CoffeeTable.java
interface CoffeeTable {
    void create();
}
// FurnitureFactory.java
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
// ModernChair.java
class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("Creating a modern chair");
    }
}

// ModernSofa.java
class ModernSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("Creating a modern sofa");
    }
}

// ModernCoffeeTable.java
class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void create() {
        System.out.println("Creating a modern coffee table");
    }
}
// VictorianChair.java
class VictorianChair implements Chair {
    @Override
    public void create() {
        System.out.println("Creating a Victorian chair");
    }
}

// VictorianSofa.java
class VictorianSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("Creating a Victorian sofa");
    }
}

// VictorianCoffeeTable.java
class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void create() {
        System.out.println("Creating a Victorian coffee table");
    }
}
// ModernFurnitureFactory.java
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

// VictorianFurnitureFactory.java
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

// Main.java
public class FurnitureMain {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureShop shop = new FurnitureShop(modernFactory);
        shop.createFurniture();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        shop = new FurnitureShop(victorianFactory);
        shop.createFurniture();
    }
}

