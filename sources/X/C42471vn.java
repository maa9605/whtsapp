package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1vn */
/* loaded from: classes2.dex */
public class C42471vn implements InterfaceC011705t {
    public static final BitmapFactory.Options A07;
    public static volatile C42471vn A08;
    public int A00;
    public final C0JH A02;
    public final C0GT A03;
    public final C43801y0 A04;
    public final List A06 = new ArrayList();
    public final HashMap A05 = new HashMap();
    public final Handler A01 = new Handler(Looper.getMainLooper());

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A07 = options;
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inDither = true;
    }

    public C42471vn(C001200o c001200o, C012005w c012005w, C011605s c011605s, C40081rY c40081rY, C41491u0 c41491u0, C002301c c002301c, C43101wr c43101wr, ComponentCallbacks2C011905v componentCallbacks2C011905v, C43791xz c43791xz, C0GT c0gt, C43171wy c43171wy) {
        this.A03 = c0gt;
        this.A04 = new C43801y0(c001200o, c012005w, c40081rY, c41491u0, c002301c, c43101wr, c43791xz, c43171wy);
        StringBuilder sb = new StringBuilder("messagethumbcache/construct ");
        sb.append((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8));
        Log.i(sb.toString());
        this.A02 = c011605s.A03();
        c011605s.A0I.add(new C0JI() { // from class: X.3sQ
            {
                C42471vn.this = this;
            }

            @Override // X.C0JI
            public final void ANo(String str, Bitmap bitmap) {
                C42471vn.this.A05.put(str, new SoftReference(bitmap));
            }
        });
        componentCallbacks2C011905v.A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d6, code lost:
        if (r1 > 0.0f) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(X.AnonymousClass097 r4, int r5) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42471vn.A00(X.097, int):int");
    }

    public static C42471vn A01() {
        if (A08 == null) {
            synchronized (C42471vn.class) {
                if (A08 == null) {
                    C001200o c001200o = C001200o.A01;
                    C012005w A00 = C012005w.A00();
                    C011605s A002 = C011605s.A00();
                    C40081rY A003 = C40081rY.A00();
                    C43811y1.A00();
                    A08 = new C42471vn(c001200o, A00, A002, A003, C41491u0.A00(), C002301c.A00(), C43101wr.A01(), ComponentCallbacks2C011905v.A00(), C43791xz.A00(), C0GT.A00(), C43171wy.A00());
                }
            }
        }
        return A08;
    }

    public static final byte[] A02(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C0JJ) {
            return ((C0JJ) anonymousClass092).A1D();
        }
        if (anonymousClass092.A0E() == null || !anonymousClass092.A0E().A06() || anonymousClass092.A0E().A08() == null) {
            return null;
        }
        return anonymousClass092.A0E().A08();
    }

    public int A03(Context context) {
        int i = this.A00;
        if (i == 0) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_thumb_cache_default_thumb_density_size);
            this.A00 = dimensionPixelSize;
            return dimensionPixelSize;
        }
        return i;
    }

    public final synchronized Bitmap A04(AnonymousClass092 anonymousClass092) {
        return A05(anonymousClass092, false, false, A02(anonymousClass092));
    }

    public final synchronized Bitmap A05(AnonymousClass092 anonymousClass092, boolean z, boolean z2, byte[] bArr) {
        Bitmap bitmap = null;
        if (anonymousClass092 instanceof C09C) {
            return null;
        }
        if (bArr != null) {
            try {
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, A07);
                if (bitmap != null && z && (anonymousClass092 instanceof C0JJ)) {
                    FilterUtils.blurNative(bitmap, 4, 2);
                } else if (bitmap != null && z && (anonymousClass092 instanceof AnonymousClass097)) {
                    boolean z3 = anonymousClass092 instanceof C09E;
                    if (!z3) {
                        FilterUtils.blurNative(bitmap, z2 ? 2 : 1, 2);
                    } else if (z3 && bitmap.getHeight() < 100 && bitmap.getWidth() < 100) {
                        FilterUtils.blurNative(bitmap, 1, 2);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("image-thumb/base64-decode/message.encoding:");
                sb.append(anonymousClass092.A03());
                Log.e(sb.toString());
                if (anonymousClass092.A03() == 0 && anonymousClass092.A0G() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("image-thumb/base64-decode/message.data:");
                    sb2.append(anonymousClass092.A0G().substring(0, Math.min(100, anonymousClass092.A0G().length())));
                    Log.e(sb2.toString());
                }
                Log.e("image-thumb/base64-decode/error", e);
            }
            return bitmap;
        }
        return null;
    }

    public final synchronized Bitmap A06(String str) {
        Bitmap bitmap;
        bitmap = (Bitmap) this.A02.A01(str);
        if (bitmap == null || bitmap.isRecycled()) {
            if (bitmap != null && bitmap.isRecycled()) {
                Log.e("!! recycled message in hard cache");
            }
            HashMap hashMap = this.A05;
            SoftReference softReference = (SoftReference) hashMap.get(str);
            bitmap = softReference != null ? (Bitmap) softReference.get() : null;
            if (bitmap == null || bitmap.isRecycled()) {
                if (softReference != null) {
                    hashMap.remove(str);
                }
                bitmap = null;
            }
        }
        return bitmap;
    }

    public void A07() {
        C000700j.A01();
        List<Runnable> list = this.A06;
        synchronized (list) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            list.clear();
        }
    }

    public void A08(AnonymousClass092 anonymousClass092) {
        C0JH c0jh = this.A02;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        String str = (anonymousClass094 == null || (str = anonymousClass094.A01) == null) ? "null" : "null";
        c0jh.A04(str);
        this.A05.remove(str);
    }

    public void A09(AnonymousClass092 anonymousClass092, View view, InterfaceC43821y3 interfaceC43821y3, Object obj) {
        Bitmap A06;
        InterfaceC43821y3 interfaceC43821y32 = interfaceC43821y3;
        view.setTag(obj);
        if (interfaceC43821y3 == null) {
            interfaceC43821y32 = new C43831y4(this, view.getContext());
        }
        if (((anonymousClass092 instanceof C0JJ) && ((C0JJ) anonymousClass092).A1D() != null) || (anonymousClass092.A0E() != null && anonymousClass092.A0E().A05())) {
            Object tag = view.getTag();
            synchronized (this) {
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                A06 = A06((anonymousClass094 == null || (r0 = anonymousClass094.A01) == null) ? "null" : "null");
            }
            if (A06 == null) {
                Bitmap A04 = A04(anonymousClass092);
                C03900Hp A0E = anonymousClass092.A0E();
                if (A04 == null && A0E != null && !A0E.A06()) {
                    this.A03.A03(A0E, new RunnableC72423Zx(this, A0E, anonymousClass092, tag, view, interfaceC43821y32));
                    interfaceC43821y32.AUo(view);
                    return;
                }
                interfaceC43821y32.AUc(view, A04, anonymousClass092);
                return;
            }
            interfaceC43821y32.AUc(view, A06, anonymousClass092);
            return;
        }
        interfaceC43821y32.AUc(view, null, anonymousClass092);
    }

    public void A0A(final AnonymousClass092 anonymousClass092, final View view, final InterfaceC43821y3 interfaceC43821y3, final Object obj, boolean z) {
        view.setTag(obj);
        this.A04.A01(anonymousClass092, view, interfaceC43821y3, new InterfaceC43851y6() { // from class: X.1y5
            {
                C42471vn.this = this;
            }

            @Override // X.InterfaceC43851y6
            public void AKM() {
                interfaceC43821y3.AKM();
            }

            @Override // X.InterfaceC43851y6
            public void AO3(Bitmap bitmap) {
                C42471vn c42471vn = C42471vn.this;
                AnonymousClass092 anonymousClass0922 = anonymousClass092;
                synchronized (c42471vn) {
                    AnonymousClass094 anonymousClass094 = anonymousClass0922.A0n;
                    c42471vn.A0E((anonymousClass094 == null || (r0 = anonymousClass094.A01) == null) ? "null" : "null", bitmap);
                }
                Object obj2 = obj;
                View view2 = view;
                if (obj2.equals(view2.getTag())) {
                    interfaceC43821y3.AUc(view2, bitmap, anonymousClass0922);
                }
            }
        }, obj, z);
    }

    public void A0B(final AnonymousClass092 anonymousClass092, final View view, InterfaceC43821y3 interfaceC43821y3, final Object obj, boolean z, boolean z2) {
        InterfaceC43821y3 interfaceC43821y32 = interfaceC43821y3;
        view.setTag(obj);
        if (interfaceC43821y3 == null) {
            interfaceC43821y32 = new C43831y4(this, view.getContext());
        }
        synchronized (this) {
            if (AnonymousClass024.A0c()) {
                A07();
            }
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            Bitmap A06 = A06((anonymousClass094 == null || (r0 = anonymousClass094.A01) == null) ? "null" : "null");
            final InterfaceC43821y3 interfaceC43821y33 = interfaceC43821y32;
            InterfaceC43851y6 interfaceC43851y6 = new InterfaceC43851y6() { // from class: X.1y7
                {
                    C42471vn.this = this;
                }

                @Override // X.InterfaceC43851y6
                public void AKM() {
                    interfaceC43821y33.AKM();
                }

                @Override // X.InterfaceC43851y6
                public void AO3(Bitmap bitmap) {
                    C42471vn c42471vn = C42471vn.this;
                    AnonymousClass092 anonymousClass0922 = anonymousClass092;
                    synchronized (c42471vn) {
                        AnonymousClass094 anonymousClass0942 = anonymousClass0922.A0n;
                        c42471vn.A0E((anonymousClass0942 == null || (r0 = anonymousClass0942.A01) == null) ? "null" : "null", bitmap);
                    }
                    Object obj2 = obj;
                    View view2 = view;
                    if (obj2.equals(view2.getTag())) {
                        interfaceC43821y33.AUc(view2, bitmap, anonymousClass0922);
                    }
                }
            };
            if (A06 != null) {
                int ADA = (int) (interfaceC43821y32.ADA() / view.getResources().getDisplayMetrics().density);
                if (ADA > A06.getWidth() || ADA == 0) {
                    this.A04.A01(anonymousClass092, view, interfaceC43821y33, interfaceC43851y6, obj, z);
                }
                interfaceC43821y32.AUc(view, A06, anonymousClass092);
            } else {
                Bitmap A05 = A05(anonymousClass092, true, z2, A02(anonymousClass092));
                C03900Hp A0E = anonymousClass092.A0E();
                if (A05 == null && A0E != null && !A0E.A06()) {
                    this.A03.A03(A0E, new RunnableC72413Zw(this, A0E, anonymousClass092, z2, obj, view, interfaceC43821y32, interfaceC43851y6, z));
                    interfaceC43821y32.AUo(view);
                } else {
                    interfaceC43821y32.AUc(view, A05, anonymousClass092);
                    if (!(anonymousClass092 instanceof C0JJ)) {
                        this.A04.A01(anonymousClass092, view, interfaceC43821y33, interfaceC43851y6, obj, z);
                    }
                }
            }
        }
    }

    public void A0C(AnonymousClass092 anonymousClass092, View view, InterfaceC43821y3 interfaceC43821y3, boolean z) {
        A0B(anonymousClass092, view, interfaceC43821y3, anonymousClass092.A0n, z, false);
    }

    public final void A0D(Runnable runnable) {
        List list = this.A06;
        synchronized (list) {
            list.add(runnable);
        }
        this.A01.post(new RunnableEBaseShape7S0100000_I0_7(this, 25));
    }

    public final synchronized void A0E(String str, Bitmap bitmap) {
        this.A05.remove(str);
        if (bitmap != null) {
            this.A02.A05(str, bitmap);
        }
    }

    @Override // X.InterfaceC011705t
    public void AHI() {
        synchronized (this) {
            this.A05.clear();
        }
    }

    @Override // X.InterfaceC011705t
    public void AHJ() {
        synchronized (this) {
            this.A05.clear();
        }
    }
}
