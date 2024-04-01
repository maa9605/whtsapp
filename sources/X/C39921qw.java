package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.1qw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39921qw implements InterfaceC31911d9 {
    public final Status A00;
    public final C31931dB A01;

    public C39921qw(Status status, C31931dB c31931dB) {
        this.A00 = status;
        this.A01 = c31931dB;
    }

    @Override // X.C08H
    public final Status ADG() {
        return this.A00;
    }

    @Override // X.InterfaceC31911d9
    public final String AAm() {
        C31931dB c31931dB = this.A01;
        if (c31931dB == null) {
            return null;
        }
        return c31931dB.A00;
    }
}
