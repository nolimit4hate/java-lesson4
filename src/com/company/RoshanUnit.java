package com.company;

public class RoshanUnit extends BaseUnit {

    RoshanUnit() {
        super("ROSHAN", UnitType.ROSHAN, 600);
        /**
         *  Default unit speed(which depends on UNIT_MAGIC_NUMBER) of ROSHAN is too high, so I fixed it.
         */
        super.setUnitSpeed((int) (super.getUNIT_MAGIC_NUMBER() / 2));
    }
}
