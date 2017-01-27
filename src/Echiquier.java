import java.util.ArrayList;
import java.util.List;

/**
 * Created by garin.cdi04 on 27/01/2017.
 */
public class Echiquier {
    private List<Piece> list;

    public Echiquier() {list = new ArrayList<>();}

    public List<Piece> getList() {return list;}

    public void setList(List<Piece> list) {this.list = list;}

    // Ajouter une pièce
    public void ajouterPiece(Piece piece){
        list.add(piece);
    }

    // Renvoie s'il y a une pièce à la position ou null
    public Piece getPiece(Position position){
        for (Piece p:list){
            if (p.getPosition().equals(position)){
                return p;
            }
        }
        return null;
    }

    // Renvoie le nombre de points du joueur
    public int getPoints(char couleur){
        int score = 0;

        for (Piece p:list){
            if (p.getCouleur().equals(couleur)){
                score += p.getValeur();
            }
        }

        return score;
    }

    // Affiche l'échiquier
    public void afficher(){

    }

    // Sauvegarde l'échiquier dans un fichier
    public void sauvegarder(){

    }

    // Charge l'échiquier depuis un fichier
    public void charger(){

    }


}
