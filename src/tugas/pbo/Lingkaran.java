package tugas.pbo;

/**
 *
 * @author ASUS TUF GAMING
 */
public class Lingkaran implements MenghitungBidang{
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double luas() {
        return Math.PI * r * r;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * r;
    }
}
