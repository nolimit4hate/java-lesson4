package com.company;

public class CreepUnit extends SuperUnit
{
    private int goldGainForKill;

//  constructor
//  CreepUnit obj have always UnitType as CREEP

    CreepUnit(String creepName)
    {
        super(creepName, UnitType.CREEP);
        goldGainForKill = 40 + (int)(Math.random()*10);
    }
    CreepUnit()
    {
        this("DefaltCreep");
    }

//  all data about CreepUnit obj to string


    @Override
    public String toStringUnit()
    {
        return (super.toStringUnit() + "|Gain gold: " + this.goldGainForKill);
    }

}
