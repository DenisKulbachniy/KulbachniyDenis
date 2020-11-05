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
        if (a && b) {
            if (random.nextInt(100) > 50) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean tolerate(boolean a, boolean b) {
        if (a && !b) {
            if (random.nextInt(100) > 95)
                return true;
            else if (a && !b) {
                if (random.nextInt(100) > 30)
                    return true;
                else if (!a && !b) {
                    if (random.nextInt(100) > 30)
                        return true;
                }
            } else if (a && b) {
                if (random.nextInt(100) > 94) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean spendTimeTogether(float height1, float height2) {
        if ((100 - ((height2 / height1) * 100)) > 10) {
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

    public Human relationship(Human human1, Human human2) {
        if (human1 instanceof Man && human2 instanceof Woman) {
            if (human1.speak(human1.isGender(), human2.isGender()) && human1.tolerate(human1.isGender(), human2.isGender())
                    && human1.spendTimeTogether(human1.getHeight(), human2.getHeight())) {
                return (((Woman) human2).delivery(human1, human2));

            }
            return null;
        } else if (human1 instanceof Woman && human2 instanceof Man) {
            if (human1.speak(human1.isGender(), human2.isGender()) && human1.tolerate(human1.isGender(), human2.isGender())
                    && human1.spendTimeTogether(human1.getHeight(), human2.getHeight())) {
                return (((Woman) human2).delivery(human2, human1));
            }
            return null;
        }
        return null;
    }
    public String toString(){
        return "Name " + name + "\n" + "Second name " + secondName + "\n" + "Height " + height + "\n" + "Weight " + weight;
    }
}






