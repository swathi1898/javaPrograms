package com.swathi;

class Car{
    public String name;
    public int cylinder;
    public int wheels;
    public boolean engine;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return ("Engine is started");
    }
    public String accelerate(){
    return ("Accelerated");
    }
    public String carBreak(){
        return ("car break is applied");
    }
    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }
}

class Porsche extends Car{
    public Porsche() {
        super("Porsche",2);
    }
    public String startEngine(){
        return ("Porsche has started.");
    }
}
class Lamborgini extends Car{
    public Lamborgini() {
        super("Lamborgini",2);
    }

    @Override
    public String startEngine() {
        return ("Lamborgini has started.");
    }
}
class Maruthi extends Car{
    public Maruthi() {
        super("Maruthi",1);
    }

    @Override
    public String startEngine() {
        return ("Maruthi has started.");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<6; i++){
            Car car = randomCar();
            System.out.println("Car #"+i+" : "+ car.getName()+"\n"+" and has "+car.getCylinder()+" cylinder");
            
        }
    }
    public static Car randomCar(){
        int randomNumber = (int) (Math.random()*3)+1;
        System.out.println("Random number generated was: "+ randomNumber);

        switch (randomNumber){
            case 1:
                return new Porsche();
            case 2:
                return new Lamborgini();
            case 3:
                return new Maruthi();

        }
        return null;
    }
}
