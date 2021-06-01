package dio.com.cidadesbrasil.services.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RaioDaTerraEnum {
    METERS("m", 6378168),
    KILOMETERS("km", 6378.168f),
    MILES("mi", 3958.747716f);

    private final String unit;
    private final float value;
}
