package tugas.pbo;

/**
 *
 * @author ASUS TUF GAMING
 */
public class PersegiPanjang implements MenghitungBidang {
    private double p,l;

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double luas() {
        return p * l;
    }

    @Override
    public double keliling() {
        return 2 * (p + l);
    }
}