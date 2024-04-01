package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* renamed from: X.12E */
/* loaded from: classes.dex */
public final class C12E extends Handler implements Runnable {
    public int A00;
    public C12C A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final C12F A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C12J A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12E(C12J c12j, Looper looper, C12F c12f, C12C c12c, int i, long j) {
        super(looper);
        this.A09 = c12j;
        this.A05 = c12f;
        this.A01 = c12c;
        this.A03 = i;
        this.A04 = j;
    }

    public void A00(long j) {
        C12J c12j = this.A09;
        C002701i.A1K(c12j.A00 == null);
        c12j.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
            return;
        }
        this.A02 = null;
        c12j.A02.execute(this);
    }

    public void A01(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.A07 = true;
            ((C29981Zg) this.A05).A0A = true;
            if (this.A06 != null) {
                this.A06.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.A09.A00 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ((C39271pr) this.A01).A05(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
        this.A01 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x00b2, code lost:
        if (r1 == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x010c, code lost:
        if (r10.A06() != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00e1  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleMessage(android.os.Message r27) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12E.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:479:0x00bc, code lost:
        r0 = r8.A00;
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x00c0, code lost:
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x00c2, code lost:
        ((X.C1ZV) r23).A09 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0320, code lost:
        if (r3 == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0324, code lost:
        if (r14 < r27) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0326, code lost:
        r25 = r4;
        r3 = r0;
        r29 = r12;
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0552, code lost:
        if (r1 == (-1)) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x055c, code lost:
        r1 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0566, code lost:
        if (r1 <= (r0.A0L + r16)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0568, code lost:
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x056a, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x056b, code lost:
        r0.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x056f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0570, code lost:
        r0.A0N.post(r0.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x057a, code lost:
        r0.A00 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0586, code lost:
        if (r22 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0588, code lost:
        r22 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x058a, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x05ae, code lost:
        r2 = X.C000200d.A0P("None of the available extractors (");
        r5 = new java.lang.StringBuilder();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x05ba, code lost:
        if (r1 >= r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x05bc, code lost:
        r5.append(r4[r1].getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x05cb, code lost:
        if (r1 >= (r3 - 1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x05cd, code lost:
        r5.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x05d2, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x05e4, code lost:
        throw new X.C1Zn(X.C000200d.A0L(r2, r5.toString(), ") could read the stream."), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x058d, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0581, code lost:
        continue;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x061a: IGET  (r0 I:boolean) = (r7 I:X.12E) X.12E.A08 boolean, block:B:771:0x0613 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x062f: IGET  (r0 I:boolean) = (r7 I:X.12E) X.12E.A08 boolean, block:B:776:0x0628 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0642: IGET  (r0 I:boolean) = (r7 I:X.12E) X.12E.A07 boolean, block:B:780:0x0642 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0652: IGET  (r0 I:boolean) = (r7 I:X.12E) X.12E.A08 boolean, block:B:785:0x0652 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0668: IGET  (r0 I:boolean) = (r7 I:X.12E) X.12E.A08 boolean, block:B:790:0x0661 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.12E, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.12E, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.12E, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.12E, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.12E, android.os.Handler] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12E.run():void");
    }
}
