package week2Task4;

import java.util.Random;

public class Human {
    Random random = new Random();
    private boolean gender;
    private String name;
    private String secondName;
    private float height;
    private float weight;

    public Human() {

    }


    public Human(boolean gender, String name, String secondName, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.secondName = secondName;
        this.height = height;
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public boolean speak(boolean a, boolean b) {
        if (a == true && b == true) {
            if (random.nextInt(100) > 50) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean tolerate(boolean a, boolean b) {
        if (a == false && b == false) {
            if (random.nextInt(100) > 95) {
                return true;
            } else if (a == true && b == false) {
                if (random.nextInt(100) > 30) {
                    return true;
                } else if (a == false && b == true) {
                    if (random.nextInt(100) > 30) {
                        return true;
                    } else if (a == true && b == true) {
                        if (random.nextInt(100) > 94) {
                            return true;
                        }
                    }
                }
            }

        }
        return false;
    }

    public boolean spendTimeTogether(float a, float b) {
        if ((100 - ((b / a) * 100)) > 10) {
            if (random.nextInt(100) > 15)
                return true;
            else {
                return false;
            }
        }
        if (random.nextInt(100) > 5) {
            return true;
        }
        return false;

    }

    public Human relationship(Man a, Woman b) {
        if (a.speak(a.isGender(), b.isGender()) && a.tolerate(a.isGender(), b.isGender()) && a.spendTimeTogether(a.getHeight(), b.getHeight())) {
            if (a.isGender() == a.isGender()) {
                return null;
            } else {


            }

        }
        return null;

    }
}



