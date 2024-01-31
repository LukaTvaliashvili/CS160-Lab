package ge.sdsu.session20240130.composition;

public class Main {

    public static void main(String[] args) {

        Cpu cpu = new Cpu(4, 8);
        Ram ram = new Ram(16, 4200);
        Monitor monitor = new Monitor("Samsung", 144, 65.2);

        PC pc = new PC(ram, cpu, monitor);

        PC pc1 = new PC(new Ram(32, 4200),
                new Cpu(16, 20),
                new Monitor("Sony", 240, 70));

        System.out.println(pc.toString());
        System.out.println(monitor);
    }
}


