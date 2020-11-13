package taskAT6;

public enum Animals {
    Animal1("Barsik", 2), Animal2("Gerald", 3), Animal3("Poison", 4);


    private String name;
    private int year;

    Animals(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String toString(){
        return "name " + name;
    }

    public int getYear() {
        return year;
    }
}
