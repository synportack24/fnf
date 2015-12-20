package idlReader.parts;

/**
 * Created by andrew on 12/19/15.
 */
public class IDLClassMember extends IDLMember {

    private IDLMember classMember;
    public IDLMember getClassMember() {
        return classMember;
    }
    public void setClassMember(IDLMember classMember) {
        this.classMember = classMember;
    }

    public IDLClassMember(String ModuleName, String Name, int Lower, int Upper) {
        super(ModuleName, Name, Lower, Upper);
        classMember = null;
    }

}
