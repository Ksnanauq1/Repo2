public class Matches {
    private int won;
    private int lost;
    private int drawn;

    public Matches(int aW, int aL, int aD) {
        won = aW;
        lost = aL;
        drawn = aD;
    }

    public int EnterWon() {
        return won;
    }

    public int EnterLost() {
        return lost;
    }

    public int EnterDrawn() {
        return drawn;
    }

    public int calculatePoints() {
        return won * 3 + lost * 0 + drawn * 1;
    }

    public int CalculateGoals() {
        return won - lost;
    }

//jak zmienie poni�szy nawaias na { to tu wywala, �e jest ok, a wywala b��dy ni�ej w "public static void main(String[] args)", jak usun� ca�kowicie to wywala b��dy w "public static void main(String[] args)"

}

/*{



        Matches Piast=new Matches(14,4,3);
        Piast.won=14;
        Piast.lost=4;
        Piast.drawn=3;

        int points1=Piast.calculatePoints();


        Matches Legia=new Matches(12,4,3);
        Legia.won=12;
        Legia.lost=4;
        Legia.drawn=3;

        int points2=Legia.calculatePoints();

        }
        */


//Trzeci


//Koniec 3


//doda�em nawias poni�ej, bo wywala�o b��d

//}

