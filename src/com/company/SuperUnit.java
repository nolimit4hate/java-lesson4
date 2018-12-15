package com.company;

public class SuperUnit
{
    private String unitName;
    private UnitType unitType;
    private int unitHP;
    private int unitMana;
    private int unitSpeed;
    private int unitDamage;

//  block of initialization
//
    {
        unitHP = 500 + (int)(Math.random()*200);
        unitMana = 200 + (int)(Math.random()*100);
        unitSpeed = 300 + (int)(Math.random()*30);
        unitDamage = 50 + (int)(Math.random()*20);
    }

//  constructor
//
    SuperUnit(String unitName, UnitType unitType)
    {
        this.unitName = unitName;
        this.unitType = unitType;
    }

//  method toString return data of SuperUnit object in String format
//
    public String toStringUnit()
    {
        return ("UnitName is " + this.unitName + "|UnitType is " + this.unitType +
                "|UnitHP is " + this.unitHP + "|UnitMP is " + this.unitMana +
                "|UnitSpeed is " + this.unitSpeed + "|UnitDamage is " + this.unitDamage);
    }
//  output data to screen
//
    public void printUnit()
    {
        System.out.println(this.toStringUnit());
        System.out.println("");
    }

}
