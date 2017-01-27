/**
 * Created by garin.cdi04 on 27/01/2017.
 */
public abstract class Piece {

    protected Position position;
    protected Couleur couleur;

    public Piece(Position position, Couleur couleur) {
        this.position = position;
        this.couleur = couleur;
    }

    public boolean positionPossible(Position position){
        return true;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Position getPosition() {
        return position;
    }

    public abstract char getSymbole();

    public abstract byte getValeur();

    public void deplacement(Position position){
        if (positionPossible(position)){
            this.position = position;
        }

    }

    @Override
    public  String toString() {
            return "Pièce : " + this.getSymbole() + "\n" +
                    "Couleur : " + this.couleur.getCouleur() + "\n" +
                    "Position : " + "{" + this.position + "}";
    }

}
