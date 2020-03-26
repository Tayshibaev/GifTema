
import java.util.ArrayList;

public class Gift implements GiftMaker {

    private Double weight = 0.0;
    private Double price = 0.0;
    private Double energyValue = 0.0;

    private ArrayList<Sweetness> gift = new ArrayList<Sweetness>();

    @Override
    public Gift addSweetness(Sweetness sweetness) {
        gift.add(sweetness);
        weight = weight + sweetness.getWeight();
        price = price + sweetness.getPrice();
        energyValue = energyValue + sweetness.getEnergyValue();
        return this;
    }

    @Override
    public Gift printTotalWeight() {
        System.out.println(weight);
        return this;
    }

    @Override
    public Gift printTotalPrice() {
        System.out.println(price);
        return this;
    }

    @Override
    public Gift removeLastSweetness() {
        Sweetness sweetness = gift.get(gift.size() - 1);
        weight = weight - sweetness.getWeight();
        price = price - sweetness.getPrice();
        energyValue = energyValue - sweetness.getEnergyValue();
        gift.remove(gift.size() - 1);
        return this;
    }

    @Override
    public Gift removeSweetnessByIndex(int index) {
        Sweetness sweetness = gift.get(index);
        weight = weight - sweetness.getWeight();
        price = price - sweetness.getPrice();
        energyValue = energyValue - sweetness.getEnergyValue();
        gift.remove(index);
        return this;
    }

    @Override
    public Gift printGiftContents() {
        System.out.println("Содержимое подарка: \n");
        for (Sweetness sweetness : gift) {
            System.out.println(sweetness.toString());
        }
        return this;
    }

    @Override
    public Gift reduceWeight(double requiredWeight) {
        while (weight>requiredWeight) {
            removeSweetnessByIndex(findMostLightweightSweetness());
        }
        return this;
    }

    private int findMostLightweightSweetness() {
        int index=0;
        double lightestWeight = Double.MAX_VALUE;
        for(Sweetness sweetness: gift) {
            if (sweetness.getWeight()<lightestWeight) {
                index = gift.indexOf(sweetness);
                lightestWeight = sweetness.getWeight();
            }
        }
        return index;
    }

    @Override
    public Gift reducePrice(double requiredPrice) {
        while (price>requiredPrice) {
            removeSweetnessByIndex(findCheapestSweetness());
        }
        return this;
    }

    private int findCheapestSweetness() {
        int index=0;
        double cheapestSweetnessPrice = Double.MAX_VALUE;
        for(Sweetness sweetness: gift) {
            if (sweetness.getPrice()<cheapestSweetnessPrice) {
                index = gift.indexOf(sweetness);
                cheapestSweetnessPrice = sweetness.getWeight();
            }
        }
        return index;
    }

}
