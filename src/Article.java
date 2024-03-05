public class Article {
    private String nom;
    private double pu;

    public Article(String nom, double pu) {
        this.nom = nom;
        this.pu = pu;
    }

    public String getNom() {
        return nom;
    }

    public double getPu() {
        return pu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPu(double pu) {
        this.pu = pu;
    }

    @Override
    public String toString() {
        return ("nom =" + nom + "prix unitaire = " + pu);
    }

}
