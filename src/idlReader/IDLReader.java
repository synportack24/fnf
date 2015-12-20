package idlReader;

import antlr.collections.AST;
import org.apache.axis2.corba.exceptions.IDLProcessorException;
import org.apache.axis2.corba.idl.parser.IDLLexer;
import org.apache.axis2.corba.idl.parser.IDLParser;
import org.apache.axis2.corba.idl.parser.IDLVisitor;
import org.apache.axis2.corba.idl.types.IDL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;


import org.apache.axis2.corba.idl.*;

public class IDLReader {

    private final static Logger log = LogManager.getLogger(IDLReader.class);

    @Deprecated
    public IDLReader(String path){

    }

    private InputStream stream;
    public IDLReader(FileReader path){
        try {
            stream = new FileInputStream("Herp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    private IDL Process() throws IDLProcessorException {
        IDL idl = null;
        try {
            IDLParser parser = new IDLParser(new IDLLexer(stream));
            parser.specification();
            AST idlTree = parser.getAST();

            IDLVisitor visitor = new IDLVisitor();
            visitor.visit(idlTree);
            idl = visitor.getIDL();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IDLProcessorException(e.getMessage());
        }
        return idl;
    }

    private void Parse(String idlText) {
        idlText = idlText.trim();
//        String[] idlText.split(" ");
    }



}
