package com.company;

public class SlytherinStudents extends HogwartsStudents {
    private int cunning;
    private int resolution;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudents(String name,  int powerOfMagic, int transgression, int cunning, int resolution, int ambition, int ingenuity, int thirstForPower) {
        super(name,  powerOfMagic, transgression);
        this.cunning = cunning;
        this.resolution = resolution;
        this.ambition=ambition;
        this.ingenuity=ingenuity;
        this.thirstForPower=thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    @Override
    public String toString(){
        return String.format(" %s; cunning : %d; resolution: %d; ambition : %d; ingenuity: %d; thirstForPower %d",
                super.toString(),cunning ,resolution ,ambition, ingenuity, thirstForPower);
}


    public int ability() {
        return cunning+ resolution+ ambition+ ingenuity+ thirstForPower;
    }
    public void compareSlytherin(SlytherinStudents slytherinStudents) {
        int ability1 = ability();
        int ability2 = slytherinStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s better than student %s%n", getName(), slytherinStudents.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s better than student %s%n",slytherinStudents.getName(), getName());
        } else {
            System.out.printf("Student %s like the other student %s%n",slytherinStudents.getName(), getName());
        }
    }
}
