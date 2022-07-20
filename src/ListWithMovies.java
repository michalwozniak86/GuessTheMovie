import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListWithMovies {

    private ArrayList<String> list;
    private String randomElement;

    public ListWithMovies(String pathname) {
        list = new ArrayList<String>();
        File file = new File(pathname);
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }
    }

    public String randomMovie(){
        Random random = new Random();
        randomElement = list.get(random.nextInt(list.size()));
        return randomElement;
    }
}

