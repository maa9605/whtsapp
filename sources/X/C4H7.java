package X;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.4H7 */
/* loaded from: classes3.dex */
public class C4H7 extends AbstractC35891ju {
    public byte[] A00;
    public final ActivityC02290Ap A01;
    public final FingerprintBottomSheet A02;
    public final AnonymousClass012 A03;
    public final AnonymousClass492 A04;
    public final AnonymousClass494 A05;
    public final AnonymousClass499 A06;

    public C4H7(AnonymousClass012 anonymousClass012, AnonymousClass499 anonymousClass499, ActivityC02290Ap activityC02290Ap, FingerprintBottomSheet fingerprintBottomSheet, AnonymousClass492 anonymousClass492, AnonymousClass494 anonymousClass494) {
        this.A03 = anonymousClass012;
        this.A06 = anonymousClass499;
        this.A01 = activityC02290Ap;
        this.A02 = fingerprintBottomSheet;
        this.A04 = anonymousClass492;
        this.A05 = anonymousClass494;
    }

    @Override // X.AbstractC27261Mr
    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        fingerprintBottomSheet.A15(true);
        this.A05.APK(this.A00);
        fingerprintBottomSheet.A11();
    }

    @Override // X.AbstractC35891ju
    public void A02() {
        this.A05.AOf();
    }

    @Override // X.AbstractC35891ju
    public void A03(C0HE c0he, InterfaceC06550Tv interfaceC06550Tv) {
        byte[] A00;
        long A01 = this.A06.A01() * 1000;
        if (A01 > this.A03.A05()) {
            this.A02.A1D(A01);
            return;
        }
        final AnonymousClass492 anonymousClass492 = this.A04;
        final C4H6 c4h6 = new C4H6(this, interfaceC06550Tv);
        final long A05 = anonymousClass492.A01.A05() / 1000;
        if (anonymousClass492 instanceof C4DJ) {
            A00 = AnonymousClass498.A00(((C4DJ) anonymousClass492).A00, Long.valueOf(A05));
        } else if (anonymousClass492 instanceof C90804Cm) {
            C90804Cm c90804Cm = (C90804Cm) anonymousClass492;
            A00 = AnonymousClass498.A00(c90804Cm.A00, Long.valueOf(A05), c90804Cm.A01);
        } else {
            A00 = AnonymousClass498.A00(Long.valueOf(A05));
        }
        if (anonymousClass492.A04.A06(A00, c0he, new InterfaceC06550Tv() { // from class: X.4Cc
            @Override // X.InterfaceC06550Tv
            public void AHZ(int i, CharSequence charSequence) {
                C014406v c014406v = anonymousClass492.A03;
                StringBuilder A0P = C000200d.A0P("sendWithBiometric/onAuthenticationError/error: ");
                A0P.append(charSequence.toString());
                c014406v.A04(A0P.toString());
                c4h6.AHZ(i, charSequence);
            }

            @Override // X.InterfaceC06550Tv
            public void AHa() {
                anonymousClass492.A03.A04("sendWithBiometric/onAuthenticationFailed");
                c4h6.AHa();
            }

            @Override // X.InterfaceC06550Tv
            public void AHb(int i, CharSequence charSequence) {
                C014406v c014406v = anonymousClass492.A03;
                StringBuilder A0P = C000200d.A0P("sendWithBiometric/onAuthenticationHelp/help: ");
                A0P.append(charSequence.toString());
                c014406v.A04(A0P.toString());
                c4h6.AHb(i, charSequence);
            }

            @Override // X.InterfaceC06550Tv
            public void AHc(byte[] bArr) {
                if (bArr != null) {
                    AnonymousClass492 anonymousClass4922 = anonymousClass492;
                    anonymousClass4922.A03.A07(null, "sendWithBiometric/onAuthenticationSucceeded/success", null);
                    c4h6.AHc(C49B.A00(anonymousClass4922.A05, Boolean.FALSE, bArr, A05, null, null, new Object[0]));
                    return;
                }
                anonymousClass492.A03.A04("sendWithBiometric/onAuthenticationSucceeded/null signature");
                c4h6.AHa();
            }
        })) {
            return;
        }
        C4H7 c4h7 = c4h6.A01;
        c4h7.A02.A10();
        new AlertDialog.Builder(c4h7.A01).setTitle(R.string.payments_biometric_invalidated_key_title).setMessage(R.string.payments_biometric_invalidated_key_error).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Nx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c4h6.A00();
            }
        }).setCancelable(false).show();
    }

    @Override // X.AbstractC35891ju
    public void A04(byte[] bArr) {
        this.A00 = bArr;
    }
}
