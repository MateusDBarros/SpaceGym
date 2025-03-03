package mb.project.SpaceGym.Classes.Models;

public enum Category {
    SUPINO ("Supino"),
    TERRA ("Levantamento Terra"),
    AGACHAMENTO ("Agachamento"),
    POWERLIFT ("Powerlifting");

    private final String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
