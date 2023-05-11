package hw.lesson19.part1.animals;

public enum HealthState {
    GOOD("HEALTHY"),
    BAD("UNHEALTHY");

    private String health;

    HealthState(String health) {
        this.health = health;
    }

    public String getHealth() {
        return health;
    }
}