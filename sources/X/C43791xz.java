package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.animated.webp.WebPImage;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1xz */
/* loaded from: classes2.dex */
public class C43791xz {
    public static volatile C43791xz A0B;
    public C44141ya A00;
    public final C012005w A01;
    public final C018508q A02;
    public final C01B A03;
    public final AnonymousClass072 A04;
    public final C003701t A05;
    public final C43101wr A07;
    public final C44091yV A08;
    public final C44081yU A06 = new C44081yU();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();

    public C43791xz(C003701t c003701t, C018508q c018508q, C012005w c012005w, C01B c01b, C43101wr c43101wr, C44071yT c44071yT, AnonymousClass072 anonymousClass072) {
        this.A05 = c003701t;
        this.A02 = c018508q;
        this.A01 = c012005w;
        this.A03 = c01b;
        this.A07 = c43101wr;
        this.A04 = anonymousClass072;
        this.A08 = new C44091yV(c003701t, c018508q, c44071yT);
    }

    public static C43791xz A00() {
        if (A0B == null) {
            synchronized (C43791xz.class) {
                if (A0B == null) {
                    C003701t A00 = C003701t.A00();
                    C018508q A002 = C018508q.A00();
                    C012005w A003 = C012005w.A00();
                    C01B A004 = C01B.A00();
                    C43101wr A01 = C43101wr.A01();
                    if (C44071yT.A01 == null) {
                        synchronized (C44071yT.class) {
                            if (C44071yT.A01 == null) {
                                C44071yT.A01 = new C44071yT(C011605s.A00(), ComponentCallbacks2C011905v.A00());
                            }
                        }
                    }
                    A0B = new C43791xz(A00, A002, A003, A004, A01, C44071yT.A01, AnonymousClass072.A00());
                }
            }
        }
        return A0B;
    }

    public static String A01(C0JM c0jm, int i, int i2) {
        String str = c0jm.A0B;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace("/", "-"));
            sb.append("_");
            sb.append(i);
            sb.append("_");
            sb.append(i2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0jm.toString());
        sb2.append("_");
        sb2.append(i);
        sb2.append("_");
        sb2.append(i2);
        return sb2.toString();
    }

    public static byte[] A02(Context context, C0JM c0jm, C012005w c012005w, C01B c01b) {
        ByteArrayOutputStream byteArrayOutputStream;
        String str = c0jm.A08;
        byte[] bArr = null;
        if (str == null) {
            Log.w("StickerImageFileLoader/loadStickerData filePath is null");
            return null;
        }
        try {
            byte[] bArr2 = null;
            if (!TextUtils.isEmpty(str)) {
                if (c0jm.A01 == 3) {
                    try {
                        InputStream openInputStream = context.getContentResolver().openInputStream(Uri.parse(c0jm.A08));
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        if (openInputStream != null) {
                            AnonymousClass024.A0V(openInputStream, byteArrayOutputStream2);
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            byteArrayOutputStream2.close();
                            openInputStream.close();
                            bArr2 = byteArray;
                        } else {
                            byteArrayOutputStream2.close();
                        }
                    } catch (IOException e) {
                        Log.e("Sticker/getImageDataFromUri/exception", e);
                    }
                    bArr = bArr2;
                } else {
                    if (!TextUtils.isEmpty(c0jm.A08)) {
                        File file = new File(c0jm.A08);
                        if (file.exists()) {
                            long length = file.length();
                            long A07 = c01b.A07(C01C.A3y) * 1024;
                            if (length > A07) {
                                C000200d.A1N(C000200d.A0S("Sticker/getImageDataFromFile/sticker is above legal size limit: ", A07, ", hash: "), c0jm.A0B);
                                File A0M = c012005w.A0M(c0jm.A0B, c0jm.A0E);
                                if (A0M == null) {
                                    Log.e("Sticker/getImageDataFromFile/could not get sticker thumbnail file");
                                } else {
                                    if (!A0M.exists()) {
                                        length = WebpUtils.getFirstWebpThumbnailMinimumFileLength(c0jm.A08);
                                        if (length > A07) {
                                            StringBuilder sb = new StringBuilder("Sticker/getImageDataFromFile/even first frame is above legal size limit: ");
                                            sb.append(A07);
                                            Log.e(sb.toString());
                                        } else {
                                            C43351xG c43351xG = new C43351xG(new FileInputStream(file), length);
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                AnonymousClass024.A0V(c43351xG, byteArrayOutputStream);
                                                if (WebpUtils.createFirstThumbnail(byteArrayOutputStream.toByteArray(), (int) length, A0M.getAbsolutePath())) {
                                                    byteArrayOutputStream.close();
                                                    c43351xG.A02.close();
                                                } else {
                                                    byteArrayOutputStream.close();
                                                    c43351xG.A02.close();
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                    file = A0M;
                                }
                            }
                            C43351xG c43351xG2 = new C43351xG(new FileInputStream(file), length);
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                AnonymousClass024.A0V(c43351xG2, byteArrayOutputStream);
                                bArr2 = byteArrayOutputStream.toByteArray();
                                c43351xG2.A02.close();
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } else {
                            C000200d.A1M(C000200d.A0P("Sticker/getImageDataFromFile/sticker file cannot be found, "), c0jm.A08);
                        }
                    }
                    bArr = bArr2;
                }
            }
            if (bArr2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("StickerImageFileLoader/loadStickerData sticker file does not exist: ");
                sb2.append(c0jm.A0B);
                Log.w(sb2.toString());
                return bArr;
            }
        } catch (IOException e2) {
            StringBuilder A0P = C000200d.A0P("StickerImageFileLoader/loadStickerData sticker IOException when getting image data: ");
            A0P.append(c0jm.A0B);
            Log.e(A0P.toString(), e2);
        }
        return bArr;
    }

    public final Drawable A03(String str, byte[] bArr, AbstractC44101yW abstractC44101yW) {
        int min;
        int i;
        C04050If A00;
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.A09;
        String str2 = abstractC44101yW.A04;
        Reference reference = (Reference) concurrentHashMap.get(str2);
        if (reference != null) {
            C44111yX c44111yX = (C44111yX) reference.get();
            if (c44111yX != null) {
                return new C44121yY(c44111yX, this.A03);
            }
            concurrentHashMap.remove(str2);
        }
        WebPImage A002 = C43101wr.A00(bArr);
        if (A002 == null) {
            return null;
        }
        boolean z2 = false;
        C003701t c003701t = this.A05;
        if (c003701t.A0C(295)) {
            C0JM c0jm = abstractC44101yW.A03;
            C04050If c04050If = c0jm.A04;
            if (c04050If != null) {
                z = c04050If.A05;
            } else {
                String str3 = c0jm.A08;
                if (str3 != null && (A00 = C04050If.A00(WebpUtils.fetchWebpMetadata(str3))) != null) {
                    z = A00.A05;
                }
            }
            z2 = !z;
        }
        if (A002.getFrameCount() != 1 && !z2) {
            if (c003701t.A0C(276)) {
                min = Math.min(512, abstractC44101yW.A02);
                i = Math.min(512, abstractC44101yW.A00);
                if (abstractC44101yW.A06) {
                    min = (int) (min / 2.0f);
                    i = (int) (i / 2.0f);
                }
            } else {
                min = Math.min(512, abstractC44101yW.A00().getResources().getDimensionPixelSize(R.dimen.conversation_row_sticker_size));
                i = min;
            }
            C43101wr c43101wr = this.A07;
            String A02 = C43101wr.A02(str2, min, i);
            Bitmap A05 = c43101wr.A05(A02);
            if (A05 == null && (A05 = c43101wr.A04(A002, min, i, A02)) == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace("/", "-"));
            sb.append("_");
            sb.append(min);
            sb.append("_");
            sb.append(i);
            C44111yX c44111yX2 = new C44111yX(sb.toString(), A05, A002, this.A02, this.A08, min, i);
            concurrentHashMap.put(str2, new WeakReference(c44111yX2));
            return new C44121yY(c44111yX2, this.A03);
        }
        Bitmap A07 = this.A07.A07(str, bArr, abstractC44101yW.A02, abstractC44101yW.A00);
        if (A07 != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(A07);
            this.A0A.put(str2, new SoftReference(bitmapDrawable));
            return bitmapDrawable;
        }
        C000200d.A13("StickerImageLoader/loadAnimatedSticker failed to create drawable, hash: ", str);
        return null;
    }

    public void A04() {
        C44141ya c44141ya = this.A00;
        if (c44141ya != null) {
            c44141ya.A01 = true;
            c44141ya.interrupt();
            this.A00 = null;
        }
        C44081yU c44081yU = this.A06;
        synchronized (c44081yU) {
            c44081yU.A00.clear();
        }
        C44091yV c44091yV = this.A08;
        C44151yb c44151yb = c44091yV.A00;
        if (c44151yb != null) {
            c44151yb.A06 = true;
            C44091yV c44091yV2 = c44151yb.A05.A00;
            c44091yV2.A00 = null;
            C44161yc c44161yc = c44091yV2.A04;
            synchronized (c44161yc) {
                c44161yc.A00 = null;
            }
            c44151yb.interrupt();
            c44091yV.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0019, code lost:
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(X.C018508q r7, X.AbstractC44101yW r8, java.util.Map r9) {
        /*
            r6 = this;
            boolean r0 = r8.A02()
            if (r0 == 0) goto L49
            r5 = 0
            if (r9 == 0) goto L6a
            java.lang.String r0 = r8.A04
            java.lang.Object r0 = r9.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 != 0) goto L46
        L1b:
            android.content.Context r4 = r8.A00()
            X.0JM r3 = r8.A03
            X.05w r2 = r6.A01
            X.01B r1 = r6.A03
            byte[] r4 = A02(r4, r3, r2, r1)
            if (r4 == 0) goto L38
            boolean r0 = r8.A05
            if (r0 == 0) goto L56
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L6c
            android.graphics.drawable.Drawable r5 = r6.A03(r0, r4, r8)
        L37:
            r0 = r5
        L38:
            if (r9 == 0) goto L46
            if (r0 == 0) goto L4a
            java.lang.String r2 = r8.A04
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r0)
            r9.put(r2, r1)
        L46:
            r8.A01(r0, r7)
        L49:
            return
        L4a:
            java.lang.String r1 = "StickerImageLoader/loadSticker failed to create drawable: "
            java.lang.StringBuilder r2 = X.C000200d.A0P(r1)
            java.lang.String r1 = r8.A04
            X.C000200d.A1M(r2, r1)
            goto L46
        L56:
            X.1wr r3 = r6.A07
            java.lang.String r2 = r8.A04
            int r1 = r8.A02
            int r0 = r8.A00
            android.graphics.Bitmap r0 = r3.A07(r2, r4, r1, r0)
            if (r0 == 0) goto L37
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r0)
            goto L37
        L6a:
            r0 = r5
            goto L1b
        L6c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43791xz.A05(X.08q, X.1yW, java.util.Map):void");
    }

    public void A06(C0JM c0jm, int i, ImageView imageView, int i2, int i3, boolean z, boolean z2, InterfaceC44171yd interfaceC44171yd) {
        PriorityQueue priorityQueue;
        Drawable drawable;
        String A01 = A01(c0jm, i2, i3);
        imageView.setTag(A01);
        C44081yU c44081yU = this.A06;
        synchronized (c44081yU) {
            priorityQueue = c44081yU.A00;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                if (((C44181ye) it.next()).A00 == imageView) {
                    it.remove();
                }
            }
        }
        Drawable drawable2 = imageView.getDrawable();
        Reference reference = (Reference) this.A0A.get(A01);
        if (reference == null || (drawable = (Drawable) reference.get()) == null) {
            drawable = null;
            if (c0jm.A0B != null) {
                ConcurrentHashMap concurrentHashMap = this.A09;
                Reference reference2 = (Reference) concurrentHashMap.get(A01);
                if (reference2 != null) {
                    C44111yX c44111yX = (C44111yX) reference2.get();
                    if (c44111yX != null) {
                        drawable = new C44121yY(c44111yX, this.A03);
                    } else {
                        concurrentHashMap.remove(A01);
                    }
                }
            }
        }
        if (drawable2 != null && drawable2.equals(drawable)) {
            if (interfaceC44171yd != null) {
                interfaceC44171yd.AP5(true);
            }
        } else if (drawable == null) {
            imageView.setImageResource(R.drawable.sticker_loading);
            C44181ye c44181ye = new C44181ye(c0jm, A01, i2, i3, z, i, z2, imageView, interfaceC44171yd);
            synchronized (c44081yU) {
                priorityQueue.add(c44181ye);
                c44081yU.notifyAll();
            }
            if (this.A00 == null) {
                C44141ya c44141ya = new C44141ya(this, c44081yU);
                this.A00 = c44141ya;
                c44141ya.start();
            }
        } else {
            imageView.setImageDrawable(drawable);
            if (interfaceC44171yd != null) {
                interfaceC44171yd.AP5(true);
            }
        }
    }
}
