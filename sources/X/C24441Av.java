package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Av  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24441Av extends AbstractC39181pi implements Handler.Callback {
    public int A00;
    public int A01;
    public C21030yg A02;
    public InterfaceC30051Zo A03;
    public C39321pw A04;
    public AbstractC39331px A05;
    public AbstractC39331px A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C21040yh A0A;
    public final AnonymousClass116 A0B;
    public final AnonymousClass117 A0C;

    @Override // X.C1Z6
    public boolean AFf() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24441Av(AnonymousClass117 anonymousClass117, Looper looper) {
        super(3);
        AnonymousClass116 anonymousClass116 = AnonymousClass116.A00;
        if (anonymousClass117 != null) {
            this.A0C = anonymousClass117;
            this.A09 = looper != null ? new Handler(looper, this) : null;
            this.A0B = anonymousClass116;
            this.A0A = new C21040yh();
            return;
        }
        throw null;
    }

    @Override // X.AbstractC39181pi
    public int A05(C21030yg c21030yg) {
        if (this.A0B != null) {
            String str = c21030yg.A0P;
            return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) ? AbstractC39181pi.A03(null, c21030yg.A0H) ? 4 : 2 : "text".equals(C223412b.A02(str)) ? 1 : 0;
        }
        throw null;
    }

    @Override // X.AbstractC39181pi
    public void A09() {
        this.A02 = null;
        List emptyList = Collections.emptyList();
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.A0C.AJA(emptyList);
        }
        A0E();
        this.A03.release();
        this.A03 = null;
        this.A00 = 0;
    }

    @Override // X.AbstractC39181pi
    public void A0A(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.A0C.AJA(emptyList);
        }
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A0E();
            this.A03.release();
            this.A03 = null;
            this.A00 = 0;
            this.A03 = C30061Zp.A00(this.A02);
            return;
        }
        A0E();
        this.A03.flush();
    }

    @Override // X.AbstractC39181pi
    public void A0C(C21030yg[] c21030ygArr, long j) {
        C21030yg c21030yg = c21030ygArr[0];
        this.A02 = c21030yg;
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = C30061Zp.A00(c21030yg);
        }
    }

    public final long A0D() {
        int i = this.A01;
        if (i != -1) {
            AbstractC39331px abstractC39331px = this.A06;
            AnonymousClass114 anonymousClass114 = abstractC39331px.A01;
            if (i < anonymousClass114.AA2()) {
                return anonymousClass114.AA1(i) + abstractC39331px.A00;
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    public final void A0E() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC39331px abstractC39331px = this.A06;
        if (abstractC39331px != null) {
            abstractC39331px.A02();
            this.A06 = null;
        }
        AbstractC39331px abstractC39331px2 = this.A05;
        if (abstractC39331px2 != null) {
            abstractC39331px2.A02();
            this.A05 = null;
        }
    }

    @Override // X.C1Z6
    public boolean AFE() {
        return this.A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r3 != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be A[EXC_TOP_SPLITTER, LOOP:1: B:73:0x00be->B:82:0x00be, LOOP_START, SYNTHETIC] */
    @Override // X.C1Z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ARV(long r11, long r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24441Av.ARV(long, long):void");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.A0C.AJA((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
