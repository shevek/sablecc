/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MSelfRefH {

    private final MFile mFile;

    MSelfRefH(
            MFile mFile) {

        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    private String rFileName() {

        return this.mFile.pFileName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  struct M");
        sb.append(rFileName());
        sb.append("* _m");
        sb.append(rFileName());
        sb.append("_;");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
