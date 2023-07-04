import java.util.ArrayList;

public class Search {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Link> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Search(GeoTree geoTree){
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Human h, Relationship re){
         for (Link t : tree) {
            if (t.h1.name == h.name && t.re == re) {
                result.add(t.h2.name);
            }
        }
        return result;
    }
}
