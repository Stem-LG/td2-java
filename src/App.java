public class App {
    public static void main(String[] args) throws Exception {

        Stock stock = new Stock();

        Article article1 = new Article("Article1", 100.0);
        stock.addNouvArticle(article1, 10);

        Article article2 = new Article("Article2", 200.0);
        stock.addNouvArticle(article2, 20);

        Facture facture = new Facture(stock);

        facture.addLigne(5, "Article1");
        facture.addLigne(10, "Article2");

        System.out.println("Total amount: " + facture.getMontantTotal());

        facture.removeLigne(1);
        System.out.println("Total amount after removing Article1: " + facture.getMontantTotal());
    }
}