/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group3.gradecalculator;

/**
 *
 * @author brook
 */
public class GradeCalculator implements GradeCalculatorInterface {

    @Override
    public char calculateGrade(float mark) {
        
        if (mark>=85 && mark<=100)
            return 'A';
        else if (mark>=70)
            return 'B';
        else if (mark>=55)
            return 'C';
        else if (mark>=45)
            return 'D';
        else if (mark>=0)
            return 'F';
        else
            return 'Z';
        
    }

    @Override
    public float calculateTotal(float st, float sp, float rm, float cd, float cp) {
        
        st = st*5;
        sp = sp*5;
        cd = cd*5;
        rm = rm*5;
        cp = cp*7;
        
        return st + sp + cd + rm + cp;
    }

    @Override
    public float calculateGpa(float total) {
        
        return (float) (total/27.0);
        
    }
   
}
