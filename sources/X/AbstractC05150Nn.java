package X;

import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Nn */
/* loaded from: classes.dex */
public abstract class AbstractC05150Nn {
    public int A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final AbstractC000600i A05;
    public final AnonymousClass012 A06;
    public final AnonymousClass011 A07;
    public final C0EJ A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final Map A0C = new LinkedHashMap();

    public abstract AnonymousClass014 A02(int i, long j);

    public abstract String A03();

    public abstract void A04(C36471kr c36471kr);

    public AbstractC05150Nn(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011, C0EJ c0ej, String str, long j, int i, long j2, Integer num) {
        this.A00 = -1;
        C000700j.A09(true, "Invalid stage");
        this.A06 = anonymousClass012;
        this.A05 = abstractC000600i;
        this.A07 = anonymousClass011;
        this.A08 = c0ej;
        this.A0B = str;
        this.A03 = j;
        this.A02 = i;
        this.A00 = 1;
        this.A01 = j2;
        this.A04 = j2;
        AnonymousClass014 A02 = A02(-1, 0L);
        if (anonymousClass011 != null) {
            this.A09 = anonymousClass011.A02(A02.code, A02.samplingRate, false);
            this.A0A = num;
            return;
        }
        throw null;
    }

    public synchronized void A00(int i) {
        if (i != -1) {
            int i2 = this.A00;
            if (i != i2) {
                long A04 = this.A06.A04();
                A01(i2, A04 - this.A01);
                this.A00 = i;
                this.A01 = A04;
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid stage ");
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A0B);
        String obj = sb.toString();
        AbstractC000600i abstractC000600i = this.A05;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A03());
        sb2.append("/failed new stage check");
        abstractC000600i.A09(sb2.toString(), obj, true);
    }

    public final void A01(int i, long j) {
        Integer num = this.A09;
        if (num != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(A03());
            sb.append("/onStageComplete stage = ");
            sb.append(i);
            sb.append("; duration = ");
            sb.append(j);
            sb.append("; ");
            sb.append(this);
            Log.i(sb.toString());
            Map map = this.A0C;
            map.put(Integer.valueOf(i), Long.valueOf(j));
            if (i == 0) {
                for (Map.Entry entry : map.entrySet()) {
                    this.A07.A08(A02(((Number) entry.getKey()).intValue(), ((Number) entry.getValue()).longValue()), num.intValue());
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("stanzaId = ");
        A0P.append(this.A0B);
        A0P.append("; loggableStanzaType = ");
        A0P.append(this.A02);
        A0P.append("; currentStage = ");
        A0P.append(this.A00);
        A0P.append("; offlineCount = ");
        A0P.append(this.A0A);
        return A0P.toString();
    }
}
