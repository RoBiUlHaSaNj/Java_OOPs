public class Patron {
    private String name;
    private String id;
    
    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Patron [name=" + name + ", id=" + id + "]";
    }
}
