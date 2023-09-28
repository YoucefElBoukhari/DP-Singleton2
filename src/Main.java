public class Main {

    public static void main(String[] args) {
        GovernmentRegistry registry = GovernmentRegistry.getInstance();

        CitizenInfo citizen1Info = new CitizenInfo("123456", "EL BOUKHARI Youcef", "INPT-Rabat");
        registry.updateCitizenInfo("123456", citizen1Info);

        CitizenInfo retrievedInfo = registry.getCitizenInfo("123456");
        System.out.println("Citizen Name: " + retrievedInfo.getName());
        System.out.println("Citizen Address: " + retrievedInfo.getAddress());
    }
}
