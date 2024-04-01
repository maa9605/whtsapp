package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.449  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass449 {
    public static AnonymousClass449 A05;
    public long A00;
    public long A01;
    public long A02;
    public final AnonymousClass427 A04 = new AnonymousClass427();
    public Handler A03 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.448
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            AnonymousClass427 anonymousClass427 = AnonymousClass449.this.A04;
            if (anonymousClass427.A00.isEmpty()) {
                return true;
            }
            List list = anonymousClass427.A00;
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5 && 0 < list.size()) {
                                    list.get(0);
                                    throw null;
                                }
                            } else if (0 < list.size()) {
                                list.get(0);
                                throw null;
                            }
                        } else if (0 < list.size()) {
                            list.get(0);
                            throw null;
                        }
                    } else if (0 < list.size()) {
                        list.get(0);
                        throw null;
                    }
                } else if (0 < list.size()) {
                    list.get(0);
                    throw null;
                }
            } else if (0 < list.size()) {
                list.get(0);
                throw null;
            }
            return true;
        }
    });

    public static synchronized AnonymousClass449 A00() {
        AnonymousClass449 anonymousClass449;
        synchronized (AnonymousClass449.class) {
            anonymousClass449 = A05;
            if (anonymousClass449 == null) {
                anonymousClass449 = new AnonymousClass449();
                A05 = anonymousClass449;
            }
        }
        return anonymousClass449;
    }

    public void A01() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A02(5, this.A00);
            return;
        }
        A02(3, j);
        this.A01 = SystemClock.elapsedRealtime();
    }

    public final void A02(int i, long j) {
        if (this.A04.A00.isEmpty()) {
            return;
        }
        Handler handler = this.A03;
        Message obtain = Message.obtain(handler, i);
        obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
        handler.sendMessage(obtain);
    }
}
