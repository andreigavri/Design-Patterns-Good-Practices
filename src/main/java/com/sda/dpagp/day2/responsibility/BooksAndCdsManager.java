package com.sda.dpagp.day2.responsibility;

public class BooksAndCdsManager extends LibraryManager{

    private Cd[] cds = new Cd[]{};

    BooksAndCdsManager() {
        super();
        cds = new Cd[2];
        cds[0] = new Cd("Armin", "A state of trance");
        cds[1] = new Cd("Parazitii", "Arma secreta");

    }

    public Cd findByArtist(String artistToSearch) {
        // going backwards in array
//        for(int i= cds.length-1; i>=0; i--) {
//            Cd currentCd = cds[i];
//            if (currentCd.getArtist().equals(artistToSearch)) {
//                return currentCd;
//            }
//        }

        // for each
        for(Cd currentCd: cds) {
            if (currentCd.getArtist().equals(artistToSearch)) {
                return currentCd;
            }
        }

        return null;
    }


}
