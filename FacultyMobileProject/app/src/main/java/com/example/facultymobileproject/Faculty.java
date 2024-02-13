package com.example.facultymobileproject;

public class Faculty {

    private int f_id;
    private String f_Lname;
    private String f_Fname;
    private double f_Salary;
    private double f_bonus;

    public Faculty(int f_id, String f_Lname, String f_Fname, double f_Salary, double f_bonus) {
        this.f_id = f_id;
        this.f_Lname = f_Lname;
        this.f_Fname = f_Fname;
        this.f_Salary = f_Salary;
        this.f_bonus = f_bonus;
    }

    public Faculty() {
        this.f_id = 0;
        this.f_Lname = "";
        this.f_Fname = "";
        this.f_Salary = 0;
        this.f_bonus = 0;
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getF_Lname() {
        return f_Lname;
    }

    public void setF_Lname(String f_Lname) {
        this.f_Lname = f_Lname;
    }

    public String getF_Fname() {
        return f_Fname;
    }

    public void setF_Fname(String f_Fname) {
        this.f_Fname = f_Fname;
    }

    public double getF_Salary() {
        return f_Salary;
    }

    public void setF_Salary(double f_Salary) {
        this.f_Salary = f_Salary;
    }

    public double getF_bonus() {
        return f_bonus;
    }

    public void setF_bonus(double f_bonus) {
        this.f_bonus = f_bonus;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "f_id=" + f_id +
                ", f_Lname='" + f_Lname + '\'' +
                ", f_Fname='" + f_Fname + '\'' +
                ", f_Salary=" + f_Salary +
                ", f_bonus=" + f_bonus +
                '}';
    }

    public double calculate_Bonus()
    {
        return  f_Salary*f_bonus/100;
    }
}
