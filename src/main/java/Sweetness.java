public abstract class Sweetness {

    public String name;
    private Double weight;
    private Double price;
    private Double energyValue;

    public Sweetness(String name, Double weight, Double price, Double energyValue) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.energyValue = energyValue;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Double getPrice() {
        return this.price;
    }

    public Double getEnergyValue() {
        return this.energyValue;
    }

    @Override
    public String toString() {
        return "Название - "+ name + ", вес - " + weight + " г. , цена - " + price + " руб. , энергетическая ценность - " + energyValue +" Ккал.";
    }



}
