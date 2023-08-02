public class Pokemon {
    private String name;
    private int atk;
    private int def;
    private int level;
    private String element;

    public Pokemon(String name, String element){
        this.name = name;
        this.element = element;
        this.atk = random();
        this.def = random();
        this.level = randomLevel();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    private int random(){
        int min = 50;
        int max = 90;
        int range = max - min + 1; // มีกี่ตัว
        return (int)(Math.random() * range) + min;
    }

    private int randomLevel(){
        int min = 1;
        int max = 30;
        int range = max - min + 1; // มีกี่ตัว
        return (int)(Math.random() * range) + min;
    }

    public String showStatus(){
        return (getName() + '\n' +
                           "Level: " + getLevel() + '\n' +
                           "Element: " + getElement() + '\n'+
                            "Atk: " + getAtk() + '\n' +
                            "Def: " + getDef());
    }

}
