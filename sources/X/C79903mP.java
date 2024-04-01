package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3mP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79903mP extends C2DX {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;

    public C79903mP(int i) {
        super(i);
    }

    @Override // X.C2DX
    public JSONObject A00() {
        JSONObject A00 = super.A00();
        try {
            Boolean bool = this.A00;
            if (bool != null) {
                A00.put("flash_call_end_success", bool);
            }
            Boolean bool2 = this.A02;
            if (bool2 != null) {
                A00.put("no_flash_call_id_received", bool2);
            }
            Boolean bool3 = this.A01;
            if (bool3 != null) {
                A00.put("invalid_flash_call_received", bool3);
            }
        } catch (JSONException unused) {
        }
        return A00;
    }
}
