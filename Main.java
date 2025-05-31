public class Main {
    public static void main(String[] args) {
        Game game1 = new Game(0, "Mystery Adventure", 5, "Adventure");
        Game game2 = new Game(0, "Zombie Survival", 4, "Horror");

        game1.play();
        game1.friendPlay();
        game1.info();

        game2.play();
        game2.friendPlay();
        game2.info();
    }    
}