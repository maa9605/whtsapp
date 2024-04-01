package X;

import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1u5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C1u5 implements C0EK {
    public static volatile C1u5 A1V;
    public int A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C02L A03;
    public final C0E3 A04;
    public final C0E4 A05;
    public final C01B A06;
    public final C0EL A07;
    public final C0EP A08;
    public final C0E6 A09;
    public final C06K A0A;
    public final C41611uE A0B;
    public final C40261rr A0C;
    public final C41541u6 A0D;
    public final C41831ua A0E;
    public final C05W A0F;
    public final AnonymousClass075 A0G;
    public final C41691uM A0H;
    public final C41581uB A0I;
    public final C41651uI A0J;
    public final C0E7 A0K;
    public final AnonymousClass012 A0L;
    public final C001200o A0M;
    public final C002301c A0N;
    public final C01J A0O;
    public final C01R A0P;
    public final C06T A0Q;
    public final C41181tV A0R;
    public final C05M A0S;
    public final C0DK A0T;
    public final C0C9 A0U;
    public final C41561u9 A0V;
    public final C0C8 A0W;
    public final C0EO A0X;
    public final C40411sD A0Y;
    public final C00A A0Z;
    public final C0ET A0a;
    public final C41661uJ A0b;
    public final C013306k A0c;
    public final C0EV A0d;
    public final C41811uY A0e;
    public final C0E9 A0f;
    public final C0EB A0g;
    public final C41711uO A0h;
    public final C41401tr A0i;
    public final C0EC A0j;
    public final C013606n A0k;
    public final C41741uR A0l;
    public final C41421tt A0m;
    public final C0ED A0n;
    public final C003701t A0o;
    public final AnonymousClass011 A0p;
    public final C0ES A0q;
    public final C41451tw A0r;
    public final C41771uU A0s;
    public final C41571uA A0t;
    public final C41601uD A0u;
    public final C41701uN A0v;
    public final C41501u1 A0w;
    public final C41671uK A0x;
    public final C41591uC A0y;
    public final C009905a A0z;
    public final C0EE A10;
    public final C41761uT A11;
    public final C0EF A12;
    public final C0EN A13;
    public final C0EG A14;
    public final C41681uL A15;
    public final C41521u3 A16;
    public final C41721uP A17;
    public final C0EJ A18;
    public final C41621uF A19;
    public final C41751uS A1A;
    public final C0EU A1B;
    public final C0EX A1C;
    public final C41821uZ A1D;
    public final C0DW A1E;
    public final C0DV A1F;
    public final C41841ub A1G;
    public final C05U A1H;
    public final C41631uG A1I;
    public final C07A A1J;
    public final C0ER A1K;
    public final AbstractC41801uX A1L;
    public final AbstractC41791uW A1M;
    public final C0EY A1N;
    public final C41731uQ A1O;
    public final InterfaceC002901k A1P;
    public final C41641uH A1Q;
    public final C41781uV A1R;
    public final C0EW A1S;
    public final Set A1U = new HashSet();
    public final Set A1T = new HashSet();

    public C1u5(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C05M c05m, C0EL c0el, AnonymousClass011 anonymousClass011, C41181tV c41181tV, C0EG c0eg, C01B c01b, C0EB c0eb, C41541u6 c41541u6, C0EN c0en, C0E6 c0e6, C05W c05w, C0ED c0ed, C0EO c0eo, C0E3 c0e3, C01R c01r, C0EP c0ep, C41521u3 c41521u3, C002301c c002301c, C05U c05u, C0DV c0dv, C40261rr c40261rr, C0C9 c0c9, C41561u9 c41561u9, C0ER c0er, C0ES c0es, C009905a c009905a, C00A c00a, C0E4 c0e4, C0EF c0ef, C41571uA c41571uA, C41581uB c41581uB, C41591uC c41591uC, C41601uD c41601uD, C40411sD c40411sD, C0EE c0ee, C41421tt c41421tt, C01J c01j, C0EC c0ec, C06T c06t, C0ET c0et, C0EU c0eu, C0EV c0ev, C0E9 c0e9, C41611uE c41611uE, C0EJ c0ej, C0E7 c0e7, C41621uF c41621uF, C41631uG c41631uG, AnonymousClass075 anonymousClass075, C41641uH c41641uH, C41451tw c41451tw, C41651uI c41651uI, C41401tr c41401tr, C41661uJ c41661uJ, C07A c07a, C41671uK c41671uK, C0DW c0dw, C41681uL c41681uL, C41691uM c41691uM, C41701uN c41701uN, C0EW c0ew, C06K c06k, C41711uO c41711uO, C41721uP c41721uP, C013606n c013606n, C41501u1 c41501u1, C41731uQ c41731uQ, C41741uR c41741uR, C41751uS c41751uS, C013306k c013306k, C41761uT c41761uT, C41771uU c41771uU, C41781uV c41781uV, C0C8 c0c8, AbstractC41791uW abstractC41791uW, AbstractC41801uX abstractC41801uX, C0DK c0dk, C41811uY c41811uY, C0EX c0ex, C41821uZ c41821uZ, C41831ua c41831ua, C41841ub c41841ub, C0EY c0ey) {
        this.A0M = c001200o;
        this.A0L = anonymousClass012;
        this.A0o = c003701t;
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A03 = c02l;
        this.A1P = interfaceC002901k;
        this.A0S = c05m;
        this.A07 = c0el;
        this.A0p = anonymousClass011;
        this.A0R = c41181tV;
        this.A14 = c0eg;
        this.A06 = c01b;
        this.A0g = c0eb;
        this.A0D = c41541u6;
        this.A13 = c0en;
        this.A09 = c0e6;
        this.A0n = c0ed;
        this.A0F = c05w;
        this.A0X = c0eo;
        this.A04 = c0e3;
        this.A08 = c0ep;
        this.A16 = c41521u3;
        this.A0N = c002301c;
        this.A1H = c05u;
        this.A1F = c0dv;
        this.A0C = c40261rr;
        this.A0U = c0c9;
        this.A0V = c41561u9;
        this.A1K = c0er;
        this.A0q = c0es;
        this.A0z = c009905a;
        this.A0Z = c00a;
        this.A05 = c0e4;
        this.A12 = c0ef;
        this.A0t = c41571uA;
        this.A0I = c41581uB;
        this.A0y = c41591uC;
        this.A0u = c41601uD;
        this.A0Y = c40411sD;
        this.A10 = c0ee;
        this.A0m = c41421tt;
        this.A0O = c01j;
        this.A0j = c0ec;
        this.A0Q = c06t;
        this.A0a = c0et;
        this.A1B = c0eu;
        this.A0d = c0ev;
        this.A0f = c0e9;
        this.A0B = c41611uE;
        this.A18 = c0ej;
        this.A0K = c0e7;
        this.A19 = c41621uF;
        this.A1I = c41631uG;
        this.A0G = anonymousClass075;
        this.A1Q = c41641uH;
        this.A0r = c41451tw;
        this.A0J = c41651uI;
        this.A0i = c41401tr;
        this.A0b = c41661uJ;
        this.A1J = c07a;
        this.A0x = c41671uK;
        this.A1E = c0dw;
        this.A15 = c41681uL;
        this.A0H = c41691uM;
        this.A0v = c41701uN;
        this.A1S = c0ew;
        this.A0A = c06k;
        this.A0h = c41711uO;
        this.A17 = c41721uP;
        this.A0k = c013606n;
        this.A0w = c41501u1;
        this.A1O = c41731uQ;
        this.A0l = c41741uR;
        this.A1A = c41751uS;
        this.A0c = c013306k;
        this.A11 = c41761uT;
        this.A0s = c41771uU;
        this.A1R = c41781uV;
        this.A0W = c0c8;
        this.A1M = abstractC41791uW;
        this.A1L = abstractC41801uX;
        this.A0T = c0dk;
        this.A0e = c41811uY;
        this.A1C = c0ex;
        this.A1D = c41821uZ;
        this.A0E = c41831ua;
        this.A1N = c0ey;
        this.A0P = c01r;
        this.A1G = c41841ub;
    }

    public final int A00(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 != null) {
            if (bArr == null) {
                Log.e("MessagingXmppHandler/validateServerErrorEncData/badmediadata;");
                return 0;
            } else if (bArr3 == null) {
                Log.e("MessagingXmppHandler/validateServerErrorEncData/incomplete enc data");
                return 0;
            } else {
                C41501u1 c41501u1 = this.A0w;
                C41501u1.A01(bArr, bArr3);
                if (c41501u1.A00.A00 != null) {
                    NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(1, str, bArr2, bArr, bArr3);
                    if (nativeHolder != null) {
                        C07850aC c07850aC = new C07850aC(nativeHolder);
                        JniBridge jniBridge = JniBridge.getInstance();
                        NativeHolder nativeHolder2 = c07850aC.A00;
                        if (jniBridge != null) {
                            long j = 22;
                            if (!str.equals(JniBridge.jvidispatchOIO(1, j, nativeHolder2))) {
                                StringBuilder A0W = C000200d.A0W("MessagingXmppHandler/validateServerErrorEncData/incorrect stanza id; key=", str, "; stanzaId=");
                                if (JniBridge.getInstance() != null) {
                                    A0W.append((String) JniBridge.jvidispatchOIO(1, j, nativeHolder2));
                                    Log.e(A0W.toString());
                                    return 0;
                                }
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        Log.e("MessagingXmppHandler/validateServerErrorEncData/malformed enc data");
                        return 3;
                    }
                } else {
                    throw null;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    public final void A01() {
        C0CE c0ce;
        Cursor A07;
        ArrayList<C05190Nr> arrayList;
        Message.obtain(this.A0X.A00, 7).sendToTarget();
        C41561u9 c41561u9 = this.A0V;
        synchronized (c41561u9.A0X) {
            try {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0CD A04 = c41561u9.A0H.A04();
                    try {
                        c0ce = A04.A02;
                        A07 = c0ce.A07("SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count  FROM message_orphaned_edit", null);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        try {
                            if (A07 == null) {
                                Log.e("msgstore/resolve-orphaned-edits/cursor-null");
                                ?? emptyList = Collections.emptyList();
                                A04.close();
                                arrayList = emptyList;
                            } else {
                                C0EB c0eb = c41561u9.A0N;
                                c0eb.A0C();
                                Map unmodifiableMap = Collections.unmodifiableMap(c0eb.A05);
                                long A05 = c41561u9.A01.A05();
                                int i = 0;
                                int i2 = 0;
                                while (A07.moveToNext()) {
                                    C42771wI A01 = c41561u9.A01(A07);
                                    if (A01 != null) {
                                        int i3 = A01.A01;
                                        if (i3 == 0) {
                                            String str = A01.A05;
                                            if (!TextUtils.isEmpty(str)) {
                                                C03890Hn c03890Hn = new C03890Hn(A01.A04, A01.A02);
                                                c03890Hn.A00 = str;
                                                c03890Hn.A0d(A01.A03);
                                                ((AnonymousClass092) c03890Hn).A00 = 7;
                                                c03890Hn.A07 = A01.A00;
                                                c41561u9.A02(0, c03890Hn, false, true);
                                                i++;
                                            }
                                        } else if (i3 == 1) {
                                            long j = A01.A02;
                                            if (j + 86400000 > A05) {
                                                AbstractC005302j abstractC005302j = A01.A03;
                                                if (unmodifiableMap.get(abstractC005302j) != null) {
                                                    C05U c05u = c41561u9.A0W;
                                                    AnonymousClass094 anonymousClass094 = A01.A04;
                                                    AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
                                                    if (abstractC005302j2 != null) {
                                                        try {
                                                            C05190Nr c05190Nr = new C05190Nr(c05u, abstractC005302j2, null, anonymousClass094.A01, j, false);
                                                            if (abstractC005302j != null) {
                                                                c05190Nr.A06 = abstractC005302j;
                                                                c05190Nr.A0E = 7;
                                                                c05190Nr.A0H = Integer.valueOf(A01.A00);
                                                                arrayList2.add(c05190Nr);
                                                                i2++;
                                                            } else {
                                                                throw null;
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            throw th;
                                                        }
                                                    } else {
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Log.e("msgstore/edit/resolve-orphaned-edits error reading orphaned message");
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("msgstore/edit/resolve-orphaned-edits orphaned=");
                                sb.append(i);
                                sb.append(" delayed=");
                                sb.append(i2);
                                Log.i(sb.toString());
                                c0ce.A01("message_orphaned_edit", null, null);
                                A07.close();
                                A04.close();
                                arrayList = arrayList2;
                            }
                            for (C05190Nr c05190Nr2 : arrayList) {
                                A05(c05190Nr2);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final void A02(DeviceJid deviceJid, C05190Nr c05190Nr) {
        if ((this.A03.A09(deviceJid) && "peer".equals(c05190Nr.A0N)) || c05190Nr.A00() == 7) {
            this.A13.A05(c05190Nr);
            return;
        }
        C01R c01r = this.A0P;
        c01r.A00.execute(new RunnableEBaseShape3S0200000_I0_3(this, c05190Nr, 47));
    }

    public final void A03(DeviceJid deviceJid, C05190Nr c05190Nr, Map map) {
        Set set = this.A1T;
        synchronized (set) {
            if (!map.isEmpty() && set.contains(map)) {
                StringBuilder sb = new StringBuilder();
                sb.append("messagingXmppHandler/onMessageForMe message in queue; skipping id:");
                sb.append((String) map.get("id"));
                Log.i(sb.toString());
            } else {
                if (!map.isEmpty() && this.A06.A0E(C01C.A1S)) {
                    set.add(map);
                }
                this.A00++;
                AnonymousClass012 anonymousClass012 = this.A0L;
                C003701t c003701t = this.A0o;
                C018508q c018508q = this.A02;
                AbstractC000600i abstractC000600i = this.A01;
                C02L c02l = this.A03;
                C001200o c001200o = this.A0M;
                InterfaceC002901k interfaceC002901k = this.A1P;
                C05M c05m = this.A0S;
                C41181tV c41181tV = this.A0R;
                C0EG c0eg = this.A14;
                C01B c01b = this.A06;
                C0EN c0en = this.A13;
                C0E6 c0e6 = this.A09;
                C05W c05w = this.A0F;
                C0ED c0ed = this.A0n;
                C0E3 c0e3 = this.A04;
                C002301c c002301c = this.A0N;
                C05U c05u = this.A1H;
                C0DV c0dv = this.A1F;
                C0C9 c0c9 = this.A0U;
                C41591uC c41591uC = this.A0y;
                C01J c01j = this.A0O;
                C0EU c0eu = this.A1B;
                C41611uE c41611uE = this.A0B;
                C0EJ c0ej = this.A18;
                C2TX c2tx = new C2TX(anonymousClass012, c003701t, c018508q, abstractC000600i, c02l, c001200o, interfaceC002901k, c05m, c41181tV, c0eg, c01b, c0en, c0e6, c05w, c0ed, c0e3, c002301c, c05u, c0dv, c0c9, c41591uC, c01j, c0eu, c41611uE, c0ej, this.A0G, this.A0x, this.A1E, this.A15, this.A0A, this.A0k, this.A1O, this.A1A, this.A0c, this.A1C, this.A1D, this.A1N);
                C07860aD A03 = c0ej.A03(c05190Nr);
                if (A03 != null) {
                    A03.A01 = this.A00 - 1;
                    A03.A00(2);
                }
                this.A0P.A00.execute(new RunnableEBaseShape0S0500000_I0(map, this, deviceJid, c2tx, c05190Nr, 5));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(X.C2TZ r32, long r33) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1u5.A04(X.2TZ, long):void");
    }

    public final void A05(C05190Nr c05190Nr) {
        new C2HA(this.A14, this.A09, this.A05, this.A0O, this.A0Q, this.A0x, c05190Nr, null, null, null, true).A00();
    }

    public final void A06(Runnable runnable, int i) {
        if (this.A06.A0E(C01C.A28)) {
            C06T c06t = this.A0Q;
            if (i < 52) {
                Handler handler = c06t.A01;
                Message obtain = Message.obtain(handler, runnable);
                obtain.arg1 = i;
                handler.sendMessage(obtain);
                return;
            }
            throw new IllegalArgumentException("Not supported TaskId");
        }
        this.A0Q.A01(runnable, i);
    }

    public final void A07(boolean z, String str, Jid jid, AnonymousClass097 anonymousClass097, int i, AbstractC005302j abstractC005302j, boolean z2, UserJid userJid) {
        C09H c09h;
        if (z) {
            C02L c02l = this.A03;
            c02l.A05();
            if (c02l.A03 != null && c02l.A09(DeviceJid.of(jid))) {
                if (anonymousClass097 == null || !((c09h = anonymousClass097.A02) == null || c09h.A0U == null)) {
                    this.A0w.A02(anonymousClass097, i, jid, str, abstractC005302j, z2, userJid, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r21.A12.A02(r2.A00) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A08(long r22, X.AnonymousClass092 r24, com.whatsapp.jid.DeviceJid r25, int r26, X.C05200Ns r27) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1u5.A08(long, X.092, com.whatsapp.jid.DeviceJid, int, X.0Ns):boolean");
    }

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{0, 1, 2, 19, 3, 69, 86, 16, 15, 215};
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03cc, code lost:
        if (java.lang.Integer.parseInt(r7) != 7) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0a4d, code lost:
        if (r20 == null) goto L496;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:540:? A[RETURN, SYNTHETIC] */
    @Override // X.C0EK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AEN(int r31, android.os.Message r32) {
        /*
            Method dump skipped, instructions count: 3230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1u5.AEN(int, android.os.Message):boolean");
    }
}
