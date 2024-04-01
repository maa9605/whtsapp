package X;

import org.json.JSONObject;

/* renamed from: X.46q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C893446q {
    public final int A00;
    public final int A01;
    public final String A02;

    public C893446q(JSONObject jSONObject) {
        this.A01 = jSONObject.getInt("offset");
        this.A00 = jSONObject.getInt("length");
        this.A02 = jSONObject.getString("url");
    }
}
