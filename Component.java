package OOP_Seminar3;

public abstract class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public Component () {
        this ("none", "none", 0);
    }

    @Override
    public String toString() {
        return "Component [name=" + name + ", weight=" + weight + ", power=" + power + "]";
    }

    public int getPower() {
        return this.power;
    }

}
