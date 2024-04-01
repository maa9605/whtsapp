package X;

import java.io.File;

/* renamed from: X.23T  reason: invalid class name */
/* loaded from: classes2.dex */
public class C23T extends C23O {
    public final AbstractC000600i A00;
    public final C012005w A01;
    public final C0F2 A02;
    public final C01B A03;
    public final C001200o A04;
    public final C23D A05;
    public final C43101wr A06;
    public final C41961un A07;

    public C23T(AbstractC000600i abstractC000600i, C001200o c001200o, C012005w c012005w, C01B c01b, C41961un c41961un, C43101wr c43101wr, C0F2 c0f2, C23D c23d) {
        super(c23d);
        this.A00 = abstractC000600i;
        this.A04 = c001200o;
        this.A01 = c012005w;
        this.A03 = c01b;
        this.A07 = c41961un;
        this.A06 = c43101wr;
        this.A02 = c0f2;
        this.A05 = c23d;
    }

    public final byte[] A03(File file) {
        C23J A00 = new C23I(this.A00, this.A03, this.A07, this.A06).A00(new C23H(C0DC.A0I, file, "image/webp", false));
        if (A00 != null) {
            return A00.A02;
        }
        return null;
    }
}
