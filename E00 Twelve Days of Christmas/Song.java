//
//  Twelve Days of Christmas
//  Song.java
//
//  Created by Jonas Zellweger on 27.09.2021.
//

public class Song {

    String firstline = "On the nth day of Christmas";
    String secondline = "My true love sent to me:";
    String[] days = {
            "first", "second", "third", "fourth",
            "fifth", "sixt", "seventh", "eight",
            "ninth", "tenth", "eleventh", "twelfth"
    };
    String[] gifts = {
            "A partridge in a pear tree.",
            "Two turtle doves and",
            "Three French hens",
            "Four calling birds",
            "Five golden rings",
            "Six geese a-laying",
            "Seven swans a-swimming",
            "Eight maids a-milking",
            "Nine ladies dancing",
            "Ten lords a-leaping",
            "Eleven pipers piping",
            "Twelve drummers drumming"
    };
    int maxVerses = 12;

    public static void main(String[] args) {
    }

    private void printLine(int g){
        System.out.println(gifts[g]);
    }

    private void printVerse(int n){
        System.out.println(firstline.replace("nth", days[n-1]));
        System.out.println(secondline);
        for(int i = n-1; i >= 0; i--){
            printLine(i);
        }
        System.out.println("");
    }

    public void printSong(int nof_verses){
        if(nof_verses > maxVerses) nof_verses = maxVerses;
        for (int v = 1; v <= nof_verses; v++){
            printVerse(v);
        }
    }

}
