/**
 * Created by garin.cdi04 on 27/01/2017.
 */
public class Cavalier extends Piece {

    public Cavalier(Position position, Couleur couleur) {
        super(position, couleur);
    }

    /*@Override
    public boolean positionPossible() {

    }*/

    @Override
    public char getSymbole() {
        return 'C';
    }

    @Override
    public byte getValeur() {
        return 3;
    }
}
