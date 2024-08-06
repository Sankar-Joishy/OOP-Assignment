// FurnitureShop.java
public class FurnitureShop {
    private FurnitureFactory factory;

    public FurnitureShop(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void createFurniture() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        chair.create();
        sofa.create();
        coffeeTable.create();
    }
}