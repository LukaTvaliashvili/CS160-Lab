package ge.sdsu.session20240130.composition;

public class PC {

    // Composition - has-a relationship

    private RAM ram;
    private CPU cpu;
    private Monitor monitor;

    public PC(RAM ram, CPU cpu, Monitor monitor) {
        this.ram = ram;
        this.cpu = cpu;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", monitor=" + monitor +
                '}';
    }
}
