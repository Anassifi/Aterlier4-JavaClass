package Ex01;

public class Test {

    // code
    public static void main(String[] args) {

        Employee mohammad = new Employee("Mohammad", "El alami", "Casablanca", 1963, 2020);
        Employee khalid = new Employee("khalid", "El wahabi", "Safi", 1990, 2020);
        Employee fouad = new Employee("Fouad", "Sbai", "Salé", 2006, 2020);

        mohammad.afficherInfoClient();
        khalid.afficherInfoClient();
        fouad.afficherInfoClient();
    }
}
