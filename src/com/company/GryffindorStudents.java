package com.company;

public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int bravery;
    private int honor;

    public GryffindorStudents(String name, int powerOfMagic, int transgression, int nobility, int bravery, int honor){
        super( name, powerOfMagic, transgression);
        this.nobility=nobility;
        this.bravery=bravery;
        this.honor=honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }


    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return String.format(" %s; nobility: %d; bravery: %d; honor: %d", super.toString(), nobility, bravery,honor);
    }

    public int ability() {
        return nobility+ bravery+ honor;
    }

    public void compareGryffindor(GryffindorStudents gryffindorStudents) {
        int ability1 = ability();
        int ability2 = gryffindorStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s better than student %s%n", getName(), gryffindorStudents.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s better than student %s%n",gryffindorStudents.getName(), getName());
        } else {
            System.out.printf("Student %s like the other student %s%n",gryffindorStudents.getName(), getName());
        }
    }
}


