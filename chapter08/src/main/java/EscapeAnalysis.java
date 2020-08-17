public class EscapeAnalysis {
    // How to determine escape or not: new object instance could be referenced by current method scope
    public EscapeAnalysis obj;

    // return val EscapeAnalysis object, escape is true
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    public void setObj() {
        obj = new EscapeAnalysis();
    }

    // if set obj as static, escape also happen

    public void useEscapeAnalysis() {
        EscapeAnalysis e = getInstance();
        // getInstance().xxx
    }




}
