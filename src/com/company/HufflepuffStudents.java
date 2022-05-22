package com.company;

public class HufflepuffStudents extends HogwartsStudents {
    private int loyalty;
    private int honour;
    private int industry;

    public HufflepuffStudents(String name,  int powerOfMagic, int transgression,  int loyalty, int honour, int industry ) {
        super(name, powerOfMagic, transgression);
        this.loyalty = loyalty;
        this.honour = honour;
        this.industry=industry;
    }


    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    @Override
    public String toString(){
        return String.format(" %s; loyalty: %d; industry: %d; honour: %d", super.toString(),loyalty , industry,honour);
    }


    public int ability() {
        return loyalty+ industry+ honour;
    }
    public void compareHufflepuff(HufflepuffStudents hufflepuffStudents) {
        int ability1 = ability();
        int ability2 = hufflepuffStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s better than student %s%n", getName(), hufflepuffStudents.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s better than student %s%n",hufflepuffStudents.getName(), getName());
        } else {
            System.out.printf("Student %s like the other student %s%n",hufflepuffStudents.getName(), getName());
        }
    }
}
