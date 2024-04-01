package X;

import android.app.Activity;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextData;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.08r */
/* loaded from: classes.dex */
public class C018608r {
    public static volatile C018608r A1D;
    public PowerManager.WakeLock A00;
    public final AbstractC000600i A01;
    public final C04480Ki A02;
    public final C0IK A03;
    public final C018508q A04;
    public final C03940Hu A05;
    public final C02L A06;
    public final C01B A07;
    public final C0L8 A08;
    public final C010005b A09;
    public final C03160Eo A0A;
    public final C06K A0B;
    public final C41541u6 A0C;
    public final C05W A0D;
    public final C42371vd A0E;
    public final C018708s A0F;
    public final C41221tZ A0G;
    public final C000400f A0H;
    public final C02E A0I;
    public final AnonymousClass012 A0J;
    public final C001200o A0K;
    public final C02F A0L;
    public final C002301c A0M;
    public final C06T A0N;
    public final C05R A0O;
    public final C41181tV A0P;
    public final C05M A0Q;
    public final C0DK A0R;
    public final C03340Fh A0S;
    public final C0CA A0T;
    public final C0C9 A0U;
    public final C41561u9 A0V;
    public final C23Y A0W;
    public final C0C8 A0X;
    public final C2ES A0Y;
    public final C03180Eq A0Z;
    public final C012406b A0a;
    public final C00A A0b;
    public final C0E9 A0c;
    public final C43081wp A0d;
    public final C22X A0e;
    public final C013006h A0f;
    public final C40421sE A0g;
    public final C0ED A0h;
    public final C003701t A0i;
    public final C03300Fd A0j;
    public final AnonymousClass011 A0k;
    public final C41451tw A0l;
    public final C41461tx A0m;
    public final C41491u0 A0n;
    public final C41771uU A0o;
    public final C43401xL A0p;
    public final C43131wu A0q;
    public final C42451vl A0r;
    public final C43091wq A0s;
    public final C43391xK A0t;
    public final C47892Cz A0u;
    public final C05Y A0v;
    public final C41511u2 A0w;
    public final C0EG A0x;
    public final C41521u3 A0y;
    public final C40301ry A0z;
    public final C22I A10;
    public final AnonymousClass247 A11;
    public final C05U A12;
    public final C0IY A13;
    public final C0CB A14;
    public final C2EQ A15;
    public final C2AM A16;
    public final C2AS A17;
    public final C2ER A18;
    public final C42461vm A19;
    public final C41961un A1A;
    public final InterfaceC002901k A1B;
    public final C41991uq A1C;

    public C018608r(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C42461vm c42461vm, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C05M c05m, AnonymousClass011 anonymousClass011, C41991uq c41991uq, C41181tV c41181tV, C0EG c0eg, C01B c01b, C41541u6 c41541u6, C05R c05r, C41491u0 c41491u0, C05Y c05y, C0IY c0iy, C03160Eo c03160Eo, C05W c05w, C0ED c0ed, C23Y c23y, C41961un c41961un, C2AM c2am, C02E c02e, C43091wq c43091wq, C018708s c018708s, C41521u3 c41521u3, C002301c c002301c, C04480Ki c04480Ki, C05U c05u, C22I c22i, C03300Fd c03300Fd, C0C9 c0c9, C41561u9 c41561u9, C03180Eq c03180Eq, C00A c00a, C010005b c010005b, C0CB c0cb, C03940Hu c03940Hu, C000400f c000400f, AnonymousClass247 anonymousClass247, C2AS c2as, C0L8 c0l8, C06T c06t, C0E9 c0e9, C43391xK c43391xK, C41511u2 c41511u2, C22X c22x, C43131wu c43131wu, C012406b c012406b, C40301ry c40301ry, C43081wp c43081wp, C41451tw c41451tw, C02F c02f, C40421sE c40421sE, C0CA c0ca, C0IK c0ik, C42451vl c42451vl, C2EQ c2eq, C43401xL c43401xL, C013006h c013006h, C03340Fh c03340Fh, C47892Cz c47892Cz, C06K c06k, C41461tx c41461tx, C41221tZ c41221tZ, C41771uU c41771uU, C0C8 c0c8, C42371vd c42371vd, C0DK c0dk, C2ER c2er, C2ES c2es) {
        this.A0K = c001200o;
        this.A0J = anonymousClass012;
        this.A0i = c003701t;
        this.A19 = c42461vm;
        this.A04 = c018508q;
        this.A01 = abstractC000600i;
        this.A06 = c02l;
        this.A1B = interfaceC002901k;
        this.A0Q = c05m;
        this.A0k = anonymousClass011;
        this.A1C = c41991uq;
        this.A0P = c41181tV;
        this.A0x = c0eg;
        this.A07 = c01b;
        this.A0C = c41541u6;
        this.A0O = c05r;
        this.A0n = c41491u0;
        this.A13 = c0iy;
        this.A0A = c03160Eo;
        this.A0D = c05w;
        this.A0h = c0ed;
        this.A0W = c23y;
        this.A0v = c05y;
        this.A1A = c41961un;
        this.A16 = c2am;
        this.A0I = c02e;
        this.A0s = c43091wq;
        this.A0F = c018708s;
        this.A0y = c41521u3;
        this.A0M = c002301c;
        this.A02 = c04480Ki;
        this.A12 = c05u;
        this.A10 = c22i;
        this.A0j = c03300Fd;
        this.A0U = c0c9;
        this.A0V = c41561u9;
        this.A0Z = c03180Eq;
        this.A0b = c00a;
        this.A09 = c010005b;
        this.A14 = c0cb;
        this.A05 = c03940Hu;
        this.A0H = c000400f;
        this.A11 = anonymousClass247;
        this.A17 = c2as;
        this.A08 = c0l8;
        this.A0N = c06t;
        this.A0c = c0e9;
        this.A0t = c43391xK;
        this.A0w = c41511u2;
        this.A0e = c22x;
        this.A0q = c43131wu;
        this.A0a = c012406b;
        this.A0z = c40301ry;
        this.A0d = c43081wp;
        this.A0l = c41451tw;
        this.A0L = c02f;
        this.A0g = c40421sE;
        this.A0T = c0ca;
        this.A03 = c0ik;
        this.A0r = c42451vl;
        this.A15 = c2eq;
        this.A0p = c43401xL;
        this.A0f = c013006h;
        this.A0S = c03340Fh;
        this.A0u = c47892Cz;
        this.A0m = c41461tx;
        this.A0B = c06k;
        this.A0G = c41221tZ;
        this.A0o = c41771uU;
        this.A0X = c0c8;
        this.A0E = c42371vd;
        this.A0R = c0dk;
        this.A18 = c2er;
        this.A0Y = c2es;
    }

    public static /* synthetic */ int A00(C2ET c2et, C2ET c2et2) {
        return (c2et2.A00 > c2et.A00 ? 1 : (c2et2.A00 == c2et.A00 ? 0 : -1));
    }

    public static /* synthetic */ int A01(C2ET c2et, C2ET c2et2) {
        return (c2et2.A00 > c2et.A00 ? 1 : (c2et2.A00 == c2et.A00 ? 0 : -1));
    }

    public static C018608r A02() {
        if (A1D == null) {
            synchronized (C018608r.class) {
                if (A1D == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C42461vm A003 = C42461vm.A00();
                    C018508q A004 = C018508q.A00();
                    AbstractC000600i A005 = AbstractC000600i.A00();
                    C02L A006 = C02L.A00();
                    InterfaceC002901k A007 = C002801j.A00();
                    C05M A008 = C05M.A00();
                    AnonymousClass011 A009 = AnonymousClass011.A00();
                    C41991uq A0010 = C41991uq.A00();
                    C41181tV A0011 = C41181tV.A00();
                    C0EG A0012 = C0EG.A00();
                    C01B A0013 = C01B.A00();
                    C41541u6 A0014 = C41541u6.A00();
                    C05R A0015 = C05R.A00();
                    C41491u0 A0016 = C41491u0.A00();
                    C05Y A01 = C05Y.A01();
                    C0IY A0017 = C0IY.A00();
                    C03160Eo A0018 = C03160Eo.A00();
                    C05W A0019 = C05W.A00();
                    C0ED A012 = C0ED.A01();
                    C23Y A0020 = C23Y.A00();
                    C41961un A0S = C41961un.A0S();
                    C2AM A0021 = C2AM.A00();
                    C02E A0022 = C02E.A00();
                    C43091wq A013 = C43091wq.A01();
                    C018708s A0023 = C018708s.A00();
                    C41521u3 A0024 = C41521u3.A00();
                    C002301c A0025 = C002301c.A00();
                    C04480Ki c04480Ki = C04480Ki.A01;
                    C05U A014 = C05U.A01();
                    C22I A0026 = C22I.A00();
                    C03300Fd A0027 = C03300Fd.A00();
                    C0C9 A0028 = C0C9.A00();
                    C41561u9 A0029 = C41561u9.A00();
                    C03180Eq A0030 = C03180Eq.A00();
                    C00A c00a = C00A.A00;
                    C010005b c010005b = C010005b.A07;
                    C0CB A0031 = C0CB.A00();
                    C03940Hu A0032 = C03940Hu.A00();
                    C000400f A0033 = C000400f.A00();
                    AnonymousClass247 A0034 = AnonymousClass247.A00();
                    C2AS A0035 = C2AS.A00();
                    C0L8 A0036 = C0L8.A00();
                    C06T c06t = C06T.A02;
                    C0E9 A0037 = C0E9.A00();
                    C43391xK A0038 = C43391xK.A00();
                    C41511u2 A0039 = C41511u2.A00();
                    C22X A0040 = C22X.A00();
                    C43131wu A0041 = C43131wu.A00();
                    C012406b A0042 = C012406b.A00();
                    C40301ry A0043 = C40301ry.A00();
                    C43081wp A0044 = C43081wp.A00();
                    C41451tw A0045 = C41451tw.A00();
                    C02F A0046 = C02F.A00();
                    C40421sE A0047 = C40421sE.A00();
                    C0CA A0048 = C0CA.A00();
                    C0IK A015 = C0IK.A01();
                    C42451vl A0049 = C42451vl.A00();
                    C2EQ A0050 = C2EQ.A00();
                    C43401xL c43401xL = C43401xL.A01;
                    if (c43401xL == null) {
                        c43401xL = new C43401xL(C000500h.A00());
                        C43401xL.A01 = c43401xL;
                    }
                    A1D = new C018608r(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A01, A0017, A0018, A0019, A012, A0020, A0S, A0021, A0022, A013, A0023, A0024, A0025, c04480Ki, A014, A0026, A0027, A0028, A0029, A0030, c00a, c010005b, A0031, A0032, A0033, A0034, A0035, A0036, c06t, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A015, A0049, A0050, c43401xL, C013006h.A00(), C03340Fh.A00, C47892Cz.A00(), C06K.A00(), C41461tx.A00(), C41221tZ.A00(), C41771uU.A00(), C0C8.A00(), C42371vd.A00(), C0DK.A00(), C2ER.A00, C2ES.A00());
                }
            }
        }
        return A1D;
    }

    public static String A03(AbstractC000600i abstractC000600i, AnonymousClass097 anonymousClass097) {
        File file;
        if (!TextUtils.isEmpty(anonymousClass097.A07)) {
            return anonymousClass097.A07;
        }
        C09H c09h = anonymousClass097.A02;
        if (c09h != null && (file = c09h.A0F) != null) {
            try {
                byte b = anonymousClass097.A0m;
                if (b == 2) {
                    return C42591vz.A0B(C42591vz.A05(file));
                }
                if (b == 3 || b == 13) {
                    return C42591vz.A0A(abstractC000600i, file);
                }
            } catch (C43691xo | IOException e) {
                Log.e("useractions/getmediamimetype exception", e);
            }
        }
        byte b2 = anonymousClass097.A0m;
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 == 3 || b2 == 13) {
                    return "video/*";
                }
                return (b2 == 23 || b2 == 25 || b2 == 37 || b2 == 42) ? "image/jpeg" : b2 != 43 ? "*/*" : "video/*";
            }
            return "audio/*";
        }
        return "image/jpeg";
    }

    public final PowerManager.WakeLock A04() {
        if (this.A00 == null) {
            PowerManager A0D = this.A0I.A0D();
            if (A0D == null) {
                Log.w("useractions/get-web-wakelock pm=null");
            } else {
                PowerManager.WakeLock A0R = C02180Ae.A0R(A0D, 1, "Web Client");
                this.A00 = A0R;
                A0R.setReferenceCounted(false);
            }
        }
        return this.A00;
    }

    public final C06C A05(AnonymousClass092 anonymousClass092) {
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (C003101m.A0U(abstractC005302j) || C003101m.A0Z(abstractC005302j)) {
            abstractC005302j = anonymousClass092.A0A();
        }
        if (abstractC005302j != null) {
            return this.A0R.A02(abstractC005302j);
        }
        return null;
    }

    public /* synthetic */ void A06() {
        this.A18.A02("starred");
    }

    public void A07(int i, AnonymousClass092 anonymousClass092) {
        C43131wu c43131wu = this.A0q;
        int i2 = 3;
        if (i != 4) {
            if (i == 3) {
                i2 = 2;
            } else {
                i2 = 0;
                if (i == 2) {
                    i2 = 1;
                }
            }
        }
        c43131wu.A05(i2, C002701i.A00(anonymousClass092.A0m, anonymousClass092.A04, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0044, code lost:
        if (r17.A0X.A05((com.whatsapp.jid.GroupJid) r20) == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(long r18, X.AbstractC005302j r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018608r.A08(long, X.02j, boolean):void");
    }

    public void A09(Activity activity, final C018308n c018308n, final AnonymousClass092 anonymousClass092) {
        File file;
        if (!(anonymousClass092 instanceof AnonymousClass097)) {
            Log.w("app/share/message-is-not-media-message");
            this.A04.A07(this.A19.A01(), 0);
            return;
        }
        final AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
        C09H c09h = anonymousClass097.A02;
        if (c09h != null && (file = c09h.A0F) != null && file.exists()) {
            InterfaceC002901k interfaceC002901k = this.A1B;
            interfaceC002901k.AS1(new Runnable() { // from class: X.1J1
                {
                    C018608r.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C018608r.this.A0Q(anonymousClass092);
                }
            });
            final WeakReference weakReference = new WeakReference(activity);
            C018508q c018508q = this.A04;
            c018508q.A06(0, R.string.loading_spinner);
            MediaProvider.A05(c018508q, this.A01, interfaceC002901k, this.A0g, anonymousClass097, new C0CG() { // from class: X.1hd
                {
                    C018608r.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    C018608r.this.A0a(weakReference, c018308n, anonymousClass097, (Uri) obj);
                }
            });
            return;
        }
        Log.w("app/share/media-does-not-exist");
        this.A04.A07(this.A19.A01(), 0);
    }

    /* JADX WARN: Finally extract failed */
    public void A0A(Uri uri, List list, AnonymousClass092 anonymousClass092, C468628o c468628o, UserJid userJid) {
        try {
            Bitmap A0Z = this.A1A.A0Z(uri, 100, 100);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                A0Z.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                A0Z.recycle();
                final ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C09H c09h = new C09H();
                    C04160Iu A0A = this.A0n.A0A((AbstractC005302j) it.next(), c09h, uri, anonymousClass092);
                    A0A.A1M(c468628o);
                    A0A.A01 = userJid;
                    arrayList.add(A0A);
                }
                C018508q c018508q = this.A04;
                c018508q.A02.post(new Runnable() { // from class: X.1J0
                    {
                        C018608r.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C018608r c018608r = C018608r.this;
                        ArrayList arrayList2 = arrayList;
                        c018608r.A0C(new C04130Ir(arrayList2), byteArray);
                    }
                });
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } catch (C42671w8 | IOException | OutOfMemoryError e) {
            this.A04.A05(R.string.catalog_product_send_message_failed, 0);
            Log.e("userActionSendProductMessages/product thumbnail load failed", e);
        }
    }

    public void A0B(ActivityC02290Ap activityC02290Ap, AnonymousClass097 anonymousClass097, boolean z) {
        C000400f c000400f = this.A0H;
        if (c000400f.A0A(new C2EV(c000400f, activityC02290Ap))) {
            C2EX c2ex = null;
            if (z) {
                boolean z2 = anonymousClass097 instanceof C04160Iu;
                C018508q c018508q = this.A04;
                AnonymousClass011 anonymousClass011 = this.A0k;
                C018708s c018708s = this.A0F;
                C06C A05 = A05(anonymousClass097);
                if (z2) {
                    c2ex = new C2EX(c018508q, anonymousClass011, c018708s, c000400f, activityC02290Ap, A05) { // from class: X.2EW
                    };
                } else {
                    c2ex = new C2EX(c018508q, anonymousClass011, c018708s, c000400f, activityC02290Ap, A05);
                }
            }
            this.A0r.A05(anonymousClass097, 0, c2ex);
        }
    }

    public void A0C(C04130Ir c04130Ir, byte[] bArr) {
        A0D(c04130Ir, bArr, null, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0032, code lost:
        if (r2.A05(r20.A00()) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0D(final X.C04130Ir r20, final byte[] r21, final X.AnonymousClass097 r22, final X.C22e r23, final boolean r24) {
        /*
            r19 = this;
            java.lang.String r0 = "useractions/useractionsendmediamessages/size = "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            r15 = r20
            java.util.concurrent.CopyOnWriteArrayList r7 = r15.A01
            int r0 = r7.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            r13 = r19
            X.1wq r2 = r13.A0s
            X.097 r0 = r15.A00()
            r12 = 0
            if (r2 == 0) goto Le2
            r6 = 1
            boolean r0 = r2.A06(r0)     // Catch: java.io.IOException -> L35
            if (r0 != 0) goto L3b
            X.097 r0 = r15.A00()
            boolean r0 = r2.A05(r0)
            if (r0 == 0) goto L5b
            goto L3b
        L35:
            r1 = move-exception
            java.lang.String r0 = "transcodeutils/needtranscodemedia exception"
            com.whatsapp.util.Log.e(r0, r1)
        L3b:
            X.097 r0 = r15.A00()
            if (r2 == 0) goto Le1
            X.0DC r1 = X.C0DC.A02(r0)
            X.09H r0 = r0.A02
            if (r0 == 0) goto Le0
            java.io.File r0 = r0.A0F
            boolean r0 = r2.A03(r1, r0)
            if (r0 != 0) goto L5b
            X.08q r2 = r13.A04
            r1 = 2131889822(0x7f120e9e, float:1.9414318E38)
            r0 = 0
            r2.A07(r1, r0)
            return
        L5b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            java.util.Iterator r11 = r0.iterator()
        L68:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r4 = r11.next()
            X.097 r4 = (X.AnonymousClass097) r4
            r5.add(r4)
            r13.A0R(r4)
            X.01B r9 = r13.A07
            X.039 r8 = X.C01C.A3w
            int r2 = r9.A07(r8)
            int r0 = r7.size()
            if (r0 != r6) goto Lae
            X.094 r0 = r4.A0n
            X.02j r0 = r0.A00
            boolean r0 = X.C003101m.A0Z(r0)
            if (r0 == 0) goto Lae
            byte r1 = r4.A0m
            r0 = 3
            if (r1 != r0) goto Lae
            int r0 = r4.A00
            if (r0 <= r2) goto Lae
            r4.A00 = r2
            X.09H r10 = r4.A02
            if (r10 == 0) goto Lcc
            long r2 = r10.A0D
            int r0 = r9.A07(r8)
            long r0 = (long) r0
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            long r0 = r0 + r2
            r10.A0E = r0
        Lae:
            X.2Cz r1 = r13.A0u
            if (r1 == 0) goto Lcb
            X.094 r2 = r4.A0n
            X.02j r0 = r2.A00
            if (r0 == 0) goto Lca
            X.2D0 r1 = r1.A01(r0)
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.A01     // Catch: java.lang.Throwable -> Lc7
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> Lc7
            r1.toString()     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r1)
            goto L68
        Lc7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lca:
            throw r12
        Lcb:
            throw r12
        Lcc:
            throw r12
        Lcd:
            r14 = r21
            r0 = r22
            r18 = r24
            r16 = r23
            r17 = r0
            X.1It r12 = new X.1It
            r12.<init>()
            r13.A0T(r0, r5, r14, r12)
            return
        Le0:
            throw r12
        Le1:
            throw r12
        Le2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018608r.A0D(X.0Ir, byte[], X.097, X.22e, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:349:0x015a, code lost:
        if (((X.AnonymousClass097) r36).A05 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01b7, code lost:
        if (r0 == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01ba, code lost:
        if (r0 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01bc, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01c6, code lost:
        if (android.text.TextUtils.isEmpty(((X.AnonymousClass097) r36).A09) == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01c8, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x01c9, code lost:
        if (r12 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x01cb, code lost:
        if (r3 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x01cd, code lost:
        if (r0 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01cf, code lost:
        r1 = r34.A06;
        r10 = r34.A0J.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01db, code lost:
        if (X.C0DB.A0E(r0) != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01e1, code lost:
        if (X.C0DB.A0C(r0) == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01e7, code lost:
        if (X.C0DB.A0J(r1, r36) != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01e9, code lost:
        r8 = r2.A07(X.C01C.A2m) * 1000;
        r1 = r36.A0E + r8;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x01fa, code lost:
        if (r8 == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01fc, code lost:
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0200, code lost:
        if (r10 < r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0202, code lost:
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0204, code lost:
        if (r12 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0208, code lost:
        if ((r36 instanceof X.C0JP) == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x020a, code lost:
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0213, code lost:
        if (X.C0DB.A0p((X.C0JP) r36) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0215, code lost:
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0217, code lost:
        r19 = r37.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x021f, code lost:
        if (r19.hasNext() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0221, code lost:
        r13 = (X.AbstractC005302j) r19.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0227, code lost:
        r11 = r34.A12;
        r2 = r34.A0J.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x022f, code lost:
        if (r21 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0231, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0232, code lost:
        if (r20 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0234, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x023c, code lost:
        if (r36.A14(1024) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x023e, code lost:
        r0 = r11.A07;
        r12 = new X.C0JJ(X.C05V.A00(r0.A01, r0.A00, r13, true), r2, r36.A0H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x024f, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0254, code lost:
        if (X.C0DB.A0d(r36) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x025a, code lost:
        if ((r36 instanceof X.C0LV) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x025c, code lost:
        r0 = r11.A07;
        r12 = new X.C0JJ(X.C05V.A00(r0.A01, r0.A00, r13, true), r2, r36.A0G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0270, code lost:
        if (r0 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0272, code lost:
        r10 = (X.AnonymousClass097) r36;
        r0 = r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0279, code lost:
        if (r0 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x027b, code lost:
        if (r15 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x027e, code lost:
        r9 = new X.C09H(r0);
        r9.A0P = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0289, code lost:
        r9 = r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0291, code lost:
        if (r9.A0B != r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0293, code lost:
        r9.A0B = r10.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0297, code lost:
        r0 = r11.A07;
        r12 = r10.A19(X.C05V.A00(r0.A01, r0.A00, r13, true), r2, r9);
        r3 = r11.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x02b4, code lost:
        if (X.C0DB.A0Q(r3, r10, X.C003101m.A0Z(r12.A0n.A00)) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x02b6, code lost:
        r1 = r10.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x02b8, code lost:
        if (r1 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x02bc, code lost:
        if (r1.A07 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x02c0, code lost:
        if (r1.A03 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x02c4, code lost:
        if (r1.A05 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x02c8, code lost:
        if (r1.A04 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02ca, code lost:
        r0 = r10.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x02ce, code lost:
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x02d4, code lost:
        if (r0.A05() == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x02e0, code lost:
        if (java.util.Arrays.equals(r10.A0N.A07, r9.A0U) != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x02e2, code lost:
        com.whatsapp.util.Log.e("FMessageFactory/newFMessageForForward/thumbnail and media file key not the same");
        r12.A0i(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x02ee, code lost:
        if (X.C0DB.A0O(r3, r12) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x02f0, code lost:
        r0 = r12.A18();
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x02f4, code lost:
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x02f6, code lost:
        r0.A05 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x02f9, code lost:
        r10 = r10.A0N;
        r9 = new X.C05610Pk();
        r9.A03 = r10.A03;
        r9.A07 = r10.A07;
        r9.A02 = r10.A02;
        r9.A04 = r10.A04;
        r9.A05 = r10.A05;
        r9.A06 = false;
        r9.A01 = r10.A01;
        r9.A00 = r10.A00;
        r9.A08 = r10.A08;
        r9.A02 = r0.A0B;
        r9.A06 = r15;
        r9.A09 = X.C0DB.A0P(r3, r12);
        r12.A0i(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0335, code lost:
        if (r15 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x033a, code lost:
        if ((r12 instanceof X.AnonymousClass095) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x033c, code lost:
        r12.A06 = null;
        r12.A05 = null;
        r0 = r12.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0342, code lost:
        if (r0 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0344, code lost:
        r0.A0K = null;
        r0.A0J = null;
        r9 = r12.A18();
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x034c, code lost:
        if (r9 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x034e, code lost:
        r10 = r9.A07();
        r9.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0355, code lost:
        if (r10 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0357, code lost:
        r11 = r10.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0359, code lost:
        if (r11 != 4) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x035b, code lost:
        r15 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x035e, code lost:
        if (r3 >= r11) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0360, code lost:
        r15 = r15 + r10[r3];
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x036d, code lost:
        if (r12.A02.A0A != r15) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x036f, code lost:
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0370, code lost:
        r9.A03 = r10;
        r9.A01 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0374, code lost:
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0375, code lost:
        r12.A0Y(1);
        r12.A09 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x037b, code lost:
        r12.A0Y(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x037f, code lost:
        r12.A0m(r24);
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0386, code lost:
        X.C000700j.A07(r36 instanceof X.C0D9);
        r0 = r11.A07;
        r12 = ((X.C0D9) r36).A6F(X.C05V.A00(r0.A01, r0.A00, r13, true), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x039e, code lost:
        r0 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x039f, code lost:
        r12.A04 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x03a1, code lost:
        if (r26 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x03a3, code lost:
        r12.A0U(1);
        r12.A03 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x03aa, code lost:
        A0R(r12);
        r0 = r12.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x03af, code lost:
        if (r0 == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x03b1, code lost:
        if (r0 != 1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x03b7, code lost:
        if (X.C003101m.A0Z(r13) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x03b9, code lost:
        r34.A15.A05(r12, r4, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x03be, code lost:
        r14.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x03c3, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x03cb, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x03cf, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03d0, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x03d2, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x03d3, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x03d4, code lost:
        com.whatsapp.util.Log.e("UserActions/userActionForwardMessage ", r1);
        r34.A01.A09("UserActions/userActionForwardMessage", r1.getMessage(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x03e5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x03ea, code lost:
        if (X.C0DB.A0C(r0) == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x03ec, code lost:
        if (r21 != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x03ee, code lost:
        X.C000700j.A07(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x03f1, code lost:
        if (r20 == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x03f3, code lost:
        r34.A1B.AS1(new X.C1J4());
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x03fd, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x03fe, code lost:
        r2 = new java.util.ArrayList(r37.size());
        r1 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x040f, code lost:
        if (r1.hasNext() == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0411, code lost:
        r2.add(r1.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0419, code lost:
        A0D(new X.C04130Ir(r2), r23, (X.AnonymousClass097) r36, null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0429, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x042a, code lost:
        A0T(r36, r14, r23, new X.C1JD(r34, r36, r14));
        r0 = r0.A00;
        r1 = X.C003101m.A0Z(r0);
        r0 = X.C003101m.A0U(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0440, code lost:
        if (r1 == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0442, code lost:
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0443, code lost:
        r34.A1B.AS1(new X.C1J5());
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x044d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x044e, code lost:
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x044f, code lost:
        if (r0 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0451, code lost:
        r2 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x019b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0E(X.C03010Du r35, final X.AnonymousClass092 r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018608r.A0E(X.0Du, X.092, java.util.List):void");
    }

    public void A0F(final C468628o c468628o, final List list, final UserJid userJid, final Uri uri, final AnonymousClass092 anonymousClass092) {
        this.A1B.AS1(new Runnable() { // from class: X.1J7
            {
                C018608r.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C018608r.this.A0A(uri, list, anonymousClass092, c468628o, userJid);
            }
        });
    }

    public void A0G(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null || C003101m.A0P(abstractC005302j) || this.A06.A0A(abstractC005302j)) {
            return;
        }
        boolean A0A = this.A10.A0A(abstractC005302j);
        C03940Hu c03940Hu = this.A05;
        c03940Hu.A00.obtainMessage(1, A0A ? 1 : 0, 0, c03940Hu.A01(abstractC005302j)).sendToTarget();
    }

    public final void A0H(AbstractC005302j abstractC005302j) {
        C0CB c0cb = this.A14;
        if (c0cb.A07(abstractC005302j).A0E) {
            C41541u6 c41541u6 = this.A0C;
            Set A0F = c41541u6.A0F(abstractC005302j, false);
            c0cb.A0B(abstractC005302j, false, 0L);
            c41541u6.A0V(A0F);
        }
    }

    public void A0I(AbstractC005302j abstractC005302j, int i) {
        if (abstractC005302j == null || C003101m.A0P(abstractC005302j)) {
            return;
        }
        if (C003101m.A0U(abstractC005302j)) {
            this.A10.A07(abstractC005302j);
        }
        if (this.A06.A0A(abstractC005302j)) {
            return;
        }
        boolean A0A = this.A10.A0A(abstractC005302j);
        C03940Hu c03940Hu = this.A05;
        c03940Hu.A00.obtainMessage(0, A0A ? 1 : 0, i, c03940Hu.A01(abstractC005302j)).sendToTarget();
    }

    public void A0J(AbstractC005302j abstractC005302j, int i) {
        if (abstractC005302j == null) {
            return;
        }
        PowerManager.WakeLock A04 = A04();
        if (A04 != null) {
            A04.acquire(30000L);
        }
        if (C003101m.A0P(abstractC005302j)) {
            return;
        }
        if (C003101m.A0U(abstractC005302j)) {
            this.A10.A07(abstractC005302j);
        }
        if (this.A06.A0A(abstractC005302j)) {
            return;
        }
        C03940Hu c03940Hu = this.A05;
        c03940Hu.A00.obtainMessage(3, 0, i, c03940Hu.A01(abstractC005302j)).sendToTarget();
    }

    public void A0K(AbstractC005302j abstractC005302j, long j, boolean z, boolean z2) {
        A08(j, abstractC005302j, z);
        C41541u6 c41541u6 = this.A0C;
        long j2 = -1;
        if (j != -1) {
            AnonymousClass012 anonymousClass012 = this.A0J;
            j2 = anonymousClass012.A05() + (j - anonymousClass012.A01());
        }
        Set A0I = c41541u6.A0I(abstractC005302j, true, j2);
        if (!this.A14.A0R(abstractC005302j, j, z)) {
            c41541u6.A0U(A0I);
            return;
        }
        c41541u6.A0V(A0I);
        if (z2) {
            this.A0y.A01(5, abstractC005302j, j, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:434:0x00fd, code lost:
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:751:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0424 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0L(X.AbstractC005302j r30, java.lang.String r31, X.C04500Kk r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018608r.A0L(X.02j, java.lang.String, X.0Kk, boolean):void");
    }

    public void A0M(AbstractC005302j abstractC005302j, boolean z) {
        A08(0L, abstractC005302j, false);
        C41541u6 c41541u6 = this.A0C;
        Set A0I = c41541u6.A0I(abstractC005302j, false, 0L);
        if (!this.A14.A0P(abstractC005302j)) {
            c41541u6.A0U(A0I);
            return;
        }
        c41541u6.A0V(A0I);
        if (z) {
            this.A0y.A01(5, abstractC005302j, 0L, 0);
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A0N(AbstractC005302j abstractC005302j, boolean z, boolean z2) {
        Set emptySet;
        this.A0j.A01(6, abstractC005302j);
        final C06C A09 = this.A0D.A09(abstractC005302j);
        C40301ry c40301ry = this.A0z;
        c40301ry.A02().post(new RunnableEBaseShape0S0300000_I0_0(c40301ry, null, abstractC005302j, 30));
        if (z2) {
            emptySet = this.A0C.A0G(abstractC005302j, z);
        } else {
            emptySet = Collections.emptySet();
        }
        this.A0U.A0N(abstractC005302j, z);
        this.A0C.A0V(emptySet);
        if (A09 != null) {
            if (A09.A0C() || A09.A0D()) {
                C0L8 c0l8 = this.A08;
                Application application = c0l8.A07.A00;
                if (Build.VERSION.SDK_INT >= 26) {
                    C0M6.A0E(application, A09);
                } else {
                    Intent A00 = C0M7.A00(application, c0l8.A01(A09, false, false));
                    A00.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                    application.sendBroadcast(A00);
                }
            }
            this.A08.A07(abstractC005302j);
            C0CB c0cb = this.A14;
            boolean A0C = A09.A0C();
            C03370Fl A07 = c0cb.A07(abstractC005302j);
            if (C03480Fw.A00 && A07.A0H) {
                c0cb.A01.A0E(abstractC005302j.getRawString());
            }
            C0CD A02 = c0cb.A09().A02();
            if (A0C) {
                try {
                    if (A07.A0H) {
                        A07.A01 = c0cb.A0E.A01();
                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put("deleted", Long.valueOf(A07.A01));
                        A02.A02.A00("settings", contentValues, "jid = ?", new String[]{abstractC005302j.getRawString()});
                    } else {
                        c0cb.A0W.remove(abstractC005302j.getRawString());
                        A02.A02.A01("settings", "jid = ?", new String[]{abstractC005302j.getRawString()});
                    }
                } finally {
                }
            }
            A02.close();
            A0H(abstractC005302j);
            this.A0G.A03((AbstractC005302j) A09.A03(AbstractC005302j.class), true, true);
            c40301ry.A04();
            if (A09.A08 == null || A09.A0C() || A09.A0D()) {
                this.A02.A00.post(new Runnable() { // from class: X.1Iv
                    {
                        C018608r.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C018608r c018608r = C018608r.this;
                        C06C c06c = A09;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c06c);
                        c018608r.A0D.A0P(arrayList);
                    }
                });
            }
            if (z2) {
                this.A0y.A01(2, abstractC005302j, 0L, 0);
            }
        }
        if (C003101m.A0Q(abstractC005302j)) {
            C0EG c0eg = this.A0x;
            RunnableC05900Qr runnableC05900Qr = new RunnableC05900Qr(this.A1C, this.A0S, (C0I1) abstractC005302j);
            if (c0eg.A02.A06) {
                Log.i("sendmethods/sendDeleteBroadcastList");
                c0eg.A07.A09(Message.obtain(null, 0, 60, 0, runnableC05900Qr));
            }
        }
        this.A08.A04();
    }

    public void A0O(AbstractC005302j abstractC005302j, boolean z, boolean z2, boolean z3) {
        Set emptySet;
        this.A0j.A01(4, abstractC005302j);
        C06C A09 = this.A0D.A09(abstractC005302j);
        if (z3) {
            emptySet = this.A0C.A0J(abstractC005302j, !z, z2);
        } else {
            emptySet = Collections.emptySet();
        }
        this.A0U.A0M(abstractC005302j, null, z, z2);
        this.A0C.A0V(emptySet);
        if (A09 == null || !z3) {
            return;
        }
        this.A0y.A0D(new C48152Ea(abstractC005302j, !z), 0);
    }

    public void A0P(AnonymousClass092 anonymousClass092) {
        C43131wu c43131wu = this.A0q;
        int A04 = C0E3.A04(anonymousClass092, this.A0h);
        int A02 = C0E3.A02(anonymousClass092);
        synchronized (c43131wu) {
            long A022 = c43131wu.A02();
            int A01 = c43131wu.A01();
            C25A c25a = c43131wu.A03;
            C25B A023 = c25a.A02(A022, A04, A01, A02, false);
            A023.A03++;
            c25a.A03(A022, A04, A01, A02, false, A023);
        }
    }

    public void A0Q(AnonymousClass092 anonymousClass092) {
        C43131wu c43131wu = this.A0q;
        int A04 = C0E3.A04(anonymousClass092, this.A0h);
        int A02 = C0E3.A02(anonymousClass092);
        synchronized (c43131wu) {
            long A022 = c43131wu.A02();
            int A01 = c43131wu.A01();
            C25A c25a = c43131wu.A03;
            C25B A023 = c25a.A02(A022, A04, A01, A02, false);
            A023.A06++;
            c25a.A03(A022, A04, A01, A02, false, A023);
        }
    }

    public void A0R(AnonymousClass092 anonymousClass092) {
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (C003101m.A0Z(abstractC005302j)) {
            anonymousClass092.A0d(C011405q.A00);
        } else if (!C003101m.A0P(abstractC005302j)) {
        } else {
            anonymousClass092.A0f = true;
            C02630Ce A01 = this.A0X.A01((AbstractC011205o) abstractC005302j);
            anonymousClass092.A0Z = this.A0R.A02(abstractC005302j).A0F;
            ArrayList arrayList = new ArrayList(A01.A04().A02());
            C02L c02l = this.A06;
            c02l.A05();
            arrayList.remove(c02l.A03);
            anonymousClass092.A0u(arrayList);
        }
    }

    public void A0S(AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        C000700j.A07(!C0DB.A0C(b));
        C000700j.A07(!C0DB.A0E(b));
        this.A0w.A01(anonymousClass092);
        this.A0b.A05(anonymousClass092, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0062, code lost:
        if ((r1 != null && (!(r1.A0E() == null || r1.A0E().A06()) || r2.A04(r1.A0C()))) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0T(final X.AnonymousClass092 r6, final java.util.Collection r7, byte[] r8, final java.lang.Runnable r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L1e
            java.util.Iterator r1 = r7.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            X.092 r0 = (X.AnonymousClass092) r0
            X.0Hp r0 = r0.A0E()
            if (r0 == 0) goto L1c
            r0.A03(r8)
            goto L6
        L1c:
            r0 = 0
            throw r0
        L1e:
            if (r6 != 0) goto L26
            X.08q r0 = r5.A04
            r0.A0G(r9)
            return
        L26:
            X.247 r4 = r5.A11
            X.1Ix r3 = new X.1Ix
            r3.<init>()
            X.0GT r2 = r4.A02
            if (r6 == 0) goto L77
            X.0Hp r0 = r6.A0E()
            if (r0 == 0) goto L41
            X.0Hp r0 = r6.A0E()
            boolean r0 = r0.A06()
            if (r0 == 0) goto L64
        L41:
            X.092 r1 = r6.A0C()
            if (r1 == 0) goto L75
            X.0Hp r0 = r1.A0E()
            if (r0 == 0) goto L57
            X.0Hp r0 = r1.A0E()
            boolean r0 = r0.A06()
            if (r0 == 0) goto L61
        L57:
            X.092 r0 = r1.A0C()
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L75
        L61:
            r0 = 1
        L62:
            if (r0 == 0) goto L77
        L64:
            r0 = 1
        L65:
            if (r0 != 0) goto L79
            X.1wy r0 = r4.A01
            boolean r0 = r0.A02(r6)
            if (r0 != 0) goto L79
            X.08q r0 = r4.A00
            r0.A0G(r3)
            return
        L75:
            r0 = 0
            goto L62
        L77:
            r0 = 0
            goto L65
        L79:
            X.01k r2 = r4.A03
            r1 = 40
            java.lang.RunnableEBaseShape0S0300000_I0_0 r0 = new java.lang.RunnableEBaseShape0S0300000_I0_0
            r0.<init>(r4, r6, r3, r1)
            r2.AS1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018608r.A0T(X.092, java.util.Collection, byte[], java.lang.Runnable):void");
    }

    public void A0U(AnonymousClass092 anonymousClass092, List list) {
        if ((anonymousClass092 instanceof AnonymousClass097) && this.A07.A0E(C01C.A1X)) {
            C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
            if (c09h != null) {
                String A0T = C40731sm.A0T(c09h.A0G, this.A0J.A05());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass092 anonymousClass0922 = (AnonymousClass092) it.next();
                    if (anonymousClass0922 instanceof AnonymousClass097) {
                        C09H c09h2 = ((AnonymousClass097) anonymousClass0922).A02;
                        if (c09h2 == null) {
                            throw null;
                        }
                        c09h2.A0G = A0T;
                    }
                }
            } else {
                throw null;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            this.A0U.A0Q((AnonymousClass092) it2.next());
        }
    }

    public void A0V(AnonymousClass092 anonymousClass092, List list) {
        AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
        String str = anonymousClass097.A05;
        if (str != null) {
            C43401xL c43401xL = this.A0p;
            String str2 = C0DC.A02(anonymousClass097).A02;
            if (str != null) {
                if (str2 != null) {
                    C43711xq c43711xq = new C43711xq(c43401xL, str, str2, null, false, false);
                    C0IY c0iy = this.A13;
                    c0iy.A04();
                    byte b = anonymousClass097.A0m;
                    if (this.A0t.A01(c0iy.A02(C0DC.A01(b, ((AnonymousClass092) anonymousClass097).A04).A02, null, null, 0), anonymousClass097.A05, c43711xq, b, ((AnonymousClass092) anonymousClass097).A04, 0).A00().A03 == C0Qt.COMPLETE) {
                        A0T(anonymousClass097, list, null, new C1JD(this, anonymousClass097, list));
                        return;
                    }
                    this.A04.A05(R.string.message_forward_media_missing, 1);
                    this.A0x.A0M(anonymousClass097);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A0W(C0KD c0kd) {
        this.A1B.ARy(new C2Ec(this.A0J, this.A01, this.A0U, this.A0b, this.A0c, this.A0l, this.A0L, this.A03, this.A0m, this.A0X, c0kd), new Void[0]);
    }

    public void A0X(AnonymousClass097 anonymousClass097) {
        A0C(new C04130Ir(Collections.singletonList(anonymousClass097)), null);
    }

    public void A0Y(AnonymousClass097 anonymousClass097, byte[] bArr) {
        A0C(new C04130Ir(Collections.singletonList(anonymousClass097)), bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Z(X.C0JM r20, X.AbstractC005302j r21, X.AnonymousClass092 r22, boolean r23, java.lang.Integer r24) {
        /*
            r19 = this;
            X.09H r8 = new X.09H
            r8.<init>()
            r3 = r20
            java.lang.String r2 = r3.A08
            if (r2 == 0) goto L42
            int r1 = r3.A01
            r0 = 3
            if (r1 != r0) goto L3b
            android.net.Uri r12 = android.net.Uri.parse(r2)
        L14:
            r2 = r19
            X.01B r1 = r2.A07
            X.039 r0 = X.C01C.A3y
            int r1 = r1.A07(r0)
            int r0 = r3.A00
            long r4 = (long) r0
            long r0 = (long) r1
            r6 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r6
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L44
            X.00o r0 = r2.A0K
            android.app.Application r1 = r0.A00
            r0 = 2131889940(0x7f120f14, float:1.9414558E38)
            java.lang.String r3 = r1.getString(r0)
            X.08q r1 = r2.A04
            r0 = 1
            r1.A0E(r3, r0)
            return
        L3b:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r8.A0F = r0
        L42:
            r12 = 0
            goto L14
        L44:
            int r0 = r3.A03
            r8.A08 = r0
            int r0 = r3.A02
            r8.A06 = r0
            java.lang.String r0 = r3.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L58
            java.lang.String r0 = r3.A05
            r8.A0G = r0
        L58:
            X.1u0 r6 = r2.A0n
            r10 = 0
            r9 = 20
            r11 = 0
            r7 = r21
            r13 = r22
            r16 = r23
            r14 = r11
            r15 = r11
            r17 = r10
            r18 = r11
            X.097 r1 = r6.A08(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0Ie r1 = (X.C04040Ie) r1
            java.lang.String r0 = r3.A0B
            r1.A06 = r0
            java.lang.String r0 = r3.A0A
            r1.A07 = r0
            if (r0 != 0) goto L7e
            java.lang.String r0 = "image/webp"
            r1.A07 = r0
        L7e:
            java.lang.String r0 = r3.A07
            r1.A05 = r0
            X.0If r0 = r3.A04
            r1.A01 = r0
            r0 = r24
            r1.A02 = r0
            r2.A0X(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018608r.A0Z(X.0JM, X.02j, X.092, boolean, java.lang.Integer):void");
    }

    public void A0a(WeakReference weakReference, C018308n c018308n, AnonymousClass097 anonymousClass097, Uri uri) {
        String str;
        String str2;
        String obj;
        Intent createChooser;
        int i;
        this.A04.A03();
        if (weakReference.get() != null) {
            Context context = (Context) weakReference.get();
            boolean z = ((AnonymousClass092) anonymousClass097).A03 >= 127;
            C02L c02l = this.A06;
            byte b = anonymousClass097.A0m;
            if (b == 23) {
                str = ((C04160Iu) anonymousClass097).A07;
            } else if (b != 44) {
                if (b == 1) {
                    i = R.string.share_email_subject_image;
                } else if (b == 2) {
                    i = R.string.share_email_subject_audio;
                } else if (b == 3) {
                    i = R.string.share_email_subject_video;
                } else if (b != 9) {
                    i = R.string.share_email_subject_gif;
                    if (b != 13) {
                        i = R.string.share_email_subject_file;
                    }
                } else {
                    i = R.string.share_email_subject_document;
                }
                str = context.getString(i, c02l.A02());
            } else {
                str = ((C0LN) anonymousClass097).A07;
            }
            C002301c c002301c = this.A0M;
            if (C40731sm.A0n(anonymousClass097)) {
                obj = C40731sm.A0P(anonymousClass097);
            } else if (b == 23) {
                C04160Iu c04160Iu = (C04160Iu) anonymousClass097;
                StringBuilder A0P = C000200d.A0P(context.getString(R.string.share_email_body_item_link, String.format("%s/p/%s/%s", "https://wa.me", c04160Iu.A04, c04160Iu.A01.user)));
                BigDecimal bigDecimal = c04160Iu.A08;
                String str3 = "";
                if (bigDecimal != null) {
                    str2 = context.getString(R.string.share_email_body_item_price, new C09R(c04160Iu.A02).A03(c002301c, bigDecimal, true));
                } else {
                    str2 = "";
                }
                A0P.append(str2);
                String str4 = c04160Iu.A03;
                if (str4 != null && !TextUtils.isEmpty(str4)) {
                    str3 = context.getString(R.string.share_email_body_item_description, c04160Iu.A03);
                }
                A0P.append(str3);
                obj = A0P.toString();
            } else if (b != 44) {
                obj = anonymousClass097.A1A();
            } else {
                obj = C2Ed.A01((C0LN) anonymousClass097, c002301c);
            }
            String A03 = A03(this.A01, anonymousClass097);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(A03);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.SUBJECT", str);
            }
            if (!TextUtils.isEmpty(obj)) {
                intent.putExtra("android.intent.extra.TEXT", obj);
            }
            intent.putExtra("origin", 3);
            intent.putExtra("android.intent.extra.STREAM", uri);
            if (Build.VERSION.SDK_INT < 29 && z) {
                ArrayList arrayList = new ArrayList();
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str5 = activityInfo.name;
                        String str6 = activityInfo.applicationInfo.packageName;
                        Intent intent2 = new Intent(intent);
                        intent2.setClassName(str6, str5);
                        intent2.setPackage(str6);
                        arrayList.add(intent2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Intent intent3 = (Intent) it.next();
                    if ("com.whatsapp".equals(intent3.getPackage()) || "com.whatsapp.w4b".equals(intent3.getPackage())) {
                        intent3.putExtra("enforce_hfm_limit", z);
                    }
                }
                createChooser = C02180Ae.A0H(arrayList, null, null);
            } else {
                createChooser = Intent.createChooser(intent, null);
            }
            createChooser.setFlags(1);
            c018308n.A06(context, createChooser);
        }
    }

    public void A0b(Collection collection, boolean z, boolean z2) {
        this.A0d.A04(collection, true, z);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            if (anonymousClass092.A0m == 20) {
                C04040Ie c04040Ie = (C04040Ie) anonymousClass092;
                C09H c09h = ((AnonymousClass097) c04040Ie).A02;
                if (c09h != null && c09h.A0P) {
                    arrayList.add(c04040Ie.A1H());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (AnonymousClass024.A0c()) {
            C2AS c2as = this.A17;
            c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, arrayList, 26));
        } else {
            this.A17.A0K(arrayList, true);
        }
        if (z2) {
            C018508q c018508q = this.A04;
            c018508q.A02.post(new Runnable() { // from class: X.1Iy
                {
                    C018608r.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C018608r.this.A06();
                }
            });
        }
    }

    public final void A0c(List list, File file, String str, int i, AnonymousClass092 anonymousClass092, boolean z) {
        C09H c09h = new C09H();
        c09h.A0F = file;
        c09h.A01 = i;
        C04130Ir A03 = this.A0n.A03(list, c09h, 7, str, anonymousClass092, z);
        for (AnonymousClass097 anonymousClass097 : Collections.unmodifiableList(A03.A01)) {
            if (anonymousClass097 instanceof C09E) {
                C09E c09e = (C09E) anonymousClass097;
                c09e.A00 = i;
                ((AnonymousClass097) c09e).A07 = "text/vcard";
                ((AnonymousClass097) c09e).A08 = str;
            }
        }
        A0C(A03, null);
    }

    public void A0d(List list, String str, C05920Qu c05920Qu, AnonymousClass092 anonymousClass092, List list2, boolean z, boolean z2) {
        A0e(list, str, c05920Qu, anonymousClass092, list2, z, z2, null, null, null);
    }

    public void A0e(List list, String str, C05920Qu c05920Qu, AnonymousClass092 anonymousClass092, List list2, boolean z, boolean z2, String str2, String str3, C0CZ c0cz) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            C0JJ A04 = this.A12.A04(abstractC005302j, str, this.A0J.A05(), c05920Qu, list2, anonymousClass092);
            if (c0cz != null) {
                A04.A0H = c0cz;
                A04.A0U(1024);
            }
            A04.A0V = str2;
            A04.A0W = str3;
            A0R(A04);
            if (z) {
                A04.A0U(4);
            }
            if (z2) {
                A04.A0U(2);
            }
            if (C003101m.A0Z(abstractC005302j)) {
                TextData textData = new TextData();
                textData.backgroundColor = C48222Ej.A00();
                textData.textColor = -1;
                textData.fontStyle = 0;
                A04.A1A(textData);
                A04.A0l(C48222Ej.A03(A04.A0G()));
                this.A15.A05(A04, 0L, 1);
            }
            this.A0U.A0Q(A04);
        }
    }

    public void A0f(List list, String str, String str2, AnonymousClass092 anonymousClass092, boolean z) {
        C001200o c001200o;
        String str3 = str;
        byte[] bArr = null;
        if (str2 != null) {
            try {
                bArr = str2.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (bArr != null) {
            long length = bArr.length;
            C01B c01b = this.A07;
            if (length > c01b.A07(C01C.A45) * 1024) {
                this.A04.A0F(this.A0M.A08(R.plurals.contact_too_large, 1L), 1);
                return;
            }
            long A07 = c01b.A07(C01C.A44) * 1024;
            if (A07 > 0 && length > A07) {
                if (str == null && (str3 = C04110Ip.A00((c001200o = this.A0K), this.A0D, this.A0M, this.A0B, str2)) == null) {
                    str3 = c001200o.A00.getString(R.string.contact);
                }
                this.A1B.AS1(new C1J9(this, list, str3, bArr, 1, anonymousClass092, z));
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C05U c05u = this.A12;
            long A05 = this.A0J.A05();
            C05V c05v = c05u.A07;
            C0D8 c0d8 = new C0D8(C05V.A00(c05v.A01, c05v.A00, (AbstractC005302j) it.next(), true), A05, str2, str3);
            c05u.A05(c0d8, anonymousClass092);
            if (z) {
                c0d8.A0U(4);
            }
            A0R(c0d8);
            this.A0U.A0Q(c0d8);
        }
    }

    public final void A0g(final List list, final String str, byte[] bArr, final int i, final AnonymousClass092 anonymousClass092, final boolean z) {
        final File A0d = this.A1A.A0d(str, bArr.length);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(A0d);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("UserActions/prepareVCardDocument IO Exception when writing vcard document", e);
        }
        if (A0d.exists()) {
            this.A04.A0G(new Runnable() { // from class: X.1Iz
                {
                    C018608r.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C018608r.this.A0c(list, A0d, str, i, anonymousClass092, z);
                }
            });
        } else {
            Log.e("UserActions/prepareVCardDocument Error writing vcard document file");
        }
    }

    public void A0h(List list, List list2, AnonymousClass092 anonymousClass092, boolean z) {
        String string;
        String join = TextUtils.join("\n", list2);
        byte[] bArr = null;
        if (join != null) {
            try {
                bArr = join.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (bArr != null) {
            int length = bArr.length;
            int size = list2.size();
            long j = length;
            C01B c01b = this.A07;
            if (j > c01b.A07(C01C.A45) * 1024) {
                this.A04.A0F(this.A0M.A08(R.plurals.contact_too_large, size), 1);
                return;
            }
            long A07 = c01b.A07(C01C.A44) * 1024;
            if (A07 > 0 && j > A07 && list2.size() > 0) {
                C001200o c001200o = this.A0K;
                C05W c05w = this.A0D;
                C002301c c002301c = this.A0M;
                C06K c06k = this.A0B;
                int size2 = list2.size();
                String A00 = C04110Ip.A00(c001200o, c05w, c002301c, c06k, (String) list2.get(0));
                if (A00 != null) {
                    int i = size2 - 1;
                    string = c002301c.A0A(R.plurals.contacts_array_title, i, A00, Integer.valueOf(i));
                } else {
                    string = c001200o.A00.getString(R.string.contacts);
                }
                this.A1B.AS1(new C1J9(this, list, string, bArr, size, anonymousClass092, z));
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C05U c05u = this.A12;
            long A05 = this.A0J.A05();
            String A0A = this.A0M.A0A(R.plurals.n_contacts_message_title, list2.size(), Integer.valueOf(list2.size()));
            C001200o c001200o2 = c05u.A03;
            C05W c05w2 = c05u.A02;
            C002301c c002301c2 = c05u.A04;
            C06K c06k2 = c05u.A01;
            C05V c05v = c05u.A07;
            C0DA c0da = new C0DA(c001200o2, c05w2, c002301c2, c06k2, C05V.A00(c05v.A01, c05v.A00, (AbstractC005302j) it.next(), true), A05);
            c0da.A00 = A0A;
            c0da.A19(list2);
            c05u.A05(c0da, anonymousClass092);
            if (z) {
                c0da.A0U(4);
            }
            A0R(c0da);
            this.A0U.A0Q(c0da);
        }
    }

    public void A0i(final Set set, final boolean z) {
        StringBuilder A0P = C000200d.A0P("useractions/userActionDeleteMessages ");
        A0P.append(set.size());
        Log.i(A0P.toString());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A0a.A03(((AnonymousClass092) it.next()).A0n);
        }
        this.A0N.A01(new Runnable() { // from class: X.1JC
            {
                C018608r.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C018608r.this.A0k(set, z);
            }
        }, 20);
    }

    public void A0j(Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (anonymousClass094.A02 && anonymousClass092.A0m != 15) {
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                if (C003101m.A0Z(abstractC005302j)) {
                    C2EQ c2eq = this.A15;
                    if (c2eq != null) {
                        C05930Qw c05930Qw = new C05930Qw();
                        c05930Qw.A02 = Long.valueOf(c2eq.A01());
                        c05930Qw.A00 = Integer.valueOf(C0E3.A04(anonymousClass092, c2eq.A04));
                        c05930Qw.A01 = Long.valueOf(c2eq.A03.A05() - anonymousClass092.A0E);
                        c2eq.A05.A09(c05930Qw, 1);
                        AnonymousClass011.A01(c05930Qw, "");
                    } else {
                        throw null;
                    }
                }
                if (anonymousClass092 instanceof C04570Ky) {
                    C04570Ky c04570Ky = (C04570Ky) anonymousClass092;
                    if (this.A0J.A05() < c04570Ky.A00 * 1000 && !c04570Ky.A06) {
                        C0EG c0eg = this.A0x;
                        C011005l c011005l = c04570Ky.A01;
                        if (c011005l != null) {
                            c0eg.A01(c011005l, Collections.singletonList(c04570Ky.A0n.A00), null, null);
                        } else {
                            throw null;
                        }
                    }
                }
                C05V c05v = this.A12.A07;
                C03890Hn c03890Hn = new C03890Hn(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), anonymousClass092);
                C41561u9 c41561u9 = this.A0V;
                c41561u9.A02.A01(new RunnableEBaseShape0S0210000_I0(c41561u9, c03890Hn, z, 5), 31);
            }
        }
    }

    public /* synthetic */ void A0k(Set set, boolean z) {
        C41541u6 c41541u6 = this.A0C;
        Set A0L = c41541u6.A0L(set, z);
        this.A0U.A0d(set, (z ? 1 : 0) | 2);
        c41541u6.A0V(A0L);
    }

    public void A0l(byte[] bArr, C04130Ir c04130Ir, C22e c22e, AnonymousClass097 anonymousClass097, boolean z) {
        byte[] bArr2 = bArr;
        C03900Hp A0E = c04130Ir.A00().A0E();
        if (bArr == null && A0E != null && A0E.A05()) {
            bArr2 = A0E.A08();
        }
        for (AnonymousClass092 anonymousClass092 : Collections.unmodifiableList(c04130Ir.A01)) {
            C0C9 c0c9 = this.A0U;
            c0c9.A0F.A01(new C1O1(c0c9, anonymousClass092, 1), 26);
        }
        this.A0o.A06(c04130Ir, new C22a(true, c04130Ir.A04()), c22e, anonymousClass097, true, z, bArr2);
    }
}
