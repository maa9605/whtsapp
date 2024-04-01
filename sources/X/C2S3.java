package X;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2S3 */
/* loaded from: classes2.dex */
public class C2S3 extends RunnableEmptyBase implements Runnable {
    public Handler A02;
    public final C02L A05;
    public final C04960Mq A06;
    public final C0E6 A07;
    public final C05W A08;
    public final C018708s A09;
    public final C41321tj A0A;
    public final C0KQ A0B;
    public final C41581uB A0C;
    public final C000500h A0D;
    public final C002301c A0E;
    public final C0DK A0F;
    public final C42431vj A0G;
    public final C0EB A0H;
    public final AnonymousClass011 A0I;
    public final C0ES A0J;
    public final C41511u2 A0K;
    public final C0EG A0L;
    public final C47302Ar A0M;
    public final C04400Ka A0N;
    public final C79753mA A0O;
    public final C2Aa A0P;
    public final AbstractC41791uW A0Q;
    public final C2CO A0R;
    public final C26S A0S;
    public final C2M5 A0T;
    public final C03510Fz A0U;
    public boolean A03 = false;
    public boolean A04 = false;
    public int A00 = 0;
    public long A01 = 0;

    public C2S3(C2CO c2co, C02L c02l, AnonymousClass011 anonymousClass011, C0EG c0eg, C0EB c0eb, C0E6 c0e6, C05W c05w, C018708s c018708s, C002301c c002301c, C2M5 c2m5, C03510Fz c03510Fz, C0ES c0es, C41581uB c41581uB, C41321tj c41321tj, C41511u2 c41511u2, C04400Ka c04400Ka, C2Aa c2Aa, C000500h c000500h, C04960Mq c04960Mq, C26S c26s, C47302Ar c47302Ar, AbstractC41791uW abstractC41791uW, C42431vj c42431vj, C0DK c0dk, C0KQ c0kq, C79753mA c79753mA, Handler handler) {
        this.A0R = c2co;
        this.A05 = c02l;
        this.A0I = anonymousClass011;
        this.A0L = c0eg;
        this.A0H = c0eb;
        this.A07 = c0e6;
        this.A08 = c05w;
        this.A09 = c018708s;
        this.A0E = c002301c;
        this.A0T = c2m5;
        this.A0U = c03510Fz;
        this.A0J = c0es;
        this.A0C = c41581uB;
        this.A0A = c41321tj;
        this.A0K = c41511u2;
        this.A0N = c04400Ka;
        this.A0P = c2Aa;
        this.A0D = c000500h;
        this.A06 = c04960Mq;
        this.A0S = c26s;
        this.A0M = c47302Ar;
        this.A0Q = abstractC41791uW;
        this.A0G = c42431vj;
        this.A0F = c0dk;
        this.A0B = c0kq;
        this.A0O = c79753mA;
        this.A02 = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0ES c0es;
        boolean isEmpty;
        C04460Kg c04460Kg;
        try {
            Log.i("registername/initializer/run");
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A01 == 0) {
                this.A01 = uptimeMillis;
            }
            this.A0B.A03();
            SystemClock.uptimeMillis();
            C468428m c468428m = new C468428m(C22H.A0F);
            c468428m.A04 = true;
            c468428m.A02();
            c468428m.A03 = true;
            EnumC40721sl A01 = this.A0A.A01(c468428m.A01());
            SystemClock.uptimeMillis();
            C41581uB c41581uB = this.A0C;
            if (c41581uB.A04.A04()) {
                HashSet hashSet = new HashSet();
                Set A0D = c41581uB.A03.A0D();
                Iterator it = c41581uB.A01.A0E().iterator();
                while (it.hasNext()) {
                    C06C c06c = (C06C) it.next();
                    if (!C23X.A0P(c06c.A02()) && c06c.A03(UserJid.class) != null && ((c04460Kg = c06c.A08) == null || TextUtils.isEmpty(c04460Kg.A01))) {
                        if (((HashSet) A0D).contains(c06c.A02())) {
                            Jid A03 = c06c.A03(UserJid.class);
                            if (A03 == null) {
                                throw null;
                            }
                            hashSet.add(A03);
                        } else {
                            continue;
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    c41581uB.A02((UserJid[]) hashSet.toArray(new UserJid[0]), 3);
                }
            }
            StringBuilder sb = new StringBuilder("registername/initializer/sync/done result=");
            sb.append(A01);
            Log.i(sb.toString());
            if (A01 == EnumC40721sl.NETWORK_UNAVAILABLE) {
                this.A00 = 1;
            } else if (A01 == EnumC40721sl.FAILED) {
                this.A00 = 3;
            } else if (A01 == EnumC40721sl.EXCEPTION) {
                this.A00 = 3;
            } else {
                Log.i("registername/setconnection/active");
                this.A0K.A05(true);
                long uptimeMillis2 = SystemClock.uptimeMillis() - this.A01;
                while (true) {
                    c0es = this.A0J;
                    if (!c0es.A0m || uptimeMillis2 >= 45000) {
                        break;
                    }
                    uptimeMillis2 += 200;
                    SystemClock.sleep(200L);
                }
                if (uptimeMillis2 >= 45000 && c0es.A0m) {
                    c0es.A09(3);
                }
                SystemClock.uptimeMillis();
                Log.i("registername/shouldrefreshlists");
                C000500h c000500h = this.A0D;
                C000200d.A0j(c000500h, "refresh_broadcast_lists", true);
                this.A0L.A04();
                this.A06.A01(null);
                C05E c05e = this.A0G.A00;
                c05e.A05();
                if (c05e.A07.exists() && !this.A0H.A0H()) {
                    this.A07.A00.A01(GetStatusPrivacyJob.A00());
                }
                this.A0M.A02(true, false);
                Log.i("registername/reintialized payments");
                C000200d.A0j(c000500h, "registration_biz_registered_on_device", false);
                SystemClock.uptimeMillis();
                HashSet hashSet2 = new HashSet();
                Iterator it2 = ((ArrayList) this.A0F.A04(50)).iterator();
                while (it2.hasNext()) {
                    C06C c06c2 = (C06C) it2.next();
                    if (c06c2.A03(AbstractC005302j.class) != null) {
                        this.A0N.A02((AbstractC005302j) c06c2.A03(AbstractC005302j.class), 0, 2, null);
                        hashSet2.add(c06c2.A03(AbstractC005302j.class));
                    }
                }
                ArrayList A0E = this.A08.A0E();
                Collections.sort(A0E, new C57722pt(this.A09, this.A0E));
                Iterator it3 = A0E.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    C06C c06c3 = (C06C) it3.next();
                    if (c06c3.A0X && c06c3.A03(UserJid.class) != null && !hashSet2.contains(c06c3.A03(UserJid.class))) {
                        i++;
                        this.A0N.A02((AbstractC005302j) c06c3.A03(UserJid.class), 0, 2, null);
                        hashSet2.add(c06c3.A03(UserJid.class));
                        if (i > 50) {
                            break;
                        }
                    }
                }
                C02L c02l = this.A05;
                c02l.A05();
                C0K1 c0k1 = c02l.A01;
                if (c0k1 != null && c0k1.A01 == 0) {
                    C04400Ka c04400Ka = this.A0N;
                    c02l.A05();
                    c04400Ka.A02(c02l.A03, 0, 1, null);
                }
                int i2 = 0;
                while (true) {
                    C0G0 c0g0 = this.A0U.A02;
                    synchronized (c0g0) {
                        isEmpty = c0g0.A01.isEmpty();
                    }
                    if (isEmpty || i2 >= 10000) {
                        break;
                    }
                    SystemClock.sleep(200L);
                    i2 += 200;
                }
                SystemClock.uptimeMillis();
                this.A04 = true;
                C000200d.A0h(c000500h, "registration_initialized_time", System.currentTimeMillis());
                this.A0P.A0B(3);
                SystemClock.uptimeMillis();
                Log.i("registername/setregverified");
                this.A01 = 0L;
                Log.i("registername/fin/done");
            }
        } finally {
            this.A03 = true;
            Handler handler = this.A02;
            if (handler != null) {
                handler.sendEmptyMessage(0);
            }
        }
    }
}
