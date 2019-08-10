package com.sda.testing;

public class Car {

    public static final String Temperature="20";  //constanta (are mereu aceeasi valoare)

        // class level
        private Engine engine;  //variabila de clasa/de instanta/field-uri/member variables
        // constructor level
        public Car() {
            engine = new Engine();
        }
        // method level
        public void start() {

        }

        //getter
    public Engine getEngine(){
            return this.engine;              //este query
    }
    //setter
    void setEngine(Engine newEngine){           //este command
            this.engine=newEngine;
    }

    class Engine{

    }

    }



