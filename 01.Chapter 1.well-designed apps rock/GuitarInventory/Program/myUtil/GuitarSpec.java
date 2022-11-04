package myUtil;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood, topWood;

    public GuitarSpec() {}

    public GuitarSpec(Builder builder, String model, Type type, 
                      int numStrings, Wood backwWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backwWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return this.builder;
    }

    public String getModel() {
        return this.model;
    }

    public Type getType() {
        return this.type;
    }

    public int getNumStrings() {
        return this.numStrings;
    }

    public Wood getBackWood() {
        return this.backWood;
    }

    public Wood getTopWood() {
        return this.topWood;
    }


    public boolean matches(GuitarSpec matchingSpec) {

        if (!this.getBuilder().equals(matchingSpec.getBuilder()))
            return false;

        if (!this.getModel().toLowerCase().equals(matchingSpec.getModel().toLowerCase()))
            return false;
        
        if (!this.getType().equals(matchingSpec.getType()))
            return false;
        
        if (this.getNumStrings() != matchingSpec.getNumStrings())
            return false;
        
        if (!this.getBackWood().equals(matchingSpec.getBackWood()))
            return false;
        
        if (!this.getTopWood().equals(matchingSpec.getTopWood()))
            return false;

        return true;
    }
}
