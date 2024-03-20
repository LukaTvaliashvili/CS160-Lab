package ge.sdsu.session20240320.equalsAndHashcode;


// ab1c -> bc2d -> encoding
// with hashing, we cannot go from output to input

import java.util.Objects;

public class Player {

    private int id;
    private String name;
    private double score;

    public Player(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Player other = (Player) obj;

        return this.id == other.id && this.name.equals(other.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*
    equals() and hashCode() contract:
    if two objects are equal, they have the same hash code.
    if two objects have the same hash code, that does not mean that they are equal.
     */
}
