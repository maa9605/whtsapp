package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.25B  reason: invalid class name */
/* loaded from: classes2.dex */
public class C25B {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final long A0C;
    public final boolean A0D;

    public C25B(long j, int i, int i2, int i3, boolean z) {
        this.A0C = j;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }

    public C25B(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, int i2, int i3, boolean z) {
        this.A01 = j;
        this.A00 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = j5;
        this.A02 = j6;
        this.A03 = j7;
        this.A06 = j8;
        this.A08 = j9;
        this.A0C = j10;
        this.A0A = i;
        this.A0B = i2;
        this.A09 = i3;
        this.A0D = z;
    }

    public static C25B A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C25B(jSONObject.optLong("bytesSent"), jSONObject.optLong("bytesReceived"), jSONObject.optLong("countMessageSent"), jSONObject.optLong("countMessageReceived"), jSONObject.optLong("countUploaded"), jSONObject.optLong("countDownloaded"), jSONObject.optLong("countForward"), jSONObject.optLong("countShared"), jSONObject.optLong("countViewed"), jSONObject.optLong("transferDate"), jSONObject.optInt("mediaType"), jSONObject.optInt("transferRadio"), jSONObject.optInt("mediaTransferOrigin"), jSONObject.optBoolean("isAutoDownload"));
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }
}
