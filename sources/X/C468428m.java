package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.28m  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C468428m {
    public C468328l A00;
    public List A01 = new ArrayList();
    public Set A02 = new HashSet();
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C22H A07;

    public C468428m(C22H c22h) {
        this.A07 = c22h;
    }

    public static void A00(C468428m c468428m, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c468428m.A03((byte[]) it.next());
        }
    }

    public C468528n A01() {
        C468328l c468328l = this.A00;
        if (c468328l.A03 | c468328l.A01 | c468328l.A04 | c468328l.A05 | false | c468328l.A00 | c468328l.A02) {
            return new C468528n(this);
        }
        throw new IllegalArgumentException("none of the syncs protocols enabled");
    }

    public void A02() {
        this.A00 = new C468328l(true, true, true, true, true, true);
    }

    public void A03(byte[] bArr) {
        for (byte[] bArr2 : this.A01) {
            if (Arrays.equals(bArr2, bArr)) {
                return;
            }
        }
        this.A01.add(bArr);
    }
}
