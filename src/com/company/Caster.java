package com.company;

public interface Caster {
    String castSpell(HeroUnit heroUnit);
    void spellCastChangeUnit(HeroUnit heroUnit, CreepUnit creepUnit);

//    void changeManaSpell(HeroUnit heroUnit, int value);
//    void changeHPSpell(CreepUnit creepUnit, int value);
//    void changeStatus(CreepUnit creepUnit, UnitStatus unitStatus);
}
