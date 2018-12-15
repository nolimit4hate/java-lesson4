package com.company;

public class HeroStrengthUnit extends HeroUnit
{
    private int heroStrength;

//  Constructor
    HeroStrengthUnit(String nameHeroStrengthUnit)
    {
        super(nameHeroStrengthUnit);
        this.heroStrength = (int)(Math.random()*70) +1;
        setHeroSpell();
    }
    HeroStrengthUnit()
    {
        this("DefaultHeroStrength");
    }

//  setter - give hero spell
    @Override
    public void setHeroSpell()
    {
        this.spellName = SpellName.BLINK;
    }

    @Override
    public String toStringUnit()
    {
        return super.toStringUnit() + "|Strength is " + this.heroStrength + "|Spell is " + this.getSpellName();
    }
}
