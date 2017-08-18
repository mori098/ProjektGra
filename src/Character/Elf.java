package Character;

public class Elf extends Character implements MagicPower {


        //private double magic = 0.2*getAttack();
        private double cure = 0.2*getHp();

        public Elf(String nick) {
            super(nick, 100, 100, 120, 80);
        }


        public double getCure() {
            return cure;
        }

        public void useSuperPower(double attack){
            attack = attack+ 0.2*attack;
        }
        public double cureMe(){
            return (getHp()+cure);
        }
        public double useFireball(){
            return (getAttack()+0.4*getAttack());
        }




    }

