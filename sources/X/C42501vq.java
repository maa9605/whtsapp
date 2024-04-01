package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.1vq */
/* loaded from: classes2.dex */
public class C42501vq extends AbstractC40441sG {
    public static volatile C42501vq A07;
    public final C0HK A00;
    public final C018508q A01;
    public final AnonymousClass012 A02;
    public final C02F A03;
    public final C42511vr A04;
    public final C41961un A05;
    public final InterfaceC002901k A06;

    public C42501vq(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, C03280Fb c03280Fb, C02L c02l, AnonymousClass034 anonymousClass034, C01B c01b, InterfaceC002901k interfaceC002901k, C41961un c41961un, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C42511vr c42511vr, C02F c02f, C0CB c0cb, C0Fi c0Fi) {
        super(c001200o, c003701t, c03280Fb, c02l, anonymousClass034, c01b, c03290Fc, c03310Fe, c000400f, c0cb, c0Fi);
        this.A00 = new C0HK(0);
        this.A02 = anonymousClass012;
        this.A01 = c018508q;
        this.A05 = c41961un;
        this.A06 = interfaceC002901k;
        this.A04 = c42511vr;
        this.A03 = c02f;
    }

    public static C42501vq A03() {
        if (A07 == null) {
            synchronized (C42501vq.class) {
                C001200o c001200o = C001200o.A01;
                AnonymousClass012 A00 = AnonymousClass012.A00();
                C003701t A002 = C003701t.A00();
                C018508q A003 = C018508q.A00();
                C03280Fb A004 = C03280Fb.A00();
                C02L A005 = C02L.A00();
                AnonymousClass034 A006 = AnonymousClass034.A00();
                C01B A007 = C01B.A00();
                InterfaceC002901k A008 = C002801j.A00();
                C41961un A0S = C41961un.A0S();
                C03290Fc A009 = C03290Fc.A00();
                C03310Fe A0010 = C03310Fe.A00();
                C000400f A0011 = C000400f.A00();
                if (C42511vr.A0A == null) {
                    synchronized (C42511vr.class) {
                        C42511vr.A0A = new C42511vr(c001200o, C003701t.A00(), C018508q.A00(), C03280Fb.A00(), C02L.A00(), C012005w.A00(), AnonymousClass034.A00(), C01B.A00(), C41961un.A0S(), C03290Fc.A00(), C03310Fe.A00(), C000400f.A00(), C02F.A00(), C0CB.A00(), C0Fi.A00(), C03350Fj.A01());
                    }
                }
                A07 = new C42501vq(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A0S, A009, A0010, A0011, C42511vr.A0A, C02F.A00(), C0CB.A00(), C0Fi.A00());
            }
        }
        return A07;
    }

    @Override // X.AbstractC40441sG
    public Drawable A0A(C42571vx c42571vx) {
        Integer num;
        Drawable A0A = super.A0A(c42571vx);
        if (c42571vx != null && (num = c42571vx.A01) != null && A0A != null) {
            C03410Fp.A06(super.A06.A00, A0A, num.intValue());
        }
        return A0A;
    }

    public final C0FK A0B(AbstractC005302j abstractC005302j, Context context) {
        C03380Fm c03380Fm;
        boolean A1K = AnonymousClass029.A1K(context);
        boolean z = true;
        if (abstractC005302j == null) {
            c03380Fm = A0D(context, A1K);
        } else {
            C03370Fl A072 = this.A09.A07(abstractC005302j);
            if (A1K) {
                c03380Fm = A072.A04;
            } else {
                c03380Fm = A072.A05;
            }
            if (c03380Fm == null) {
                c03380Fm = A0D(context, A1K);
            } else {
                z = false;
            }
        }
        return new C0FK(c03380Fm, Boolean.valueOf(z));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:23|24)|(14:26|28|29|(9:31|32|(2:34|(4:36|37|6|7))|38|(1:44)(1:42)|43|37|6|7)|46|32|(0)|38|(1:40)|44|43|37|6|7)|48|28|29|(0)|46|32|(0)|38|(0)|44|43|37|6|7) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0100, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0030, code lost:
        if (r2.equals("USER_PROVIDED") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0039, code lost:
        if (r2.equals("DOWNLOADED") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x003b, code lost:
        r0 = android.net.Uri.parse(r8.A02).getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0045, code lost:
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0047, code lost:
        r0 = X.C03410Fp.A03(r7.A08, new java.io.File(r0), r9, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0069 A[Catch: NumberFormatException -> 0x006e, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x006e, blocks: (B:89:0x0065, B:91:0x0069), top: B:124:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C42571vx A0C(X.C03380Fm r8, android.content.Context r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42501vq.A0C(X.0Fm, android.content.Context, boolean):X.1vx");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0032, code lost:
        if (r6.equals("DOWNLOADED") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003b, code lost:
        if (r6.equals("COLOR_WITH_WA_OVERLAY") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0044, code lost:
        if (r6.equals("USER_PROVIDED") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0046, code lost:
        r1 = X.AbstractC40441sG.A02(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004e, code lost:
        if (r1.exists() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0050, code lost:
        r1 = android.net.Uri.fromFile(r1).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005f, code lost:
        if (r6.equals("COLOR_ONLY") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0061, code lost:
        r0 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0063, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0065, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0066, code lost:
        r7 = r10.getResources().getIntArray(com.google.android.search.verification.client.R.array.solid_color_wallpaper_colors)[r2];
        r4 = r10.getResources().getIntArray(com.google.android.search.verification.client.R.array.solid_color_wallpaperv2_colors);
        r3 = r4.length;
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0081, code lost:
        if (r2 >= r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0085, code lost:
        if (r4[r2] == r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0087, code lost:
        r1 = r1 + 1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x008c, code lost:
        r2 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0091, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0092, code lost:
        r1 = java.lang.String.valueOf(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C03380Fm A0D(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            X.0CB r0 = r9.A09
            r5 = 0
            X.0Fl r0 = r0.A04()
            if (r11 == 0) goto L97
            X.0Fm r2 = r0.A04
        Lb:
            if (r2 != 0) goto L2b
            X.1vr r1 = r9.A04
            r0 = 1
            X.1vy r1 = r1.A0B(r10, r0)
            java.lang.String r6 = r1.A02
            int r0 = r6.hashCode()
            r8 = 0
            switch(r0) {
                case -1770733785: goto L2c;
                case -899329064: goto L35;
                case 175331287: goto L3e;
                case 1804184360: goto L59;
                default: goto L1e;
            }
        L1e:
            r1 = r5
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.0Fm r2 = new X.0Fm
            r2.<init>(r6, r1, r0)
            r9.A0G(r5, r2, r10)
        L2b:
            return r2
        L2c:
            java.lang.String r0 = "DOWNLOADED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1e
            goto L46
        L35:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1e
            goto L61
        L3e:
            java.lang.String r0 = "USER_PROVIDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1e
        L46:
            java.io.File r1 = X.AbstractC40441sG.A02(r10)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L1e
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r0.toString()
            goto L1f
        L59:
            java.lang.String r0 = "COLOR_ONLY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1e
        L61:
            java.lang.Integer r0 = r1.A00
            if (r0 != 0) goto L8c
            r2 = 0
        L66:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903058(0x7f030012, float:1.7412923E38)
            int[] r0 = r1.getIntArray(r0)
            r7 = r0[r2]
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903059(0x7f030013, float:1.7412925E38)
            int[] r4 = r1.getIntArray(r0)
            int r3 = r4.length
            r2 = 0
            r1 = 0
        L81:
            if (r2 >= r3) goto L91
            r0 = r4[r2]
            if (r0 == r7) goto L92
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L81
        L8c:
            int r2 = r0.intValue()
            goto L66
        L91:
            r1 = 0
        L92:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L1f
        L97:
            X.0Fm r2 = r0.A05
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42501vq.A0D(android.content.Context, boolean):X.0Fm");
    }

    public final C03380Fm A0E(AbstractC005302j abstractC005302j, Context context, BitmapDrawable bitmapDrawable) {
        AnonymousClass012 anonymousClass012 = this.A02;
        String A01 = C02A.A01(String.valueOf(anonymousClass012.A01()));
        if (A01 == null) {
            A01 = String.valueOf(anonymousClass012.A01());
        }
        File file = new File(context.getFilesDir(), "Wallpapers");
        file.mkdirs();
        File file2 = new File(file, A01);
        if (!file2.exists()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmapDrawable.getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e("wallpaper/v2/save-wallpaper-file/failed to save wallpaper", e);
            }
        }
        C03380Fm c03380Fm = new C03380Fm("USER_PROVIDED", Uri.fromFile(file2).toString(), 25);
        A0G(abstractC005302j, c03380Fm, context);
        return c03380Fm;
    }

    /* JADX WARN: Finally extract failed */
    public final void A0F() {
        File[] listFiles;
        C0CB c0cb = this.A09;
        C0CD A02 = c0cb.A09().A02();
        try {
            C0CE c0ce = A02.A02;
            c0ce.A0C("UPDATE settings SET wallpaper_light_type = NULL, wallpaper_light_value = NULL, wallpaper_dark_type = NULL, wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid != 'individual_chat_defaults'");
            c0ce.A0C("UPDATE settings SET wallpaper_light_type = 'DEFAULT', wallpaper_light_value = NULL, wallpaper_dark_type = 'DEFAULT', wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid = 'individual_chat_defaults'");
            A02.close();
            c0cb.A0W.clear();
            File file = new File(super.A06.A00.getFilesDir(), "Wallpapers");
            if (!file.exists() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                file2.delete();
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

    /* JADX WARN: Code restructure failed: missing block: B:59:0x002a, code lost:
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x002d, code lost:
        if (r5 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0035, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r5.A01) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0037, code lost:
        if (r1 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0039, code lost:
        r1 = android.net.Uri.parse(r5.A02).getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0043, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0045, code lost:
        new java.io.File(r1).delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x007f, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0G(X.AbstractC005302j r8, X.C03380Fm r9, android.content.Context r10) {
        /*
            r7 = this;
            boolean r6 = X.AnonymousClass029.A1K(r10)
            X.0CB r2 = r7.A09
            if (r8 != 0) goto L79
            X.0Fl r0 = r2.A04()
        Lc:
            if (r6 == 0) goto L76
            X.0Fm r5 = r0.A04
        L10:
            java.lang.String r4 = "USER_PROVIDED"
            r3 = 1
            if (r9 == 0) goto L2c
            java.lang.String r0 = r9.A01
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2c
            if (r5 == 0) goto L4d
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L2c
            java.lang.String r0 = r9.A02
            boolean r0 = r1.equalsIgnoreCase(r0)
            r1 = 1
            if (r0 != 0) goto L2f
        L2c:
            r1 = 0
            if (r5 == 0) goto L4d
        L2f:
            java.lang.String r0 = r5.A01
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L4d
            if (r1 != 0) goto L4d
            java.lang.String r0 = r5.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getPath()
            if (r1 == 0) goto L7e
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
        L4d:
            r7.A00 = r3
            if (r8 != 0) goto L71
            X.0Fl r0 = r2.A04()
        L55:
            if (r6 == 0) goto L6e
            r0.A04 = r9
        L59:
            r2.A0J(r0)
            if (r8 == 0) goto L6a
            r6 = r6 ^ r3
            X.0Fl r0 = r2.A07(r8)
            if (r6 == 0) goto L6b
            r0.A04 = r9
        L67:
            r2.A0J(r0)
        L6a:
            return
        L6b:
            r0.A05 = r9
            goto L67
        L6e:
            r0.A05 = r9
            goto L59
        L71:
            X.0Fl r0 = r2.A07(r8)
            goto L55
        L76:
            X.0Fm r5 = r0.A05
            goto L10
        L79:
            X.0Fl r0 = r2.A07(r8)
            goto Lc
        L7e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42501vq.A0G(X.02j, X.0Fm, android.content.Context):void");
    }
}
