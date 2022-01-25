package fr.java17.presentation;

import java.util.List;

public class AdoptionService {





    // switch
    public IAnimal getAnimalJAVA11(String type) {
        // JAVA 11
        return null;
    }
    public IAnimal getAnimal2(String type) {
        return switch(type) {
            case "chat" ->  {
                yield new Chat("chat");
            }
            case "chien" -> {
                yield new Chien("albert", 23);
            }
            default -> null;
        };
    }
    public IAnimal getAnimal(String type) {
        return switch(type) {
            case "chat" -> new Chat();
            case "chien" -> new Chien("albert", 18);
            default -> null;
        };
    }


    // intanceof ternaire
    public boolean canFetchBallJAVA11(IAnimal animal) {
        // JAVA 11
        return false;
    }
    public boolean canFetchBall(IAnimal animal) {
        return animal instanceof Chien chien && chien.description();
    }


    // tolist on stream
    public List<IAnimal> getBallCatcherJava11(List<IAnimal> listAnimal) {
        // JAVA 11
        return null;
    }
    public List<IAnimal> getBallCatcher(List<IAnimal> listAnimal) {
        return listAnimal.stream().filter(this::canFetchBall).toList();
    }


    // intro sealed
    public String getType(IAnimal animal) {
        if(animal instanceof Chien) {
            return "c'est un chien";
        }
        if(animal instanceof Chat) {
            return "c'est un chat";
        }
        return """
                l'animal examiné ne semble pas reconnu...
                c'est dommage !
                """;
    }
}
