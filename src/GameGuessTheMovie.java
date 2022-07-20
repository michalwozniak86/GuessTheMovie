import java.util.Scanner;

public class GameGuessTheMovie {

    private final String movieToGuess;
    private int points;
    private String wrongChar;
    private String rightChar;
    private boolean Victory;

    public GameGuessTheMovie(String pathname){
        ListWithMovies listWithMovies = new ListWithMovies(pathname);
        movieToGuess = listWithMovies.randomMovie();
        points = 10;
        wrongChar = "";
        rightChar = "";
        Victory = false;
    }

    public String randomMovie(){
        return movieToGuess;
    }

    public String showWrongChars(){
        return wrongChar;
    }

    public String repleaceTitleToUnderscores(){
        if (rightChar.equals("")){
            return movieToGuess.replaceAll("[a-zA-Z]", "_");
        }
        else {
            return movieToGuess.replaceAll("[a-zA-Z&&[^" + rightChar + "]]", "_");
        }
    }

    public boolean winGame(){
//        Victory = true;
        return Victory;
    }

    public boolean endGame(){
        if (points == 0){
            return true;
        }

        if (!repleaceTitleToUnderscores().contains("_")){
            Victory = true;
            return true;
        }
        return false;
    }

    private String enterChar(){
        System.out.println("Please enter some letter: ");
        Scanner charScanner = new Scanner(System.in);
        return charScanner.nextLine();
    }

    public void guessChar(){
        String guessChar = enterChar();

        if (movieToGuess.contains(guessChar)){
            rightChar += guessChar;
        }
        else {
            points--;
            wrongChar += guessChar;
        }
    }
}
