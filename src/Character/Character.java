package Character;

public class Character {
    private String nick;
    private double hp;
    private int mana;
    private int defensive;
    private double attack;

    public Character(String nick, int hp, int mana, int defensive, double attack) {
        this.nick = nick;
        this.hp = hp;
        this.mana = mana;
        this.defensive = defensive;
        this.attack = attack;



    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }


    public double getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDefensive() {
        return defensive;
    }

    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }

    public double getAttack() {
        return attack;
    }


    public int regenerateMana(){
        return mana;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }



}

