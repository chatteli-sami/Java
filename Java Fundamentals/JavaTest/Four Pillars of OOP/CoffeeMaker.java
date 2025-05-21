public class CoffeeMaker {
    protected int maxValumeOz;
    protected String milk;

    public CoffeeMaker(int maxValumeOz){
        this.maxValumeOz = maxValumeOz;
    }

    public int getMaxVolumeOz(){
        return this.maxValumeOz;
    }

    public int getMaxServings(){
        return this.maxValumeOz /8;
    }

    public void brew(String beans){
        System.out.println("Brewing coffee");
    }
}