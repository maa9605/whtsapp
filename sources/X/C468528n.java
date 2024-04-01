package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.28n */
/* loaded from: classes2.dex */
public class C468528n {
    public boolean A01;
    public final C22H A02;
    public final List A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final List A03 = new ArrayList();
    public int A00 = 0;

    public C468528n(C468428m c468428m) {
        this.A02 = c468428m.A07;
        this.A01 = c468428m.A04;
        this.A07 = c468428m.A05;
        this.A08 = c468428m.A06;
        this.A06 = c468428m.A03;
        this.A04 = c468428m.A01;
        this.A05 = c468428m.A02;
        C468328l c468328l = c468428m.A00;
        this.A0A = c468328l.A01;
        this.A0D = c468328l.A04;
        this.A0E = c468328l.A05;
        this.A09 = c468328l.A00;
        this.A0B = c468328l.A02;
        this.A0C = c468328l.A03;
    }

    public static C468528n A00(String str) {
        C22H c22h;
        JSONObject jSONObject = new JSONObject(str);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (jSONObject.has("sync_jid_hash")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sync_jid_hash");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(Base64.decode((String) jSONArray.get(i2), 0));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("sync_jid")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("sync_jid");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                UserJid nullable = UserJid.getNullable((String) jSONArray2.get(i3));
                if (nullable != null) {
                    arrayList2.add(nullable);
                }
            }
        }
        int i4 = jSONObject.getInt("sync_type_code");
        C22H[] values = C22H.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                c22h = null;
                break;
            }
            c22h = values[i];
            if (c22h.code == i4) {
                break;
            }
            i++;
        }
        C468428m c468428m = new C468428m(c22h);
        c468428m.A04 = jSONObject.getBoolean("sync_is_urgent");
        c468428m.A05 = jSONObject.getBoolean("sync_only_if_changed");
        c468428m.A06 = jSONObject.getBoolean("sync_only_if_registered");
        c468428m.A03 = jSONObject.getBoolean("sync_clear_whatsapp_sync_data");
        boolean optBoolean = jSONObject.optBoolean("sync_contact", true);
        boolean optBoolean2 = jSONObject.optBoolean("sync_sidelist", true);
        boolean optBoolean3 = jSONObject.optBoolean("sync_status", true);
        jSONObject.optBoolean("sync_picture", true);
        c468428m.A00 = new C468328l(optBoolean, optBoolean2, optBoolean3, jSONObject.optBoolean("sync_business", true), jSONObject.optBoolean("sync_devices", true), jSONObject.optBoolean("sync_payment", true));
        C468428m.A00(c468428m, arrayList);
        c468428m.A02.addAll(arrayList2);
        C468528n A01 = c468428m.A01();
        A01.A00 = jSONObject.getInt("sync_retry_count");
        if (jSONObject.getBoolean("sync_should_retry")) {
            A01.A03.add(new C469028s(true));
        }
        return A01;
    }

    public String A01() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sync_type_code", this.A02.code);
        jSONObject.put("sync_is_urgent", this.A01);
        jSONObject.put("sync_only_if_changed", this.A07);
        jSONObject.put("sync_only_if_registered", this.A08);
        jSONObject.put("sync_clear_whatsapp_sync_data", this.A06);
        jSONObject.put("sync_should_retry", A02());
        jSONObject.put("sync_retry_count", this.A00);
        jSONObject.put("sync_contact", this.A0A);
        jSONObject.put("sync_sidelist", this.A0D);
        jSONObject.put("sync_status", this.A0E);
        jSONObject.put("sync_picture", false);
        List<byte[]> list = this.A04;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (byte[] bArr : list) {
                arrayList.add(Base64.encodeToString(bArr, 0));
            }
            jSONObject.put("sync_jid_hash", new JSONArray((Collection) arrayList));
        }
        Set<Jid> set = this.A05;
        if (!set.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Jid jid : set) {
                arrayList2.add(jid.getRawString());
            }
            jSONObject.put("sync_jid", new JSONArray((Collection) arrayList2));
        }
        return jSONObject.toString();
    }

    public boolean A02() {
        for (C469028s c469028s : this.A03) {
            if (c469028s.A00) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncRequest, mode=");
        C22H c22h = this.A02;
        A0P.append(c22h.mode.modeString);
        A0P.append(", context=");
        A0P.append(c22h.context.contextString);
        A0P.append(", protocols=");
        A0P.append(this.A0A ? "C" : "");
        A0P.append(this.A0D ? "I" : "");
        A0P.append(this.A0E ? "S" : "");
        A0P.append(this.A09 ? "B" : "");
        A0P.append(this.A0B ? "D" : "");
        A0P.append(this.A0C ? "P" : "");
        return A0P.toString();
    }
}
