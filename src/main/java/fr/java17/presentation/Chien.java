package fr.java17.presentation;

import static java.util.Objects.requireNonNull;

//public final class Chien implements IAnimal{
public record Chien(String name, int age) implements IAnimal{

    // implicit compact constructor
    public Chien {
        requireNonNull(name);
    }

    public String description() {
        return """
                this dog is a good boy
                """;
    }
}
