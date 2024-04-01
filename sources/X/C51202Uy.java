package X;

import com.whatsapp.dns.DnsCacheEntrySerializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.2Uy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51202Uy {
    public static final String[] A0A = {"e1.whatsapp.net.", "e2.whatsapp.net.", "e3.whatsapp.net.", "e4.whatsapp.net.", "e5.whatsapp.net.", "e6.whatsapp.net.", "e7.whatsapp.net.", "e8.whatsapp.net.", "e9.whatsapp.net.", "e10.whatsapp.net.", "e11.whatsapp.net.", "e12.whatsapp.net.", "e13.whatsapp.net.", "e14.whatsapp.net.", "e15.whatsapp.net.", "e16.whatsapp.net."};
    public int A02;
    public final int A03;
    public final int A04;
    public final C01H A05;
    public final String A06;
    public final Random A09;
    public int A01 = 0;
    public int A00 = -1;
    public final List A08 = new ArrayList();
    public final List A07 = new ArrayList();

    public C51202Uy(C01H c01h, String str, List list, Random random) {
        this.A05 = c01h;
        this.A06 = str;
        this.A09 = random;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DnsCacheEntrySerializable dnsCacheEntrySerializable = (DnsCacheEntrySerializable) it.next();
            if (dnsCacheEntrySerializable.forceOverride) {
                this.A08.add(dnsCacheEntrySerializable);
            } else {
                this.A07.add(dnsCacheEntrySerializable);
            }
        }
        boolean nextBoolean = random.nextBoolean();
        this.A03 = nextBoolean ? 443 : 5222;
        this.A04 = nextBoolean ? 5222 : 443;
    }

    public final C08120af A00(int i, boolean z) {
        String str;
        if (z) {
            str = "g.whatsapp.net";
        } else {
            String[] strArr = A0A;
            str = strArr[this.A09.nextInt(strArr.length)];
        }
        C08120af A01 = this.A05.A01(str);
        Arrays.toString(A01.A04);
        A01.A00 = i;
        C000200d.A14("ConnectionSequence/getInetSocketAddress; host=", str);
        return A01;
    }
}
