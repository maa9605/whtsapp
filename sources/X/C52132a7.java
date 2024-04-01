package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.provider.MediaStore;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2a7 */
/* loaded from: classes2.dex */
public class C52132a7 {
    public final ContentResolver A01;
    public final Handler A02;
    public final C0JH A03;
    public final Thread A04;
    public final ArrayList A05 = new ArrayList();
    public boolean A00 = false;

    public C52132a7(C011605s c011605s, ContentResolver contentResolver, Handler handler) {
        this.A01 = contentResolver;
        this.A02 = handler;
        this.A03 = c011605s.A03();
        Thread thread = new Thread(new RunnableEBaseShape2S0100000_I0_2(this));
        this.A04 = thread;
        thread.setName("image-loader");
        this.A04.start();
        StringBuilder sb = new StringBuilder("imageloader/cachesize:");
        sb.append(this.A03.A00.A00());
        Log.i(sb.toString());
    }

    public void A00() {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            this.A00 = true;
            arrayList.notifyAll();
        }
        C61002vR A00 = C61002vR.A00();
        Thread thread = this.A04;
        ContentResolver contentResolver = this.A01;
        synchronized (A00) {
            C60992vQ A03 = A00.A03(thread);
            A03.A00 = 0;
            BitmapFactory.Options options = A03.A01;
            if (options != null) {
                options.requestCancelDecode();
            }
            A00.notifyAll();
            synchronized (A03) {
                if (A03.A02) {
                    MediaStore.Images.Thumbnails.cancelThumbnailRequest(contentResolver, -1L, thread.getId());
                    MediaStore.Video.Thumbnails.cancelThumbnailRequest(contentResolver, -1L, thread.getId());
                }
            }
        }
        thread.interrupt();
    }

    public void A01(InterfaceC61152vg interfaceC61152vg) {
        if (interfaceC61152vg == null) {
            return;
        }
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((C61172vi) arrayList.get(i)).A00 != interfaceC61152vg) {
                    i++;
                } else if (i >= 0) {
                    arrayList.remove(i);
                    return;
                }
            }
        }
    }

    public void A02(InterfaceC61152vg interfaceC61152vg, InterfaceC61162vh interfaceC61162vh) {
        C000700j.A08(!this.A04.isInterrupted(), "Thumb loader reused after destroy");
        Bitmap bitmap = (Bitmap) this.A03.A01(interfaceC61152vg.ADR());
        if (bitmap != null) {
            interfaceC61162vh.APF(bitmap, true);
            return;
        }
        interfaceC61162vh.A5d();
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            arrayList.add(new C61172vi(interfaceC61152vg, interfaceC61162vh));
            arrayList.notifyAll();
        }
    }
}
