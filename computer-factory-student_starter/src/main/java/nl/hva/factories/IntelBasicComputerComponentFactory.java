package nl.hva.factories;

import nl.hva.components.*;
import nl.hva.computers.Computer;

public class IntelBasicComputerComponentFactory implements ComputerComponentFactory {

    private final ComputerCase computerCase;
    private final PowerSupply powerSupply;
    private final Processor processor;
    private final MotherBoard motherBoard;
    private final Memory[] memory;
    private final GraphicsCard graphicsCard;
    private final Storage[] storage;
    private IntelBasicComputerComponentFactory(Builder builder) {
        this.computerCase = builder.computerCase != null ? builder.computerCase : new BasicComputerCase();
        this.powerSupply = builder.powerSupply != null ? builder.powerSupply : new BasicPowerSupply();
        this.processor = builder.processor != null ? builder.processor : new IntelProcessor();
        this.motherBoard = builder.motherBoard != null ? builder.motherBoard : new IntelMotherBoard();
        this.memory = builder.memory != null ? builder.memory : new Memory[]{new FourGBRam()};
        this.graphicsCard = builder.graphicsCard;
        this.storage = builder.storage != null ? builder.storage : new Storage[]{new HardDrive()};
    }
    @Override
    public ComputerCase selectCase() {
        return new BasicComputerCase();
    }

    @Override
    public PowerSupply selectPowerSupply() {
        return new BasicPowerSupply();
    }

    @Override
    public Processor selectProcessor() {
        return new IntelProcessor();
    }

    @Override
    public MotherBoard selectMotherBoard() {
        return new IntelMotherBoard();
    }

    @Override
    public Memory[] selectMemory() {
        return new Memory[]{new FourGBRam()};
    }

    @Override
    public GraphicsCard selectGraphicsCard() {
        return null;
    }

    @Override
    public Storage[] selectStorage(StorageType... type) {
        return new Storage[]{new HardDrive()};
    }

    public static class Builder {
        private ComputerCase computerCase;
        private PowerSupply powerSupply;
        private Processor processor;
        private MotherBoard motherBoard;
        private Memory[] memory;
        private GraphicsCard graphicsCard;
        private Storage[] storage;

        public Builder setComputerCase(ComputerCase computerCase) {
            this.computerCase = computerCase;
            return this;
        }

        public Builder setPowerSupply(PowerSupply powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder setProcessor(Processor processor) {
            this.processor = processor;
            return this;
        }

        public Builder setMotherBoard(MotherBoard motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public Builder setMemory(Memory... memory) {
            this.memory = memory;
            return this;
        }

        public Builder setGraphicsCard(GraphicsCard graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setStorage(Storage... storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new ();
        }
    }
}
