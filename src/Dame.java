/**
 * Created by garin.cdi04 on 27/01/2017.
 */
public class Dame extends Piece {

    public Dame(Position position, Couleur couleur) {
        super(position, couleur);
    }

    /*@Override
    public boolean positionPossible() {

    }*/

    @Override
    public char getSymbole() {
        return 'D';
    }

    @Override
    public byte getValeur() {
        return 9;
    }
}
