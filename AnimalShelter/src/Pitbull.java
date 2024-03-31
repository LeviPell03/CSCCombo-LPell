public class Pitbull extends Dog {
    public Pitbull(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getBreed() {
        return "Pitbull";
    }
}

