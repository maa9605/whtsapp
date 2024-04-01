package X;

/* renamed from: X.0eQ */
/* loaded from: classes.dex */
public final class C09610eQ extends AbstractC09620eR {
    public void A07(InterfaceFutureC09630eS future) {
        C17250rn c17250rn;
        if (future != null) {
            Object obj = this.value;
            if (obj == null) {
                if (future.isDone()) {
                    if (AbstractC09620eR.A00.A04(this, null, AbstractC09620eR.A00(future))) {
                        AbstractC09620eR.A03(this);
                        return;
                    }
                    return;
                }
                RunnableC17270rp runnableC17270rp = new RunnableC17270rp(this, future);
                AbstractC17220rk abstractC17220rk = AbstractC09620eR.A00;
                if (!abstractC17220rk.A04(this, null, runnableC17270rp)) {
                    obj = this.value;
                } else {
                    try {
                        future.A5E(runnableC17270rp, EnumC17290rr.A01);
                        return;
                    } catch (Throwable th) {
                        try {
                            c17250rn = new C17250rn(th);
                        } catch (Throwable unused) {
                            c17250rn = C17250rn.A01;
                        }
                        abstractC17220rk.A04(this, runnableC17270rp, c17250rn);
                        return;
                    }
                }
            }
            if (!(obj instanceof C17230rl)) {
                return;
            }
            future.cancel(((C17230rl) obj).A01);
            return;
        }
        throw null;
    }

    public void A08(Object value) {
        if (value == null) {
            value = AbstractC09620eR.A01;
        }
        if (AbstractC09620eR.A00.A04(this, null, value)) {
            AbstractC09620eR.A03(this);
        }
    }

    public void A09(Throwable throwable) {
        if (throwable != null) {
            if (AbstractC09620eR.A00.A04(this, null, new C17250rn(throwable))) {
                AbstractC09620eR.A03(this);
                return;
            }
            return;
        }
        throw null;
    }
}
