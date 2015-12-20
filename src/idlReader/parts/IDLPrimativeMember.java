package idlReader.parts;


public class IDLPrimativeMember extends IDLMember {

    public enum IDLTypes {
        BOOLEAN,
        CHAR,
        WCHAR,
        OCTET,
        STING,
        WSTRING,
        SHORT,
        USHORT,
        LONG,
        ULONG,
        FLOAT,
        DOUBLE,
        FIXED,
        ENUM,
        STRING
    }

    private IDLTypes idlType;
    public IDLTypes getIdlType() {
        return idlType;
    }
    public void setIdlType(IDLTypes idlType) {
        this.idlType = idlType;
    }


    public IDLPrimativeMember(String ModuleName, String Name, IDLTypes type) {
        super(ModuleName, Name);
        this.idlType = type;
    }

    public IDLPrimativeMember(String ModuleName, String Name, int Lower, int Upper, IDLTypes type){
        super(ModuleName, Name, Lower, Upper);
        this.idlType = type;
    }


}
