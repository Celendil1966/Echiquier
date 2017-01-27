/**
 * Created by garin.cdi04 on 27/01/2017.
 */
public class Roi extends Piece {

    public Roi(Position position, Couleur couleur) {
        super(position, couleur);
    }

    /*@Override
    public boolean positionPossible(Position position) {

    }*/

    @Override
    public char getSymbole() {
        return 'R';
    }

    @Override
    public byte getValeur() {
        return 20;
    }


}
