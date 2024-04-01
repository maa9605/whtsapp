package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Ph  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05580Ph implements InterfaceC04070Ih {
    public final /* synthetic */ C05330Og A00;
    public final /* synthetic */ AnonymousClass092 A01;
    public final /* synthetic */ C04040Ie A02;

    @Override // X.InterfaceC04070Ih
    public void AJX(boolean z) {
    }

    public C05580Ph(C05330Og c05330Og, C04040Ie c04040Ie, AnonymousClass092 anonymousClass092) {
        this.A00 = c05330Og;
        this.A02 = c04040Ie;
        this.A01 = anonymousClass092;
    }

    public void A00(C04040Ie c04040Ie, C43211x2 c43211x2, AnonymousClass092 anonymousClass092) {
        C09H c09h = ((AnonymousClass097) c04040Ie).A02;
        File A03 = c43211x2.A03();
        if (c09h == null) {
            Log.e("MainMessageObserver/downloadQuotedMessageForSticker null mediaDataV2");
        } else if (A03 != null) {
            c09h.A0F = A03;
            C05330Og c05330Og = this.A00;
            c05330Og.A0D.A0U(anonymousClass092);
            c05330Og.A04.A07(A03, 1, true);
        } else {
            Log.e("MainMessageObserver/downloadQuotedMessageForSticker null download onComplete");
        }
    }

    @Override // X.InterfaceC04070Ih
    public void AJY(C04020Ic c04020Ic, final C43211x2 c43211x2) {
        if (c04020Ic.A02()) {
            InterfaceC002901k interfaceC002901k = this.A00.A0h;
            final C04040Ie c04040Ie = this.A02;
            final AnonymousClass092 anonymousClass092 = this.A01;
            interfaceC002901k.AS1(new Runnable() { // from class: X.1Ha
                @Override // java.lang.Runnable
                public final void run() {
                    C05580Ph.this.A00(c04040Ie, c43211x2, anonymousClass092);
                }
            });
        }
    }
}
