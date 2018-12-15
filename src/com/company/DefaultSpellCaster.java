package com.company;

public class DefaultSpellCaster implements Caster
{

    public String castSpell(HeroUnit heroUnit)
    {
        return ("Casting spell " + heroUnit.spellName);
    }

    public void printSpell(HeroUnit heroUnit)
    {
        System.out.println(castSpell(heroUnit));
        System.out.println();
    }
}
