package com.beta.converter.dto;

import com.beta.converter.util.LengthsUnits;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lengths {

    private double number;

    private LengthsUnits inUnits;

    private LengthsUnits outUnits;

}
