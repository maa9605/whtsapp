package X;

import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1qx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39931qx implements InterfaceC31921dA {
    public final Status A00;
    public final C31941dC A01;

    public C39931qx(Status status, C31941dC c31941dC) {
        this.A00 = status;
        this.A01 = c31941dC;
    }

    @Override // X.InterfaceC31921dA
    public final List AAQ() {
        C31941dC c31941dC = this.A01;
        return c31941dC == null ? Collections.emptyList() : Arrays.asList(c31941dC.A03);
    }

    @Override // X.C08H
    public final Status ADG() {
        return this.A00;
    }
}
