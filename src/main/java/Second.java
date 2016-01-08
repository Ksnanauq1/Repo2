/**
 * Created by Administrator on 2016-01-08.
 */ //public
class Second {
    public static void main(String[] args) {
        new Second();
    }

    public Second() {
        Matches Legia = new Matches(12, 4, 3);
        int points1 = Legia.calculatePoints();

        System.out.println("Ilo�� punkt�w: " +
                '\n' + Legia.EnterWon() + " , " +
                Legia.EnterLost() + " , " +
                Legia.EnterDrawn() + '\n' + "wynosi: " + '\n' +
                points1);
    }
}
