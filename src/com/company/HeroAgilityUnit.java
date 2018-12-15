package com.company;

public class HeroAgilityUnit extends HeroUnit
{
    private int heroAgility;

// constructor

    HeroAgilityUnit(String nameHeroAgilityUnit)
    {
        super(nameHeroAgilityUnit);
        this.heroAgility = (int)(Math.random()*50) +1;
        setHeroSpell();
    }
    HeroAgilityUnit()
    {
        this("DefaultHeroAgillity");
    }


    @Override
    public void setHeroSpell()
    {
        this.spellName = SpellName.FIREFLY;
    }

    @Override
    public String toStringUnit()
    {
        return super.toStringUnit() + "|Agility is " + this.heroAgility + "|Spell is " + this.getSpellName();
    }
}
