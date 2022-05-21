package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class Phone extends Device implements Rechargeable, Saleable {
    static final String DEFAULT_APP_VERSION = "latest";
    static final String DEFAULT_APP_SERVER = "play.store.com";
    public Double screenSize;
    public String os;

    public Phone(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("włączam...");
    }

    public void recharge(){
        System.out.println("Podłącz i czekaj...");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        throw new ExecutionControl.NotImplementedException("Not implemented");
    }

    public void installAnApp(List<String> appNames){
        for (String appname: appNames){
            installAnApp(appname);
        }
    };

    public void installAnApp(String appname){
        this.installAnApp(appname, DEFAULT_APP_VERSION);
    };
    public void installAnApp(String appname, String version){
        this.installAnApp(appname, version, DEFAULT_APP_SERVER);
    };

    public void installAnApp(String appname, String version, String server){
        System.out.println("Czy jest miejsce");
        System.out.println("Czy jest blokada rodzicielska");
        System.out.println("Czy jest płatna");
        System.out.println("Obsłuż płatność");
        System.out.println("Pobierz");
        System.out.println("Rozpakuj");
        System.out.println("Zainstaluj");
        System.out.println("Sukces! Zainstalowano: "+appname+"w wersji: "+version+"z serwera: "+server);

    }

}
