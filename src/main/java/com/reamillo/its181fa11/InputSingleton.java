package com.reamillo.its181fa11;

public class InputSingleton {

    private static final InputSingleton instance = new InputSingleton();

    private String userName;
    private String userRole;
    private int userDep;
    private int userHours;
    private int gross;
    private double fee;
    private double ssd;
    private double tax;
    private double totDed;
    private double netPay;

    private InputSingleton(){}

    public static InputSingleton getInstance() {
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public int getUserDep() {
        return userDep;
    }

    public int getUserHours() {
        return userHours;
    }

    public int getGross() {
        return gross;
    }

    public void setName(String userName) {
        this.userName = userName;

    }

    public void setHours(int userHours) {
        this.userHours = userHours;

    }

    public void setRole(String userRole) {
        this.userRole = userRole;
    }

    public void setDependent(int userDep) {
        this.userDep = userDep;
    }

    public void setGross(int userHours) {
        this.gross = 1000 * userHours ;
    }

    public void setFee(int gross) {
        this.fee =  gross * 0.15;
    }

    public double getFee() {
        return fee;
    }

    public void setSSD(int gross) {
        this.ssd = gross * 0.0785;
    }

    public double getSSD() {
        return ssd;
    }

    public void setTax(int gross, int userDep) {
        this.tax = (gross - (gross * 0.05 * userDep)) * 0.15;
    }

    public double getTax() {
        return tax;
    }

    public void setTotDed(double fee, double ssd, double tax) {
        this.totDed = fee + ssd + tax;
    }

    public double getTotDed() {
        return totDed;
    }

    public void setNetPay(int gross, double totDed) {
        this.netPay = gross - totDed;
    }

    public double getNetPay() {
        return netPay;
    }

}
