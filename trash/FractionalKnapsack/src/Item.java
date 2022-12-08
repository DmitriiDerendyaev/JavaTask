class Item{
    private int weight;
    private int value;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public double valuePerUnitOfWeight(){
        return value / (double)weight;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }
}