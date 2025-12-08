package com.beta.converter.service;

import com.beta.converter.util.LengthsUnits;

public class ConverterService {

    private double toM(LengthsUnits lu, double number){
        return switch (lu){
            case KM -> number * 1000;
            case M -> number;
            case DM -> number * 0.1;
            case SM -> number * 0.01;
            case MM -> number * 0.001;
            case MKM -> number * 1e-6;
            case NM -> number * 1e-9;
            case VERSHOK -> number * 0.04445;
            case PYAD -> number * 0.1778;
            case MALAYA_PYAD -> number * 0.1524;
            case BOLSHAYA_PYAD -> number * 0.2286;
            case LOKOT -> number * 0.4572;
            case ARSHIN -> number * 0.7112;
            case MAHOVAYA_SAJEN -> number * 1.76;
            case KOSAYA_SAJEN -> number * 2.48;
            case KAZENNAYA_SAJEN -> number * 2.1336;
            case VERSTA -> number * 1066.8;
            case MEJEVAYA_VERSTA -> number * 2133.6;
            case INCH -> number * 0.0254;
            case FOOT -> number * 0.3048;
            case YARD -> number * 0.9144;
            case NAUTICAL_MILE -> number * 1852.0;
            case MILE -> number * 1609.344;
            case LI -> number * 500.0;
            case CHI -> number * 0.33;
            case CAN -> number * 1.818;
            case CYAKU -> number * 0.303;
            case ALN -> number * 0.594;
            case FATHOM -> number * 1.8288;
            case HAND -> number * 0.1016;
            case ZOLL -> number * 0.025;
            case PALMO -> number * 0.22;
            case STADIY -> number * 177.0;
            case WA -> number * 2.0;
            case ZHANG -> number * 3.33;
            case ROD -> number * 5.0292;
            case CHAIN -> number * 20.1168;
            case FURLONG -> number * 201.168;
            case LEAGUE -> number * 4828.0;
            case LINK -> number * 0.201168;
        };
        }
        public double convert (LengthsUnits lu, LengthsUnits lout, double number){
            return toM(lu, number)/toM(lout, 1);
        }

}
