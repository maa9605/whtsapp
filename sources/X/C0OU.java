package X;

import com.whatsapp.Conversation;

/* renamed from: X.0OU  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OU {
    public final Conversation A00;
    public final C03150Ej A01;
    public final boolean A02;

    public C0OU(Conversation conversation, boolean z, C03150Ej c03150Ej) {
        this.A00 = conversation;
        this.A02 = z;
        this.A01 = c03150Ej;
    }

    public Conversation A00() {
        if (this.A02) {
            return this.A00;
        }
        throw new AssertionError("no active session");
    }

    public boolean A01(AbstractC005302j abstractC005302j) {
        return this.A02 && AnonymousClass024.A0l(this.A00.A2a, abstractC005302j) && !this.A01.A00;
    }
}
