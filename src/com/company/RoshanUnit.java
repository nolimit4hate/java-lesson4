package com.company;

public class RoshanUnit extends SuperUnit
{

    private String whatRoshanSayAfterDeath;

//  Constructor
//  RoshanUnit obj always named as ROSHAN
//  RoshanUnit obj always have UnitType as ROSHAN

    RoshanUnit(String whatRoshanSayAfterDeath)
    {
        super("ROSHAN", UnitType.ROSHAN);
        this.whatRoshanSayAfterDeath = whatRoshanSayAfterDeath;
    }
    RoshanUnit()
    {
        this("ARRR");
    }

//  all data about RoshanUnit obj to string
//
    @Override
    public String toStringUnit()
    {
        return (super.toStringUnit() + "|After death say: " + this.whatRoshanSayAfterDeath);
    }
}
