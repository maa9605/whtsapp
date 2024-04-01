package X;

import com.whatsapp.Conversation;

/* renamed from: X.1GG  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1GG implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Conversation A01;
    public final /* synthetic */ AnonymousClass092 A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C1GG(Conversation conversation, AnonymousClass092 anonymousClass092, int i, boolean z) {
        this.A01 = conversation;
        this.A02 = anonymousClass092;
        this.A00 = i;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A2N(this.A02, this.A00, this.A03);
    }
}
