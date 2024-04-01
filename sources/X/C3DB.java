package X;

import com.whatsapp.voipcalling.Voip;
import org.json.JSONObject;

/* renamed from: X.3DB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DB extends AbstractC03000Dt {
    public final C0F0 A00;
    public final C49032Ic A01;
    public final C41641uH A02;

    public C3DB(C49032Ic c49032Ic, C0F0 c0f0, C41641uH c41641uH) {
        this.A01 = c49032Ic;
        this.A00 = c0f0;
        this.A02 = c41641uH;
    }

    public String A00(C07F c07f, JSONObject jSONObject) {
        if (!this.A00.A03(c07f, jSONObject.getJSONObject("payload").getString("call_id")).equals(Voip.getCurrentCallId())) {
            return AbstractC03000Dt.A00(17, "There is no call with that call id");
        }
        C41641uH c41641uH = this.A02;
        c41641uH.A00.obtainMessage(1, this.A01).sendToTarget();
        return AbstractC03000Dt.A01(null);
    }
}
