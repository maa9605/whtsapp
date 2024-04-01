package X;

import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Gw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48822Gw {
    public final C0HK A00;
    public final C0HK A01;
    public final C0HK A02;
    public final C0HK A03;
    public final C0HK A04;
    public final C2Gx A05;
    public final C41961un A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C48822Gw(C41961un c41961un, C2Gx c2Gx, List list, int i, List list2, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        this.A07 = new ArrayList();
        this.A06 = c41961un;
        this.A05 = c2Gx;
        arrayList.addAll(list);
        this.A02 = new C0HK(Collections.unmodifiableList(this.A08));
        this.A01 = new C0HK(Integer.valueOf(i));
        this.A07.addAll(list2);
        this.A00 = new C0HK(Collections.unmodifiableList(this.A07));
        this.A0B = z3;
        this.A03 = new C0HK(0);
        this.A04 = new C0HK(Integer.valueOf(A02()));
        this.A09 = z;
        this.A0A = z2;
    }

    public byte A00() {
        if (0 >= A04().size()) {
            return (byte) 0;
        }
        return this.A06.A0Y(this.A05.A01((Uri) A04().get(0)));
    }

    public int A01() {
        return ((Number) this.A01.A01()).intValue();
    }

    public final int A02() {
        byte byteValue;
        if (!this.A0B || A0A() || ((List) this.A02.A01()).size() != 1 || (byteValue = Byte.valueOf(A00()).byteValue()) == 13 || byteValue == 29) {
            return 0;
        }
        return this.A05.A01((Uri) A04().get(0)).A0D() ^ true ? 2 : 1;
    }

    public Uri A03() {
        int A01 = A01();
        if (A01 >= 0) {
            List list = this.A08;
            if (A01 < list.size()) {
                return (Uri) list.get(A01);
            }
            return null;
        }
        return null;
    }

    public List A04() {
        return (List) this.A02.A01();
    }

    public final void A05() {
        C0HK c0hk = this.A02;
        List list = this.A08;
        c0hk.A0A(Collections.unmodifiableList(list));
        if (list.isEmpty()) {
            A06(-1);
        } else if (A01() >= list.size()) {
            A06(list.size() - 1);
        }
        A08(A02());
    }

    public void A06(int i) {
        if (A01() != i) {
            this.A01.A0B(Integer.valueOf(i));
            A07(0);
        }
    }

    public void A07(int i) {
        C0HK c0hk = this.A03;
        if (i != ((Number) c0hk.A01()).intValue()) {
            c0hk.A0B(Integer.valueOf(i));
        }
    }

    public final void A08(int i) {
        C0HK c0hk = this.A04;
        if (i != ((Number) c0hk.A01()).intValue()) {
            c0hk.A0B(Integer.valueOf(i));
        }
    }

    public boolean A09() {
        Uri A03 = A03();
        return A03 != null && this.A06.A0Y(this.A05.A01(A03)) == 1;
    }

    public boolean A0A() {
        for (Jid jid : (List) this.A00.A01()) {
            if (C003101m.A0Z(jid)) {
                return true;
            }
        }
        return false;
    }
}
