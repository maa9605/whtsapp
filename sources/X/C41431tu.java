package X;

import android.util.Base64;
import com.whatsapp.fieldstats.privatestats.PrivateStatsWorker;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.1tu */
/* loaded from: classes2.dex */
public class C41431tu {
    public static volatile C41431tu A0G;
    public NativeVOPRFExtension A00;
    public final C01B A01;
    public final AnonymousClass012 A02;
    public final C47282Ap A03;
    public final C48132Dx A04;
    public final C470329g A05;
    public final C010605h A06;
    public final InterfaceC002901k A07;
    public final C2A9 A08;
    public volatile int A09;
    public volatile long A0A;
    public volatile long A0B;
    public volatile String A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public volatile byte[] A0F;

    public C41431tu(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C01B c01b, C2A9 c2a9, C48132Dx c48132Dx, C470329g c470329g, C47282Ap c47282Ap, C010605h c010605h) {
        this.A02 = anonymousClass012;
        this.A07 = interfaceC002901k;
        this.A08 = c2a9;
        this.A01 = c01b;
        this.A04 = c48132Dx;
        this.A05 = c470329g;
        this.A03 = c47282Ap;
        this.A06 = c010605h;
        c470329g.A00 = this;
        this.A09 = 0;
        this.A0E = false;
        this.A0D = false;
    }

    public static C41431tu A00() {
        if (A0G == null) {
            synchronized (C41431tu.class) {
                if (A0G == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    InterfaceC002901k A002 = C002801j.A00();
                    C01B A003 = C01B.A00();
                    C2A9 A01 = C2A9.A01();
                    if (C48132Dx.A02 == null) {
                        synchronized (C48132Dx.class) {
                            if (C48132Dx.A02 == null) {
                                C48132Dx.A02 = new C48132Dx(C02O.A00());
                            }
                        }
                    }
                    C48132Dx c48132Dx = C48132Dx.A02;
                    if (C470329g.A02 == null) {
                        synchronized (C470329g.class) {
                            if (C470329g.A02 == null) {
                                C470329g.A02 = new C470329g(C05Y.A01());
                            }
                        }
                    }
                    A0G = new C41431tu(A00, A002, A003, A01, c48132Dx, C470329g.A02, C47282Ap.A00(), C010605h.A03);
                }
            }
        }
        return A0G;
    }

    public int A01() {
        C48132Dx c48132Dx = this.A04;
        int i = c48132Dx.A00().getInt("first_token_stage", 0);
        if (i == 1) {
            synchronized (this) {
                return this.A0D ? 15 : 2;
            }
        } else if (i == 0) {
            return 2;
        } else {
            return c48132Dx.A00().getInt("token_not_ready_reason", 0);
        }
    }

    public final synchronized void A02() {
        this.A0C = null;
        this.A0F = null;
        this.A09 = 0;
        this.A0E = false;
        this.A0D = false;
        C48132Dx c48132Dx = this.A04;
        c48132Dx.A05("original_token", null);
        c48132Dx.A05("next_original_token", null);
        c48132Dx.A04("base_timestamp", 0L);
        c48132Dx.A04("time_to_live", 0L);
        c48132Dx.A05("blinding_factor", null);
        c48132Dx.A02(-1);
        c48132Dx.A05("shared_secret", null);
        if (c48132Dx.A00().getInt("first_token_stage", 0) == 1) {
            c48132Dx.A01(0);
        }
    }

    public final void A03(int i) {
        if (this.A09 < 2) {
            this.A09++;
            this.A07.ASB(new RunnableEBaseShape2S0100000_I0_2(this, 45), this.A09 * 30000 * this.A09);
            return;
        }
        if (i == 5) {
            this.A04.A03(9);
        } else {
            this.A04.A03(10);
        }
        A06(false, i);
    }

    public final synchronized void A04(int i) {
        if (this.A0D) {
            return;
        }
        this.A0D = true;
        StringBuilder sb = new StringBuilder();
        sb.append("PrivateStatsToken/doCreateFirstToken!!--->about to create 1st token: ");
        sb.append(i);
        Log.i(sb.toString());
        A05(false);
    }

    public void A05(boolean z) {
        NativeVOPRFExtension nativeVOPRFExtension = this.A00;
        if (nativeVOPRFExtension == null) {
            nativeVOPRFExtension = new NativeVOPRFExtension();
            this.A00 = nativeVOPRFExtension;
        }
        if (nativeVOPRFExtension != null) {
            byte[] bArr = new byte[32];
            C2E0.A00(bArr);
            byte[] bArr2 = null;
            int i = 0;
            while (i < 256) {
                bArr2 = new byte[32];
                C2E0.A00(bArr2);
                bArr2[31] = (byte) (bArr2[31] & 31);
                if (nativeVOPRFExtension.A00(bArr2)) {
                    break;
                }
                i++;
            }
            if (i >= 256) {
                Log.w("PrivateStatsToken/generateCredentialToken cannot generate valid blindingFactor");
                this.A04.A03(5);
                A06(true, 4);
                return;
            }
            AnonymousClass012 anonymousClass012 = this.A02;
            anonymousClass012.A03();
            byte[] A02 = nativeVOPRFExtension.A02(bArr, bArr2);
            anonymousClass012.A03();
            if (A02 == null) {
                Log.e("PrivateStatsToken/generateCredentialToken failed to blind the token");
                this.A04.A03(7);
                A06(true, 4);
                return;
            }
            synchronized (this) {
                this.A0E = z;
                this.A0F = A02;
                if (z) {
                    C48132Dx c48132Dx = this.A04;
                    c48132Dx.A05("next_original_token", Base64.encodeToString(bArr, 10));
                    c48132Dx.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                } else {
                    C48132Dx c48132Dx2 = this.A04;
                    c48132Dx2.A05("original_token", Base64.encodeToString(bArr, 10));
                    c48132Dx2.A05("blinding_factor", Base64.encodeToString(bArr2, 10));
                    c48132Dx2.A05("shared_secret", null);
                    c48132Dx2.A02(-1);
                    c48132Dx2.A04("base_timestamp", 0L);
                    c48132Dx2.A04("time_to_live", 0L);
                }
                this.A09 = 0;
                this.A0A = anonymousClass012.A03();
                this.A0B = this.A0A;
                if (this.A06.A03()) {
                    this.A0C = this.A05.A00(this.A0F);
                } else {
                    A03(5);
                }
            }
            return;
        }
        throw null;
    }

    public final synchronized void A06(boolean z, int i) {
        long A03 = this.A02.A03();
        this.A03.A02(i, A03 - this.A0A, A03 - this.A0B, this.A09);
        this.A0D = false;
        C48132Dx c48132Dx = this.A04;
        c48132Dx.A05("blinding_factor", null);
        if (this.A0E) {
            c48132Dx.A05("next_original_token", null);
        } else {
            c48132Dx.A05("original_token", null);
        }
        this.A0E = false;
        this.A0F = null;
        if (!z) {
            this.A0C = null;
            this.A09 = 0;
        }
        if (c48132Dx.A00().getInt("first_token_stage", 0) == 1) {
            c48132Dx.A01(0);
        }
    }

    public final boolean A07() {
        C48132Dx c48132Dx = this.A04;
        int i = c48132Dx.A00().getInt("first_token_stage", 0);
        if (i == 2) {
            return false;
        }
        int A07 = this.A01.A07(C01C.A0A);
        if (A07 <= 30) {
            c48132Dx.A01(2);
            return false;
        }
        long j = c48132Dx.A00().getLong("first_token_delay_time", 0L);
        if (i == 1) {
            if (!this.A0D) {
                AnonymousClass012 anonymousClass012 = this.A02;
                if (anonymousClass012.A05() / 1000 > c48132Dx.A00().getLong("first_token_request_timestamp", 0L) + j + 300) {
                    ((C0OD) this.A08.get()).A02("name.com.whatsapp.privatestats.firsttoken");
                    Log.i("PrivateStatsToken/delayForFirstTokenIfNeeded cancelled the work");
                    A04(2);
                } else {
                    anonymousClass012.A05();
                    return true;
                }
            }
            return true;
        } else if (i == 0) {
            long nextInt = new Random().nextInt(A07 - 30) + 30;
            C000200d.A0u("PrivateStatsToken/delayForFirstToken-->delay timesec= ", nextInt);
            c48132Dx.A04("first_token_delay_time", nextInt);
            c48132Dx.A04("first_token_request_timestamp", this.A02.A05() / 1000);
            c48132Dx.A01(1);
            C0OJ c0oj = new C0OJ(PrivateStatsWorker.class);
            c0oj.A02(nextInt, TimeUnit.SECONDS);
            ((C0OD) this.A08.get()).A00("name.com.whatsapp.privatestats.firsttoken", C0OO.REPLACE, (C0ON) c0oj.A00());
            return true;
        } else {
            return false;
        }
    }
}
