import static java.lang.Math.abs;

public class HorrorFilm extends Film implements IKorhataros {
    protected int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public int Korhatar() {
        return korh;
    }

    @Override
    public int Buntetes(int ertek) {
        if (ertek - this.korh < 0) {
            return abs(ertek - this.korh) * this.getAr();
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Film korhatárja: " + this.korh;
    }
}
