package nl.hva.factories;

import nl.hva.components.*;

public class IntelBasicComputerComponentFactory implements ComputerComponentFactory {
    @Override
    public ComputerCase selectCase() {
        return null;
    }

    @Override
    public PowerSupply selectPowerSupply() {
        return null;
    }

    @Override
    public Processor selectProcessor() {
        return null;
    }

    @Override
    public MotherBoard selectMotherBoard() {
        return null;
    }

    @Override
    public Memory[] selectMemory() {
        return new Memory[0];
    }

    @Override
    public GraphicsCard selectGraphicsCard() {
        return null;
    }

    @Override
    public Storage[] selectStorage(StorageType... type) {
        return new Storage[0];
    }

    public static class IntelBasicComputerComponentFactoryBuilder {
        public IntelBasicComputerComponentFactory build() {
            return new IntelBasicComputerComponentFactory();
        }
    }
}
