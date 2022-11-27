package OOPExampleTheory;

public class MovieDemo {
    public static void main(String[] args) {
        Movie film1=new Movie();
        film1.setTitle("Indijana Jones");
        film1.setDirector("Stiven Spielberg");
        film1.setYear(1984);
        film1.setRate(18.9);

        Movie film2=new Movie();
        film2.setTitle("Kill Bill");
        film2.setDirector("Quentin Tarantino");
        film2.setYear(2010);
        film2.setRate(4.7);
        System.out.println(film1.getRate());
    }
}
