package com.by.fara0n;

public class StartConvert {
    public static void main(String[] args) {
        ReportCard rc=new ReportCard();
        char yourGrade=rc.convertGrades(92);
        System.out.println("Ваша первая оценка "+yourGrade);
        yourGrade=rc.convertGrades(81);
        System.out.println("Ваша вторая оценка "+yourGrade);
    }
}
