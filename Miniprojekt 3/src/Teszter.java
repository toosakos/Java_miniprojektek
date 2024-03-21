import java.util.ArrayList;
import java.util.Collections;

public class Teszter {
    public static int osszBuntetes(int eletkor, ArrayList<IKorhataros> horrorFilmek){
        int osszeg=0;
        for(IKorhataros film:horrorFilmek){
            osszeg += film.Buntetes(eletkor);
        }
        return osszeg;
    }
    public static void main(String[] args) {
        Film film1 = new Film("Star Wars",12);
        Film film2 = new Film("Star Trek",11);
        Film film3 = new Film("Gru",10);
        Film film4 = new Film("Avatar",14);
        Film film5 = new Film("Avengers",9);
        Film film6 = new Film("Spider-Man",17);
        HorrorFilm hfilm1 = new HorrorFilm("FNAF",15,16);
        HorrorFilm hfilm2 = new HorrorFilm("Saw",13,18);
        HorrorFilm hfilm3 = new HorrorFilm("Ring",17,18);
        HorrorFilm hfilm4 = new HorrorFilm("Nun",12,16);
        HorrorFilm hfilm5 = new HorrorFilm("Friday the 13th",14,18);
        HorrorFilm hfilm6 = new HorrorFilm("Resident Evil",15,16);
        ArrayList<Film> filmek = new ArrayList<>();
        filmek.add(film1);
        filmek.add(film2);
        filmek.add(film3);
        filmek.add(film4);
        filmek.add(film5);
        filmek.add(film6);
        filmek.add(hfilm1);
        filmek.add(hfilm2);
        filmek.add(hfilm3);
        filmek.add(hfilm4);
        filmek.add(hfilm5);
        filmek.add(hfilm6);
        for (Film film:filmek){
            System.out.println(film);
        }
        System.out.println("Rendezett Filmek");
        Collections.sort(filmek);
        for (Film film:filmek){
            System.out.println(film);
        }
        ArrayList<IKorhataros> horrorFilmek = new ArrayList<>();
        for(Film film:filmek){
            if(film instanceof IKorhataros){
                horrorFilmek.add((IKorhataros) film);
            }
        }
        System.out.println("Horrorfilmek:");
        for(IKorhataros film:horrorFilmek){
            System.out.println(film);
        }
        System.out.println("Büntetés 15 évesen:" + osszBuntetes(15,horrorFilmek));
        System.out.println("Büntetés 16 évesen:" + osszBuntetes(16,horrorFilmek));
        System.out.println("Büntetés 17 évesen:" + osszBuntetes(17,horrorFilmek));

    }
}
