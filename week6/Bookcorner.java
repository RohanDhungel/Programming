public class Bookcorner {
    public static void main (String[] args) {
        String[] categories = {"Fiction", "Nepali"};
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];
        
        titles[0][0] = "Harry Potter";
        prices[0][0] = 500;
        
        titles[1][0] = "Asahamatai";
        prices[1][0] = 750;
        for(int i =0 ; i<2; i++){
            System.out.println(categories[i]);
            System.out.println(titles[i][0]);
            System.out.println(prices[i]);
        }
    }
}