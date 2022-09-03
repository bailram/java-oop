package abstractclass;

public class AbstractApp {
    public static void main(String[] args) {
        /**
         * abstract class gak bisa dijadikan object secara langsung, hanya bisa diturunkan
         * dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child
         */
//        Location location = new Location();
        City city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);

        var koceng = new Cat();
        koceng.name = "oren";
        koceng.run();
    }
}
