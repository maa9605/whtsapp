package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.23a */
/* loaded from: classes2.dex */
public class C456723a {
    public static volatile C456723a A0L;
    public final C04480Ki A00;
    public final C012005w A01;
    public final C018508q A02;
    public final C02L A03;
    public final C05W A04;
    public final AnonymousClass008 A05;
    public final C011505r A06;
    public final C04470Kh A07;
    public final C0E7 A08;
    public final C02E A09;
    public final AnonymousClass012 A0A;
    public final C002301c A0B;
    public final C0C9 A0C;
    public final C0C8 A0D;
    public final C03180Eq A0E;
    public final AnonymousClass011 A0F;
    public final C04400Ka A0G;
    public final C07A A0H;
    public final C03510Fz A0I;
    public final InterfaceC002901k A0J;
    public final C41991uq A0K;

    public C456723a(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C012005w c012005w, AnonymousClass011 anonymousClass011, C41991uq c41991uq, C05W c05w, C02E c02e, C002301c c002301c, C04480Ki c04480Ki, AnonymousClass008 anonymousClass008, C0C9 c0c9, C03510Fz c03510Fz, C03180Eq c03180Eq, C011505r c011505r, C04470Kh c04470Kh, C0E7 c0e7, C04400Ka c04400Ka, C07A c07a, C0C8 c0c8) {
        this.A0A = anonymousClass012;
        this.A02 = c018508q;
        this.A03 = c02l;
        this.A0J = interfaceC002901k;
        this.A01 = c012005w;
        this.A0F = anonymousClass011;
        this.A0K = c41991uq;
        this.A04 = c05w;
        this.A09 = c02e;
        this.A0B = c002301c;
        this.A00 = c04480Ki;
        this.A05 = anonymousClass008;
        this.A0C = c0c9;
        this.A0I = c03510Fz;
        this.A0E = c03180Eq;
        this.A06 = c011505r;
        this.A07 = c04470Kh;
        this.A08 = c0e7;
        this.A0G = c04400Ka;
        this.A0H = c07a;
        this.A0D = c0c8;
    }

    public static C456723a A00() {
        if (A0L == null) {
            synchronized (C456723a.class) {
                if (A0L == null) {
                    A0L = new C456723a(AnonymousClass012.A00(), C018508q.A00(), C02L.A00(), C002801j.A00(), C012005w.A00(), AnonymousClass011.A00(), C41991uq.A00(), C05W.A00(), C02E.A00(), C002301c.A00(), C04480Ki.A01, AnonymousClass008.A01, C0C9.A00(), C03510Fz.A03, C03180Eq.A00(), C011505r.A00(), C04470Kh.A00(), C0E7.A00(), C04400Ka.A00(), C07A.A01(), C0C8.A00());
                }
            }
        }
        return A0L;
    }

    public C04510Kl A01(AbstractC005302j abstractC005302j, byte[] bArr, byte[] bArr2, C04500Kk c04500Kk) {
        return new C04510Kl(this.A0A, this.A02, this.A03, this.A0F, this.A0K, this.A04, this.A05, this.A0C, this.A0E, this.A06, this.A07, this, this.A0H, this.A0D, abstractC005302j, bArr, bArr2, c04500Kk);
    }

    /* JADX WARN: Finally extract failed */
    public C457323i A02(File file) {
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.read(bArr);
            fileInputStream.close();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            options.inDither = true;
            options.inPreferQualityOverSpeed = true;
            Bitmap bitmap = C002701i.A0N(bArr, new C0DH(96, 96, null, true, options)).A02;
            if (bitmap != null) {
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(96, 96, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, 96, 96), paint);
                bitmap.recycle();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(AbstractC012105x.A01(this.A01.A0B(), "tmpt"));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e("profileinfo/sendphoto/cannot save thumb", e);
                }
                createBitmap.recycle();
                File A01 = AbstractC012105x.A01(this.A01.A0B(), "tmpt");
                byte[] bArr2 = new byte[(int) A01.length()];
                fileInputStream = new FileInputStream(A01);
                try {
                    fileInputStream.read(bArr2);
                    fileInputStream.close();
                    return new C457323i(bArr, bArr2);
                } finally {
                }
            } else {
                Log.e("profileinfo/sendphoto/cannot decode thumb");
                throw new FileNotFoundException();
            }
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public File A03() {
        return AbstractC012105x.A01(this.A01.A0B(), "tmpi");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0014, code lost:
        if (r8.A0C() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0017, code lost:
        if (r8 != null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0023, code lost:
        if (r6.A06.A04(r8).exists() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0025, code lost:
        if (r5 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0027, code lost:
        r0 = com.whatsapp.profile.ResetGroupPhoto.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0029, code lost:
        r3 = new android.content.Intent(r7, r0);
        r2 = com.google.android.search.verification.client.R.string.remove_profile_photo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
        if (r5 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0033, code lost:
        r2 = com.google.android.search.verification.client.R.string.remove_photo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0036, code lost:
        r4.add(new X.C457523l(r3, r2, com.google.android.search.verification.client.R.drawable.clear));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0041, code lost:
        r4.add(new X.C457523l(new android.content.Intent(r7, com.whatsapp.gallerypicker.GalleryPickerLauncher.class), com.google.android.search.verification.client.R.string.gallery_picker_label, com.google.android.search.verification.client.R.drawable.ic_gallery));
        android.os.Environment.getExternalStorageDirectory();
        r4.add(new X.C457523l(new android.content.Intent(r7, com.whatsapp.profile.CapturePhoto.class).putExtra("target_file_uri", X.AnonymousClass024.A04(r7, A03())), com.google.android.search.verification.client.R.string.capture_photo, com.google.android.search.verification.client.R.drawable.ic_capture));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
        r4.add(new X.C457523l(new android.content.Intent(r7, com.whatsapp.profile.WebImagePicker.class).putExtra("output", android.net.Uri.fromFile(A03())).putExtra("query", r8.A0F), com.google.android.search.verification.client.R.string.search_web, com.google.android.search.verification.client.R.drawable.ic_search_web));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
        com.whatsapp.util.Log.i("profile/photo/updater/run chooser");
        r3 = r7.A0N();
        r0 = com.google.android.search.verification.client.R.string.profile_photo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
        if (r5 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
        r0 = com.google.android.search.verification.client.R.string.group_photo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
        r2 = com.whatsapp.IntentChooserBottomSheetDialogFragment.A00(r0, r4, r9);
        r1 = r2.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
        if (r3.A0Q.A01(r1) != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
        r2.A14(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
        r0 = com.whatsapp.profile.ResetProfilePhoto.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.ActivityC02320As r7, X.C06C r8, int r9) {
        /*
            r6 = this;
            java.io.File r0 = r6.A03()
            r0.delete()
            r0 = 4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            if (r8 == 0) goto L16
            boolean r0 = r8.A0C()
            r5 = 1
            if (r0 != 0) goto L19
        L16:
            r5 = 0
            if (r8 == 0) goto L41
        L19:
            X.05r r0 = r6.A06
            java.io.File r0 = r0.A04(r8)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L41
            if (r5 == 0) goto Ld2
            java.lang.Class<com.whatsapp.profile.ResetGroupPhoto> r0 = com.whatsapp.profile.ResetGroupPhoto.class
        L29:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r7, r0)
            r2 = 2131889408(0x7f120d00, float:1.9413479E38)
            if (r5 == 0) goto L36
            r2 = 2131889407(0x7f120cff, float:1.9413477E38)
        L36:
            r1 = 2131231108(0x7f080184, float:1.8078288E38)
            X.23l r0 = new X.23l
            r0.<init>(r3, r2, r1)
            r4.add(r0)
        L41:
            java.lang.Class<com.whatsapp.gallerypicker.GalleryPickerLauncher> r0 = com.whatsapp.gallerypicker.GalleryPickerLauncher.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r7, r0)
            r2 = 2131887544(0x7f1205b8, float:1.9409698E38)
            r1 = 2131231519(0x7f08031f, float:1.8079121E38)
            X.23l r0 = new X.23l
            r0.<init>(r3, r2, r1)
            r4.add(r0)
            android.os.Environment.getExternalStorageDirectory()
            java.lang.Class<com.whatsapp.profile.CapturePhoto> r0 = com.whatsapp.profile.CapturePhoto.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r7, r0)
            java.io.File r0 = r6.A03()
            android.net.Uri r1 = X.AnonymousClass024.A04(r7, r0)
            java.lang.String r0 = "target_file_uri"
            android.content.Intent r3 = r2.putExtra(r0, r1)
            r2 = 2131886578(0x7f1201f2, float:1.9407739E38)
            r1 = 2131231450(0x7f0802da, float:1.8078981E38)
            X.23l r0 = new X.23l
            r0.<init>(r3, r2, r1)
            r4.add(r0)
            if (r5 == 0) goto La9
            java.lang.Class<com.whatsapp.profile.WebImagePicker> r0 = com.whatsapp.profile.WebImagePicker.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r7, r0)
            java.io.File r0 = r6.A03()
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            java.lang.String r0 = "output"
            android.content.Intent r2 = r2.putExtra(r0, r1)
            java.lang.String r1 = r8.A0F
            java.lang.String r0 = "query"
            android.content.Intent r3 = r2.putExtra(r0, r1)
            r2 = 2131889525(0x7f120d75, float:1.9413716E38)
            r1 = 2131231658(0x7f0803aa, float:1.8079403E38)
            X.23l r0 = new X.23l
            r0.<init>(r3, r2, r1)
            r4.add(r0)
        La9:
            java.lang.String r0 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i(r0)
            X.0Cx r3 = r7.A0N()
            r0 = 2131889268(0x7f120c74, float:1.9413195E38)
            if (r5 == 0) goto Lba
            r0 = 2131887896(0x7f120718, float:1.9410412E38)
        Lba:
            com.whatsapp.IntentChooserBottomSheetDialogFragment r2 = com.whatsapp.IntentChooserBottomSheetDialogFragment.A00(r0, r4, r9)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getName()
            X.0Cy r0 = r3.A0Q
            X.0BA r0 = r0.A01(r1)
            if (r0 != 0) goto Ld1
            r2.A14(r3, r1)
        Ld1:
            return
        Ld2:
            java.lang.Class<com.whatsapp.profile.ResetProfilePhoto> r0 = com.whatsapp.profile.ResetProfilePhoto.class
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C456723a.A04(X.0As, X.06C, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x000e, code lost:
        if (r5 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(X.ActivityC02290Ap r11, android.content.Intent r12, int r13, X.C0B6 r14) {
        /*
            r10 = this;
            r8 = 0
            r6 = r11
            if (r12 == 0) goto L10
            android.net.Uri r5 = r12.getData()
            java.lang.String r0 = "webImageSource"
            java.lang.String r8 = r12.getStringExtra(r0)
            if (r5 != 0) goto L22
        L10:
            java.io.File r0 = r10.A03()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L38
            java.io.File r0 = r10.A03()
            android.net.Uri r5 = android.net.Uri.fromFile(r0)
        L22:
            if (r5 == 0) goto L38
            X.02E r4 = r10.A09
            X.05r r7 = r10.A06
            r9 = r13
            r3 = r14
            X.23u r2 = new X.23u
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.01k r1 = r10.A0J
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.AS4(r2, r0)
            return
        L38:
            java.lang.String r0 = "profileinfo/cropphoto/no-data"
            com.whatsapp.util.Log.e(r0)
            r0 = 2131887340(0x7f1204ec, float:1.9409284E38)
            r11.AUj(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C456723a.A05(X.0Ap, android.content.Intent, int, X.0B6):void");
    }

    public void A06(C06C c06c) {
        if (!this.A08.A05()) {
            this.A02.A07(R.string.coldsync_no_network, 0);
            return;
        }
        C04400Ka c04400Ka = this.A0G;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            c04400Ka.A03(A01((AbstractC005302j) A03, null, null, null));
            return;
        }
        throw null;
    }

    public void A07(C06C c06c) {
        int read;
        C011505r c011505r = this.A06;
        File A03 = c011505r.A03(c06c);
        File A04 = c011505r.A04(c06c);
        if (A03.exists() && A04.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(A04);
                FileInputStream fileInputStream2 = new FileInputStream(A03);
                int length = (int) A04.length();
                byte[] bArr = new byte[length];
                int i = 0;
                int i2 = 0;
                while (i2 < length && (read = fileInputStream.read(bArr, i2, length - i2)) != -1) {
                    i2 += read;
                }
                int length2 = (int) A03.length();
                byte[] bArr2 = new byte[length2];
                while (i < length2) {
                    int read2 = fileInputStream2.read(bArr2, i, length2 - i);
                    if (read2 == -1) {
                        break;
                    }
                    i += read2;
                }
                Jid A032 = c06c.A03(AbstractC005302j.class);
                if (A032 != null) {
                    C04510Kl A01 = A01((AbstractC005302j) A032, bArr2, bArr, null);
                    A01.A05 = true;
                    this.A0G.A03(A01);
                    fileInputStream2.close();
                    fileInputStream.close();
                    return;
                }
                throw null;
            } catch (IOException e) {
                StringBuilder A0P = C000200d.A0P("profileinfo/resend/jid ");
                A0P.append(c06c.A02());
                A0P.append("/failed");
                Log.e(A0P.toString(), e);
            }
        }
    }

    public void A08(AbstractC005302j abstractC005302j, int i, boolean z) {
        C06C A0A = this.A04.A0A(abstractC005302j);
        if (A0A.A01 == i && A0A.A02 == i) {
            return;
        }
        if (i == -1) {
            this.A07.A04(abstractC005302j);
            return;
        }
        C04480Ki c04480Ki = this.A00;
        c04480Ki.A00.post(new RunnableEBaseShape0S0311000_I0(this, A0A, i, z, abstractC005302j, 3));
    }

    public boolean A09(C06C c06c) {
        if (!this.A08.A05()) {
            this.A02.A07(R.string.coldsync_no_network, 0);
            return false;
        }
        try {
            C457323i A02 = A02(this.A06.A02());
            C04400Ka c04400Ka = this.A0G;
            Jid A03 = c06c.A03(AbstractC005302j.class);
            if (A03 != null) {
                c04400Ka.A03(A01((AbstractC005302j) A03, A02.A00, A02.A01, null));
                return true;
            }
            throw null;
        } catch (FileNotFoundException e) {
            this.A02.A07(R.string.error_load_image, 0);
            Log.e("profileinfo/sendphoto", e);
            return false;
        } catch (IOException e2) {
            this.A02.A07(R.string.error_load_image, 0);
            Log.e("profileinfo/sendphoto", e2);
            return false;
        }
    }
}
