package com.group2;

public class StudentA extends Marks{

    public StudentA(double subject1, double subject2, double subject3) {
        super(subject1, subject2, subject3);
    }

    @Override
    public double getPercentage(int numberOfSubjects) {
        double total= super.subject1+super.subject2+super.subject3;
        return total/numberOfSubjects;
    }
}
