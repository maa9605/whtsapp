package X;

/* renamed from: X.23O */
/* loaded from: classes2.dex */
public abstract class C23O implements Runnable, C0CJ {
    public final C23B A00;

    public C23O(C23B c23b) {
        this.A00 = c23b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:441:0x00f9, code lost:
        if (r1.isHeld() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0112, code lost:
        if (r1.isHeld() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x012b, code lost:
        if (r1.isHeld() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0144, code lost:
        if (r1.isHeld() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x014f, code lost:
        if (r1.isHeld() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0151, code lost:
        r1.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0416, code lost:
        if (r6.isHeld() != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0481, code lost:
        if (r6.isHeld() != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x04a0, code lost:
        if (r6.isHeld() != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x04d1, code lost:
        if (r6.isHeld() != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0502, code lost:
        if (r6.isHeld() != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x050e, code lost:
        if (r6.isHeld() != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0510, code lost:
        r6.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x059f, code lost:
        if (r15.exists() == false) goto L270;
     */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x06d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass235 A02() {
        /*
            Method dump skipped, instructions count: 1887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23O.A02():X.235");
    }

    @Override // X.C0CJ
    public synchronized void cancel() {
        InterfaceC43741xt interfaceC43741xt;
        C23B c23b = this.A00;
        synchronized (c23b) {
            interfaceC43741xt = c23b.A00;
        }
        if (interfaceC43741xt == null) {
            return;
        }
        interfaceC43741xt.cancel();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A05.AKW(A02());
    }
}
