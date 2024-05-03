public class Player {
        //Data members
        private String name;
        private Die die;
        //Constructor
        public Player(String name, Die die) {
            this.name = name;
            this.die = die;
        }
        //Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Die getDie() {
            return die;
        }

        public void setDie(Die die) {
            this.die = die;
        }
    }

