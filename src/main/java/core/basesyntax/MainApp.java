package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        Machine[] machine = new Machine[]{truck, bulldozer, excavator};

        for (Machine machine1 : machine) {

            machine1.doWork();
            machine1.stopWork();

        }
    }
}
