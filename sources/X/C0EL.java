package X;

import android.os.Message;
import com.whatsapp.Statistics$Data;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0EL */
/* loaded from: classes.dex */
public class C0EL {
    public static volatile C0EL A07;
    public HandlerC05430Os A00;
    public final AbstractC000600i A01;
    public final C000800k A02;
    public final C000400f A03;
    public final AnonymousClass012 A04;
    public final C001200o A05;
    public final C003701t A06;

    public C0EL(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, C000400f c000400f, C000800k c000800k) {
        this.A05 = c001200o;
        this.A04 = anonymousClass012;
        this.A06 = c003701t;
        this.A01 = abstractC000600i;
        this.A03 = c000400f;
        this.A02 = c000800k;
    }

    public static C0EL A00() {
        if (A07 == null) {
            synchronized (C0EL.class) {
                if (A07 == null) {
                    A07 = new C0EL(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), C000400f.A00(), C000800k.A02);
                }
            }
        }
        return A07;
    }

    public Statistics$Data A01() {
        Statistics$Data statistics$Data;
        HandlerC05430Os handlerC05430Os = this.A00;
        C000700j.A07(handlerC05430Os != null);
        try {
            handlerC05430Os.A03.await();
        } catch (InterruptedException e) {
            Log.e("statistics/waitForStatsInit exception waiting", e);
        }
        HandlerC05430Os handlerC05430Os2 = this.A00;
        synchronized (handlerC05430Os2) {
            try {
                statistics$Data = new Statistics$Data(new JSONObject(handlerC05430Os2.A00.A00()));
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        return statistics$Data;
    }

    public final void A02() {
        this.A00.removeMessages(1);
        this.A00.sendEmptyMessageDelayed(1, 1000L);
    }

    public void A03(int i, int i2) {
        HandlerC05430Os handlerC05430Os = this.A00;
        C000700j.A07(handlerC05430Os != null);
        Message.obtain(handlerC05430Os, 3, i2, i).sendToTarget();
        A02();
    }

    public void A04(int i, int i2) {
        HandlerC05430Os handlerC05430Os = this.A00;
        C000700j.A07(handlerC05430Os != null);
        if (i < 0) {
            return;
        }
        Message.obtain(handlerC05430Os, 2, i2, i).sendToTarget();
        A02();
    }

    public void A05(long j, int i) {
        HandlerC05430Os handlerC05430Os = this.A00;
        C000700j.A07(handlerC05430Os != null);
        if (j < 0) {
            return;
        }
        Message obtain = Message.obtain(handlerC05430Os, 5, i, 0);
        obtain.getData().putLong("bytes", j);
        obtain.sendToTarget();
        A02();
    }

    public void A06(long j, int i) {
        HandlerC05430Os handlerC05430Os = this.A00;
        C000700j.A07(handlerC05430Os != null);
        if (j < 0) {
            return;
        }
        Message obtain = Message.obtain(handlerC05430Os, 4, i, 0);
        obtain.getData().putLong("bytes", j);
        obtain.sendToTarget();
        A02();
    }

    public void A07(boolean z) {
        HandlerC05430Os handlerC05430Os = this.A00;
        C000700j.A07(handlerC05430Os != null);
        Message.obtain(handlerC05430Os, 8, z ? 1 : 0, 0).sendToTarget();
        A02();
    }
}
