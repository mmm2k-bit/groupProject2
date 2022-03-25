package com.group2;

public abstract class Marks {
    double subject1;
    double subject2;
    double subject3;

    public Marks(double subject1, double subject2, double subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;

    }

    public abstract double getPercentage(int numberOfSubjects);
}
