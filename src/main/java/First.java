/**
 * Created by Administrator on 2016-01-08.
 */ //public
class First {
    public static void main(String[] args) {
        nazwaaa();
    }

    static public void nazwaaa() {
        Matches piast = new Matches(12, 4, 3);
        int points1 = piast.calculatePoints();

        System.out.println("Ilo�� punkt�w: " +
                '\n' + piast.EnterWon() + " , " +
                piast.EnterLost() + " , " +
                piast.EnterDrawn() + '\n' + "wynosi: " + '\n' +
                points1);
    }
}
