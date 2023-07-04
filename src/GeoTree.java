import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Link> tree = new ArrayList<>();

    public ArrayList<Link> getTree() {
        return tree;
    }

    public void appendPerentChild(Human parent, Human children) {
        tree.add(new Link(parent, Relationship.parent, children));
        tree.add(new Link(children, Relationship.children, parent));
    }

    public void appendVifeHusbent(Human vife, Human husbent) {
        tree.add(new Link(vife, Relationship.vife, husbent));
        tree.add(new Link(husbent, Relationship.husbent, vife));
    }

}