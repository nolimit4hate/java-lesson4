package com.company;

public class CreepUnit extends BaseUnit {
    /**
     * @param goldGainForKill how much gold you gain after kill creep
     */
    private int goldGainForKill;
    private UnitStatus unitStatus;

    public CreepUnit(String creepName) {
        super(creepName, UnitType.CREEP);
        this.goldGainForKill = (int) (super.getUNIT_MAGIC_NUMBER() / 2);
        this.unitStatus = UnitStatus.NORMAL;
    }

    public CreepUnit() {
        this("DefaltCreep");
    }

    public int getGoldGainForKill() {
        return goldGainForKill;
    }

    public void setGoldGainForKill(int goldGainForKill) {
        this.goldGainForKill = goldGainForKill;
    }

    public UnitStatus getUnitStatus() {
        return unitStatus;
    }

    public void setUnitStatus(UnitStatus unitStatus) {
        this.unitStatus = unitStatus;
    }

    /**
     * @return all information about fields CreepUnit object in string
     * I deleted last char '}' from string returned by super.toString()
     */

    @Override
    public String toString() {
        return super.toStringZero() +
                ", getGoldGainForKill=" + this.getGoldGainForKill() +
                ", unitStatus=" + this.getUnitStatus() +
                '}';
    }

}
