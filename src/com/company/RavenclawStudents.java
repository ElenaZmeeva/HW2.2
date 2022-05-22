package com.company;

public class RavenclawStudents extends HogwartsStudents {
    private int cleverness;
    int wit;
    private int wisdom;
    private int creativity;

    public RavenclawStudents(String name,  int powerOfMagic, int transgression,  int wisdom, int creativity, int wit, int cleverness) {
        super ( name, powerOfMagic,transgression);
        this.wisdom= wisdom;
        this.creativity = creativity;
        this.wit=wit;
        this.cleverness=cleverness;


    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }


    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    @Override
    public String toString(){
        return String.format(" %s; wisdom: %d; creativity: %d; wit: %d; cleverness: %d", super.toString(),wisdom ,creativity ,wit, cleverness);
    }


    public int ability() {
        return wit+ wisdom+ cleverness+ cleverness;
    }
    public void compareRavenclaw(RavenclawStudents ravenclawStudents) {
        int ability1 = ability();
        int ability2 = ravenclawStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s better than student %s%n", getName(), ravenclawStudents.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s better than student %s%n",ravenclawStudents.getName(), getName());
        } else {
            System.out.printf("Student %s like the other student %s%n",ravenclawStudents.getName(), getName());
        }
    }
}
