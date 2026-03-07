package eu.ase.poly;

public class ProgMainJars {
    public static void main(String[] args) {
        Vehicle v;
        try {
            v = new Auto(1200, 4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Vehicle display: " + v.display());
    }
}
