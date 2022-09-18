package ru.qamilord.openclosed;

import java.util.ArrayList;
import java.util.List;

/*

«Программные сущности (классы, модули, функции и т. п.)
должны быть открыты для расширения, но закрыты для изменения»

 */

public class Start {

    public static void main(String[] args) {

        // неправильно по SOLID
        Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        Developer dev2 = new JSDeveloper();
        dev2.setLangName("JS");

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        for (Developer dev: devList) {
            dev.writeCode();
        }




    }

}
