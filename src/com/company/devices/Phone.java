package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;
import java.net.URL;
import java.net.MalformedURLException;

public class Phone extends Device implements Rechargeable, Saleable {
    static final String DEFAULT_APP_VERSION = "latest";
    static final String DEFAULT_SERVER_ADDRESS = "play.store.com";
    private static final Integer DEFAULT_PORT_NUMBER = 443;
    private static final String DEFAULT_PROTOCOL = "https";

    public Double screenSize;
    public String os;

    public Phone(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączam...");
        System.out.println("Telefon został włączony.");
    }

    @Override
    public void recharge(){
        System.out.println("Podłącz i czekaj...");
        System.out.println("Telefon został naładowany!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        throw new ExecutionControl.NotImplementedException("Not implemented");
    }

    public void installAnApp(List<String> appNames){
        for (String appName: appNames){
            installAnApp(appName);
        }
    };

    public void installAnApp(String appName){
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    };
    public void installAnApp(String appName, String version){
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    };

    public void installAnApp(String appName, String version, String server){
        try {
            URL url = new URL(DEFAULT_PROTOCOL, server, DEFAULT_PORT_NUMBER, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url){
        System.out.println("sprawdź czy jest miejsce");
        System.out.println("sprawdź blokadę rodzicielską");
        System.out.println("sprawdź czy jest płatna");
        System.out.println("jeżeli tak obsłuż płatność");
        System.out.println("pobierz");
        System.out.println("rozpakuj (unzip)");
        System.out.println("zainstaluj");
        System.out.println("udało zainstalować " + url.getFile() + " z serwera " + url.getHost());
    }

}
