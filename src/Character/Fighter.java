package Character;

public class Fighter {


    public Fighter(String nick) {
        super(nick, 100, 60, 120, 120);
    }
    public double superAttack(){
        return (getAttack()+0.5*getAttack());
    }


}
}
