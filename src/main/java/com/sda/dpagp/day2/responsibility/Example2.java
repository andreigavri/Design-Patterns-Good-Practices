package com.sda.dpagp.day2.responsibility;

public class Example2 {



    public static void main(String[] args) {
//        LibraryManager libraryManager = new LibraryManager();
        LibraryManager libraryManager = new BooksAndCdsManager(); // substitution principal in action
        Book result = libraryManager.findBookByTitle("Amintiri din copilarie");

        System.out.println(result);



        BooksAndCdsManager booksAndCdsManager = new BooksAndCdsManager();
        Cd resultCd = booksAndCdsManager.findByArtist("Parazitii");
        Book resultBook = booksAndCdsManager.findBookByTitle("Amintiri din copilarie");

        System.out.println(resultCd);
        System.out.println(resultBook);
    }

}

/*
*  Car:
*  - startEngine()
*  - turnOnLight()
*  - signalLef()
*  - signalRight()
*  - turnOnAc()
*  - turnOffAc()
*  - stopEngine()
*  - break()
*  Non SRP
*
* */

/*
*  Engine:
*   - startEngine()
*   - stopEngine()
*  AcUnit:
*   - turnOnAc()
*   - turnOffAcc()
*  BreaksUnit():
*   - break();
*  LightUnit():
*   - turnOnLights()
*   - signalRight()
*   - signalLeft()
*
* Car:
*  - Car (engine, acUnit, breaksUnit, ligtsUnit)
*
* With SRP
*
*
* */
