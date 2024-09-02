

import java.util.ArrayList;

import java.util.List;

public class Lesson {
    String title;
    List<String> materials;
    
    public Lesson(String title) {
        this.title = title;
        this.materials = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    
    public void addMaterial(String material) {
        materials.add(material);
    }
    public List<String> getMaterials() {
        return materials;
    }
    public void viewMaterials() {
        System.out.println("Lesson: " + title);
        for (String material : materials) {
            System.out.println("- " + material);
        }
    }
}
