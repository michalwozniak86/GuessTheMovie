
public class Main {
    public static void main(String[] args) {

        GameGuessTheMovie game = new GameGuessTheMovie("movies.txt");
        System.out.println("Welcome to the game 'Guess The Movie'!\n" +
                "");
        System.out.println("The title has " + game.repleaceTitleToUnderscores().length() + " characters (with spaces)");

        while (!game.endGame()){
            System.out.println("You are guessing: " + game.repleaceTitleToUnderscores());

            System.out.println("You used: " + game.showWrongChars().length() + " wrong letters: " + game.showWrongChars());
            game.guessChar();
        }

        if (game.winGame()){
            System.out.println("Great you win!");
        }
        else {
            System.out.println("Sorry, you lost!\n" +
                    "The title was: " + game.randomMovie());
        }
    }
}