package idlReader.parts;

import java.util.List;

/**
 * Created by andrew on 12/19/15.
 */
public class IDLModule {

    private List<IDLStruct> structs;
    public List<IDLStruct> getStructs() {
        return structs;
    }
    public void setStructs(List<IDLStruct> structs) {
        this.structs = structs;
    }

}
