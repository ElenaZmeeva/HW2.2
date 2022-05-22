package com.company;

public class HogwartsStudents {
    private String name;
    private int powerOfMagic;
    private int transgression;


    public HogwartsStudents(String name, int powerOfMagic, int transgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }


    public int abilityHogwarts() {
        return powerOfMagic + transgression;
    }

    @Override
    public String toString() {
        return String.format("Student %s; power of magic %d; transgression %d", name, powerOfMagic, transgression);
    }

    public void print() {
        System.out.println(this);
    }

    public void compareHogwarts(HogwartsStudents hogwartsStudents) {
        int ability1 = abilityHogwarts();
        int ability2 = hogwartsStudents.abilityHogwarts();
        if (ability1 > ability2) {
            System.out.printf("Student %s better than student %s%n", getName(), hogwartsStudents.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s better than student %s%n",hogwartsStudents.getName(), getName());
        } else {
            System.out.printf("Student %s like the other student %s%n",hogwartsStudents.getName(), getName());
        }
    }
}
