/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.country;

/**
 *
 * @author PC
 */
public class Country {
    protected String countryCode;
    protected  String countryName;
    protected  float totalArea;

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }
    
    public Country(){
        this.countryCode="";
        this.countryName="";
        this.totalArea=0.0f;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setToatalArea(float toatalArea) {
        this.totalArea = toatalArea;
    }
public void display()    {
    System.out.println("ID: " +countryCode+ ", Name: " +countryName+ " , Area: "+totalArea);
}     
}
