package nl.hva.shops;

import nl.hva.components.GamingComputerCase;
import nl.hva.components.IntelFastProcessor;
import nl.hva.components.SSD;
import nl.hva.computers.Computer;
import nl.hva.computers.ComputerTypes;
import nl.hva.factories.IntelBasicComputerComponentFactory;

public class IntelComputerShop extends ComputerShop {

    @Override
    protected Computer buildComputer(String computerType) {
        if(computerType.equals(ComputerTypes.GAMING_COMPUTER)) {
            return
            );
        } else if(computerType.equals(ComputerTypes.BASIC_COMPUTER)) {
            return new IntelBasicComputerComponentFactory.Builder().build();
            );
        } else {
            return null;
        }
    }

    private class GamingComputer extends Computer {
        public GamingComputer(IntelFastProcessor intelFastProcessor, SSD ssd, GamingComputerCase gamingComputerCase) {
            super();
        }

        @Override
        public void prepare() {

        }
    }
}
