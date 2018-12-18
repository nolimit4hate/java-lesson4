package com.company;

public abstract class HeroUnit extends BaseUnit {

    /**
     * @param spellName is a name of spell what have all object what extends HeroUnit class
     * spellName is ENUM.
     */
    private SpellName spellName;

    // constructor
    public HeroUnit(String nameHeroUnit) {
        super(nameHeroUnit, UnitType.HERO);
        spellName = null;
    }

    public HeroUnit() {
        this("DefaultHero");
    }

    public SpellName getSpellName() {
        return spellName;
    }

    public void setSpellName(SpellName spellName) {
        this.spellName = spellName;
    }

    @Override
    public String toStringZero() {
        return super.toStringZero() +
                ", spellName=" + this.spellName;
    }

    @Override
    public String toString() {
        return this.toStringZero() + '}';
    }

    /**
     * abstract method = all heroes must have a spell
     */
    abstract void setHeroSpell();
}

