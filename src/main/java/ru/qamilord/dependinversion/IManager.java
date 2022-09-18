package ru.qamilord.dependinversion;

// менеджер проектов
public interface IManager {

    // менеджер сможет разговаривать с любом разработчиком
    void speak(IDeveloper developer);

}
