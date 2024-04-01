package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.37D  reason: invalid class name */
/* loaded from: classes2.dex */
public class C37D extends C0MU {
    public final C05W A05;
    public final C018708s A06;
    public final C002301c A07;
    public C461825l A02 = new C461825l();
    public final C0HK A04 = new C0HK();
    public final C04880Mg A03 = new C04880Mg();
    public C0HK A00 = new C0HK();
    public C0HK A01 = new C0HK();

    public C37D(C05W c05w, C002301c c002301c, C018708s c018708s, C2M6 c2m6) {
        this.A05 = c05w;
        this.A07 = c002301c;
        this.A06 = c018708s;
        C04880Mg c04880Mg = new C04880Mg();
        c2m6.A00(c04880Mg, this.A00, new InterfaceC04240Jk() { // from class: X.37C
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
                if (r5.size() <= 0) goto L46;
             */
            @Override // X.InterfaceC04240Jk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object A5S(java.lang.Object r11) {
                /*
                    r10 = this;
                    X.37D r6 = X.C37D.this
                    X.2IH r11 = (X.C2IH) r11
                    java.lang.Object r5 = r11.A01
                    java.util.List r5 = (java.util.List) r5
                    X.0HE r4 = r11.A00
                    r7 = 1
                    r1 = 0
                    if (r5 == 0) goto L15
                    int r0 = r5.size()
                    r9 = 1
                    if (r0 > 0) goto L16
                L15:
                    r9 = 0
                L16:
                    r4.A02()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r2.<init>()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.05W r0 = r6.A05     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.060 r0 = r0.A05     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r0.A0V(r2, r1, r7, r1)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.01c r1 = r6.A07     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.2qY r0 = new X.2qY     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    java.util.Collections.sort(r2, r0)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r4.A02()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r3.<init>()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r5 == 0) goto L9d
                    int r0 = r5.size()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r0 <= 0) goto L9d
                    r0 = 2131887523(0x7f1205a3, float:1.9409655E38)
                    java.lang.String r1 = r1.A06(r0)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.372 r0 = new X.372     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r3.add(r0)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.08s r1 = r6.A06     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.37E r0 = new X.37E     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r0.<init>(r5, r1)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    java.util.List r8 = java.util.Collections.singletonList(r0)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                L5d:
                    boolean r0 = r6.hasNext()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r0 == 0) goto Lb9
                    java.lang.Object r5 = r6.next()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.06C r5 = (X.C06C) r5     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r4.A02()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r8 == 0) goto L8f
                    boolean r0 = r8.isEmpty()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r0 != 0) goto L8f
                    java.util.Iterator r2 = r8.iterator()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                L78:
                    boolean r0 = r2.hasNext()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r2.next()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.37E r0 = (X.C37E) r0     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.08s r1 = r0.A00     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    java.util.List r0 = r0.A01     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    boolean r0 = r1.A0G(r5, r0, r7)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r0 != 0) goto L78
                    goto L91
                L8f:
                    r0 = 1
                    goto L92
                L91:
                    r0 = 0
                L92:
                    if (r0 == 0) goto L5d
                    X.36U r0 = new X.36U     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r0.<init>(r5)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r3.add(r0)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    goto L5d
                L9d:
                    java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                La1:
                    boolean r0 = r2.hasNext()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    if (r0 == 0) goto Lb9
                    java.lang.Object r1 = r2.next()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.06C r1 = (X.C06C) r1     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r4.A02()     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    X.36U r0 = new X.36U     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r3.add(r0)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    goto La1
                Lb9:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    r2.<init>(r3, r0)     // Catch: java.lang.IllegalStateException -> Lc3 X.C0S2 -> Lc5
                    return r2
                Lc3:
                    r1 = move-exception
                    goto Lc6
                Lc5:
                    r1 = move-exception
                Lc6:
                    java.lang.String r0 = "InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error"
                    com.whatsapp.util.Log.e(r0, r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
                    android.util.Pair r2 = new android.util.Pair
                    r2.<init>(r1, r0)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C37C.A5S(java.lang.Object):java.lang.Object");
            }
        });
        this.A03.A0C(c04880Mg, new InterfaceC05620Pl() { // from class: X.37B
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C37D c37d = C37D.this;
                Pair pair = (Pair) obj;
                List list = (List) pair.first;
                boolean booleanValue = ((Boolean) pair.second).booleanValue();
                if (list.isEmpty()) {
                    c37d.A04.A0A(Integer.valueOf(booleanValue ? 3 : 1));
                } else {
                    c37d.A04.A0A(2);
                }
                c37d.A03.A0B(list);
            }
        });
    }

    public void A02(String str) {
        ArrayList A03 = C09940f2.A03(str, this.A07);
        this.A04.A0B(0);
        this.A00.A0B(A03);
    }
}
