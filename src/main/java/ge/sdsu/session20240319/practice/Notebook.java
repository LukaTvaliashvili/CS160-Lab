package ge.sdsu.session20240319.practice;

public class Notebook {

    private int numberOfPages;

    public Notebook(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "numberOfPages=" + numberOfPages +
                '}';
    }
}
