package Builder;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint());
        factory.setBlueprint(new MacAirBlueprint());
        factory.setBlueprint(new SonyBlueprint());
        Computer computer = factory.makeAndGet();
        Computer computer = new factory.make();
        Comptuer computer = new factoyr.getComputer();

        //Computer computer = new Computer("i7", "16g", "256g ssd");

        System.out.println("computer = " + computer.toString());
    }
}
