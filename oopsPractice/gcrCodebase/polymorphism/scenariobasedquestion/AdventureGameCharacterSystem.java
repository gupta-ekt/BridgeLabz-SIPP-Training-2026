class GameCharacter {

    protected String characterName;

    public GameCharacter(String characterName) {

        this.characterName = characterName;
    }

    public void performAttack() {

        System.out.println(characterName + " attacks.");
    }
}

class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void performAttack() {

        System.out.println(characterName +
                " attacks with Sword!");
    }
}

class Mage extends GameCharacter {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void performAttack() {

        System.out.println(characterName +
                " casts Fireball!");
    }
}

class Archer extends GameCharacter {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void performAttack() {

        System.out.println(characterName +
                " shoots Arrow!");
    }
}

public class AdventureGameCharacterSystem {

    static void startBattle(GameCharacter[] characters) {

        int warriors = 0;
        int mages = 0;
        int archers = 0;

        for (GameCharacter character : characters) {

            character.performAttack();

            if (character instanceof Warrior)
                warriors++;

            else if (character instanceof Mage)
                mages++;

            else if (character instanceof Archer)
                archers++;
        }

        System.out.println();

        System.out.println("Warriors : " + warriors);
        System.out.println("Mages : " + mages);
        System.out.println("Archers : " + archers);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {

                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Leon")
        };

        startBattle(characters);
    }
}