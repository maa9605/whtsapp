package X;

import android.content.Intent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.StatusReplyActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.3yf */
/* loaded from: classes2.dex */
public class C86873yf extends AbstractC86423xS {
    public C84143tG A00;
    public final C00T A01;
    public final C00A A02;

    public C86873yf(C003701t c003701t, C42461vm c42461vm, C018508q c018508q, C03010Du c03010Du, InterfaceC002901k interfaceC002901k, C0EB c0eb, C018608r c018608r, C018308n c018308n, C41471ty c41471ty, C42761wH c42761wH, C002301c c002301c, C42441vk c42441vk, C0C9 c0c9, C00A c00a, C0CB c0cb, C2MV c2mv, C2EQ c2eq, C53132bw c53132bw, C41771uU c41771uU, C53362fl c53362fl, AnonymousClass092 anonymousClass092, AbstractC53832ha abstractC53832ha) {
        super(c003701t, c42461vm, c018508q, c03010Du, interfaceC002901k, c0eb, c018608r, c018308n, c41471ty, c42761wH, c002301c, c42441vk, c0c9, c0cb, c2mv, c2eq, c53132bw, c41771uU, c53362fl, anonymousClass092, abstractC53832ha);
        this.A01 = new C82343qM(this);
        this.A02 = c00a;
    }

    @Override // X.AbstractC53812hY, X.AbstractC53822hZ
    public void A02() {
        super.A02();
        this.A02.A00(this.A01);
    }

    @Override // X.AbstractC53812hY, X.AbstractC53822hZ
    public void A09(View view) {
        super.A09(view);
        AbstractC71693Xc abstractC71693Xc = ((AbstractC53812hY) this).A01;
        if (abstractC71693Xc == null) {
            abstractC71693Xc = new C82353qN();
            ((AbstractC53812hY) this).A01 = abstractC71693Xc;
        }
        abstractC71693Xc.A08.setVisibility(C003101m.A0Y(((AbstractC86423xS) this).A04.A0A()) ? 8 : 0);
        C003301p.A06(abstractC71693Xc.A0D);
        abstractC71693Xc.A0D.setText(R.string.notification_quick_reply);
        abstractC71693Xc.A0D.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, abstractC71693Xc, 16));
        A0P(false);
        A0J();
        this.A02.A01(this.A01);
    }

    @Override // X.AbstractC53812hY
    public void A0E() {
        super.A0E();
        C84143tG c84143tG = this.A00;
        if (c84143tG != null) {
            c84143tG.A05(true);
            this.A00 = null;
        }
        final AnonymousClass092 anonymousClass092 = ((AbstractC86423xS) this).A04;
        AbstractC71693Xc abstractC71693Xc = ((AbstractC53812hY) this).A01;
        if (abstractC71693Xc == null) {
            abstractC71693Xc = new C82353qN();
            ((AbstractC53812hY) this).A01 = abstractC71693Xc;
        }
        final C82353qN c82353qN = (C82353qN) abstractC71693Xc;
        InterfaceC73333bT interfaceC73333bT = new InterfaceC73333bT() { // from class: X.3qF
            @Override // X.InterfaceC73333bT
            public final void AO9(C73343bU c73343bU) {
                AnonymousClass094 anonymousClass094;
                AnonymousClass092 anonymousClass0922 = anonymousClass092;
                C82353qN c82353qN2 = c82353qN;
                C73353bV c73353bV = c73343bU.A01;
                if (c73353bV != null && (anonymousClass094 = c73353bV.A00) != null && anonymousClass094.equals(anonymousClass0922.A0n)) {
                    c82353qN2.A0A.callOnClick();
                }
            }
        };
        C0C9 c0c9 = this.A0B;
        C2MV c2mv = this.A0N;
        AbstractC005302j A0A = anonymousClass092.A0A();
        if (A0A != null) {
            C84143tG c84143tG2 = new C84143tG(c0c9, c2mv, interfaceC73333bT, A0A);
            this.A00 = c84143tG2;
            this.A0M.ARy(c84143tG2, new Void[0]);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC53812hY
    public void A0G() {
        super.A0G();
        BottomSheetBehavior bottomSheetBehavior = ((AbstractC53812hY) this).A00;
        if (bottomSheetBehavior.A0B != 4) {
            bottomSheetBehavior.A0O(4);
            return;
        }
        ((AbstractC53812hY) this).A01.A06.setVisibility(8);
        ((AbstractC53812hY) this).A01.A06.setAlpha(0.0f);
    }

    @Override // X.AbstractC53812hY
    public void A0K(int i) {
        super.A0K(i);
        if (i == 3) {
            A0R();
        }
    }

    public final void A0R() {
        StringBuilder sb = new StringBuilder("playbackPage/reply page=");
        sb.append(this);
        sb.append("; host=");
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0G.A00;
        sb.append(statusPlaybackBaseFragment);
        Log.i(sb.toString());
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(A0A(), ActivityC02290Ap.class);
        if (activityC02290Ap != null && activityC02290Ap.AFE()) {
            StringBuilder sb2 = new StringBuilder("playbackPage/reply reply-already-ended page=");
            sb2.append(this);
            sb2.append("; host=");
            sb2.append(statusPlaybackBaseFragment);
            Log.i(sb2.toString());
            return;
        }
        A0F();
        Intent intent = new Intent(A0A(), StatusReplyActivity.class);
        C0LD.A00(intent, ((AbstractC86423xS) this).A04.A0n);
        A0A().startActivity(intent);
    }
}
