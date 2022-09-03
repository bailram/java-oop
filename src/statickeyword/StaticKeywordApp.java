package statickeyword;

import static statickeyword.Constant.*;
import static statickeyword.Util.*;
import static statickeyword.Device.*;
import static statickeyword.Country.*;

public class StaticKeywordApp {
    public static void main(String[] args) {
        // before use static import
//        System.out.println(Constant.API_KEY);
//        System.out.println(Util.myName());
//
//        Country.City city = new Country.City();
//        city.setName("Surabaya");
//        System.out.println(city.getName());
//
//        System.out.println("jumlah processor " + Device.PROCESSOR);

        // after use static import
        System.out.println(API_KEY);
        System.out.println(myName());

        Country.City city = new City();
        city.setName("Surabaya");
        System.out.println(city.getName());

        System.out.println("jumlah processor " + PROCESSOR);
    }
}
