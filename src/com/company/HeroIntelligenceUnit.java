package com.company;

public class HeroIntelligenceUnit extends HeroUnit
{
    private int heroIntelligence;


        //  Constructor
    HeroIntelligenceUnit(String nameHeroIntelligenceUnit)
    {
        super(nameHeroIntelligenceUnit);
        this.heroIntelligence = (int)(Math.random()*70) +1;
        setHeroSpell();
    }
    HeroIntelligenceUnit()
    {
        this("DefaultHeroStrength");
    }

    //  setter - give hero spell
    @Override
    public void setHeroSpell()
    {
        this.spellName = SpellName.LANDMINE;
    }

    @Override
    public String toStringUnit()
    {
        return super.toStringUnit() + "|Intelligence is " + this.heroIntelligence + "|Spell is " + this.getSpellName();
    }

}
