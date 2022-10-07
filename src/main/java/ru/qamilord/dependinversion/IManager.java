package ru.qamilord.dependinversion;

import ru.qamilord.liskov.Developer;

// менеджер проектов
public interface IManager {

    // менеджер сможет разговаривать с любом разработчиком
    void speak(IDeveloper developer);

}
