public class Demo24 {
    public static void main(String[] args) {
        String[][] members = {
            {"Geethu", "20", "1234567890", "Wanaparthy"},
            {"Shruthi", "20" ,"9876543210", "Khammam"},
            {"Jashmika", "20", "5556667777", "Nandyal"},
            {"Nandu", "20", "4445556666", "Nalagonda"},
            {"Pranavi", "20", "3332221111", "Wanaparthy"}
        };
        for (String[] member : members) {
            System.out.println("Name: " + member[0] + ", Age: " + member[1] + ", Phone: " + member[2] + ", Address: " + member[3]);
        }
    }
}
