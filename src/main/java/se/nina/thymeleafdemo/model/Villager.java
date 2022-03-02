package se.nina.thymeleafdemo.model;

public class Villager {

    private int id;
    private String name;
    private String personality;
    private String species;

    public Villager() {

    }

    public Villager(int id, String name, String personality, String species) {
        this.id = id;
        this.name = name;
        this.personality = personality;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Villager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personality='" + personality + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
