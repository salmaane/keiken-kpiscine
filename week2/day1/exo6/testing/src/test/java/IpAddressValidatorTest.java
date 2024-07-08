import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IpAddressValidatorTest {

    @ParameterizedTest
    @CsvSource({
            "1.1.1.1, true",
            "192.168.1.1, true",
            "10.0.0.1, true",
            "127.0.0.1, true",
            "0.0.0.0, false",
            "255.255.255.255, false",
            "1.1.1.0, false",
            "10.0.1, false"
    })
    void validateIpv4Address(String ip, Boolean valid) {
        var ipValidator = new IpAddressValidator();

        assertEquals(valid, ipValidator.validateIpv4Address(ip));
    }

}