package com.company;

public class DefaultSpellCaster implements Caster {

    @Override
    public String castSpell(HeroUnit heroUnit) {
        return ("Casting spell " + heroUnit.getSpellName());
    }

    public void printSpell(HeroUnit heroUnit) {
        System.out.println(castSpell(heroUnit));
        System.out.println();
    }

    @Override
    public int changeManaSpell(HeroUnit heroUnit) {
        return 0;
    }

    @Override
    public int changeHPSpell(BaseUnit baseUnit) {
        return 0;
    }

    @Override
    public int changeStatus(CreepUnit creepUnit) {
        return 0;
    }
}
