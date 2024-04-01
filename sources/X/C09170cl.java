package X;

import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0cl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09170cl extends C0HS {
    public int A00;
    public C52622b3 A01;
    public final C02L A02;
    public final C05W A03;
    public final C018708s A04;
    public final C05Y A05;
    public final C0EG A06;
    public final String A07;
    public final WeakReference A08;

    public C09170cl(C02L c02l, C0EG c0eg, C05Y c05y, C05W c05w, C018708s c018708s, AcceptInviteLinkActivity acceptInviteLinkActivity, String str) {
        this.A02 = c02l;
        this.A06 = c0eg;
        this.A05 = c05y;
        this.A03 = c05w;
        this.A04 = c018708s;
        this.A08 = new WeakReference(acceptInviteLinkActivity);
        this.A07 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        long elapsedRealtime;
        C0EG c0eg;
        String str;
        InterfaceC07690Zh interfaceC07690Zh;
        C010005b c010005b;
        Future A05;
        try {
            this.A05.A08(32000L);
            elapsedRealtime = SystemClock.elapsedRealtime();
            c0eg = this.A06;
            str = this.A07;
            interfaceC07690Zh = new InterfaceC07690Zh() { // from class: X.1ho
                @Override // X.InterfaceC07690Zh
                public void AJp(int i) {
                    C09170cl.this.A00 = i;
                }

                @Override // X.InterfaceC07690Zh
                public void AKt(C011005l c011005l, UserJid userJid, long j, String str2, long j2, String str3, Map map, int i, C04410Kb c04410Kb) {
                    ArrayList arrayList = new ArrayList(map.keySet().size());
                    for (AbstractC005302j abstractC005302j : map.keySet()) {
                        C06C A09 = C09170cl.this.A03.A09(abstractC005302j);
                        if (A09 != null && A09.A08 != null) {
                            arrayList.add(A09);
                        }
                    }
                    C09170cl c09170cl = C09170cl.this;
                    Collections.sort(arrayList, new C61772wh(c09170cl.A02, c09170cl.A04) { // from class: X.1hn
                        @Override // X.C61772wh
                        public int A00(C06C c06c, C06C c06c2) {
                            String str4 = c06c.A0F;
                            if (str4 != null || c06c2.A0F == null) {
                                if (str4 == null || c06c2.A0F != null) {
                                    return super.compare(c06c, c06c2);
                                }
                                return -1;
                            }
                            return 1;
                        }
                    });
                    c09170cl.A01 = new C52622b3(c011005l, userJid, str2, arrayList, i, c04410Kb);
                }
            };
            c010005b = c0eg.A02;
        } catch (C1PZ unused) {
        }
        if (c010005b.A06 && c010005b.A02) {
            C05Y c05y = c0eg.A07;
            String A02 = c05y.A02();
            try {
                A05 = c05y.A05(A02, Message.obtain(null, 0, 107, 0, new C07600Yy(A02, str, interfaceC07690Zh)), false);
            } catch (C0S4 unused2) {
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
                    Log.w("acceptlink/failed/timeout", e);
                    return null;
                }
            }
        }
        Log.e("acceptlink/failed/callback is null");
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A08.get();
        if (acceptInviteLinkActivity != null) {
            AcceptInviteLinkActivity.A02(acceptInviteLinkActivity, this.A07, this.A01, this.A00);
        }
    }
}
