public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tyson" ,10,100,100,40,50);
        Fighter f2 = new Fighter("Bobby Jr" ,15,100,85, 20,50);

        Match match = new Match(f1,f2,85,100 );
        match.run();
    }
}