package X;

import android.os.Message;

/* renamed from: X.2Td  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50782Td {
    public static volatile C50782Td A02;
    public final C01J A00;
    public final C05Y A01;

    public C50782Td(C05Y c05y, C01J c01j) {
        this.A01 = c05y;
        this.A00 = c01j;
    }

    public void A00(C04990Mu c04990Mu) {
        this.A01.A0A(Message.obtain(null, 0, 206, 0, c04990Mu), c04990Mu.A03, true);
    }

    public void A01(C04990Mu c04990Mu) {
        this.A01.A0A(Message.obtain(null, 0, 206, 0, c04990Mu), c04990Mu.A03, false);
    }
}
