package com.example.student.lanascrystalball;

public class Songs {

    private static Songs songs;
    private String[] choice;

    private Songs() {
        choice = new String[] {
                "Ultraviolence",
                "Honeymoon",
                "Lolita",
                "Video Games",
                "Brooklyn Baby",
                "Ride",
                "Freak",
                "Carmen",
                "Shades of Cool",
                "West Coast"
        };
    }

    public static Songs get() {
        if(songs == null) {
            songs = new Songs();
        }
        return songs;
    }

    public String getSong() {
        return choice[1];
    }
}