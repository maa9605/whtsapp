package X;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Du */
/* loaded from: classes.dex */
public class C03010Du {
    public static volatile C03010Du A0L;
    public final C012005w A00;
    public final C018508q A01;
    public final C01B A02;
    public final C018608r A03;
    public final C02E A04;
    public final C001200o A05;
    public final C002301c A06;
    public final C0C9 A07;
    public final C00A A08;
    public final C40081rY A09;
    public final C003701t A0A;
    public final AnonymousClass011 A0B;
    public final C41491u0 A0C;
    public final C41771uU A0D;
    public final C41511u2 A0E;
    public final C02O A0F;
    public final AnonymousClass247 A0G;
    public final C43791xz A0H;
    public final C41961un A0I;
    public final InterfaceC002901k A0J;
    public final C40951t8 A0K;

    public C03010Du(C001200o c001200o, C018508q c018508q, InterfaceC002901k interfaceC002901k, C012005w c012005w, AnonymousClass011 anonymousClass011, C40081rY c40081rY, C01B c01b, C003701t c003701t, C018608r c018608r, C40951t8 c40951t8, C41491u0 c41491u0, C41961un c41961un, C02E c02e, C002301c c002301c, C0C9 c0c9, C00A c00a, AnonymousClass247 anonymousClass247, C41511u2 c41511u2, C43791xz c43791xz, C41771uU c41771uU, C02O c02o) {
        this.A05 = c001200o;
        this.A01 = c018508q;
        this.A0J = interfaceC002901k;
        this.A00 = c012005w;
        this.A0B = anonymousClass011;
        this.A09 = c40081rY;
        this.A02 = c01b;
        this.A0A = c003701t;
        this.A03 = c018608r;
        this.A0K = c40951t8;
        this.A0C = c41491u0;
        this.A0I = c41961un;
        this.A04 = c02e;
        this.A06 = c002301c;
        this.A07 = c0c9;
        this.A08 = c00a;
        this.A0G = anonymousClass247;
        this.A0E = c41511u2;
        this.A0H = c43791xz;
        this.A0D = c41771uU;
        this.A0F = c02o;
    }

    public static C03010Du A00() {
        if (A0L == null) {
            synchronized (C03010Du.class) {
                if (A0L == null) {
                    A0L = new C03010Du(C001200o.A01, C018508q.A00(), C002801j.A00(), C012005w.A00(), AnonymousClass011.A00(), C40081rY.A00(), C01B.A00(), C003701t.A00(), C018608r.A02(), C40951t8.A00(), C41491u0.A00(), C41961un.A0S(), C02E.A00(), C002301c.A00(), C0C9.A00(), C00A.A00, AnonymousClass247.A00(), C41511u2.A00(), C43791xz.A00(), C41771uU.A00(), C02O.A00());
                }
            }
        }
        return A0L;
    }

    public /* synthetic */ void A01(Uri uri, Activity activity, List list, int i, String str, InterfaceC05830Qk interfaceC05830Qk, C0B5 c0b5, File file) {
        try {
            String queryParameter = uri.getQueryParameter("doodle");
            C2EK c2ek = null;
            if (queryParameter != null) {
                c2ek = C2EK.A01(C0DD.A0F(this.A00, queryParameter), activity, this.A09, this.A06, this.A0H);
                if (c2ek != null) {
                    c2ek.A03 = queryParameter;
                } else {
                    throw new NullPointerException("Doodle object is null");
                }
            }
            if (!A0A(list, file, str, c2ek, GifHelper.A02(file))) {
                this.A01.A07(R.string.share_failed, 0);
            }
            interfaceC05830Qk.AQC(uri);
        } catch (IOException | NullPointerException e) {
            if (e.getMessage() != null && e.getMessage().contains("No space")) {
                this.A01.A0D(c0b5, activity.getString(R.string.error_no_disc_space));
            } else {
                this.A01.A07(R.string.share_failed, 0);
            }
            Log.e("sendmedia/sendvideo/error ", e);
        }
    }

    public void A02(final C04130Ir c04130Ir, final boolean z, final boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass097 anonymousClass097 : Collections.unmodifiableList(c04130Ir.A01)) {
            C41771uU c41771uU = this.A0D;
            if (c41771uU != null) {
                if (anonymousClass097 != null && c41771uU.A03(anonymousClass097) != null) {
                    arrayList.add(anonymousClass097);
                }
            } else {
                throw null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StringBuilder A0P = C000200d.A0P("sendmedia/retrymediaupload/already-uploading ");
            AnonymousClass094 anonymousClass094 = ((AnonymousClass092) it.next()).A0n;
            A0P.append(anonymousClass094);
            Log.i(A0P.toString());
            c04130Ir.A03(anonymousClass094);
        }
        if (c04130Ir.A05()) {
            Log.i("sendmedia/retrymediaupload/nothing-to-upload");
        } else {
            this.A0J.AS1(new Runnable() { // from class: X.1IS
                {
                    C03010Du.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C03010Du.this.A03(c04130Ir, z, z2);
                }
            });
        }
    }

    public /* synthetic */ void A03(C04130Ir c04130Ir, boolean z, boolean z2) {
        byte[] bArr = null;
        for (AnonymousClass092 anonymousClass092 : Collections.unmodifiableList(c04130Ir.A01)) {
            this.A0G.A01(anonymousClass092);
            if (bArr == null && anonymousClass092.A0E() != null) {
                bArr = anonymousClass092.A0E().A08();
            }
        }
        this.A0D.A06(c04130Ir, new C22a(z, c04130Ir.A04()), null, null, z2, false, bArr);
    }

    public void A04(AnonymousClass097 anonymousClass097) {
        C09H c09h = anonymousClass097.A02;
        if (anonymousClass097.A09 != null && (c09h == null || c09h.A0F == null)) {
            this.A0E.A01(anonymousClass097);
        } else {
            A05(anonymousClass097, true, true);
        }
        this.A08.A05(anonymousClass097, -1);
    }

    public void A05(AnonymousClass097 anonymousClass097, boolean z, boolean z2) {
        C09H c09h = anonymousClass097.A02;
        if (c09h != null) {
            if (z && !c09h.A0L) {
                c09h.A0L = true;
                this.A07.A0W(anonymousClass097, -1);
            }
            A02(new C04130Ir(Collections.singletonList(anonymousClass097)), z, z2);
            return;
        }
        throw null;
    }

    public void A06(List list, Uri uri, int i, List list2, String str, int i2) {
        A07(list, uri, null, i, null, list2, str, false, i2, null, false, false);
    }

    public void A07(List list, Uri uri, C22e c22e, int i, AnonymousClass092 anonymousClass092, List list2, String str, boolean z, int i2, List list3, boolean z2, boolean z3) {
        Bitmap A0Z = this.A0I.A0Z(uri, 100, 100);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A0Z.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        A0Z.recycle();
        C018608r c018608r = this.A03;
        C41491u0 c41491u0 = this.A0C;
        C09H c09h = new C09H();
        byte b = 1;
        if (z3) {
            b = 42;
        }
        c018608r.A0D(c41491u0.A02(list, c09h, b, i, str, uri, anonymousClass092, list2, z, i2, list3), byteArray, null, c22e, z2);
    }

    public void A08(List list, Uri uri, String str, AnonymousClass092 anonymousClass092, C0B5 c0b5, boolean z) {
        StringBuilder sb = new StringBuilder("sendmedia/send-document uri:");
        sb.append(uri);
        sb.append(" mime:");
        sb.append(str);
        sb.append(" jids:");
        sb.append(Arrays.deepToString(list.toArray()));
        Log.i(sb.toString());
        this.A0J.ARy(new C0HS(this.A05, this.A01, this.A00, this.A0B, this.A02, this.A03, this.A0C, this.A0I, this.A04, this.A06, list, uri, str, anonymousClass092, c0b5, z) { // from class: X.0Ql
            public final Uri A00;
            public final C012005w A01;
            public final C018508q A02;
            public final C01B A03;
            public final C018608r A04;
            public final C02E A05;
            public final C001200o A06;
            public final C002301c A07;
            public final AnonymousClass011 A08;
            public final C41491u0 A09;
            public final AnonymousClass092 A0A;
            public final C41961un A0B;
            public final String A0C;
            public final WeakReference A0D;
            public final List A0E;
            public final boolean A0F;

            {
                this.A06 = r3;
                this.A02 = r4;
                this.A01 = r5;
                this.A08 = r6;
                this.A03 = r7;
                this.A04 = r8;
                this.A09 = r9;
                this.A0B = r10;
                this.A05 = r11;
                this.A07 = r12;
                this.A0E = list;
                this.A00 = uri;
                this.A0C = str;
                this.A0A = anonymousClass092;
                this.A0D = new WeakReference(c0b5);
                this.A0F = z;
            }

            @Override // X.C0HS
            public void A06() {
                C0B5 c0b52 = (C0B5) this.A0D.get();
                if (c0b52 != null) {
                    c0b52.AUr(0, R.string.media_loading);
                }
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                try {
                    return C460324r.A06(this.A01, this.A08, this.A03, this.A09, this.A0B, this.A05, this.A0E, this.A00, this.A0C, this.A0A, this.A0F);
                } catch (Exception e) {
                    return e;
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C0B5 c0b52 = (C0B5) this.A0D.get();
                if (c0b52 != null) {
                    c0b52.ARS();
                }
                Application application = this.A06.A00;
                if (obj instanceof C72463a2) {
                    this.A02.A0D(c0b52, application.getString(R.string.error_file_is_not_a_document));
                } else if (obj instanceof C72473a3) {
                    int A07 = this.A03.A07(C01C.A2w);
                    this.A02.A0D(c0b52, application.getString(R.string.file_too_large_with_placeholder, this.A07.A09(280, A07, String.format(application.getResources().getConfiguration().locale, "%d", Integer.valueOf(A07)))));
                } else if (obj instanceof IOException) {
                    Throwable th = (Throwable) obj;
                    StringBuilder sb2 = new StringBuilder("sendmedia/senddocumentasync/ioerror ");
                    sb2.append(th);
                    Log.e(sb2.toString());
                    if (th.getMessage() != null && th.getMessage().contains("No space")) {
                        this.A02.A0D(c0b52, application.getString(R.string.error_no_disc_space));
                    } else {
                        this.A02.A07(R.string.share_failed, 0);
                    }
                } else if (!(obj instanceof Pair)) {
                } else {
                    Pair pair = (Pair) obj;
                    this.A04.A0C((C04130Ir) pair.first, (byte[]) pair.second);
                }
            }
        }, new Void[0]);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:150:0x013d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void A09(boolean r24, java.util.List r25, java.util.List r26, java.lang.String r27, int r28, boolean r29, android.app.Activity r30, X.C0B5 r31, X.InterfaceC05830Qk r32) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03010Du.A09(boolean, java.util.List, java.util.List, java.lang.String, int, boolean, android.app.Activity, X.0B5, X.0Qk):void");
    }

    public boolean A0A(List list, File file, String str, C2EK c2ek, boolean z) {
        byte[] bArr;
        StringBuilder A0P = C000200d.A0P("sendmedia/sendmediafile src:");
        A0P.append(file.getAbsolutePath());
        A0P.append(" ");
        A0P.append(file.length());
        Log.i(A0P.toString());
        C09H c09h = new C09H();
        c09h.A0F = file;
        if (c2ek == null) {
            bArr = C02180Ae.A1b(file);
        } else {
            Bitmap A0I = C02180Ae.A0I(file);
            if (A0I != null && (A0I.isMutable() || (A0I = A0I.copy(Bitmap.Config.ARGB_8888, true)) != null)) {
                c2ek.A07(A0I, 0, false, false);
                bArr = C02180Ae.A1a(A0I);
            } else {
                bArr = null;
            }
            String str2 = c2ek.A03;
            if (str2 == null) {
                String A0J = C0DD.A0J();
                c09h.A0H = A0J;
                if (!c2ek.A0C(C0DD.A0F(this.A00, A0J))) {
                    return false;
                }
            } else {
                c09h.A0H = str2;
            }
        }
        this.A03.A0C(this.A0C.A01(list, c09h, z ? (byte) 13 : (byte) 3, 0, str, null, null, null, false), bArr);
        return true;
    }

    public boolean A0B(boolean z, List list, File file, C0DC c0dc, boolean z2, String str, AnonymousClass092 anonymousClass092, boolean z3) {
        int A07;
        File A0D;
        C002301c c002301c = this.A06;
        C018508q c018508q = this.A01;
        C01B c01b = this.A02;
        StringBuilder A0P = C000200d.A0P("mediafileutils/checkmediafilesize src:");
        A0P.append(file.getAbsolutePath());
        Log.i(A0P.toString());
        if (c0dc == C0DC.A07) {
            A07 = c01b.A07(C01C.A2w);
        } else {
            A07 = c01b.A07(C01C.A3Y);
        }
        long j = A07;
        if (file.length() > 1048576 * j) {
            StringBuilder A0P2 = C000200d.A0P("mediafileutils/checkmediafilesize/too large:");
            A0P2.append(file.length());
            Log.w(A0P2.toString());
            String A0D2 = c002301c.A0D(R.string.file_too_large_with_placeholder, c002301c.A09(280, j, String.format(c002301c.A0I(), "%d", Integer.valueOf(A07))));
            if (z) {
                c018508q.A0E(A0D2, 1);
                return false;
            }
            c018508q.A0I(A0D2, 1);
            return false;
        }
        StringBuilder A0P3 = C000200d.A0P("sendmedia/sendmediafile src:");
        A0P3.append(file.getAbsolutePath());
        A0P3.append(" ");
        A0P3.append(file.length());
        Log.i(A0P3.toString());
        if (z2) {
            Application application = this.A05.A00;
            C012005w c012005w = this.A00;
            A0D = C0DD.A0D(application, c012005w, this.A0F, file, c0dc, 0);
            StringBuilder A0P4 = C000200d.A0P("sendmedia/sendmediafile send:");
            A0P4.append(A0D.getAbsolutePath());
            Log.i(A0P4.toString());
            AnonymousClass024.A0P(c012005w.A04, file, A0D);
        } else {
            A0D = file;
        }
        C09H c09h = new C09H();
        c09h.A0F = A0D;
        byte[] bArr = null;
        if ((c0dc == C0DC.A0N || c0dc == C0DC.A04 || c0dc == C0DC.A0Q) && (bArr = C02180Ae.A1b(A0D)) == null) {
            Log.w("sendmedia/sendmediafile no video thumbnail generated");
        }
        this.A03.A0C(this.A0C.A01(list, c09h, c0dc.A00, 0, str, null, anonymousClass092, null, z3), bArr);
        return true;
    }
}
