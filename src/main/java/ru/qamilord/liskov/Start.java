package ru.qamilord.liskov;

import java.util.ArrayList;
import java.util.List;

/*

"Функции, которые используют базовый тип,
должны иметь возможность использовать подтипы
базового типа не зная об этом"

 */

public class Start {

    public static void main(String[] args) {

        // неправильно по SOLID
        Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        Developer dev2 = new JSDeveloper();
        dev2.setLangName("JS");

        Developer dev3 = new KotlinDeveloper();
        dev3.setLangName("kotlin");

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);
        devList.add(dev3);

        showReaction(devList);



    }

    // функция должна быть универсальной и вы не должны ее постоянно переписывать для новых объектов
    // верный подход SOLID - универсальня функция, которая умеет работать с любыми типами и подтипами Developer
    public static void showReaction(List<Developer> devList){
        for (Developer dev: devList) {
           dev.reaction(); // будет вызываться нужная реализация объекта
        }
    }

}
