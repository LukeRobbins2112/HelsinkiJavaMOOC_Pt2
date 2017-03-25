public class Main {
    public static void main(String[] args) {
Changer scandiesAway = new Changer();
  scandiesAway.addChange(new Change('a', 'b'));
  scandiesAway.addChange(new Change('x', 'y'));
  System.out.println(scandiesAway.change("aa xx"));
    }
}
