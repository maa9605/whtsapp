package X;

import android.text.TextUtils;

/* renamed from: X.4C3  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4C3 implements AnonymousClass486 {
    public final /* synthetic */ AnonymousClass486 A00;
    public final /* synthetic */ C4C4 A01;

    public C4C3(C4C4 c4c4, AnonymousClass486 anonymousClass486) {
        this.A01 = c4c4;
        this.A00 = anonymousClass486;
    }

    @Override // X.AnonymousClass486
    public void AIz(C4GI c4gi) {
        if (!TextUtils.isEmpty(c4gi.A01)) {
            this.A01.A05.A0F(c4gi.A01, c4gi.A02);
            AnonymousClass486 anonymousClass486 = this.A00;
            if (anonymousClass486 != null) {
                anonymousClass486.AIz(c4gi);
                return;
            }
            return;
        }
        AnonymousClass486 anonymousClass4862 = this.A00;
        if (anonymousClass4862 == null) {
            return;
        }
        anonymousClass4862.AJs(new C28Q());
    }

    @Override // X.AnonymousClass486
    public void AJs(C28Q c28q) {
        AnonymousClass486 anonymousClass486 = this.A00;
        if (anonymousClass486 != null) {
            anonymousClass486.AJs(c28q);
        }
    }
}
