package OOPExampleTheory;

public class Movie {

    private String title;
   private String director;
    private int year;
    private double rate;

    public void setRate(double ocjena){
      if(ocjena>10.0){
          rate=10.0;
      }else if(ocjena<0.0){
          rate=0.0;
        }else {
          rate=ocjena;
      }
    }

    public double getRate() {
        return rate;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

