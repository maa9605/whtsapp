package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1wq */
/* loaded from: classes2.dex */
public class C43091wq {
    public static volatile C43091wq A05;
    public final AbstractC000600i A00;
    public final C012005w A01;
    public final C01B A02;
    public final C003701t A03;
    public final C42591vz A04;

    public C43091wq(AbstractC000600i abstractC000600i, C012005w c012005w, C01B c01b, C003701t c003701t, C42591vz c42591vz) {
        this.A00 = abstractC000600i;
        this.A01 = c012005w;
        this.A02 = c01b;
        this.A03 = c003701t;
        this.A04 = c42591vz;
    }

    public static float A00(C01B c01b, int i, int i2, long j, int i3) {
        if (i == 0 || i2 == 0) {
            return 3.0f;
        }
        float A07 = (((c01b.A07(C01C.A3Y) << 10) << 10) * 8000.0f) / (((i * i2) * 3) + 96000);
        float max = Math.max(0.0f, A07 - ((float) j)) / A07;
        return ((i3 - 3) * max * max) + 3.0f;
    }

    public static C43091wq A01() {
        if (A05 == null) {
            synchronized (C43091wq.class) {
                if (A05 == null) {
                    A05 = new C43091wq(AbstractC000600i.A00(), C012005w.A00(), C01B.A00(), C003701t.A00(), C42591vz.A09());
                }
            }
        }
        return A05;
    }

    public boolean A02(long j, long j2) {
        if (j > 262144) {
            return ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0 ? 0 : (int) ((j * 8) / (j2 * 1000))) > this.A02.A07(C01C.A46);
        }
        return false;
    }

    public boolean A03(C0DC c0dc, File file) {
        if (c0dc == C0DC.A0N || c0dc == C0DC.A04 || c0dc == C0DC.A0Q) {
            return C0JA.A04(this.A03.A0C(422)) == 1;
        } else if (c0dc == C0DC.A05) {
            return C43731xs.A00(file);
        } else {
            return c0dc == C0DC.A0A || c0dc == C0DC.A0P || c0dc == C0DC.A0H || c0dc == C0DC.A06 || c0dc == C0DC.A0I || c0dc == C0DC.A0C;
        }
    }

    public boolean A04(C0DC c0dc, File file) {
        if (file != null) {
            try {
                if (C0DC.A0N != c0dc && C0DC.A04 != c0dc && C0DC.A0Q != c0dc) {
                    if ((C0DC.A05 == c0dc || C0DC.A0D == c0dc) && C42591vz.A06(file).A01 == 2) {
                        return true;
                    }
                } else if (C42591vz.A06(file).A01 != 0) {
                    return true;
                }
            } catch (IOException e) {
                Log.e("transcodeutils/isEligibleForMp4Check exception", e);
                return false;
            }
        }
        return false;
    }

    public boolean A05(AnonymousClass097 anonymousClass097) {
        C0DC A02 = C0DC.A02(anonymousClass097);
        if (A02 == C0DC.A0N || A02 == C0DC.A0Q || A02 == C0DC.A04) {
            return A02(anonymousClass097.A01, anonymousClass097.A00);
        }
        return false;
    }

    public final boolean A06(AnonymousClass097 anonymousClass097) {
        File file;
        C09H c09h = anonymousClass097.A02;
        boolean z = false;
        if (anonymousClass097.A09 != null) {
            if (c09h == null || c09h.A0F == null) {
                return false;
            }
        } else if (c09h == null) {
            throw null;
        }
        if (c09h.A0O) {
            return false;
        }
        C0DC A02 = C0DC.A02(anonymousClass097);
        C0DC c0dc = C0DC.A04;
        if (A02 == c0dc && ((file = c09h.A0F) == null || C40841sx.A0i(file))) {
            return true;
        }
        if (A02 == C0DC.A0A || A02 == C0DC.A0P || A02 == C0DC.A0C || A02 == C0DC.A06 || A02 == C0DC.A0H || A02 == C0DC.A0L) {
            return c09h.A0F == null;
        } else if (A02 != C0DC.A0N && A02 != c0dc && A02 != C0DC.A0Q) {
            if (A02 == C0DC.A05 || A02 == C0DC.A0D) {
                return !this.A04.A0J(c09h.A0F);
            }
            return A02 == C0DC.A0I;
        } else {
            String str = c09h.A0H;
            if (str != null && C0DD.A0F(this.A01, str).exists()) {
                z = true;
            }
            File file2 = c09h.A0F;
            long j = anonymousClass097.A01;
            if (z || j > this.A02.A07(C01C.A3Y) * 1048576) {
                return true;
            }
            return !this.A04.A0K(file2);
        }
    }
}
