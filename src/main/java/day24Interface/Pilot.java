package day24Interface;

public class Pilot implements HondaAC, HondaEngine, HondaSecurity{
    @Override
    public void cool() {
        System.out.println("Pilot uses digital climate AC");
    }

    @Override
    public void run() {
        System.out.println("Pilot runs well");
    }
}
