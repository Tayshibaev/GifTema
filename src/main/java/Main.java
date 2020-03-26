public class Main {

    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.addSweetness(new Biscuit("Oreo",170.0 , 75.0, 460.0))
                .addSweetness(new Candy("Ferrero Rocher", 350.0,400.0,600.0))
                .addSweetness(new ChocolateBar("Twix", 120.0,45.0,570.0))
                .addSweetness(new ChocolateBar("Snickers", 140.0,55.0,620.0))
                .addSweetness(new ChocolateBar("KitKat", 70.0,35.0,370.0))
                .addSweetness(new Candy("Rafaello", 200.0,250.0,840.0))
                .removeLastSweetness()
                .removeSweetnessByIndex(3)
                .reducePrice(400)
                .reduceWeight(350)
                .printTotalWeight()
                .printTotalPrice()
                .printGiftContents();
    }

}
