/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.scala.macro;

import java.util.LinkedList;
import java.util.List;

public class MMacroCreator {

    private final String pName;

    private final MMacroCreator mMacroCreator = this;

    private final List<Object> eParamParam = new LinkedList<Object>();

    private final List<Object> eParamArg_AncestorArg = new LinkedList<Object>();

    private final List<Object> eAddToExpand = new LinkedList<Object>();

    public MMacroCreator(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    public MAddToExpand newAddToExpand(
            String pSignature) {

        MAddToExpand lAddToExpand = new MAddToExpand(pSignature,
                this.mMacroCreator);
        this.eAddToExpand.add(lAddToExpand);
        return lAddToExpand;
    }

    public MParamParam newParamParam(
            String pName) {

        MParamParam lParamParam = new MParamParam(pName);
        this.eParamParam.add(lParamParam);
        return lParamParam;
    }

    public MParamArg newParamArg(
            String pName) {

        MParamArg lParamArg = new MParamArg(pName);
        this.eParamArg_AncestorArg.add(lParamArg);
        return lParamArg;
    }

    public MAncestorArg newAncestorArg(
            String pName) {

        MAncestorArg lAncestorArg = new MAncestorArg(pName);
        this.eParamArg_AncestorArg.add(lAncestorArg);
        return lAncestorArg;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mMacroCreator.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  def new");
        sb.append(rName());
        sb.append("(");
        {
            boolean first = true;
            for (Object oParamParam : this.eParamParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamParam.toString());
            }
        }
        sb.append("): M");
        sb.append(rName());
        sb.append(" = {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    var l");
        sb.append(rName());
        sb.append(" = new M");
        sb.append(rName());
        sb.append("(");
        {
            boolean first = true;
            for (Object oParamArg_AncestorArg : this.eParamArg_AncestorArg) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamArg_AncestorArg.toString());
            }
        }
        sb.append(")");
        sb.append(System.getProperty("line.separator"));
        for (Object oAddToExpand : this.eAddToExpand) {
            sb.append(oAddToExpand.toString());
        }
        sb.append("    l");
        sb.append(rName());
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
