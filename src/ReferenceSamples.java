public class ReferenceSamples {

    public ReferenceSamples() {
        DoMyWork dmw = new DoMyWork();
        DoMyWork dmw2 = dmw;
        dmw.setVar("Hello work class do it");
        System.out.println(dmw2.getVar());
    }
}
