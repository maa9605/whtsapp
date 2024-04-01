package X;

import java.nio.ByteBuffer;

/* renamed from: X.1pv */
/* loaded from: classes.dex */
public abstract class AbstractC39311pv extends C1ZM implements InterfaceC30051Zo {
    public abstract AnonymousClass114 A01(byte[] bArr, int i, boolean z);

    @Override // X.InterfaceC30051Zo
    public void ATg(long j) {
    }

    public AbstractC39311pv() {
        super(new C39321pw[2], new AbstractC39331px[2]);
        int i = this.A00;
        C1ZK[] c1zkArr = this.A0B;
        C002701i.A1K(i == c1zkArr.length);
        for (C1ZK c1zk : c1zkArr) {
            c1zk.A04(1024);
        }
    }

    @Override // X.C1ZM
    public Exception A00(C1ZK c1zk, C1ZL c1zl, boolean z) {
        C39321pw c39321pw = (C39321pw) c1zk;
        AbstractC39331px abstractC39331px = (AbstractC39331px) c1zl;
        try {
            ByteBuffer byteBuffer = c39321pw.A01;
            AnonymousClass114 A01 = A01(byteBuffer.array(), byteBuffer.limit(), z);
            long j = ((C1ZK) c39321pw).A00;
            long j2 = c39321pw.A00;
            ((C1ZL) abstractC39331px).A00 = j;
            abstractC39331px.A01 = A01;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            abstractC39331px.A00 = j;
            ((AbstractC21590za) abstractC39331px).A00 &= Integer.MAX_VALUE;
            return null;
        } catch (AnonymousClass115 e) {
            return e;
        }
    }
}
