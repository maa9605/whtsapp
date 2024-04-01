package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

/* renamed from: X.0KY */
/* loaded from: classes.dex */
public class C0KY {
    public static final AnonymousClass015 A04 = new AnonymousClass015(1, 1, 10, true);
    public final AnonymousClass011 A02;
    public long A00 = -1;
    public final C0KZ A03 = new C0KZ();
    public final long A01 = SystemClock.uptimeMillis();

    public C0KY(AnonymousClass011 anonymousClass011) {
        this.A02 = anonymousClass011;
    }

    public void A00() {
        long j = this.A00;
        C000700j.A07(j > 0);
        C0KZ c0kz = this.A03;
        c0kz.A02 = Boolean.FALSE;
        c0kz.A09 = Long.valueOf(SystemClock.uptimeMillis() - j);
        c0kz.A0L = Long.valueOf(SystemClock.uptimeMillis() - this.A01);
        this.A02.A0B(c0kz, A04, false);
    }

    public void A01() {
        long j = this.A00;
        C000700j.A07(j > 0);
        C0KZ c0kz = this.A03;
        c0kz.A09 = Long.valueOf(SystemClock.uptimeMillis() - j);
        StringBuilder A0P = C000200d.A0P("mediatranscodequeue/srcLength");
        A0P.append(c0kz.A0I);
        A0P.append(" destinationSize=");
        A0P.append(c0kz.A07);
        A0P.append(" compressionRate=");
        A0P.append(((float) c0kz.A07.longValue()) / ((float) c0kz.A0I.longValue()));
        A0P.append(" duration=");
        A0P.append(c0kz.A09);
        A0P.append(" width=");
        A0P.append(c0kz.A08);
        A0P.append(" height=");
        A0P.append(c0kz.A06);
        A0P.append(" isProgressiveJpeg=");
        A0P.append(c0kz.A03);
        A0P.append(" firstScanLength=");
        A0P.append(c0kz.A0A);
        A0P.append(" thumbnailLength=");
        A0P.append(c0kz.A0K);
        Log.i(A0P.toString());
        c0kz.A02 = Boolean.TRUE;
        c0kz.A0L = Long.valueOf(SystemClock.uptimeMillis() - this.A01);
        this.A02.A07(c0kz);
    }

    public void A02(int i, int i2) {
        C0KZ c0kz = this.A03;
        c0kz.A08 = Long.valueOf(i);
        c0kz.A06 = Long.valueOf(i2);
    }

    public void A03(C72653aN c72653aN) {
        C0KZ c0kz = this.A03;
        c0kz.A0J = Long.valueOf(c72653aN.A03);
        c0kz.A0H = Long.valueOf(c72653aN.A01);
        c0kz.A0F = Long.valueOf(c72653aN.A00() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        c0kz.A0G = Long.valueOf(c72653aN.A04 / 1000);
    }
}
