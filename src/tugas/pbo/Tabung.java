package tugas.pbo;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private double t;

    public Tabung(double r, double t) {
        super(r);
        this.t = t;
    }

    @Override
    public double luas() {
        return super.luas() * 2;
    }

    @Override
    public double keliling() {
        return super.keliling() * t ;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double volume() {
        return Math.PI * super.getR() * super.getR() * t;
    }

    @Override
    public double luasPermukaan() {
        return luas() + keliling();
    }

    public void display(){
        System.out.println("\nLuas lingkaran = " + luas());
        System.out.println("Keliling lingkaran = " + keliling());
        System.out.println("Volume tabung = " + volume());
        System.out.println("Luas permukaan tabung = " + luasPermukaan());
    }
}
