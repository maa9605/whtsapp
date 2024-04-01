package X;

import android.util.Pair;
import com.whatsapp.GifVideoPreviewActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.1it  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35281it implements AnonymousClass240 {
    public final int A00;
    public final C49292Jm A01;
    public final C47212Ai A02;
    public final C41961un A03;
    public final InterfaceC002901k A04;
    public final WeakReference A05;

    @Override // X.AnonymousClass240
    public void AKE(Exception exc) {
    }

    public C35281it(GifVideoPreviewActivity gifVideoPreviewActivity, InterfaceC002901k interfaceC002901k, C49292Jm c49292Jm, C41961un c41961un, C47212Ai c47212Ai, int i) {
        this.A05 = new WeakReference(gifVideoPreviewActivity);
        this.A04 = interfaceC002901k;
        this.A01 = c49292Jm;
        this.A03 = c41961un;
        this.A02 = c47212Ai;
        this.A00 = i;
    }

    public static /* synthetic */ void A00(GifVideoPreviewActivity gifVideoPreviewActivity, File file) {
        gifVideoPreviewActivity.A00.setVisibility(8);
        gifVideoPreviewActivity.A02.setVisibility(8);
        gifVideoPreviewActivity.A01.setVisibility(8);
        String absolutePath = file.getAbsolutePath();
        gifVideoPreviewActivity.A0L = absolutePath;
        gifVideoPreviewActivity.A0K.setVideoPath(absolutePath);
        gifVideoPreviewActivity.A0K.start();
    }

    public /* synthetic */ void A01(String str, File file) {
        C49292Jm c49292Jm = this.A01;
        if (c49292Jm.A02(str)) {
            long A00 = c49292Jm.A00(str);
            if (A00 > 0) {
                Pair A0C = C0DD.A0C(file);
                this.A02.A02(file, ((Number) A0C.first).intValue(), ((Number) A0C.second).intValue(), this.A00, A00);
                c49292Jm.A01(str);
            }
        }
    }

    @Override // X.AnonymousClass240
    public void AKO(final String str, final File file, byte[] bArr) {
        final GifVideoPreviewActivity gifVideoPreviewActivity = (GifVideoPreviewActivity) this.A05.get();
        if (file == null) {
            if (gifVideoPreviewActivity != null) {
                gifVideoPreviewActivity.A00.setVisibility(8);
                return;
            }
            return;
        }
        this.A04.AS1(new Runnable() { // from class: X.1Gy
            @Override // java.lang.Runnable
            public final void run() {
                C35281it.this.A01(str, file);
            }
        });
        if (gifVideoPreviewActivity != null) {
            gifVideoPreviewActivity.A02.postDelayed(new Runnable() { // from class: X.1Gz
                @Override // java.lang.Runnable
                public final void run() {
                    C35281it.A00(GifVideoPreviewActivity.this, file);
                }
            }, 50L);
        }
    }
}
