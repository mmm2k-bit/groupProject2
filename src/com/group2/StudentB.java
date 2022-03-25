package com.group2;

public class StudentB extends Marks{
    double subject4;

    public StudentB(double subject1, double subject2, double subject3, double subject4) {
        super(subject1, subject2, subject3);
        this.subject4=subject4;
    }

    @Override
    public double getPercentage(int numberOfSubjects) {
        double total= super.subject1+super.subject2+subject3+this.subject4;
        return total/numberOfSubjects;

    }
}
