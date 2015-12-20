package idlReader.parts;

/**
 * Created by andrew on 12/19/15.
 */
public abstract class IDLMember {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String moduleName;
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }


    private int lowerBounds;
    public int getLowerBounds() {
        return lowerBounds;
    }
    public void setLowerBounds(int lowerBounds) {
        this.lowerBounds = lowerBounds;
    }


    private int upperBound;
    public int getUpperBound() {
        return upperBound;
    }
    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }


    public IDLMember(){
        name = "";
        moduleName = "";
        lowerBounds = -1;
        upperBound = -1;
    }

    public IDLMember(String ModuleName, String Name){
        this.name = Name;
        this.moduleName = ModuleName;
    }

    public IDLMember(String ModuleName, String Name, int Lower, int Upper){
        this(ModuleName, Name);
        this.lowerBounds = Lower;
        this.upperBound = Upper;
    }

}
