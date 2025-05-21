class CappuccinoMaker extends CoffeeMaker {

    public CappuccinoMaker(int maxValumeOz) {
        super(maxValumeOz);
        this.milk = "whole";
    }

    public void makeCappuccino(String beans) {
        super.brew(beans);
        System.out.println("Smooth.");
    }
}
