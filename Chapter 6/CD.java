//********************************************************************
//  CD.java       Author: Lewis/Loftus/Cocking
//
//  Represents a compact disc.
//********************************************************************

import java.text.NumberFormat;

public class CD implements Comparable {
    private String title, artist;
    private double cost;
    private int tracks;

    //-----------------------------------------------------------------
    //  Creates a new CD with the specified information.
    //----q-------------------------------------------------------------
    public CD (String name, String singer, double price, int numTracks)
    {
        title = name;
        artist = singer;
        cost = price;
        tracks = numTracks;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this CD.
    //-----------------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String description;

        description = fmt.format(cost) + "\t" + tracks + "\t"
        + title + "\t" + artist;

        return description;
    }

    public int compareTo(Object other){
        CD cd = (CD) other;
        int[] comp = new int[4];
        comp[0] = artist.compareTo(cd.artist);
        comp[1] = title.compareTo(cd.title);
        comp[2] = new Double(cost).compareTo(new Double(cd.cost));
        comp[3] = new Integer(tracks).compareTo(new Integer(tracks));
        for(int i : comp)
            if(i != 0) return i;
        return 0;
    }
}
