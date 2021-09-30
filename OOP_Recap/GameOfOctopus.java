public class GameOfOctopus extends Thread {

    @Override
    public void run() {
        //System.out.println("Run has be called");

        Octopus otto = new Octopus();
        otto.makeDoActivity(); // i stedet laver vi en otto
    }
}
