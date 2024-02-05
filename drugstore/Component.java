package drugstore;

public abstract class Component implements Comparable<Component>{
    
    private String title;
    private double weight;
    private int power;

    public Component(String title, double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
       return String.format("TITLE: %s W: %s P: %s\t", title, weight, power);
    }

    @Override
    public int compareTo(Component component) {
        //if(this.power > component.power) return 1;
        //else if(this.power < component.power) return -1;
        //else return 0;

        return Integer.compare(component.power, this.power);

        // закоментированный код, то же самое, что и return ниже.
    }

    public double getComponentFullPower(){
        return power + weight;
    }
}
