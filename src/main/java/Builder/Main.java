package Builder;

public class Main {
    public static void main(String[] args) {
        /*ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint());
        //Computer computer = factory.makeAndGet();
        factory.make();

        Computer computer = factory.getComputer();*/
        Computer computer = ComputerBuilder.startWithCpu("i7").setRam("8g").build();

        System.out.println("computer = " + computer.toString());
    }
}
