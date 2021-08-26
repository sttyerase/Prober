package com.dbmi.prober;

public class Prober {
    private static final String usage = "Usage: java Prober <configuration-file>";

    public Prober(String configFile){

    } // CONSTRUCTOR(STRING)

    public static void main(String args[]){
        if(args.length != 1){
            System.out.println(usage);
            System.exit(-22);
        } // IF
        Prober prober = new Prober(args[0]);
    } // MAIN(STRING[])
} // CLASS
