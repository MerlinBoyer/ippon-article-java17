package fr.java17.presentation;

public final class Chat implements IAnimal{

    private String name;

    public Chat() {}
    public Chat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
