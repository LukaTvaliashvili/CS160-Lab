package ge.sdsu.session20240130.composition;

public class PC extends Object {

    private Ram ram;
    private Cpu cpu;
    private Monitor monitor;

    public PC(Ram ram, Cpu cpu, Monitor monitor) {
        this.ram = ram;
        this.cpu = cpu;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC consists of: " +
                this.ram + " " + this.cpu + " " + this.monitor;
    }
}
