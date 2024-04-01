package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.01J */
/* loaded from: classes.dex */
public class C01J {
    public static volatile C01J A0K;
    public AnonymousClass051 A00;
    public AnonymousClass052 A01;
    public final C04g A02;
    public final C02L A03;
    public final C01B A04;
    public final C04h A05;
    public final C04j A06;
    public final C04u A07;
    public final C04r A08;
    public final C04t A09;
    public final C04o A0A;
    public final C04q A0B;
    public final C009304p A0C;
    public final C04s A0D;
    public final C000500h A0E;
    public final C009504w A0F;
    public final C009404v A0G;
    public final C01R A0H;
    public final C003701t A0I;
    public final JniBridge A0J;

    public C01J(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, JniBridge jniBridge, C02L c02l, C01B c01b, C04Z c04z, C01R c01r, C04g c04g, C04h c04h, C000500h c000500h) {
        C04j c04j = new C04j(c001200o, anonymousClass012, abstractC000600i, c04z);
        C04o c04o = new C04o(anonymousClass012, c04j, c01b);
        C009304p c009304p = new C009304p(anonymousClass012, c04j);
        C04q c04q = new C04q(anonymousClass012, c04j);
        C04r c04r = new C04r(anonymousClass012, c04j);
        C04s c04s = new C04s(anonymousClass012, c04j);
        C04t c04t = new C04t(anonymousClass012, c04j);
        C04u c04u = new C04u(anonymousClass012, c04j);
        this.A0G = new C009404v();
        C009504w c009504w = new C009504w(this);
        this.A0F = c009504w;
        this.A0I = c003701t;
        this.A0J = jniBridge;
        this.A03 = c02l;
        this.A06 = c04j;
        this.A04 = c01b;
        this.A0H = c01r;
        this.A02 = c04g;
        this.A0A = c04o;
        this.A0C = c009304p;
        this.A05 = c04h;
        this.A0E = c000500h;
        this.A0B = c04q;
        this.A08 = c04r;
        this.A0D = c04s;
        this.A09 = c04t;
        this.A07 = c04u;
        this.A00 = new AnonymousClass051(anonymousClass012, c01r, new C009604x(c01b, c01r, this, c04o, c009304p, c04q, c04r, c04s, c04u));
        this.A01 = new AnonymousClass052(anonymousClass012, jniBridge, c01b, c04o);
        c04j.A00 = c009504w;
    }

    public static C01J A00() {
        if (A0K == null) {
            synchronized (C01J.class) {
                if (A0K == null) {
                    A0K = new C01J(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), JniBridge.getInstance(), C02L.A00(), C01B.A00(), C04Z.A00(), C01R.A02, C04g.A00(), C04h.A00(), C000500h.A00());
                }
            }
        }
        return A0K;
    }

    public static C05020My A01(int i, byte[] bArr) {
        byte[] A06 = ((C13270ks) C0AZ.A03(C13270ks.A04, bArr)).A03.A06();
        int length = A06.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(A06, 1, bArr2, 0, length);
        return new C05020My(AnonymousClass029.A1d(i), bArr2, null);
    }

    public static void A02(C07920aJ c07920aJ) {
        if (c07920aJ.A01.A00().length == 0) {
            throw new IOException("Alice base key missing from session");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:13|14|15|(10:19|20|21|22|23|(1:25)(1:33)|26|27|28|29)|40|21|22|23|(0)(0)|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d9, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00da, code lost:
        r1 = new java.lang.StringBuilder("invalid signed prekey returned from server during prekey fetch; address=");
        r1.append(r28);
        com.whatsapp.util.Log.e(r1.toString(), r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A03(X.C0IO r28, byte[] r29, byte r30, X.C05020My r31, X.C05020My r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01J.A03(X.0IO, byte[], byte, X.0My, X.0My, byte[]):int");
    }

    public C27381Nd A04(C0IO c0io, byte[] bArr, C0OC c0oc) {
        C1R6 c36371kh;
        this.A0H.A00();
        if (this.A0I.A0C(182)) {
            JniBridge jniBridge = this.A01.A03;
            C19960wY c19960wY = new C19960wY((NativeHolder) JniBridge.jvidispatchOIOOOO(2, c0io.A00, c0io.A01, c0oc, jniBridge.getWajContext(), bArr));
            JniBridge jniBridge2 = JniBridge.getInstance();
            NativeHolder nativeHolder = c19960wY.A00;
            return new C27381Nd(jniBridge2.modelGetByteArray(nativeHolder, 39), JniBridge.getInstance().modelGetInt(nativeHolder, 40));
        }
        C1RG A07 = this.A00.A07(c0io);
        try {
            C38171nf c38171nf = new C38171nf(bArr);
            if (c0oc != null) {
                c36371kh = new C36361kg(c0oc);
            } else {
                c36371kh = new C36371kh();
            }
            return AnonymousClass051.A00(A07.A04(c38171nf, c36371kh), 0, null);
        } catch (C1R7 e) {
            return AnonymousClass051.A00(null, -1001, e);
        } catch (C1RB e2) {
            return AnonymousClass051.A00(null, -1005, e2);
        } catch (C1RD e3) {
            return AnonymousClass051.A00(null, -1007, e3);
        } catch (C1RE e4) {
            return AnonymousClass051.A00(null, -1008, e4);
        }
    }

    public C27381Nd A05(C0IO c0io, byte[] bArr, C0OC c0oc) {
        C1R6 c36371kh;
        this.A0H.A00();
        if (this.A0I.A0C(182)) {
            JniBridge jniBridge = this.A01.A03;
            C19960wY c19960wY = new C19960wY((NativeHolder) JniBridge.jvidispatchOIOOOO(3, c0io.A00, c0io.A01, c0oc, jniBridge.getWajContext(), bArr));
            JniBridge jniBridge2 = JniBridge.getInstance();
            NativeHolder nativeHolder = c19960wY.A00;
            return new C27381Nd(jniBridge2.modelGetByteArray(nativeHolder, 39), JniBridge.getInstance().modelGetInt(nativeHolder, 40));
        }
        C1RG A07 = this.A00.A07(c0io);
        try {
            C38151nd c38151nd = new C38151nd(bArr);
            if (c0oc != null) {
                c36371kh = new C36361kg(c0oc);
            } else {
                c36371kh = new C36371kh();
            }
            return AnonymousClass051.A00(A07.A03(c38151nd, c36371kh), 0, null);
        } catch (C02650Cg e) {
            return AnonymousClass051.A00(null, -1002, e);
        } catch (C1R7 e2) {
            return AnonymousClass051.A00(null, -1001, e2);
        } catch (C1RA e3) {
            return AnonymousClass051.A00(null, -1003, e3);
        } catch (C1RB e4) {
            return AnonymousClass051.A00(null, -1005, e4);
        } catch (C1RC e5) {
            return AnonymousClass051.A00(null, -1006, e5);
        } catch (C1RD e6) {
            return AnonymousClass051.A00(null, -1007, e6);
        } catch (C1RH e7) {
            return AnonymousClass051.A00(null, -1010, e7);
        }
    }

    public C27381Nd A06(C0QS c0qs, byte[] bArr, C0OC c0oc) {
        C1R6 c36371kh;
        this.A0H.A00();
        if (this.A0I.A0C(188)) {
            JniBridge jniBridge = this.A01.A03;
            String str = c0qs.A01;
            C0IO c0io = c0qs.A00;
            C19960wY c19960wY = new C19960wY((NativeHolder) JniBridge.jvidispatchOIOOOOO(1, c0io.A00, str, c0io.A01, c0oc, jniBridge.getWajContext(), bArr));
            JniBridge jniBridge2 = JniBridge.getInstance();
            NativeHolder nativeHolder = c19960wY.A00;
            return new C27381Nd(jniBridge2.modelGetByteArray(nativeHolder, 39), JniBridge.getInstance().modelGetInt(nativeHolder, 40));
        }
        C1RI c1ri = new C1RI(this.A00.A00.A01, C002701i.A15(c0qs));
        try {
            if (c0oc != null) {
                c36371kh = new C36361kg(c0oc);
            } else {
                c36371kh = new C36371kh();
            }
            return AnonymousClass051.A00(c1ri.A02(bArr, c36371kh), 0, null);
        } catch (C1R7 e) {
            return AnonymousClass051.A00(null, -1001, e);
        } catch (C1RB e2) {
            return AnonymousClass051.A00(null, -1005, e2);
        } catch (C1RD e3) {
            return AnonymousClass051.A00(null, -1007, e3);
        } catch (C1RE e4) {
            return AnonymousClass051.A00(null, -1008, e4);
        }
    }

    public C27391Ne A07(C0IO c0io, byte[] bArr) {
        this.A0H.A00();
        if (this.A0I.A0C(187)) {
            JniBridge jniBridge = this.A01.A03;
            C19970wZ c19970wZ = new C19970wZ((NativeHolder) JniBridge.jvidispatchOIOOO(0, c0io.A00, c0io.A01, jniBridge.getWajContext(), bArr));
            JniBridge jniBridge2 = JniBridge.getInstance();
            NativeHolder nativeHolder = c19970wZ.A00;
            return new C27391Ne(jniBridge2.modelGetByteArray(nativeHolder, 36), JniBridge.getInstance().modelGetInt(nativeHolder, 37), JniBridge.getInstance().modelGetInt(nativeHolder, 38));
        }
        C1RQ A02 = this.A00.A07(c0io).A02(AnonymousClass051.A03(bArr));
        int type = A02.getType();
        int i = 1;
        if (type != 2) {
            if (type != 3) {
                throw new IllegalStateException("SignalMessageType is neither message nor pre_key_message");
            }
            i = 2;
        }
        return new C27391Ne(A02.ASe(), i, 0);
    }

    public C27391Ne A08(C0QS c0qs, byte[] bArr) {
        this.A0H.A00();
        if (this.A0I.A0C(189)) {
            JniBridge jniBridge = this.A01.A03;
            String str = c0qs.A01;
            C0IO c0io = c0qs.A00;
            C19970wZ c19970wZ = new C19970wZ((NativeHolder) JniBridge.jvidispatchOIOOOO(1, c0io.A00, str, c0io.A01, jniBridge.getWajContext(), bArr));
            JniBridge jniBridge2 = JniBridge.getInstance();
            NativeHolder nativeHolder = c19970wZ.A00;
            return new C27391Ne(jniBridge2.modelGetByteArray(nativeHolder, 36), JniBridge.getInstance().modelGetInt(nativeHolder, 37), JniBridge.getInstance().modelGetInt(nativeHolder, 38));
        }
        AnonymousClass051 anonymousClass051 = this.A00;
        new C1RJ(anonymousClass051.A00.A01).A00(C002701i.A15(c0qs));
        try {
            return new C27391Ne(new C1RI(anonymousClass051.A00.A01, C002701i.A15(c0qs)).A01(AnonymousClass051.A03(bArr)), 4, 0);
        } catch (C1RE unused) {
            return new C27391Ne(null, 0, -1008);
        }
    }

    public C0IQ A09(String str, List list, String str2, List list2) {
        Object obj;
        if (this.A04.A0E(C01C.A2Y)) {
            AnonymousClass052 anonymousClass052 = this.A01;
            List A00 = anonymousClass052.A00(list);
            if (A00 == null) {
                Log.e("wamsys/generateFingerprint/local-identity-key-conversion-failed");
                return null;
            }
            List A002 = anonymousClass052.A00(list2);
            if (A002 == null) {
                Log.e("wamsys/generateFingerprint/remote-identity-key-conversion-failed");
                return null;
            }
            NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOOO(str, str2, anonymousClass052.A03.getWajContext(), A00, A002);
            if (nativeHolder != null) {
                C20000wc c20000wc = new C20000wc(nativeHolder);
                try {
                    JniBridge jniBridge = JniBridge.getInstance();
                    NativeHolder nativeHolder2 = c20000wc.A00;
                    if (jniBridge != null) {
                        String str3 = (String) JniBridge.jvidispatchOIO(2, 45, nativeHolder2);
                        if (JniBridge.getInstance() != null) {
                            return new C0IQ(new C0SH(str3, (String) JniBridge.jvidispatchOIO(2, 46, nativeHolder2)), (C14340mn) C0AZ.A03(C14340mn.A04, JniBridge.getInstance().modelGetByteArray(nativeHolder2, 44)));
                        }
                        throw null;
                    }
                    throw null;
                } catch (C0JX unused) {
                    Log.e("wamsys/generateFingerprint/protobuf-parsing-failed");
                    return null;
                }
            }
            Log.e("wamsys/generateFingerprint/processing-fingerprints-failed");
            return null;
        }
        final AnonymousClass051 anonymousClass051 = this.A00;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0IP((C0IR) it.next()));
        }
        C01R c01r = anonymousClass051.A02;
        if (c01r.A01()) {
            obj = anonymousClass051.A04().A01;
        } else {
            try {
                obj = c01r.A00.submit(new Callable() { // from class: X.1Nb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return anonymousClass051.A04().A01;
                    }
                }).get();
            } catch (InterruptedException | ExecutionException unused2) {
                Log.e("SignalCoordinatorDefault/generateFingerprint/getPublicKey interrupted");
                return null;
            }
        }
        arrayList.add(obj);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C0IP((C0IR) it2.next()));
        }
        C0SH c0sh = new C0SH(C002701i.A0v(str, arrayList), C002701i.A0v(str2, arrayList2));
        byte[] A1X = C002701i.A1X(arrayList);
        byte[] A1X2 = C002701i.A1X(arrayList2);
        C0CT AVX = C14340mn.A04.AVX();
        AVX.A02();
        C14340mn c14340mn = (C14340mn) AVX.A00;
        c14340mn.A00 |= 1;
        c14340mn.A01 = 0;
        C13900m0 c13900m0 = C13900m0.A03;
        C0CT AVX2 = c13900m0.AVX();
        C0AN A003 = C0AN.A00(str.getBytes());
        AVX2.A02();
        C13900m0 c13900m02 = (C13900m0) AVX2.A00;
        c13900m02.A00 |= 2;
        c13900m02.A02 = A003;
        C0AN A004 = C0AN.A00(A1X);
        AVX2.A02();
        C13900m0 c13900m03 = (C13900m0) AVX2.A00;
        c13900m03.A00 |= 1;
        c13900m03.A01 = A004;
        AVX.A02();
        C14340mn c14340mn2 = (C14340mn) AVX.A00;
        if (c14340mn2 != null) {
            c14340mn2.A02 = (C13900m0) AVX2.A01();
            c14340mn2.A00 |= 2;
            C0CT AVX3 = c13900m0.AVX();
            C0AN A005 = C0AN.A00(str2.getBytes());
            AVX3.A02();
            C13900m0 c13900m04 = (C13900m0) AVX3.A00;
            c13900m04.A00 |= 2;
            c13900m04.A02 = A005;
            C0AN A006 = C0AN.A00(A1X2);
            AVX3.A02();
            C13900m0 c13900m05 = (C13900m0) AVX3.A00;
            c13900m05.A00 |= 1;
            c13900m05.A01 = A006;
            AVX.A02();
            C14340mn c14340mn3 = (C14340mn) AVX.A00;
            if (c14340mn3 != null) {
                c14340mn3.A03 = (C13900m0) AVX3.A01();
                c14340mn3.A00 |= 4;
                return new C0IQ(c0sh, (C14340mn) AVX.A01());
            }
            throw null;
        }
        throw null;
    }

    public C0IP A0A(C0IO c0io) {
        C04r c04r = this.A08;
        byte[] A05 = c04r.A05(c0io);
        if (A05 != null) {
            try {
                return new C0IP(C002701i.A0S(A05));
            } catch (C05240Nw e) {
                StringBuilder sb = new StringBuilder("axolotl identity key for ");
                sb.append(c0io);
                sb.append(" decoded as invalid");
                Log.e(sb.toString(), e);
                c04r.A04(c0io);
                return null;
            }
        }
        return null;
    }

    public C0JY A0B() {
        C01R c01r = this.A0H;
        if (c01r.A01()) {
            return this.A00.A04();
        }
        try {
            return (C0JY) c01r.A00.submit(new Callable() { // from class: X.1NY
                {
                    C01J.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C01J.this.A00.A04();
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("SignalCoordinator/getIdentityKeyPair", e);
            throw new RuntimeException(e);
        }
    }

    public C07920aJ A0C(C0IO c0io) {
        C009304p c009304p = this.A0C;
        byte[] A03 = c009304p.A03(c0io);
        if (A03 == null) {
            return new C07920aJ();
        }
        try {
            C07920aJ c07920aJ = new C07920aJ(A03);
            A02(c07920aJ);
            return c07920aJ;
        } catch (IOException unused) {
            c009304p.A01(c0io);
            return new C07920aJ();
        }
    }

    public C0XW A0D() {
        C01R c01r = this.A0H;
        if (c01r.A01()) {
            return A0E();
        }
        try {
            return (C0XW) c01r.A00.submit(new Callable() { // from class: X.1NZ
                {
                    C01J.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C01J.this.A0E();
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("SignedPreKeyStore/getLatestSignedPrekeyRecord", e);
            throw new RuntimeException(e);
        }
    }

    public final C0XW A0E() {
        C0CD A01 = this.A0D.A00.A01();
        try {
            C0CE c0ce = A01.A02;
            Cursor A0A = c0ce.A0A("signed_prekeys", new String[]{"prekey_id", "record"}, null, null, "prekey_id DESC", "1");
            if (!A0A.moveToNext()) {
                Log.e("no signed prekey record found");
                A0A.close();
                A01.close();
            } else {
                int i = A0A.getInt(0);
                byte[] blob = A0A.getBlob(1);
                A0A.close();
                if (i == 16777215) {
                    Cursor A0A2 = c0ce.A0A("signed_prekeys", new String[]{"prekey_id", "record"}, "prekey_id < ?", new String[]{String.valueOf(8388607)}, "prekey_id DESC", "1");
                    if (A0A2.moveToNext()) {
                        i = A0A2.getInt(0);
                        blob = A0A2.getBlob(1);
                    }
                    A0A2.close();
                }
                A01.close();
                StringBuilder sb = new StringBuilder("axolotl retrieved latest signed prekey record successfully; id=");
                sb.append(i);
                Log.i(sb.toString());
                if (blob != null) {
                    try {
                        return new C0XW(blob);
                    } catch (IOException e) {
                        Log.e("failed to parse the latest signed prekey record", e);
                        throw new AssertionError(e);
                    }
                }
            }
            throw new AssertionError("no signed prekey record found");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public C05020My A0F() {
        this.A0H.A00();
        C0XW A0D = A0D();
        Log.i("axolotl loaded the latest signed pre key for sending");
        C0XX c0xx = A0D.A00;
        return new C05020My(AnonymousClass029.A1d(c0xx.A01), A0D.A00().A01.A01, c0xx.A05.A06());
    }

    public C05020My A0G() {
        this.A0H.A00();
        AnonymousClass051 anonymousClass051 = this.A00;
        C0JY A04 = anonymousClass051.A04();
        C009804z c009804z = anonymousClass051.A00.A06;
        C01R c01r = c009804z.A01;
        c01r.A00();
        C04s c04s = c009804z.A00;
        C0CD A01 = c04s.A00.A01();
        try {
            C0CE c0ce = A01.A02;
            Cursor A0A = c0ce.A0A("signed_prekeys", new String[]{"prekey_id"}, null, null, "prekey_id DESC", "1");
            if (A0A.moveToNext()) {
                int i = A0A.getInt(0);
                if (i == 16777215) {
                    A0A.close();
                    Cursor A0A2 = c0ce.A0A("signed_prekeys", new String[]{"prekey_id"}, "prekey_id < ?", new String[]{String.valueOf(8388607)}, "prekey_id DESC", "1");
                    r0 = A0A2.moveToNext() ? A0A2.getInt(0) + 1 : 0;
                    A0A2.close();
                    A01.close();
                    long A05 = anonymousClass051.A01.A05();
                    C0XQ A0Q = C002701i.A0Q();
                    C0XW c0xw = new C0XW(r0, A05, A0Q, C002701i.A1W(A04.A00, A0Q.A01.A00()));
                    C0XX c0xx = c0xw.A00;
                    int i2 = c0xx.A01;
                    C0XY A16 = C002701i.A16(c0xw);
                    c01r.A00();
                    c04s.A00(i2, A16.A00.A0B());
                    return new C05020My(AnonymousClass029.A1d(c0xx.A01), c0xw.A00().A01.A01, c0xx.A05.A06());
                }
                r0 = i + 1;
            }
            A0A.close();
            A01.close();
            long A052 = anonymousClass051.A01.A05();
            C0XQ A0Q2 = C002701i.A0Q();
            C0XW c0xw2 = new C0XW(r0, A052, A0Q2, C002701i.A1W(A04.A00, A0Q2.A01.A00()));
            C0XX c0xx2 = c0xw2.A00;
            int i22 = c0xx2.A01;
            C0XY A162 = C002701i.A16(c0xw2);
            c01r.A00();
            c04s.A00(i22, A162.A00.A0B());
            return new C05020My(AnonymousClass029.A1d(c0xx2.A01), c0xw2.A00().A01.A01, c0xx2.A05.A06());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public Set A0H(List list) {
        HashSet hashSet = new HashSet(list);
        C009304p c009304p = this.A0C;
        Cursor A00 = c009304p.A00(list);
        while (A00.moveToNext()) {
            try {
                byte[] blob = A00.getBlob(0);
                C0IO c0io = new C0IO(String.valueOf(A00.getLong(1)), A00.getInt(2));
                try {
                    A02(new C07920aJ(blob));
                    hashSet.remove(c0io);
                } catch (IOException unused) {
                    c009304p.A01(c0io);
                }
            } finally {
            }
        }
        A00.close();
        return hashSet;
    }

    public void A0I() {
        C04j c04j = this.A06;
        synchronized (c04j) {
            c04j.close();
            String str = c04j.A07;
            if (str != null) {
                File databasePath = c04j.A04.A00.getDatabasePath(str);
                C002501g.A0O(databasePath, "axolotl");
                if (databasePath.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("deleted ");
                    sb.append(databasePath);
                    Log.i(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed to delete ");
                    sb2.append(databasePath);
                    Log.e(sb2.toString());
                }
            }
        }
        if (this.A04.A0E(C01C.A2X)) {
            this.A0J.initWajContext();
        }
    }

    public void A0J() {
        this.A0H.A00();
        if (this.A04.A0E(C01C.A2X)) {
            AnonymousClass052 anonymousClass052 = this.A01;
            int A00 = anonymousClass052.A01.A00();
            int A07 = anonymousClass052.A00.A07(C01C.A2q);
            if (A00 >= A07) {
                StringBuilder sb = new StringBuilder("skipping key generation because already more than ");
                sb.append(A07);
                sb.append(" are unsent");
                Log.i(sb.toString());
                return;
            }
            int i = A07 - A00;
            while (i > 0) {
                int min = Math.min(i, 50);
                StringBuilder sb2 = new StringBuilder("wa-msys generating ");
                sb2.append(min);
                sb2.append(" new prekeys");
                sb2.append(" and recording them in the db");
                Log.i(sb2.toString());
                int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(4, min, anonymousClass052.A03.getWajContext());
                if (jvidispatchIIO <= 0) {
                    StringBuilder sb3 = new StringBuilder("wa-msys generated 0 keys when expected to generate ");
                    sb3.append(min);
                    sb3.append(" keys");
                    Log.e(sb3.toString());
                    return;
                }
                i -= jvidispatchIIO;
            }
            return;
        }
        this.A00.A08();
    }

    public void A0K() {
        this.A0H.A00();
        C009604x c009604x = this.A00.A00;
        c009604x.A08.A00();
        C04j c04j = c009604x.A04.A01;
        C0CD A02 = c04j.A02();
        try {
            C03790Hb A00 = A02.A00();
            ContentValues contentValues = new ContentValues();
            contentValues.put("sent_to_server", Boolean.FALSE);
            contentValues.put("upload_timestamp", (Long) 0L);
            A02.A02.A00("prekeys", contentValues, "sent_to_server != 0", null);
            Log.i("axolotl recorded no prekeys as received by server");
            C0CD A022 = c04j.A02();
            int A01 = A022.A02.A01("prekey_uploads", null, null);
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted prekey upload timestamps:");
            sb.append(A01);
            Log.i(sb.toString());
            A022.close();
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0L(C0IO c0io) {
        DeviceJid A0X;
        this.A0H.A00();
        C04r c04r = this.A08;
        byte[] A05 = c04r.A05(c0io);
        boolean A04 = c04r.A04(c0io);
        if (A05 == null || !A04 || (A0X = C002701i.A0X(c0io)) == null) {
            return;
        }
        this.A02.A04(A0X);
    }

    public void A0M(C0IO c0io, C0IP c0ip) {
        this.A0H.A00();
        if (!this.A03.A09(C002701i.A0X(c0io))) {
            A0N(c0io, c0ip);
        } else {
            Log.e("SignalCoordinator/saveIdentity - Not allowed to save my companion identity");
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void A0N(C0IO c0io, C0IP c0ip) {
        byte[] bArr;
        C0IP A0A = A0A(c0io);
        C04r c04r = this.A08;
        if (c0ip != null) {
            bArr = c0ip.A00.A00();
        } else {
            bArr = null;
        }
        C0CD A02 = c04r.A00.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("recipient_id", c0io.A01);
            contentValues.put("device_id", Integer.valueOf(c0io.A00));
            if (bArr == null) {
                contentValues.putNull("public_key");
            } else {
                contentValues.put("public_key", bArr);
            }
            contentValues.put("timestamp", Long.valueOf(c04r.A01.A05() / 1000));
            long A05 = A02.A02.A05("identities", contentValues);
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl saved identity for ");
            sb.append(c0io);
            sb.append(" with resultant row id ");
            sb.append(A05);
            Log.i(sb.toString());
            A02.close();
            DeviceJid A0X = C002701i.A0X(c0io);
            if (A0X != null) {
                if (c0ip == null) {
                    if (A0A != null) {
                        this.A02.A04(A0X);
                    }
                } else if (A0A == null) {
                    this.A02.A02(A0X);
                } else if (c0ip.equals(A0A)) {
                } else {
                    this.A02.A03(A0X);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A0O(C0IO c0io, AbstractC005302j abstractC005302j, byte[] bArr) {
        C01R c01r = this.A0H;
        c01r.A00();
        AnonymousClass094 anonymousClass094 = new AnonymousClass094(abstractC005302j, true, "location_msg_id");
        c01r.A00();
        this.A09.A01(c0io, anonymousClass094, bArr);
    }

    /* JADX WARN: Finally extract failed */
    public void A0P(C0QS c0qs) {
        this.A0H.A00();
        String str = c0qs.A01;
        if (!C0Zq.A00.getRawString().equals(str)) {
            C000200d.A15("signalCoordinator/removefastratchetsenderkey/invalidgroupid ", str);
            return;
        }
        C0CD A02 = this.A07.A00.A02();
        try {
            C0CE c0ce = A02.A02;
            C0IO c0io = c0qs.A00;
            c0ce.A01("fast_ratchet_sender_keys", "group_id=? AND sender_id=? AND device_id=?", new String[]{str, c0io.A01, String.valueOf(c0io.A00)});
            A02.close();
            this.A05.A00.A01(new C0KE());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A0Q(C0QS c0qs) {
        this.A0H.A00();
        String str = c0qs.A01;
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AbstractC011205o) {
                AbstractC011205o abstractC011205o = (AbstractC011205o) jid;
                C04q c04q = this.A0B;
                StringBuilder sb = new StringBuilder("SenderKeyStore/removeSenderKey/");
                sb.append(c0qs);
                Log.i(sb.toString());
                C0CD A02 = c04q.A00.A02();
                try {
                    C0CE c0ce = A02.A02;
                    C0IO c0io = c0qs.A00;
                    c0ce.A01("sender_keys", "group_id = ? AND sender_id = ? AND device_id = ?", new String[]{str, c0io.A01, String.valueOf(c0io.A00)});
                    A02.close();
                    this.A05.A01.A01(new C27281Mt(abstractC011205o));
                } finally {
                }
            } else {
                throw new C011305p(str);
            }
        } catch (C011305p unused) {
            C000200d.A15("senderkeystore/removesenderkey/invalidgroupid ", str);
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A0R(C0QS c0qs, byte[] bArr) {
        this.A0H.A00();
        String str = c0qs.A01;
        if (!C0Zq.A00.getRawString().equals(str)) {
            C000200d.A15("signalCoordinator/savefastratchetsenderkey/invalidgroupid ", str);
            return;
        }
        C0CD A02 = this.A07.A00.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("group_id", str);
            C0IO c0io = c0qs.A00;
            contentValues.put("sender_id", c0io.A01);
            contentValues.put("device_id", Integer.valueOf(c0io.A00));
            contentValues.put("record", bArr);
            A02.A02.A05("fast_ratchet_sender_keys", contentValues);
            A02.close();
            C04h c04h = this.A05;
            c04h.A00.A01(new C0KE());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A0S(C0QS c0qs, byte[] bArr) {
        this.A0H.A01();
        String str = c0qs.A01;
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AbstractC011205o) {
                AbstractC011205o abstractC011205o = (AbstractC011205o) jid;
                C04q c04q = this.A0B;
                StringBuilder sb = new StringBuilder("SenderKeyStore/saveSenderKey/");
                sb.append(c0qs);
                Log.i(sb.toString());
                C0CD A02 = c04q.A00.A02();
                try {
                    C03790Hb A00 = A02.A00();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("record", bArr);
                    long A05 = c04q.A01.A05() / 1000;
                    C0CE c0ce = A02.A02;
                    C0IO c0io = c0qs.A00;
                    String str2 = c0io.A01;
                    int i = c0io.A00;
                    long A002 = c0ce.A00("sender_keys", contentValues, "group_id = ? AND sender_id = ? AND device_id = ?", new String[]{str, str2, String.valueOf(i)});
                    if (A002 == 0) {
                        contentValues.put("group_id", str);
                        contentValues.put("sender_id", str2);
                        contentValues.put("device_id", Integer.valueOf(i));
                        contentValues.put("timestamp", Long.valueOf(A05));
                        A002 = c0ce.A03("sender_keys", contentValues);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SenderKeyStore/saveSenderKey/result/");
                    sb2.append(A002);
                    Log.i(sb2.toString());
                    A00.A00();
                    A00.close();
                    A02.close();
                    this.A05.A01.A01(new C27281Mt(abstractC011205o));
                } finally {
                }
            } else {
                throw new C011305p(str);
            }
        } catch (C011305p unused) {
            C000200d.A15("senderkeystore/storesenderkey/invalidgroupid ", str);
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A0T(List list, int i) {
        this.A0H.A00();
        if (list.size() == 0) {
            return;
        }
        C0CD A02 = this.A06.A02();
        try {
            C03790Hb A00 = A02.A00();
            C0CD A022 = this.A0A.A01.A02();
            try {
                C03790Hb A002 = A022.A00();
                ContentValues contentValues = new ContentValues();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C05000Mw c05000Mw = (C05000Mw) it.next();
                    contentValues.clear();
                    contentValues.put("prekey_id", Integer.valueOf(c05000Mw.A00));
                    contentValues.put("record", c05000Mw.A01);
                    Boolean bool = Boolean.FALSE;
                    contentValues.put("sent_to_server", bool);
                    contentValues.put("direct_distribution", bool);
                    A022.A02.A03("prekeys", contentValues);
                }
                A002.A00();
                A002.close();
                A022.close();
                C0CD A023 = this.A08.A00.A02();
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("next_prekey_id", Integer.valueOf(i));
                    A023.A02.A00("identities", contentValues2, "recipient_id = ? AND device_id = ? ", new String[]{String.valueOf(-1), String.valueOf(0)});
                    A023.close();
                    A00.A00();
                    A00.close();
                    A02.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A022.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    A02.close();
                } catch (Throwable unused2) {
                }
                throw th4;
            }
        }
    }

    public boolean A0U(C0IO c0io) {
        C009304p c009304p = this.A0C;
        byte[] A03 = c009304p.A03(c0io);
        if (A03 == null) {
            return false;
        }
        try {
            A02(new C07920aJ(A03));
            return true;
        } catch (IOException unused) {
            c009304p.A01(c0io);
            return false;
        }
    }

    public boolean A0V(C0IO c0io, AnonymousClass094 anonymousClass094) {
        C01R c01r = this.A0H;
        c01r.A00();
        c01r.A00();
        C04t c04t = this.A09;
        String A0N = C000200d.A0N(C000200d.A0P("msg_key_remote_jid = ? AND recipient_id = ? AND device_id = ? AND msg_key_from_me"), anonymousClass094.A02 ? " != " : " = ", "0 AND ", "msg_key_id", " = ?");
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            String rawString = abstractC005302j.getRawString();
            C0CD A01 = c04t.A00.A01();
            try {
                Cursor A09 = A01.A02.A09("message_base_key", new String[]{"last_alice_base_key"}, A0N, new String[]{rawString, c0io.A01, String.valueOf(c0io.A00), anonymousClass094.A01}, null, "SignalMessageBaseKeyStore/getMessageBaseKey");
                if (!A09.moveToNext()) {
                    A09.close();
                    A01.close();
                } else {
                    byte[] blob = A09.getBlob(0);
                    A09.close();
                    A01.close();
                    if (blob != null) {
                        boolean equals = Arrays.equals(blob, A0C(c0io).A01.A00());
                        StringBuilder A0P = C000200d.A0P("axolotl has ");
                        A0P.append(equals ? "matching" : "different");
                        A0P.append(" saved base key and session for ");
                        A0P.append(anonymousClass094);
                        A0P.append(" and ");
                        A0P.append(c0io);
                        Log.i(A0P.toString());
                        return equals;
                    }
                }
                C000200d.A0z("axolotl has no saved base key for ", anonymousClass094);
                return false;
            } finally {
            }
        } else {
            throw null;
        }
    }

    public byte[] A0W() {
        this.A0H.A00();
        byte[] bArr = A0B().A01.A00.A01;
        Log.i("axolotl fetched identity key for sending");
        return bArr;
    }
}
