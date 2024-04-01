package X;

import android.util.Pair;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.2QS  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2QS {
    public static volatile C2QS A05;
    public final AbstractC000600i A00;
    public final C001200o A01;
    public final AnonymousClass035 A02;
    public final C004902f A03;
    public final InterfaceC002901k A04;

    public C2QS(AbstractC000600i abstractC000600i, C001200o c001200o, InterfaceC002901k interfaceC002901k, C004902f c004902f, AnonymousClass035 anonymousClass035) {
        this.A00 = abstractC000600i;
        this.A01 = c001200o;
        this.A04 = interfaceC002901k;
        this.A03 = c004902f;
        this.A02 = anonymousClass035;
    }

    public static C2QS A00() {
        if (A05 == null) {
            synchronized (C2QS.class) {
                if (A05 == null) {
                    A05 = new C2QS(AbstractC000600i.A00(), C001200o.A01, C002801j.A00(), C004902f.A00(), AnonymousClass035.A00());
                }
            }
        }
        return A05;
    }

    public final void A01(final File file) {
        if (file.exists()) {
            AbstractC000600i abstractC000600i = this.A00;
            String A052 = abstractC000600i.A05();
            C05070Ne c05070Ne = new C05070Ne(this.A02, "https://crashlogs.whatsapp.net/wa_clb_data", this.A03.A02(), new InterfaceC05060Nd() { // from class: X.2U5
                @Override // X.InterfaceC05060Nd
                public void AJD(long j) {
                }

                @Override // X.InterfaceC05060Nd
                public void AJz(Map map, String str) {
                    String substring = AnonymousClass024.A0j(str) ? "" : str.substring(0, Math.min(str.length(), 500));
                    AbstractC000600i abstractC000600i2 = C2QS.this.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(file.length()));
                    sb.append(":uploadServiceError:");
                    sb.append(substring);
                    abstractC000600i2.A09("voip-time-series-upload-fail", sb.toString(), false);
                }

                @Override // X.InterfaceC05060Nd
                public void AO0(Map map, String str) {
                    C2QS.this.A00.A09("voip-time-series-upload-success", String.valueOf(file.length()), false);
                }
            }, false, false);
            c05070Ne.A0C.add(Pair.create("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af"));
            List list = c05070Ne.A0D;
            list.add(Pair.create("from", A052));
            list.add(Pair.create("tags", "voip_time_series"));
            try {
                try {
                    c05070Ne.A05(new FileInputStream(file), "file", file.getName(), 0L, file.length());
                    c05070Ne.A01(null);
                    if (file.delete()) {
                        return;
                    }
                } catch (IOException e) {
                    Log.w("app/VoiceService: could not upload dummy time series log data", e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(file.length()));
                    sb.append(":uploadError:");
                    abstractC000600i.A09("voip-time-series-upload-fail", sb.toString(), true);
                    if (file.delete()) {
                        return;
                    }
                }
                Log.i("app/VoiceService: dummy time series log could not be deleted");
            } catch (Throwable th) {
                if (!file.delete()) {
                    Log.i("app/VoiceService: dummy time series log could not be deleted");
                }
                throw th;
            }
        }
    }

    public void A02(String str, WamCall wamCall) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            this.A04.AS1(new RunnableEBaseShape1S0300000_I0_1(this, wamCall, file, 2));
        } else {
            Log.w("app/VoipTimeSeriesLogger: uploadTimeSeries received bad directory path, skipping upload.");
        }
    }
}
