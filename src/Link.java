public class Link {
    Human h1;
    Relationship re;
    Human h2; 
    
    public Link(Human p1, Relationship re, Human p2) {
        this.h1 = h1;
        this.re = re;
        this.h2 = h2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", h1, re, h2);
    }
}
