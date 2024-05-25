public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Victor");
        Human human2 = new Human("Igor");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}