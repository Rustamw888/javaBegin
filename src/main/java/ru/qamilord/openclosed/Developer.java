package ru.qamilord.openclosed;

/*

объект не должен заниматься НЕсвоими делами
объект должен выполнять только свой функционал
- по смыслу

 */

public class Developer {

    private String langName;

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    // неправильно по SOLID: в зависимости от названия языка - реализуем нужный функционал
    // если будут добавляться новые языки (расширение класса) - придется добавлять новый IF - а это модификация базового класса
    public void writeCode(){
        System.out.println("def lang syntax");
    }

    public void eat(){

    }


}
