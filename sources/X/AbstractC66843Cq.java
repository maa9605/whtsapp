package X;

import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Cq */
/* loaded from: classes2.dex */
public abstract class AbstractC66843Cq extends C0HS {
    public final C018508q A00;
    public final C02L A01;
    public final AnonymousClass012 A02;
    public final C03340Fh A03;
    public final C06C A04;
    public final C0EG A05;
    public final String A06;

    public AbstractC66843Cq(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C0EG c0eg, C03340Fh c03340Fh, C06C c06c, String str) {
        this.A02 = anonymousClass012;
        this.A00 = c018508q;
        this.A01 = c02l;
        this.A05 = c0eg;
        this.A03 = c03340Fh;
        this.A04 = c06c;
        this.A06 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        String A03;
        Future A05;
        String str = this.A06;
        if (TextUtils.isEmpty(str)) {
            A03 = null;
        } else {
            byte[] A032 = C05V.A03(this.A02, this.A01, false);
            if (A032 != null) {
                A03 = C02A.A03(A032);
            } else {
                throw null;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C66833Cp c66833Cp = new C66833Cp(this);
        C0EG c0eg = this.A05;
        C06C c06c = this.A04;
        Jid A033 = c06c.A03(C011005l.class);
        if (A033 != null) {
            C011005l c011005l = (C011005l) A033;
            String str2 = c06c.A0B.A03;
            C010005b c010005b = c0eg.A02;
            if (c010005b.A06 && c010005b.A02) {
                C05Y c05y = c0eg.A07;
                String A02 = c05y.A02();
                try {
                    Log.i("sendmethods/sendSetGroupDescription");
                    A05 = c05y.A05(A02, Message.obtain(null, 0, 134, 0, new C07550Yr(A02, c011005l, str2, A03, str, c66833Cp, null)), false);
                } catch (C0S4 unused) {
                }
                if (A05 != null) {
                    try {
                        A05.get(32000L, TimeUnit.MILLISECONDS);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (elapsedRealtime2 < 500) {
                            SystemClock.sleep(500 - elapsedRealtime2);
                            return null;
                        }
                        return null;
                    } catch (Exception e) {
                        Log.w("groupinfo/setgroupdescription/timeout", e);
                        c66833Cp.AJp(0);
                        return null;
                    }
                }
            }
            Log.e("groupinfo/setgroupdescription/failed/callback is null");
            c66833Cp.AJp(0);
            return null;
        }
        throw null;
    }
}
