package Challenge84;

public abstract class Bird implements Flyable {
    
    @SuppressWarnings("unused")
    private  final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }
    
}
