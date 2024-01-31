package ge.sdsu.session20240130.composition;

public class Cpu {

    private int numOfCores;
    private int numOfThreads;

    public Cpu(int numOfCores, int numOfThreads) {
        this.numOfCores = numOfCores;
        this.numOfThreads = numOfThreads;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "numOfCores=" + numOfCores +
                ", numOfThreads=" + numOfThreads +
                '}';
    }
}
