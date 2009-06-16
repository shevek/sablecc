/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.LinkedList;
import java.util.List;

public class MMacroC {

    private final MFile mFile;

    private final List<Object> eParamParam_AncestorParam = new LinkedList<Object>();

    private final List<Object> eParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit = new LinkedList<Object>();

    private final List<Object> eExpandDestructor = new LinkedList<Object>();

    private final List<Object> eMacroCreator = new LinkedList<Object>();

    private final List<Object> eParam = new LinkedList<Object>();

    private final List<Object> eParamRef = new LinkedList<Object>();

    private final List<Object> eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart = new LinkedList<Object>();

    MMacroC(
            MFile mFile) {

        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    public MParamParam newParamParam(
            String pPname) {

        MParamParam lParamParam = new MParamParam(pPname);
        this.eParamParam_AncestorParam.add(lParamParam);
        return lParamParam;
    }

    public MAncestorParam newAncestorParam(
            String pPname) {

        MAncestorParam lAncestorParam = new MAncestorParam(pPname);
        this.eParamParam_AncestorParam.add(lAncestorParam);
        return lAncestorParam;
    }

    public MParamConstructorInit newParamConstructorInit(
            String pPname) {

        MParamConstructorInit lParamConstructorInit = new MParamConstructorInit(
                pPname, this.mFile);
        this.eParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit
                .add(lParamConstructorInit);
        return lParamConstructorInit;
    }

    public MSelfRefC newSelfRefC() {

        MSelfRefC lSelfRefC = new MSelfRefC(this.mFile);
        this.eParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit
                .add(lSelfRefC);
        return lSelfRefC;
    }

    public MAncestorConstructorInit newAncestorConstructorInit(
            String pPname) {

        MAncestorConstructorInit lAncestorConstructorInit = new MAncestorConstructorInit(
                pPname, this.mFile);
        this.eParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit
                .add(lAncestorConstructorInit);
        return lAncestorConstructorInit;
    }

    public MExpandConstructorInit newExpandConstructorInit(
            String pPname) {

        MExpandConstructorInit lExpandConstructorInit = new MExpandConstructorInit(
                pPname, this.mFile);
        this.eParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit
                .add(lExpandConstructorInit);
        return lExpandConstructorInit;
    }

    public MExpandDestructor newExpandDestructor(
            String pPname) {

        MExpandDestructor lExpandDestructor = new MExpandDestructor(pPname,
                this.mFile);
        this.eExpandDestructor.add(lExpandDestructor);
        return lExpandDestructor;
    }

    public MMacroCreator newMacroCreator(
            String pPname) {

        MMacroCreator lMacroCreator = new MMacroCreator(pPname, this.mFile);
        this.eMacroCreator.add(lMacroCreator);
        return lMacroCreator;
    }

    public MParam newParam(
            String pPname) {

        MParam lParam = new MParam(pPname, this.mFile);
        this.eParam.add(lParam);
        return lParam;
    }

    public MParamRef newParamRef(
            String pPname,
            String pContext) {

        MParamRef lParamRef = new MParamRef(pPname, pContext, this.mFile);
        this.eParamRef.add(lParamRef);
        return lParamRef;
    }

    public MStringPart newStringPart(
            String pString) {

        MStringPart lStringPart = new MStringPart(pString);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lStringPart);
        return lStringPart;
    }

    public MEolPart newEolPart() {

        MEolPart lEolPart = new MEolPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lEolPart);
        return lEolPart;
    }

    public MParamInsertPart newParamInsertPart(
            String pPname) {

        MParamInsertPart lParamInsertPart = new MParamInsertPart(pPname,
                this.mFile);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lParamInsertPart);
        return lParamInsertPart;
    }

    public MTextInsertPart newTextInsertPart() {

        MTextInsertPart lTextInsertPart = new MTextInsertPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lTextInsertPart);
        return lTextInsertPart;
    }

    public MExpandInsertPart newExpandInsertPart(
            String pPname) {

        MExpandInsertPart lExpandInsertPart = new MExpandInsertPart(pPname,
                this.mFile);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lExpandInsertPart);
        return lExpandInsertPart;
    }

    private String rName() {

        return this.mFile.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("#include \"M");
        sb.append(rName());
        sb.append(".h\"");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("M");
        sb.append(rName());
        sb.append("* M");
        sb.append(rName());
        sb.append("_init(");
        {
            boolean first = true;
            for (Object oParamParam_AncestorParam : this.eParamParam_AncestorParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamParam_AncestorParam.toString());
            }
        }
        sb.append(") {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  M");
        sb.append(rName());
        sb.append("* m");
        sb.append(rName());
        sb.append(" = (M");
        sb.append(rName());
        sb.append("*)malloc(sizeof(M");
        sb.append(rName());
        sb.append("));");
        sb.append(System.getProperty("line.separator"));
        sb.append("  m");
        sb.append(rName());
        sb.append("->toString = &M");
        sb.append(rName());
        sb.append("_toString;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  m");
        sb.append(rName());
        sb.append("->free = &M");
        sb.append(rName());
        sb.append("_free;");
        sb.append(System.getProperty("line.separator"));
        for (Object oParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit : this.eParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit) {
            sb
                    .append(oParamConstructorInit_SelfRefC_AncestorConstructorInit_ExpandConstructorInit
                            .toString());
        }
        sb.append("  return m");
        sb.append(rName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("void M");
        sb.append(rName());
        sb.append("_free(M");
        sb.append(rName());
        sb.append("* m");
        sb.append(rName());
        sb.append(") {");
        sb.append(System.getProperty("line.separator"));
        for (Object oExpandDestructor : this.eExpandDestructor) {
            sb.append(oExpandDestructor.toString());
        }
        sb.append("  free(m");
        sb.append(rName());
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        if (this.eMacroCreator.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oMacroCreator : this.eMacroCreator) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oMacroCreator.toString());
            }
        }
        if (this.eParam.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParam : this.eParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParam.toString());
            }
        }
        if (this.eParamRef.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParamRef : this.eParamRef) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParamRef.toString());
            }
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("//@Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("char* M");
        sb.append(rName());
        sb.append("_toString(M");
        sb.append(rName());
        sb.append("* m");
        sb.append(rName());
        sb.append(") {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  int size = 1;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  MList* lsb = MList_init();");
        sb.append(System.getProperty("line.separator"));
        for (Object oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart : this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart) {
            sb
                    .append(oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                            .toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("  char* sb = (char*)calloc(size, sizeof(char));");
        sb.append(System.getProperty("line.separator"));
        sb.append("  MNode* temp = lsb->_first_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  while(temp != NULL) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    strcat(sb, temp->_elem_);");
        sb.append(System.getProperty("line.separator"));
        sb.append("    temp = temp->_next_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  MList_free(lsb);");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  return sb;");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}