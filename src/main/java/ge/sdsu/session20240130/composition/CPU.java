package ge.sdsu.session20240130.composition;

public class CPU {

    private int cores;
    private int threads;

    public CPU(int cores, int threads){
        this.cores = cores;
        this.threads = threads;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "cores=" + cores +
                ", threads=" + threads +
                '}';
    }
}
