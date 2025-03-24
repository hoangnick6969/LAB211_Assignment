/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.country;

/**
 *
 * @author PC
 */
public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String terrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain=terrain;
    }

    public EastAsiaCountries() {
    }

  
    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    public void display(){
        super.display();
        System.out.println("Terrain "+countryTerrain);
    }
}
