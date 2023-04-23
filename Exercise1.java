public class Exercise1 {

    static boolean iwillNotCheat = false;
    static boolean iWillWin = false;

    public static void main(String[] args) {

        // Precondition
        assert iwillNotCheat == true : "Bad 'yan";

        enterCompetition();

        // Postcondition
        assert iWillWin == true : "Kaya ko na 'to";

    }

    static void enterCompetition() {
        iWillWin = false;
    }

}