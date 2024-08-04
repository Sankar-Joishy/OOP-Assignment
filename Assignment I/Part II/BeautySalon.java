// Customer class
class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }
}

// Discount class
class Discount {
    private static final double SERVICE_PREMIUM_DISCOUNT = 0.20;
    private static final double SERVICE_GOLD_DISCOUNT = 0.15;
    private static final double SERVICE_SILVER_DISCOUNT = 0.10;
    private static final double PRODUCT_DISCOUNT_RATE = 0.10;

    public static double getServiceDiscountRate(String memberType) {
        switch (memberType.toLowerCase()) {
            case "premium":
                return SERVICE_PREMIUM_DISCOUNT;
            case "gold":
                return SERVICE_GOLD_DISCOUNT;
            case "silver":
                return SERVICE_SILVER_DISCOUNT;
            default:
                return 0.0; // No discount for non-members
        }
    }

    public static double getProductDiscountRate() {
        return PRODUCT_DISCOUNT_RATE;
    }
}

// Visit class
class Visit {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double totalServiceExpense = serviceExpense * (1 - Discount.getServiceDiscountRate(customer.getMemberType()));
        double totalProductExpense = productExpense * (1 - Discount.getProductDiscountRate());
        return totalServiceExpense + totalProductExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }
}

// Test program to exercise the classes
public class BeautySalon {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Hari", true, "Premium");
        Customer customer2 = new Customer("Madhu", true, "Gold");
        Customer customer3 = new Customer("Ram", true, "Silver");
        Customer customer4 = new Customer("Sita", false, ""); // Non-member

        // Create visits
        Visit visit1 = new Visit(customer1, 100.0, 50.0); // $100 services, $50 products
        Visit visit2 = new Visit(customer2, 150.0, 80.0); // $150 services, $80 products
        Visit visit3 = new Visit(customer3, 80.0, 30.0);  // $80 services, $30 products
        Visit visit4 = new Visit(customer4, 120.0, 60.0); // $120 services, $60 products

        // Display total expenses
        displayVisitInfo(visit1);
        displayVisitInfo(visit2);
        displayVisitInfo(visit3);
        displayVisitInfo(visit4);
    }

    public static void displayVisitInfo(Visit visit) {
        Customer customer = visit.getCustomer();
        System.out.println("Customer: " + customer.getName());
        System.out.println("Service Expense: $" + visit.getServiceExpense());
        System.out.println("Product Expense: $" + visit.getProductExpense());
        System.out.println("Total Expense: $" + visit.getTotalExpense());
        System.out.println();
    }
}
