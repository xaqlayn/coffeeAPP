public class CoffeeApp {

        public static void main(String[] args) {
            CoffeeCup coffeeCup = new CoffeeCup(67);
            Person otto = new Person();

            try {
                otto.drinkCoffee(coffeeCup);
            }catch(TemperatureExecption e){
                //e.printStackTrace();
                System.out.println(e.getMessage());

            }
            System.out.println("let keep on going on with coffee");
        }

}
