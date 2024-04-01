package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3mO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79893mO extends C2DX {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;

    public C79893mO(int i) {
        super(i);
    }

    @Override // X.C2DX
    public JSONObject A00() {
        JSONObject A00 = super.A00();
        try {
            Integer num = this.A03;
            if (num != null) {
                A00.put("is_sim_number", num);
            }
            Boolean bool = this.A01;
            if (bool != null) {
                A00.put("is_sim_absent", bool);
            }
            Boolean bool2 = this.A00;
            if (bool2 != null) {
                A00.put("is_permission_granted", bool2);
            }
            Boolean bool3 = this.A02;
            if (bool3 != null) {
                A00.put("isUserChoosingToMigrateFromConsumerAppDirectly", bool3);
            }
        } catch (JSONException unused) {
        }
        return A00;
    }
}
