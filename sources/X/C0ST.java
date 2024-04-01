package X;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ST  reason: invalid class name */
/* loaded from: classes.dex */
public class C0ST {
    public final C0SN A00;
    public final C0SQ A01;
    public final C006202t A02;
    public final C0QO A03;

    public C0ST(C0QO c0qo, C006202t c006202t) {
        C0SQ c0sq = new C0SQ();
        C0SN c0sn = new C0SN();
        this.A03 = c0qo;
        this.A02 = c006202t;
        this.A01 = c0sq;
        this.A00 = c0sn;
    }

    public int A00() {
        return this.A00.A0A() + this.A01.A0A();
    }

    public void A01() {
        long seconds;
        Collection<Number> unmodifiableCollection;
        this.A00.A0B();
        C0QO c0qo = this.A03;
        if (c0qo.A01 == 2) {
            seconds = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()) * 3600;
        } else {
            seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        C006202t c006202t = this.A02;
        c006202t.A02(47, Long.valueOf(seconds), c0qo.A01);
        c006202t.A02(3433, c0qo.A07(), c0qo.A01);
        int i = c0qo.A01;
        if (i != 1 && i != 0) {
            unmodifiableCollection = Collections.unmodifiableCollection(c006202t.A01.A00.keySet());
        } else {
            unmodifiableCollection = Collections.unmodifiableCollection(c006202t.A00.A00.keySet());
        }
        for (Number number : unmodifiableCollection) {
            A02(number.intValue());
        }
        for (Number number2 : c0qo.A09()) {
            A02(number2.intValue());
        }
    }

    public final void A02(int i) {
        C006402v A00;
        C006202t c006202t = this.A02;
        C0QO c0qo = this.A03;
        int i2 = c0qo.A01;
        if (i2 != 1 && i2 != 0) {
            A00 = c006202t.A01.A00(i);
        } else {
            A00 = c006202t.A00.A00(i);
        }
        C006402v A05 = c0qo.A05(i);
        C0SN c0sn = this.A00;
        Map map = c0sn.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) && !A00.equals(A05)) {
            c0sn.A0D(0, i, A00.A00);
            map.put(valueOf, A00);
        }
    }

    public void A03(int i, byte[] bArr, int i2) {
        C0SQ c0sq = this.A01;
        c0sq.A0B();
        c0sq.A0D(1, i, Integer.valueOf(i2));
        c0sq.A0E(ByteBuffer.wrap(bArr));
        c0sq.A0C((byte) (c0sq.A09() | 4));
    }

    public void A04(AnonymousClass014 anonymousClass014, int i) {
        C0SQ c0sq = this.A01;
        c0sq.A0B();
        c0sq.A0D(1, anonymousClass014.code, Integer.valueOf(i));
        anonymousClass014.serialize(new C0SU() { // from class: X.2ID
            @Override // X.C0SU
            public final void ASd(int i2, Object obj) {
                C0ST c0st = C0ST.this;
                if (obj != null) {
                    c0st.A01.A0D(2, i2, obj);
                }
            }
        });
        c0sq.A0C((byte) (c0sq.A09() | 4));
    }
}
