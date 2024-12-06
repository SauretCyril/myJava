package root.poo;

public class figure {
    public static void main(String[] args) {

    }
}

class FigureGeometrique {
    private int x;
    private int y;

    public FigureGeometrique(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Carre extends FigureGeometrique {
    long cote;

    Carre(long cote, int x, int y) {
        // Appel du constructeur de la classe mère FigureGeometrique
        super(x, y);
        this.cote = cote;
    }
}