import java.util.ArrayList;

public class Museum {
    public static void main(String[] args) {
        Painting p1 = new Painting();
        Painting p2 = new Painting();
        Painting p3 = new Painting();
        Sculpture s1 = new Sculpture();
        Sculpture s2 = new Sculpture();
        ArrayList<Art> museum = new ArrayList<>();
        museum.add(p1);
        museum.add(p2);
        museum.add(p3);
        museum.add(s1);
        museum.add(s2);

        for (Art i: museum) {
            System.out.println("Title: " + i.title + ", Author: " + i.author + ", Description: " + i.description);
        }




    }
}
