import java.util.concurrent.ThreadLocalRandom;

    public class Die {
        //Data members
        private int numSides;
        private int value;

        public Die() {
            this.numSides = 6;
            this.value = 1;
        }
        //Constructor
        public Die(int numSides) {
            this.numSides = numSides;
            this.value = 1;
        }
        //Getters and setters
        public int getNumSides() {
            return numSides;
        }

        public void setNumSides(int numSides) {
            this.numSides = numSides;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
        //Method for roll creates a random number between 1 and numSides, inclusive, and assigns it to value
        public void roll() {
            this.value = ThreadLocalRandom.current().nextInt(1, numSides + 1);
        }
        //toString
        @Override
        public String toString() {
            return "Die{" +
                    "numSides=" + numSides +
                    ", value=" + value +
                    '}';
        }
    }

