package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2UF  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2UF extends C0JU {
    public final long A00;
    public final Set A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2UF(AnonymousClass094 anonymousClass094, long j, C55292kB c55292kB) {
        super(anonymousClass094, j, (byte) 50);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(c55292kB.A02));
        long j2 = c55292kB.A01;
        this.A01 = unmodifiableSet;
        this.A00 = j2;
    }

    @Override // X.C0JU
    public String A19() {
        throw new RuntimeException("FMessageAppStateFatalExceptionNotification/writeData should not be called");
    }

    @Override // X.C0JU
    public void A1A(String str) {
        throw new RuntimeException("FMessageAppStateFatalExceptionNotification/readData should not be called");
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C0CT AVX = C55292kB.A03.AVX();
        Set set = this.A01;
        AVX.A02();
        C55292kB c55292kB = (C55292kB) AVX.A00;
        C0CX c0cx = c55292kB.A02;
        if (!((C0CY) c0cx).A00) {
            c55292kB.A02 = C0AZ.A05(c0cx);
        }
        C0Aa.A08(set, c55292kB.A02);
        C0CT AVX2 = C48512Fn.A0A.AVX();
        EnumC55282kA enumC55282kA = EnumC55282kA.APP_STATE_FATAL_EXCEPTION_NOTIFICATION;
        AVX2.A02();
        C48512Fn.A0B((C48512Fn) AVX2.A00, enumC55282kA);
        AVX2.A02();
        C48512Fn c48512Fn = (C48512Fn) AVX2.A00;
        if (c48512Fn != null) {
            c48512Fn.A04 = (C55292kB) AVX.A01();
            c48512Fn.A00 |= 256;
            C48512Fn c48512Fn2 = (C48512Fn) AVX2.A01();
            C40541sR c40541sR = c40551sS.A01;
            c40541sR.A02();
            C40531sQ c40531sQ = (C40531sQ) c40541sR.A00;
            if (c48512Fn2 != null) {
                c40531sQ.A0R = c48512Fn2;
                c40531sQ.A00 |= 2048;
                return;
            }
            throw null;
        }
        throw null;
    }
}
