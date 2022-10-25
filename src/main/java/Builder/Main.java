package Builder;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint());
        //Computer computer = factory.makeAndGet();
        factory.make();

        Computer computer = factory.getComputer();

        System.out.println("computer = " + computer.toString());
    }
}
