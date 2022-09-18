package ru.qamilord.dependinversion;

/*

"Нужно создавать такие интерфейсы,
в которых описан только необходимый минимум реализаций методов"

 */

public class Start {

    public static void main(String[] args) {

        JavaDeveloper developer1 = new JavaDeveloper();
        KotlinDeveloper developer2 = new KotlinDeveloper();

        IManager manager = new BestManager();
        manager.speak(developer2);



    }



}
