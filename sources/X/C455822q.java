package X;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Mp4Ops;
import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.22q */
/* loaded from: classes2.dex */
public final class C455822q {
    public static final AnonymousClass240 A0C = new AnonymousClass240() { // from class: X.23z
        @Override // X.AnonymousClass240
        public void AKE(Exception exc) {
        }

        @Override // X.AnonymousClass240
        public void AKO(String str, File file, byte[] bArr) {
        }
    };
    public static volatile C455822q A0D;
    public AnonymousClass241 A00;
    public ThreadPoolExecutor A01;
    public final AbstractC000600i A02;
    public final C012005w A03;
    public final C018508q A04;
    public final Mp4Ops A05;
    public final C011605s A06;
    public final C000400f A07;
    public final AnonymousClass012 A08;
    public final C001200o A09;
    public final C41451tw A0A;
    public final InterfaceC002901k A0B;

    public C455822q(C001200o c001200o, AnonymousClass012 anonymousClass012, C011605s c011605s, Mp4Ops mp4Ops, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C000400f c000400f, C41451tw c41451tw) {
        this.A09 = c001200o;
        this.A08 = anonymousClass012;
        this.A06 = c011605s;
        this.A05 = mp4Ops;
        this.A04 = c018508q;
        this.A02 = abstractC000600i;
        this.A0B = interfaceC002901k;
        this.A03 = c012005w;
        this.A07 = c000400f;
        this.A0A = c41451tw;
    }

    public static C455822q A00() {
        if (A0D == null) {
            synchronized (C455822q.class) {
                if (A0D == null) {
                    A0D = new C455822q(C001200o.A01, AnonymousClass012.A00(), C011605s.A00(), Mp4Ops.A00(), C018508q.A00(), AbstractC000600i.A00(), C002801j.A00(), C012005w.A00(), C000400f.A00(), C41451tw.A00());
                }
            }
        }
        return A0D;
    }

    public final ThreadPoolExecutor A01() {
        C000700j.A01();
        ThreadPoolExecutor threadPoolExecutor = this.A01;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor A0s = C02180Ae.A0s(4, 4, TimeUnit.SECONDS, "Gif cache Worker#");
            this.A01 = A0s;
            return A0s;
        }
        return threadPoolExecutor;
    }

    public void A02(String str, ImageView imageView) {
        Context context = imageView.getContext();
        C000700j.A01();
        AnonymousClass241 anonymousClass241 = this.A00;
        if (anonymousClass241 == null) {
            File file = new File(this.A09.A00.getCacheDir(), "GifsCache");
            if (!file.mkdirs() && !file.isDirectory()) {
                Log.w("gif/cache/unable to create gifs directory");
            }
            AnonymousClass242 anonymousClass242 = new AnonymousClass242(this.A04, this.A0A, file);
            anonymousClass242.A01 = context.getResources().getDimensionPixelSize(R.dimen.gif_cache_thumb_loader_size);
            anonymousClass241 = anonymousClass242.A00();
            this.A00 = anonymousClass241;
        }
        anonymousClass241.A01(str, imageView);
    }

    public final byte[] A03(String str) {
        C000700j.A01();
        GifCacheItemSerializable A03 = this.A06.A06().A03(str);
        if (A03 != null) {
            return A03.A00;
        }
        return null;
    }
}
