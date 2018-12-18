package com.company;

public class HeroIntelligenceUnit extends HeroUnit {

    /**
     * Intelligence hero is one of the hero type
     *
     * @heroIntelligence improve some standard abilities(hero mana point, hero damage)
     */

    private int heroIntelligence;


    public HeroIntelligenceUnit(String nameHeroIntelligenceUnit, int heroIntelligence) {
        super(nameHeroIntelligenceUnit);
        this.heroIntelligence = heroIntelligence;

        /**
         * some random logic that improve hero ability by heroIntelligence
         * unit mana points improve by heroIntelligence * 3
         * unit damage improve by heroIntelligence / 10
         */
        this.setUnitMana(this.getUnitMana() + this.heroIntelligence * 3);
        this.setUnitDamage(this.getUnitDamage() + (int) (this.heroIntelligence / 10));
        setHeroSpell();
    }

    public HeroIntelligenceUnit(String nameHeroIntelligenceUnit) {
        // default hero intelligence is 50
        this(nameHeroIntelligenceUnit, 50);
    }

    HeroIntelligenceUnit() {
        this("DefaultHeroStrength");
    }

    public int getHeroIntelligence() {
        return heroIntelligence;
    }

    public void setHeroIntelligence(int heroIntelligence) {
        this.heroIntelligence = heroIntelligence;
    }

    @Override
    public void setHeroSpell() {
        this.setSpellName(SpellName.LANDMINE);
    }

    @Override
    public String toString() {
        return super.toStringZero()
                + "|Intelligence is " + this.heroIntelligence +
                '}';
    }

}
