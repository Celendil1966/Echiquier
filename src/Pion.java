/**
 * Created by garin.cdi04 on 27/01/2017.
 */
public class Pion extends Piece {

    public Pion(Position position, Couleur couleur) {
        super(position, couleur);
    }

    /*@Override
    public boolean positionPossible() {

    }*/

    @Override
    public char getSymbole() {
        return 'P';
    }

    @Override
    public byte getValeur() {
        return 1;
    }
}
