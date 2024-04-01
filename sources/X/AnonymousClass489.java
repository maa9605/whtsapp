package X;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.489  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass489 {
    public static final long[] A0H = {3, 2, 15};
    public int A00;
    public HandlerThread A01;
    public AnonymousClass487 A02;
    public AnonymousClass488 A03;
    public String A04;
    public String A05;
    public final C018508q A06;
    public final C0E7 A07;
    public final C001200o A08;
    public final C013606n A09;
    public final C894947f A0A;
    public final C90564Bm A0B;
    public final C28S A0C;
    public final C3NV A0D;
    public final C463026g A0E;
    public final C4AT A0F;
    public final C49682Lx A0G;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.488] */
    public AnonymousClass489(C001200o c001200o, C018508q c018508q, final C49682Lx c49682Lx, C0E7 c0e7, final C894947f c894947f, C463026g c463026g, C013606n c013606n, C28S c28s, final C90564Bm c90564Bm, C4AT c4at, final C4IA c4ia, AnonymousClass487 anonymousClass487) {
        this.A08 = c001200o;
        this.A06 = c018508q;
        this.A0G = c49682Lx;
        this.A07 = c0e7;
        this.A0A = c894947f;
        this.A0E = c463026g;
        this.A09 = c013606n;
        this.A0C = c28s;
        this.A0B = c90564Bm;
        this.A0F = c4at;
        this.A0D = c894947f.A04;
        this.A02 = anonymousClass487;
        this.A04 = c894947f.A04(c4ia);
        this.A05 = c894947f.A05(c4ia);
        HandlerThread handlerThread = new HandlerThread("PAY: device binding iq sender");
        this.A01 = handlerThread;
        handlerThread.start();
        final String str = this.A04;
        final Looper looper = this.A01.getLooper();
        this.A03 = new Handler(c49682Lx, c894947f, c90564Bm, str, c4ia, looper) { // from class: X.488
            public final C4IA A00;
            public final C894947f A01;
            public final C90564Bm A02;
            public final C49682Lx A03;
            public final String A04;

            {
                super(looper);
                this.A03 = c49682Lx;
                this.A01 = c894947f;
                this.A02 = c90564Bm;
                this.A04 = str;
                this.A00 = c4ia;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i;
                int i2;
                C90564Bm c90564Bm2 = this.A02;
                String str2 = this.A04;
                String A0A = c90564Bm2.A0A(str2);
                if (!TextUtils.isEmpty(A0A)) {
                    C49682Lx c49682Lx2 = this.A03;
                    C3NT c3nt = c49682Lx2.A00;
                    if (c3nt == null) {
                        c3nt = c49682Lx2.A01();
                        c49682Lx2.A00 = c3nt;
                    }
                    C3NT c3nt2 = c3nt;
                    if (c3nt != null) {
                        C90684Ca c90684Ca = (C90684Ca) c3nt2;
                        c90684Ca.A02.A03("PaymentDeviceId: try to upgrade algorithm ...");
                        int i3 = c90684Ca.A01.A04().getInt("payments_device_id_algorithm", 0);
                        if (c90684Ca instanceof C4H3) {
                            i = 2;
                        } else if (!(c90684Ca instanceof C4H1)) {
                            throw null;
                        } else {
                            i = 2;
                        }
                        if (i3 < i) {
                            c90684Ca.A02.A03("PaymentDeviceId: algorithm upgraded!");
                            C0EU c0eu = c90684Ca.A01;
                            if (c90684Ca instanceof C4H3) {
                                i2 = 2;
                            } else if (!(c90684Ca instanceof C4H1)) {
                                throw null;
                            } else {
                                i2 = 2;
                            }
                            c0eu.A04().edit().putInt("payments_device_id_algorithm", i2).apply();
                            C000200d.A0k(c90684Ca.A01, "payments_device_id", null);
                        }
                    }
                    String A07 = c90564Bm2.A07();
                    if (A07 == null) {
                        A07 = this.A01.A03(this.A00);
                    }
                    final AnonymousClass489 anonymousClass489 = AnonymousClass489.this;
                    if (anonymousClass489 != null) {
                        StringBuilder A0W = C000200d.A0W("PAY: sendDeviceBindingIq called with psp: ", str2, " verificationData: ");
                        A0W.append(C40841sx.A0O(A0A));
                        Log.i(A0W.toString());
                        final C3NV c3nv = anonymousClass489.A0D;
                        c3nv.A04("upi-bind-device");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C04P("action", "upi-bind-device", null, (byte) 0));
                        arrayList.add(new C04P("version", "2", null, (byte) 0));
                        arrayList.add(new C04P("device-id", anonymousClass489.A0G.A02(), null, (byte) 0));
                        C000200d.A1A("verification-data", A0A, arrayList);
                        if (!TextUtils.isEmpty(str2)) {
                            C000200d.A1A("provider-type", str2, arrayList);
                        }
                        arrayList.add(new C04P("sms-phone-number", A07, null, (byte) 0));
                        arrayList.add(new C04P("delay", String.valueOf(anonymousClass489.A00()), null, (byte) 0));
                        int i4 = anonymousClass489.A00;
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            i5 = 0;
                        }
                        arrayList.add(new C04P("counter", String.valueOf(i5), null, (byte) 0));
                        C463026g c463026g2 = anonymousClass489.A0E;
                        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
                        final Application application = anonymousClass489.A08.A00;
                        final C018508q c018508q2 = anonymousClass489.A06;
                        final C0E7 c0e72 = anonymousClass489.A07;
                        final C28S c28s2 = anonymousClass489.A0C;
                        c463026g2.A0F("set", c02590Ca, new C91754Gd(application, c018508q2, c0e72, c28s2, c3nv) { // from class: X.4IL
                            @Override // X.C91754Gd, X.C28V
                            public void A02(C28Q c28q) {
                                super.A02(c28q);
                                StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ");
                                sb.append(c28q);
                                Log.i(sb.toString());
                                A05(c28q);
                            }

                            @Override // X.C91754Gd, X.C28V
                            public void A03(C28Q c28q) {
                                super.A03(c28q);
                                StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ");
                                sb.append(c28q);
                                Log.i(sb.toString());
                                A05(c28q);
                            }

                            @Override // X.C91754Gd, X.C28V
                            public void A04(C02590Ca c02590Ca2) {
                                super.A04(c02590Ca2);
                                AnonymousClass489 anonymousClass4892 = AnonymousClass489.this;
                                String A01 = anonymousClass4892.A0F.A01();
                                anonymousClass4892.A0B.A0G(anonymousClass4892.A04, anonymousClass4892.A05, A01);
                                StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: ");
                                sb.append(anonymousClass4892.A04);
                                sb.append(" seqNumPrefix: ");
                                sb.append(anonymousClass4892.A05);
                                sb.append(" bindID: ");
                                sb.append(C40841sx.A0P(A01));
                                Log.i(sb.toString());
                                AnonymousClass487 anonymousClass4872 = anonymousClass4892.A02;
                                if (anonymousClass4872 != null) {
                                    ((IndiaUpiDeviceBindActivity) anonymousClass4872).A1h(null);
                                }
                            }

                            public final void A05(C28Q c28q) {
                                AnonymousClass489 anonymousClass4892 = AnonymousClass489.this;
                                AnonymousClass487 anonymousClass4872 = anonymousClass4892.A02;
                                if (anonymousClass4872 != null) {
                                    if (c28q.A00 != 11453) {
                                        ((IndiaUpiDeviceBindActivity) anonymousClass4872).A1h(c28q);
                                        return;
                                    }
                                    String A01 = anonymousClass4892.A0F.A01();
                                    anonymousClass4892.A0B.A0G(anonymousClass4892.A04, anonymousClass4892.A05, A01);
                                    StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ");
                                    sb.append(anonymousClass4892.A04);
                                    sb.append(" seqNumPrefix: ");
                                    sb.append(anonymousClass4892.A05);
                                    sb.append(" bindID: ");
                                    sb.append(C40841sx.A0P(A01));
                                    Log.i(sb.toString());
                                    ((IndiaUpiDeviceBindActivity) anonymousClass4892.A02).A1h(c28q);
                                }
                            }
                        }, 0L);
                        return;
                    }
                    throw null;
                }
            }
        };
    }

    public long A00() {
        int i = this.A00;
        int i2 = i - 1;
        if (i == 0) {
            i2 = 0;
        }
        long j = 0;
        int i3 = 0;
        while (i3 <= i2) {
            long[] jArr = A0H;
            j += i3 < jArr.length ? jArr[i3] : i3 * 5;
            i3++;
        }
        return j;
    }

    public void A01() {
        long j;
        Log.i("PAY: IndiaUpiGetBankAccountsAction: delayedDeviceVerifIqHandlerMessage");
        this.A00++;
        removeMessages(0);
        AnonymousClass488 anonymousClass488 = this.A03;
        int i = this.A00 - 1;
        long[] jArr = A0H;
        if (i < jArr.length) {
            j = jArr[i];
        } else {
            j = i * 5;
        }
        anonymousClass488.sendEmptyMessageDelayed(0, j * 1000);
    }
}
