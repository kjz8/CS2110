package a1;

/** NetId: kjz8. Time spent: hh hours, mm minutes. What I thought about this assignment: An instance
 * maintains info about tan Elephant. */
public class Elephant {
    /** Name given to this Elephant, a String of length > 0. */
    private String nickname;
    /** Year this elephant was born. Must be >= 2000 */
    private int birthYear;
    /** month this elephant was born. In 1..12, with 1 meaning January, etc. */
    private int birthMonth;
    /** gender of this elephant. 'F' means female and 'M' means male */
    private char gender;
    /** Mother of this elephant—null if unknown. */
    private Elephant mother;
    /** Father of this —null if unknown */
    private Elephant father;
    /** Number of known children of this Elephant. */
    private int numChildren;

    /** Constructor: an instance with nickname n, gender g, birth year y, and birth month m. Its
     * parents are unknown, and it has no children. Precondition: n has at least 1 character, y >=
     * 2000, m is in 1..12, and g is 'F' for female or 'M' for male. */

    Elephant(String n, char g, int y, int m) {
        assert n.length() >= 1 && y >= 2000 && m >= 1 && m <= 12 && (g == 'F' || g == 'M');
        nickname= n;
        gender= g;
        birthYear= y;
        birthMonth= m;
    }

    /** this elephant's nickname */
    public String name() {
        return nickname;
    }

    /** the value of "this elephant is a female" */
    public boolean isFemale() {
        assert gender == 'F';
        return true;
    }

    /** the date of birth of this elephant. In the form "month/year", with no blanks, e.g.
     * "6/2007" */
    public String date() {
        return birthMonth + "/" + birthYear;
    }

    /** this elephant's mother (null if unknown) */
    public Elephant mom() {
        return mother;
    }

    /** this elephant's father (null if unknown) */
    public Elephant dad() {
        return father;
    }

    /** the number of children of this elephant */
    public int children() {
        return numChildren;
    }
}
