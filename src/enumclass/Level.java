package enumclass;

public enum Level {
    EASY("Level Easy"),
    MEDIUM("Level Medium"),
    HARD("Level Hard")
    ;

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
