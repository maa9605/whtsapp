package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3y1 */
/* loaded from: classes2.dex */
public class C86663y1 implements InterfaceC06380Sv {
    public C83793sh A00;
    public boolean A01;
    public final ActivityC02290Ap A02;
    public final C018508q A03;
    public final C018708s A04;
    public final InterfaceC001000m A05 = new InterfaceC001000m() { // from class: X.3sm
        {
            C86663y1.this = this;
        }

        @Override // X.InterfaceC001000m
        public final void AIx(C05050Nc c05050Nc) {
            C40941t7 c40941t7;
            C86663y1 c86663y1 = C86663y1.this;
            if (!c86663y1.A02.isFinishing() && c05050Nc.A02 && (c40941t7 = c86663y1.A08) != null && c40941t7.A00() == 4 && c40941t7.A08()) {
                Log.i("MediaViewStreamingVideoPlayer/auto-retry");
                C83793sh c83793sh = c86663y1.A00;
                if (c83793sh != null) {
                    c83793sh.A00("", true, 2);
                }
            }
        }
    };
    public final C000800k A06;
    public final C49322Jp A07;
    public final C40941t7 A08;

    @Override // X.InterfaceC06380Sv
    public void A5K(C12L c12l) {
    }

    public C86663y1(C001200o c001200o, C018508q c018508q, C018608r c018608r, C018708s c018708s, C42441vk c42441vk, C000400f c000400f, C42451vl c42451vl, C000800k c000800k, C0DK c0dk, ActivityC02290Ap activityC02290Ap, C09B c09b, C83793sh c83793sh, C67393Fi c67393Fi) {
        C40941t7 c40941t7;
        long j;
        this.A00 = c83793sh;
        this.A03 = c018508q;
        this.A04 = c018708s;
        this.A06 = c000800k;
        this.A02 = activityC02290Ap;
        C09H c09h = ((AnonymousClass097) c09b).A02;
        if (c09h != null) {
            if (c42441vk.A00(c09h) == null) {
                c018608r.A0B(activityC02290Ap, c09b, false);
            }
            C43221x3 A00 = c42441vk.A00(c09h);
            if (A00 != null && (c40941t7 = A00.A0g) != null) {
                this.A08 = c40941t7;
                c40941t7.A0C = true;
                c40941t7.A0D = true;
                C06350Ss c06350Ss = A00.A02;
                if (c67393Fi.A04 == null) {
                    synchronized (c06350Ss) {
                        j = c06350Ss.A03;
                    }
                    c67393Fi.A02 = j;
                }
                c67393Fi.A04 = c06350Ss;
                this.A07 = new C49322Jp(c001200o, c018708s, c000400f, c0dk, c09b, this.A08, c83793sh);
                if (this.A08.A00() == 4) {
                    String A0h = C02180Ae.A0h(activityC02290Ap, this.A04, c0dk, c09b, this.A08);
                    boolean A08 = this.A08.A08();
                    C83793sh c83793sh2 = this.A00;
                    if (c83793sh2 != null) {
                        c83793sh2.A00(A0h, A08, 1);
                    }
                }
                if (c42451vl != null) {
                    StringBuilder A0P = C000200d.A0P("MediaDownloadManager/markAsUrgent message.key=");
                    A0P.append(c09b.A0n);
                    A0P.append(", message.mediaHash=");
                    A0P.append(((AnonymousClass097) c09b).A06);
                    A0P.toString();
                    if (((AnonymousClass097) c09b).A02 != null) {
                        C43221x3 A002 = c42451vl.A0R.A00(((AnonymousClass097) c09b).A02);
                        if (A002 == null || !c42451vl.A0A(c09b)) {
                            return;
                        }
                        A002.A0q = true;
                        ArrayList arrayList = new ArrayList();
                        synchronized (c42451vl.A0S) {
                            c42451vl.A00.close();
                            Iterator it = ((ArrayList) c42451vl.A04()).iterator();
                            while (it.hasNext()) {
                                AnonymousClass097 anonymousClass097 = (AnonymousClass097) it.next();
                                if (anonymousClass097.A02 != null && c42451vl.A0T.A04(anonymousClass097)) {
                                    arrayList.add(anonymousClass097);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                AnonymousClass097 anonymousClass0972 = (AnonymousClass097) it2.next();
                                C43221x3 A02 = c42451vl.A02(anonymousClass0972);
                                if (A02 != null && !A02.A0q && A02.A0p == 1) {
                                    synchronized (c42451vl.A0h) {
                                        c42451vl.A0h.put(anonymousClass0972, Long.valueOf(A02.A07));
                                    }
                                    c42451vl.A07(anonymousClass0972, false, false);
                                }
                            }
                        }
                        StringBuilder A0P2 = C000200d.A0P("MediaDownloadManager/markAsUrgent/executing download message.key=");
                        A0P2.append(c09b.A0n);
                        A0P2.append(", message.mediaHash=");
                        A0P2.append(((AnonymousClass097) c09b).A06);
                        A0P2.toString();
                        c42451vl.A0f.AS1(c42451vl.A0R.A00(((AnonymousClass097) c09b).A02));
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw new IllegalStateException("download file is null");
        }
        throw null;
    }

    @Override // X.InterfaceC06380Sv
    public /* synthetic */ Map ACr() {
        return Collections.emptyMap();
    }

    @Override // X.InterfaceC06380Sv
    public Uri ADi() {
        return this.A07.ADi();
    }

    @Override // X.InterfaceC06380Sv
    public long AQX(AnonymousClass126 anonymousClass126) {
        C018508q c018508q = this.A03;
        c018508q.A02.post(new RunnableEBaseShape9S0100000_I1_1(this, 23));
        return this.A07.AQX(anonymousClass126);
    }

    @Override // X.InterfaceC06380Sv
    public void close() {
        C018508q c018508q = this.A03;
        c018508q.A02.post(new RunnableEBaseShape9S0100000_I1_1(this, 24));
        this.A07.close();
    }

    @Override // X.InterfaceC06380Sv
    public int read(byte[] bArr, int i, int i2) {
        return this.A07.read(bArr, i, i2);
    }
}
