package ClassAbstractTP6;

import ClassAbstractTP6.classes.Developer;
import ClassAbstractTP6.classes.SalesPerson;
import ClassAbstractTP6.classes.Tester;

public class Main {
    public static void main(String[] args) {
        SalesPerson sp = new SalesPerson("Amine", 30, 5000, 101, 120000.0);

        sp.displaySalesPersonDetails();
        System.out.println("-------------");

        sp.approveLeave("Karim");
        Developer dev = new Developer("Alice", 28, 101, 60000, 4);
        dev.displayDeveloperDetails();
        System.out.println("-------------");
        Tester tester = new Tester("Bob", 32, "Project A");
        tester.displayTesterDetails();
    }
}
