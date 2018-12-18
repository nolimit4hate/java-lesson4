package com.company;

public class DefaultSpellCaster implements Caster {

    @Override
    public String castSpell(HeroUnit heroUnit) {
        return ("Casting spell " + heroUnit.getSpellName());
    }

    /**
     * change unit mana points who cast spell
     * change hit points and status of unit on whom been spell casted
     * @param heroUnit obj of HeroUnit class
     * @param creepUnit obj of CreepUnit  class
     */

    @Override
    public void spellCastChangeUnit(HeroUnit heroUnit, CreepUnit creepUnit)
    {
        switch (heroUnit.getSpellName()){
            case FIREFLY:{
                changeHPSpell(creepUnit, 100);
                changeManaSpell(heroUnit, 150);
                changeStatus(creepUnit, UnitStatus.BASHED);
                break;
            }
            case LANDMINE:{
                changeHPSpell(creepUnit, 200);
                changeManaSpell(heroUnit, 100);
                changeStatus(creepUnit, UnitStatus.SILENCED);
                break;
            }
            case BLINK:{
                changeHPSpell(creepUnit, 25);
                changeManaSpell(heroUnit, 25);
                changeStatus(creepUnit, UnitStatus.SLOWED);
                break;
            }
        }
    }

    /**
     * change mana points of @param heroUnit by @param changeMana
     */

//    @Override
    private void changeManaSpell(HeroUnit heroUnit, int changeMana) {
        if(heroUnit.getUnitMana() < changeMana)
            System.out.println("Not enuf MANA");
        else
            heroUnit.setUnitMana(heroUnit.getUnitMana() - changeMana);
    }

    /**
     * change hit points of @param creepUnit by @param changeHP
     */

//    @Override
    private void changeHPSpell(CreepUnit creepUnit, int changeHP) {
        if (creepUnit.getUnitHP() <= 0)
            System.out.println("This target is DEAD");
        else
            if(creepUnit.getUnitHP() <= changeHP){
                creepUnit.setUnitHP(0);
                creepUnit.setUnitStatus(UnitStatus.DEAD);
                System.out.println("You killed " + creepUnit.getUnitName());}
            else {
                creepUnit.setUnitHP(creepUnit.getUnitHP() - changeHP);
                System.out.println("Deal damage " + changeHP +
                                    ", to " + creepUnit.getUnitName() +
                                    ", withHP=" + creepUnit.getUnitHP());
            }
    }

    /**
     * change switch status of @param creepUnit into @param newUnitStatus
     */

//    @Override
    private void changeStatus(CreepUnit creepUnit, UnitStatus newUnitStatus) {
        if (creepUnit.getUnitStatus() != UnitStatus.DEAD){
            creepUnit.setUnitStatus(newUnitStatus);
        }
    }
}
