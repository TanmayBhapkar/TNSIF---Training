package DAY5.MultiLevel;

public class MultiLevelInheritance {

    public static void main(String[] args) {

        City c = new City();
        c.setArea(23000.5f);
        c.setCapital("Delhi");
        c.setCityName("Pune");
        c.setCountryname("India");
        c.setLanguage("Marathi");
        c.setStateName("Maharashtra");

        System.out.println(c);
    }
}
