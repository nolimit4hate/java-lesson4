package com.company;

public abstract class HeroUnit extends SuperUnit
{

// adding field spellName;
    protected SpellName spellName;

// constructor
    HeroUnit(String nameHeroUnit)
    {
        super(nameHeroUnit, UnitType.HERO);
        spellName = null;
    }
    HeroUnit()
    {
        this("DefaultHero");
    }

// get Spell Name of hero in SpellName type

    protected SpellName getSpellName()
    {
        return this.spellName;
    }

// abstract method that give HeroUnit type obj spell
    abstract void setHeroSpell();
}

