package com.dr.learning;

import javax.measure.Unit;
import javax.measure.format.UnitFormat;
import javax.measure.quantity.Volume;
import javax.measure.spi.ServiceProvider;

public class UnitTest {
    public static void main(String[] args) {
       // NonSI.getInstance().getUnits();//return the collection of NonSI Units
       // SI.getInstance().getUnits();//return the collection of SI Units
       
       
        //techUnits();   
        //SI;
        int  a = ServiceProvider.available().size();
        System.out.println(a);
        //formatAVolumeUnit();
        //Units.getInstance().getUnits();
        /*ServiceProvider provider = ServiceProvider.current();
        QuantityFactory<Length> lengthFactory = provider.getQuantityFactory(Length.class);
        Quantity<Length> first = lengthFactory.create(5, Units.METRE.divide(100.0));
        Quantity<Length> second = lengthFactory.create(3, Units.METRE);
        System.out.println(second.add(first));*/
        
  /*      SystemOfUnitsService service =  ServiceProvider.current().getSystemOfUnitsService(); 
        SystemOfUnits system = service.getSystemOfUnits();
        system.getUnits();
        System.out.println(system.getUnits().size());*/
        //tecunits();
        //jscience();
        //printAllSI();
        //printAllNonSI();
    }
  /* private static void jscience(){
        String string  = MyUnits.getInstance().getUnits().toString();
        System.out.println(SI.getInstance().getUnits());
        System.out.println(NonSI.getInstance().getUnits());
        System.out.println(string);
    }*/
   /* private static void  techUnits() {
        //ServiceProvider.current().getSystemOfUnitsService().getAvailableSystemsOfUnits();
         SystemOfUnitsService service = ServiceProvider.current().getSystemOfUnitsService();
         System.out.println(ServiceProvider.available().toString());
    }

   /* private static void tecunits() {
        ServiceProvider provider = ServiceProvider.current();
        QuantityFactory<Length> lengthFactory = provider.getQuantityFactory(Length.class);
        Quantity<Length> first = lengthFactory.create(5, Units.METRE.divide(100.0));
        Quantity<Length> second = lengthFactory.create(3, Units.METRE);
        System.out.println(second.add(first));
    }*/
    
   /* private  static void printAllSI(){
        for (javax.measure.unit.Unit<?> unit: javax.measure.unit.SI.getInstance().getUnits())
            System.out.println(UnitFormat.getInstance().format(unit));
            //System.out.println(unit);
    }
    private  static void printAllNonSI(){
        for (javax.measure.unit.Unit<?> unit: javax.measure.unit.NonSI.getInstance().getUnits())
            System.out.println(UnitFormat.getInstance().format(unit));
    }*/
   /*  
     private static void formatAVolumeUnit(){

         final UnitFormat unitFormat =    ServiceProvider.current().getUnitFormatService().getUnitFormat();

         final Unit<Volume> MILLILITRE = MILLI(LITRE);
         final Unit<Volume> CENTILITRE = CENTI(LITRE);
         final Unit<Volume> DECILITRE = DECI(LITRE);

         final String mL = unitFormat.format(MILLILITRE);
         final String cL = unitFormat.format(CENTILITRE);
         final String dL = unitFormat.format(DECILITRE);

         System.out.println(mL);
         System.out.println(cL);
         System.out.println(dL);
     }*/
}
