package X;

import android.os.Handler;
import android.util.Log;
import java.util.UUID;

/* renamed from: X.44E */
/* loaded from: classes3.dex */
public class C44E {
    public C44S A00;
    public String A01;
    public final C44I A02;
    public volatile UUID A03;
    public volatile boolean A04;

    public C44E(C44I c44i) {
        this.A02 = c44i;
    }

    public UUID A00(final String str, Handler handler) {
        UUID uuid;
        C44I c44i = this.A02;
        synchronized (c44i) {
            if (this.A04) {
                final String str2 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" has been evicted. ");
                sb.append(str);
                sb.append(" now owns the camera device");
                Log.e("SessionManager", sb.toString());
                final C44S c44s = this.A00;
                if (c44s != null) {
                    Runnable runnable = new Runnable() { // from class: X.44D
                        @Override // java.lang.Runnable
                        public void run() {
                            C44S c44s2 = c44s;
                            String str3 = str2;
                            String str4 = str;
                            C44W c44w = c44s2.A00;
                            c44w.A0K.A01();
                            c44w.A0J.A00(4, new Object[]{c44w.A0N.A00, str3, str4});
                        }
                    };
                    Handler handler2 = c44i.A00;
                    if (handler2 != null) {
                        handler2.post(runnable);
                    } else {
                        C44J.A00(runnable);
                    }
                    this.A00 = null;
                }
            }
            A01();
            c44i.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public final void A01() {
        if (this.A03 != null) {
            C44I c44i = this.A02;
            UUID uuid = this.A03;
            synchronized (c44i) {
                if (uuid.equals(c44i.A01)) {
                    c44i.A03.removeCallbacksAndMessages(uuid);
                    Handler handler = c44i.A00;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(uuid);
                    } else {
                        C44J.A00.removeCallbacksAndMessages(uuid);
                    }
                }
            }
        }
        this.A03 = UUID.randomUUID();
        C44I c44i2 = this.A02;
        UUID uuid2 = this.A03;
        synchronized (c44i2) {
            c44i2.A01 = uuid2;
        }
    }

    public void A02(UUID uuid) {
        C44I c44i = this.A02;
        synchronized (c44i) {
            if (uuid != null) {
                if (uuid.equals(this.A03)) {
                    A01();
                    c44i.A00 = null;
                    this.A00 = null;
                    this.A04 = false;
                }
            }
        }
    }
}
