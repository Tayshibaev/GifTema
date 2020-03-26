public interface GiftMaker {

    public Gift addSweetness(Sweetness sweetness);
    public Gift printTotalWeight();
    public Gift printTotalPrice();
    public Gift removeLastSweetness();
    public Gift removeSweetnessByIndex(int index);
    public Gift printGiftContents();
    public Gift reduceWeight(double requiredWeight);
    public Gift reducePrice(double requiredPrice);

}
