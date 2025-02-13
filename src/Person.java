public class Person {
    private final int tooHot;
    private final int tooCold;

    public Person() {
        this.tooHot = 60;
        this.tooCold = 30;
    }



    public void drinkCoffee(CoffeeCup coffeeCup) throws TemperatureExecption{


        if (coffeeCup.getTemperature() >= tooHot){
            throw new TemperatureExecption("too hot");

        }

        if(coffeeCup.getTemperature() <= tooCold){
            throw new TemperatureExecption("too cold");

        }

    }
}
