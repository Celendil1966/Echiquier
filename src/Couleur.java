/**
 * Created by garin.cdi04 on 27/01/2017.
 */
public enum Couleur {
    B("Blanc"),
    N("Noir");

    String couleur = "";

    Couleur(java.lang.String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }
}