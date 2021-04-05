package Pack1;


public class MainClass {
    public static void main(String[] arg) {
        String url = "D:\\info 3\\TSoptional\\src\\input\\data.txt";
        Proiect proiect = new Proiect();
        proiect.Citire(url);
        proiect.Sortare();
        Pair sol = proiect.Rezolvare();
        System.out.println("Solutia "+sol.x+" "+sol.y);
    }

}
