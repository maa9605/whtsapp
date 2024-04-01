package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Map;

/* renamed from: X.2or  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C57202or {
    public C1D9 A00;
    public C57192oq A01;
    public Map A02;
    public final InterfaceC57182op A05;
    public final InterfaceC57222ot A06;
    public volatile boolean A07 = false;
    public final C33191fV A04 = new C33191fV();
    public final int A03 = 3;

    public C57202or(int i, InterfaceC57222ot interfaceC57222ot, InterfaceC57182op interfaceC57182op) {
        this.A06 = interfaceC57222ot;
        this.A05 = interfaceC57182op;
    }

    public C57202or(InterfaceC57222ot interfaceC57222ot, InterfaceC57182op interfaceC57182op) {
        this.A06 = interfaceC57222ot;
        this.A05 = interfaceC57182op;
    }

    public synchronized void A00() {
        this.A00 = null;
    }

    public synchronized void A01() {
        if (this.A07) {
            this.A07 = false;
            C57192oq c57192oq = this.A01;
            if (c57192oq != null) {
                c57192oq.interrupt();
                this.A01 = null;
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2oq, java.lang.Thread] */
    public synchronized void A02() {
        if (this.A07) {
            return;
        }
        this.A07 = true;
        ?? r0 = new Thread() { // from class: X.2oq
            {
                super("CameraQRCodeProcessor");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C1D9 c1d9;
                C1D9 c1d92;
                while (true) {
                    C57202or c57202or = C57202or.this;
                    if (!c57202or.A07) {
                        return;
                    }
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        C57212os A8D = c57202or.A06.A8D();
                        if (A8D != null) {
                            byte[] bArr = A8D.A02;
                            int i = A8D.A01;
                            int i2 = A8D.A00;
                            int i3 = i;
                            if (i >= 320) {
                                i3 = (i * 3) >> 2;
                            }
                            int i4 = i2;
                            if (i2 >= 320) {
                                i4 = (i2 * 3) >> 2;
                            }
                            try {
                                c1d9 = c57202or.A04.A00(new C1D4(new C33181fU(new C33161fS(bArr, i, i2, (i - i3) >> 1, (i2 - i4) >> 1, i3, i4))), c57202or.A02);
                            } catch (C1D8 unused) {
                                c1d9 = null;
                            }
                            if (c57202or.A04 != null) {
                                if (c57202or.A07) {
                                    synchronized (c57202or) {
                                        if (c1d9 != null && ((c1d92 = c57202or.A00) == null || !c1d92.A01.equals(c1d9.A01))) {
                                            c57202or.A00 = c1d9;
                                            c57202or.A05.AMP(c1d9);
                                        }
                                    }
                                }
                            } else {
                                throw null;
                                break;
                            }
                        }
                        long uptimeMillis2 = (SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS / c57202or.A03) - (SystemClock.uptimeMillis() - uptimeMillis);
                        if (c57202or.A07 && uptimeMillis2 > 0) {
                            Thread.sleep(uptimeMillis2);
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        };
        this.A01 = r0;
        r0.start();
    }
}
