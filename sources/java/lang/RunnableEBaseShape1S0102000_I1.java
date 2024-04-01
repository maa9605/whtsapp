package java.lang;

import X.AbstractC48662Ge;
import X.C000200d;
import X.C2Zb;
import X.C67673Gk;
import X.C73083b4;
import X.C84053t7;
import X.InterfaceC73103b6;
import X.InterfaceC73113b7;
import X.InterfaceC73133b9;
import X.InterfaceC73143bA;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0102000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape1S0102000_I1(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }

    public static void A00(RunnableEBaseShape1S0102000_I1 runnableEBaseShape1S0102000_I1) {
        InterfaceC73113b7 interfaceC73113b7;
        StringBuilder A0P = C000200d.A0P("InlineYoutubeVideoPlayer - YoutubeJsInterface postPlayerEvent:");
        int i = runnableEBaseShape1S0102000_I1.A01;
        A0P.append(i);
        A0P.append(" data: ");
        int i2 = runnableEBaseShape1S0102000_I1.A00;
        C000200d.A1F(A0P, i2);
        C84053t7 c84053t7 = ((C73083b4) runnableEBaseShape1S0102000_I1.A02).A00;
        if (i != 0) {
            if (i == 1) {
                c84053t7.A01 = i2 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            } else if (i != 2) {
                if (i != 3) {
                    StringBuilder A0P2 = C000200d.A0P("Invalid postPlayerEvent");
                    A0P2.append(i2);
                    c84053t7.A0F(A0P2.toString(), i2 == 0);
                    return;
                }
                StringBuilder A0P3 = C000200d.A0P("Youtube player Error=");
                A0P3.append(i2);
                c84053t7.A0F(A0P3.toString(), i2 == 0);
            } else {
                long j = i2 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                if (c84053t7.A07 || c84053t7.A04 != -9223372036854775807L) {
                    return;
                }
                c84053t7.A04 = j;
                c84053t7.A09.loadUrl("javascript:(function() { loaded = true; })()");
                long j2 = c84053t7.A04;
                if (j2 > 0) {
                    return;
                }
                StringBuilder A0P4 = C000200d.A0P("Invalid duration=");
                A0P4.append(j2);
                c84053t7.A0F(A0P4.toString(), false);
            }
        } else if (c84053t7 == null) {
            throw null;
        } else {
            if ((i2 < -1 || i2 > 3) && i2 != 5) {
                return;
            }
            InterfaceC73143bA interfaceC73143bA = ((AbstractC48662Ge) c84053t7).A04;
            if (interfaceC73143bA != null) {
                interfaceC73143bA.AN3(true, i2);
            }
            if (i2 == 0 && c84053t7.A03 != i2 && (interfaceC73113b7 = ((AbstractC48662Ge) c84053t7).A01) != null) {
                interfaceC73113b7.AIq(c84053t7);
            }
            int i3 = c84053t7.A02;
            if (i3 != 2 && i2 == 2) {
                c84053t7.A06();
            } else if (i3 != 1 && i2 == 1) {
                c84053t7.A09.loadUrl("javascript:(function() { player.playVideo(); })()");
                c84053t7.A02 = 1;
                c84053t7.A00 = 1;
                C2Zb c2Zb = c84053t7.A0C;
                c2Zb.A03();
                c2Zb.A06 = true;
            }
            c84053t7.A03 = i2;
            int i4 = c84053t7.A00;
            if (i4 != 0 && (i4 != 1 ? !(i4 != 2 || i2 != 2) : i2 == 1)) {
                c84053t7.A00 = 0;
                c84053t7.A0C.A06 = false;
            }
            if (!c84053t7.A07 && i2 == 1) {
                if (c84053t7.A04 == -9223372036854775807L) {
                    c84053t7.A0F("Video started playing before duration loaded.", true);
                    return;
                }
                c84053t7.A07 = true;
                InterfaceC73133b9 interfaceC73133b9 = ((AbstractC48662Ge) c84053t7).A03;
                if (interfaceC73133b9 != null) {
                    interfaceC73133b9.AOs(c84053t7);
                }
            } else if (i2 == 3) {
                r4 = true;
            }
            InterfaceC73103b6 interfaceC73103b6 = ((AbstractC48662Ge) c84053t7).A00;
            if (interfaceC73103b6 == null) {
                return;
            }
            interfaceC73103b6.AI1(c84053t7, r4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A03) {
            case 0:
                ((C67673Gk) this.A02).A04.A07(this.A00, this.A01);
                return;
            case 1:
                ((C67673Gk) this.A02).A04.A05(this.A00, this.A01);
                return;
            case 2:
                A00(this);
                return;
            default:
                return;
        }
    }
}
