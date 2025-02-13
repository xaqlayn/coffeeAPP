
    // Custom checked exception
    public class TemperatureExecption extends Exception {
        // Default constructor
        public TemperatureExecption() {
            super("Coffee is not to good to drink");
        }

        // Constructor with custom message
        public TemperatureExecption(String message) {
            super(message);
        }


    }


