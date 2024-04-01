package X;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: X.1fJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33071fJ implements InterfaceC32171da {
    public final Status A00;
    public final List A01;

    public C33071fJ(Status status, List list) {
        this.A00 = status;
        this.A01 = list;
    }

    @Override // X.InterfaceC32171da
    public final List ABc() {
        return this.A01;
    }

    @Override // X.C08H
    public final Status ADG() {
        return this.A00;
    }
}
