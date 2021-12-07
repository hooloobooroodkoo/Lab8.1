package ATM;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @Test
    void atm() {
        ATM  atm = new ATM();
        assertEquals("class ATM.Tray20", atm.getFirstTray().getClass().toString());
    }
}