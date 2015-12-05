package org.bloominglabs.apple.criminalintent.database;

/**
 * Created by apple on 12/4/15.
 *
 */
public class CrimeDbSchema {

    //Inner class
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
