package idlReader.parts;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 12/19/15.
 */
public class IDLStruct {

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

    private List<IDLMember> members;
    public List<IDLMember> getMembers() {
        return members;
    }
    public void setMembers(List<IDLMember> members) {
        this.members = members;
    }


    public IDLStruct(String Name, String ModuleName){
        this.name = Name;
        this.moduleName = ModuleName;
        members = new ArrayList<>();
    }


}
