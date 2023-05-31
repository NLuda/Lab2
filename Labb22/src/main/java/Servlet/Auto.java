package Servlet;


import lombok.Getter;
public class Auto {
    @Getter private String name;        //Название игры
    @Getter private String body;       //Жанр
    @Getter private String transmission;    //Платформа
    @Getter private String engine;
    @Getter private float year;         //Год
           //Цена

    public Auto(String name, String body, String transmission, String engine, float year) {
        this.name = name;
        this.body = body;
        this.transmission = transmission;
        this.engine = engine;
        this.year = year;

    }
}