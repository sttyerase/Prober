package com.dbmi.prober;

public class Configurator {
    private ConfigurationHandler myHandler;

    public Configurator(){
        myHandler = new ConfigurationHandler();
    } // NULL CONSTRUCTOR

    public ConfigurationHandler getMyHandler() {
        return myHandler;
    }

} // CLASS
