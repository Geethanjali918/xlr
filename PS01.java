public class Employee {

    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    // Parameterized constructor
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Method to get the full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Method to display employee details
    public void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + getFullName());
        System.out.println("Address: " + address);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Employee employee1 = new Employee();
        employee1.showDetails();

        // Using parameterized constructor
        Employee employee2 = new Employee(101, "John", "Doe", "123 Main St");
        employee2.showDetails();
    }
}


// class employee{
//     int id = 1;
//     String firstname = "Geethanjali";
//     String lastname = "Guvvala";
//     String adress = "Wanaparthy";
// }