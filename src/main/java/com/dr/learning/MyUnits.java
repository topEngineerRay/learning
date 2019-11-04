/*package com.sap.ngom.learning;

import java.awt.FlowLayout;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.measure.quantity.Area;
import javax.measure.quantity.DataRate;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.SystemOfUnits;
import javax.measure.unit.Unit;

public class MyUnits extends SystemOfUnits {
    private static HashSet<Unit<?>> UNITS = new HashSet();

    private static final MyUnits INSTANCE = new MyUnits();

    public static final Unit<Area> ACRE = myUnits((SI.METER.pow(2)).times(4046.8564224).asType(Area.class));
    //ACRE means 英亩 ,here 1 ACRE = [m²*4046.8564224]
    public static final Unit<Area> ACRE1 = myUnits((SI.CENTIMETER.pow(2)).asType(Area.class));
    public static final Unit<Area> ACRE2 = myUnits((SI.METER.pow(2)).times(1000).asType(Area.class));
    public static final Unit<DataRate> FLOW = myUnits((SI.BIT.times(1024*1024*1024)).divide(SI.SECOND.times(3600)).asType(DataRate.class));

    public static MyUnits getInstance() {
        return INSTANCE;
    }

    @Override
    public Set<Unit<?>> getUnits() {
        return Collections.unmodifiableSet(UNITS);
    }

    private static <U extends Unit<?>> U myUnits(U unit) {
        UNITS.add(unit);
        return unit;
    }
}*/