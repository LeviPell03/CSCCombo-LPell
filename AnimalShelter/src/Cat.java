
    public class Cat implements AdoptableAnimal {
        private final String name;
        private final String description;
        private final double price;

        public Cat(String name, String description, double price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public double getPrice() {
            return price;
        }
    }

