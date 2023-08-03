public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int startAdv;
    boolean hasAdvantage;

    Fighter(String name, int damage, int health, int weight, int dodge, int startAdv){
        this.name = name;
        this.health = health;
        this.weight = weight;
        if(dodge >= 0 && dodge <= 100 ) {
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
        this.damage = damage;

        if (startAdv >= 0 && startAdv <= 100) {
            this.startAdv = startAdv;
        } else {
            this.startAdv = 0;
        }
        this.hasAdvantage = isStartAdv();

    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name +  " " + this.damage + " "  + "Hasar vurdu!");
        if (foe.isDodge()){
            System.out.println(foe.name + " Gelen Hasarı Blokladı! ");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;

        }

        return foe.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
    boolean isStartAdv(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.startAdv;
    }
    boolean hasAdvantageForRound(){
        return hasAdvantage;
    }
    void resetAdvantageForRound(){
        this.hasAdvantage = isStartAdv();
    }
}
