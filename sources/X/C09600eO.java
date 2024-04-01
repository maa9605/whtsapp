package X;

import java.util.Arrays;

/* renamed from: X.0eO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09600eO {
    public final AbstractC005302j A00;
    public final AbstractC005302j A01;
    public final Long[] A02;
    public final String[] A03;

    public C09600eO(AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2, Long[] lArr, String[] strArr) {
        this.A01 = abstractC005302j;
        this.A00 = abstractC005302j2;
        this.A02 = lArr;
        this.A03 = strArr;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("toJid=");
        A0P.append(this.A01);
        A0P.append("; participant=");
        A0P.append(this.A00);
        A0P.append("; rowIds=");
        A0P.append(Arrays.toString(this.A02));
        A0P.append("; ids=");
        A0P.append(Arrays.toString(this.A03));
        return A0P.toString();
    }
}
