/**
 * Created by Administrator on 2016-01-08.
 */ //public
class Third {
    public static void main(String[] args) {
        new Third();
    }

    public Third() {
        Matches ref1, ref2, ref3;
// utworzenie dw�ch obiekt�w klasy Matches
        ref1 = new Matches(1, 0, 0);
        ref2 = new Matches(0, 1, 0);
        ref3 = ref1;

        System.out.println("Ilo�� punkt�w dru�yny Piast: " +
                ref3.EnterWon() + " , " +
                ref3.EnterLost() + " , " +
                ref3.EnterDrawn() + '\n' + "wynosi: " +
                ref3.calculatePoints());
        ref3 = ref2;

        System.out.println("Ilo�� punkt�w dru�yny Legia: " +
                ref3.EnterWon() + " , " +
                ref3.EnterLost() + " , " +
                ref3.EnterDrawn() + '\n' + "wynosi: " +
                ref3.calculatePoints());
    }
}
