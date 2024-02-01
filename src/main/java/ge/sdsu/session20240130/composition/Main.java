package ge.sdsu.session20240130.composition;

public class Main {

    public static void main(String[] args) {

        RAM ram = new RAM(16, 4200);
        CPU cpu = new CPU(8, 16);
        Monitor monitor = new Monitor("Samsung", 65, 144);

        PC pc = new PC(ram, cpu, monitor);
        System.out.println(pc);
    }
}
