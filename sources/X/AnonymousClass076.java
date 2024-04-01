package X;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.076 */
/* loaded from: classes.dex */
public abstract class AnonymousClass076 {
    public final C01B A01;
    public final C05W A03;
    public final AnonymousClass060 A04;
    public final AnonymousClass008 A05;
    public final C01J A06;
    public final C01R A07;
    public final AnonymousClass011 A08;
    public final Map A0A = Collections.synchronizedMap(new HashMap());
    public final AnonymousClass077 A02 = new AnonymousClass077();
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Object A09 = new Object();

    public AnonymousClass076(AnonymousClass011 anonymousClass011, C01B c01b, C05W c05w, C01R c01r, AnonymousClass008 anonymousClass008, C01J c01j, AnonymousClass060 anonymousClass060) {
        this.A08 = anonymousClass011;
        this.A01 = c01b;
        this.A03 = c05w;
        this.A05 = anonymousClass008;
        this.A06 = c01j;
        this.A04 = anonymousClass060;
        this.A07 = c01r;
    }

    public C018108l A00(UserJid userJid) {
        return this.A04.A0E(userJid);
    }

    /* JADX WARN: Finally extract failed */
    public void A01(final UserJid userJid) {
        synchronized (this.A09) {
            AnonymousClass060 anonymousClass060 = this.A04;
            try {
                C0CD A0B = anonymousClass060.A0B();
                try {
                    C03790Hb A00 = A0B.A00();
                    anonymousClass060.A0L(A00, userJid);
                    A00.A00();
                    A00.close();
                    A0B.close();
                } finally {
                }
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("contact-mgr-db/unable to delete vname details ");
                sb.append(userJid);
                String obj = sb.toString();
                if (obj != null) {
                    Log.e(obj, e);
                } else {
                    throw null;
                }
            }
        }
        this.A0A.remove(userJid);
        this.A03.A0G();
        this.A00.post(new Runnable() { // from class: X.1N8
            {
                AnonymousClass076.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass076 anonymousClass076 = AnonymousClass076.this;
                anonymousClass076.A05.A05(userJid);
            }
        });
    }

    public boolean A02(UserJid userJid) {
        C018108l A0E = this.A04.A0E(userJid);
        return A0E != null && A0E.A01();
    }

    public boolean A03(final UserJid userJid, int i) {
        synchronized (this.A09) {
            AnonymousClass060 anonymousClass060 = this.A04;
            C018108l A0E = anonymousClass060.A0E(userJid);
            if ((A0E != null ? A0E.A03 : 0) == i) {
                return false;
            }
            anonymousClass060.A0Q(userJid, i);
            this.A03.A0G();
            this.A00.post(new Runnable() { // from class: X.1N9
                {
                    AnonymousClass076.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass076 anonymousClass076 = AnonymousClass076.this;
                    anonymousClass076.A05.A05(userJid);
                }
            });
            return true;
        }
    }

    /* JADX WARN: Finally extract failed */
    public boolean A04(final UserJid userJid, int i, C05200Ns c05200Ns, boolean z) {
        boolean z2;
        if (!this.A01.A0E(C01C.A0W)) {
            return A03(userJid, i);
        }
        synchronized (this.A09) {
            AnonymousClass060 anonymousClass060 = this.A04;
            C018108l A0E = anonymousClass060.A0E(userJid);
            z2 = false;
            int i2 = A0E != null ? A0E.A03 : 0;
            long j = A0E != null ? A0E.A04 : 0L;
            ContentValues contentValues = new ContentValues();
            if (i2 != i) {
                contentValues.put("verified_level", Integer.valueOf(i));
            }
            if (c05200Ns != null) {
                long j2 = c05200Ns.privacyModeTs;
                if (j < j2 || (j > 0 && j2 == 0)) {
                    contentValues.put("host_storage", Integer.valueOf(c05200Ns.hostStorage));
                    contentValues.put("actual_actors", Integer.valueOf(c05200Ns.actualActors));
                    contentValues.put("privacy_mode_ts", Long.valueOf(c05200Ns.privacyModeTs));
                }
            }
            if (contentValues.size() > 0) {
                z2 = true;
                try {
                    C0CD A0B = anonymousClass060.A0B();
                    try {
                        AnonymousClass061.A04(A0B, "wa_vnames", contentValues, "jid = ?", new String[]{C003101m.A07(userJid)});
                        A0B.close();
                    } finally {
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder A0U = C000200d.A0U("wadbhelper/update-multi-fields/unable to update fields", userJid, ", ");
                    A0U.append(contentValues.toString());
                    String obj = A0U.toString();
                    if (obj != null) {
                        Log.e(obj, e);
                    } else {
                        throw null;
                    }
                }
                anonymousClass060.A02.A02(anonymousClass060.A0G(userJid));
                if (z && i2 != i) {
                    this.A03.A0G();
                }
                this.A00.post(new Runnable() { // from class: X.1NA
                    {
                        AnonymousClass076.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass076 anonymousClass076 = AnonymousClass076.this;
                        anonymousClass076.A05.A05(userJid);
                    }
                });
            }
        }
        return z2;
    }

    public boolean A05(final UserJid userJid, byte[] bArr, int i, C05200Ns c05200Ns) {
        synchronized (this.A09) {
            A06(userJid, bArr, i, c05200Ns);
            C018108l A0E = this.A04.A0E(userJid);
            if (A0E != null) {
                if (A0E.A02 == 0) {
                    this.A00.post(new Runnable() { // from class: X.1NB
                        {
                            AnonymousClass076.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass076 anonymousClass076 = AnonymousClass076.this;
                            anonymousClass076.A05.A05(userJid);
                        }
                    });
                    return true;
                }
                return false;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x030d: INVOKE  (r5v1 ?? I:X.076), (r15v2 ?? I:com.whatsapp.jid.UserJid), (r4v1 ?? I:int), (r10 I:X.0Ns), (r7 I:boolean) type: VIRTUAL call: X.076.A04(com.whatsapp.jid.UserJid, int, X.0Ns, boolean):boolean, block:B:365:0x030d */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0361: MOVE  (r22 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:376:0x034f */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0363: MOVE  (r23 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:376:0x034f */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x02e8: INVOKE  (r9 I:X.08l) = (r14v0 ?? I:X.060), (r15 I:com.whatsapp.jid.UserJid) type: VIRTUAL call: X.060.A0E(com.whatsapp.jid.UserJid):X.08l, block:B:352:0x02e6 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0379: INVOKE  (r0v0 ?? I:java.lang.StringBuilder), (r15 I:java.lang.Object) type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.Object):java.lang.StringBuilder, block:B:380:0x0372 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x038d: INVOKE  (r2v1 ?? I:java.util.Map), (r15 I:java.lang.Object), (r0 I:java.lang.Object) type: INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object, block:B:381:0x0383 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0306: IF  (r0v21 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:363:0x030b, block:B:361:0x0306 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x030d: INVOKE  (r5v1 ?? I:X.076), (r15v2 ?? I:com.whatsapp.jid.UserJid), (r4 I:int), (r10 I:X.0Ns), (r7 I:boolean) type: VIRTUAL call: X.076.A04(com.whatsapp.jid.UserJid, int, X.0Ns, boolean):boolean, block:B:365:0x030d */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x035f: MOVE  (r21 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:376:0x034f */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x02e3: IGET  (r8 I:java.lang.Object) = (r5 I:X.076) X.076.A09 java.lang.Object, block:B:350:0x02e3 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0383: IGET  (r2 I:java.util.Map) = (r5 I:X.076) X.076.A0A java.util.Map, block:B:381:0x0383 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.whatsapp.jid.UserJid, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.076] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.076] */
    public final boolean A06(UserJid userJid, byte[] bArr, int i, C05200Ns c05200Ns) {
        Object append;
        ?? r5;
        ?? put;
        ?? r52;
        ?? A0E;
        int i2;
        C05200Ns c05200Ns2;
        byte[] bArr2;
        String str;
        int A04;
        C05200Ns A042;
        int i3;
        AnonymousClass077 anonymousClass077;
        C0QX c0qx;
        String str2;
        String str3;
        C14400mt c14400mt;
        int i4;
        String str4;
        boolean z = true;
        boolean z2 = false;
        C14410mu c14410mu = null;
        try {
            try {
                c14400mt = (C14400mt) C0AZ.A03(C14400mt.A04, bArr);
                i4 = c14400mt.A00;
            } catch (C0JX e) {
                e = e;
            } catch (IllegalArgumentException e2) {
                e = e2;
            }
            if ((i4 & 2) == 2 && (i4 & 1) == 1) {
                byte[] A06 = c14400mt.A03.A06();
                byte[] A062 = c14400mt.A01.A06();
                C14410mu c14410mu2 = (C14410mu) C0AZ.A03(C14410mu.A06, A062);
                c14410mu = c14410mu2;
                C0IP A0A = this.A06.A0A(C002701i.A0T(DeviceJid.of(userJid)));
                if (A0A != null) {
                    C0IR c0ir = A0A.A00;
                    if (c0ir != null) {
                        try {
                            if (!C002701i.A1Q(c0ir, A062, A06)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("vname failed to verify signature for jid ");
                                sb.append(userJid);
                                Log.w(sb.toString());
                            } else {
                                z2 = true;
                            }
                        } catch (C0JX e3) {
                            e = e3;
                            Log.w("vname invalidproto:", e);
                            if (c14410mu != null) {
                                synchronized (this.A09) {
                                    try {
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        AnonymousClass060 anonymousClass060 = this.A04;
                                        C018108l A0E2 = anonymousClass060.A0E(userJid);
                                        if (A0E2 != null && A0E2.A05 == c14410mu.A02 && A0E2.A02 <= 0) {
                                            if (this.A01.A0E(C01C.A0W)) {
                                                z = A04(userJid, i, c05200Ns, false) | false;
                                            } else if (A0E2.A03 != i) {
                                                anonymousClass060.A0Q(userJid, i);
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            for (C14420mv c14420mv : c14410mu.A03) {
                                                if (!TextUtils.isEmpty(c14420mv.A02)) {
                                                    String str5 = c14420mv.A02;
                                                    if (!TextUtils.isEmpty(c14420mv.A01)) {
                                                        str3 = c14420mv.A01;
                                                    } else {
                                                        str3 = "";
                                                    }
                                                    arrayList.add(new C0FK(new Locale(str5, str3), c14420mv.A03));
                                                }
                                            }
                                            anonymousClass060.A0S(userJid, c14410mu.A02, c14410mu.A04, c14410mu.A05, arrayList, i, c05200Ns, bArr, false, this.A01.A0E(C01C.A0W));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder("vname certificate details could no be found or validated for jid ");
                                sb2.append(userJid);
                                Log.w(sb2.toString());
                                z = false;
                            }
                            this.A0A.put(userJid, Long.valueOf(System.currentTimeMillis()));
                            anonymousClass077 = this.A02;
                            c0qx = new C0QX(userJid);
                            anonymousClass077.A02(c0qx);
                            return z;
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("vname failed to get identity entry for jid = ");
                            sb3.append(userJid);
                            Log.w(sb3.toString(), e);
                            if (c14410mu != null) {
                                synchronized (this.A09) {
                                    try {
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    try {
                                        AnonymousClass060 anonymousClass0602 = this.A04;
                                        C018108l A0E3 = anonymousClass0602.A0E(userJid);
                                        if (A0E3 != null && A0E3.A05 == c14410mu.A02 && A0E3.A02 <= 0) {
                                            if (this.A01.A0E(C01C.A0W)) {
                                                z = A04(userJid, i, c05200Ns, false) | false;
                                            } else if (A0E3.A03 != i) {
                                                anonymousClass0602.A0Q(userJid, i);
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (C14420mv c14420mv2 : c14410mu.A03) {
                                                if (!TextUtils.isEmpty(c14420mv2.A02)) {
                                                    String str6 = c14420mv2.A02;
                                                    if (!TextUtils.isEmpty(c14420mv2.A01)) {
                                                        str2 = c14420mv2.A01;
                                                    } else {
                                                        str2 = "";
                                                    }
                                                    arrayList2.add(new C0FK(new Locale(str6, str2), c14420mv2.A03));
                                                }
                                            }
                                            anonymousClass0602.A0S(userJid, c14410mu.A02, c14410mu.A04, c14410mu.A05, arrayList2, i, c05200Ns, bArr, false, this.A01.A0E(C01C.A0W));
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw th;
                                    }
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder("vname certificate details could no be found or validated for jid ");
                                sb4.append(userJid);
                                Log.w(sb4.toString());
                                z = false;
                            }
                            this.A0A.put(userJid, Long.valueOf(System.currentTimeMillis()));
                            anonymousClass077 = this.A02;
                            c0qx = new C0QX(userJid);
                            anonymousClass077.A02(c0qx);
                            return z;
                        }
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("vname no identity key for jid ");
                    sb5.append(userJid);
                    Log.w(sb5.toString());
                }
                if (c14410mu2 != null) {
                    synchronized (this.A09) {
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        try {
                            AnonymousClass060 anonymousClass0603 = this.A04;
                            C018108l A0E4 = anonymousClass0603.A0E(userJid);
                            if (A0E4 != null && A0E4.A05 == c14410mu2.A02 && A0E4.A02 <= 0) {
                                if (this.A01.A0E(C01C.A0W)) {
                                    z = A04(userJid, i, c05200Ns, false) | false;
                                } else if (A0E4.A03 != i) {
                                    anonymousClass0603.A0Q(userJid, i);
                                } else {
                                    z = false;
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (C14420mv c14420mv3 : c14410mu.A03) {
                                    if (!TextUtils.isEmpty(c14420mv3.A02)) {
                                        String str7 = c14420mv3.A02;
                                        if (!TextUtils.isEmpty(c14420mv3.A01)) {
                                            str4 = c14420mv3.A01;
                                        } else {
                                            str4 = "";
                                        }
                                        arrayList3.add(new C0FK(new Locale(str7, str4), c14420mv3.A03));
                                    }
                                }
                                anonymousClass0603.A0S(userJid, c14410mu.A02, c14410mu.A04, c14410mu.A05, arrayList3, i, c05200Ns, bArr, z2, this.A01.A0E(C01C.A0W));
                            }
                            this.A0A.put(userJid, Long.valueOf(System.currentTimeMillis()));
                            anonymousClass077 = this.A02;
                            c0qx = new C0QX(userJid);
                            anonymousClass077.A02(c0qx);
                            return z;
                        } catch (Throwable th6) {
                            th = th6;
                            throw th;
                        }
                    }
                }
            }
            StringBuilder sb6 = new StringBuilder("vname certificate details could no be found or validated for jid ");
            sb6.append(userJid);
            Log.w(sb6.toString());
            z = false;
            this.A0A.put(userJid, Long.valueOf(System.currentTimeMillis()));
            anonymousClass077 = this.A02;
            c0qx = new C0QX(userJid);
            anonymousClass077.A02(c0qx);
            return z;
        } catch (Throwable th7) {
            if (0 != 0) {
                synchronized (r52.A09) {
                    AnonymousClass060 anonymousClass0604 = r52.A04;
                    C018108l A0E5 = anonymousClass0604.A0E(A0E);
                    if (A0E5 != null && A0E5.A05 == c14410mu.A02 && A0E5.A02 <= 0) {
                        if (!r52.A01.A0E(C01C.A0W)) {
                            if (A0E5.A03 != i3) {
                                anonymousClass0604.A0Q(A0E, i3);
                            }
                        } else {
                            r52.A04(A0E, A04, A042, false);
                        }
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        for (C14420mv c14420mv4 : c14410mu.A03) {
                            if (!TextUtils.isEmpty(c14420mv4.A02)) {
                                String str8 = c14420mv4.A02;
                                if (!TextUtils.isEmpty(c14420mv4.A01)) {
                                    str = c14420mv4.A01;
                                } else {
                                    str = "";
                                }
                                arrayList4.add(new C0FK(new Locale(str8, str), c14420mv4.A03));
                            }
                        }
                        anonymousClass0604.A0S(A0E, c14410mu.A02, c14410mu.A04, c14410mu.A05, arrayList4, i2, c05200Ns2, bArr2, false, r52.A01.A0E(C01C.A0W));
                    }
                }
            } else {
                StringBuilder sb7 = new StringBuilder("vname certificate details could no be found or validated for jid ");
                sb7.append(append);
                Log.w(sb7.toString());
            }
            r5.A0A.put(put, Long.valueOf(System.currentTimeMillis()));
            r5.A02.A02(new C0QX(put));
            throw th7;
        }
    }
}
