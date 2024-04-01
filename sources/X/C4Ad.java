package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.4Ad  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4Ad extends Intent {
    public C4Ad(Context context, String str, String str2, boolean z) {
        super(context, WaBloksActivity.class);
        HashMap hashMap;
        Serializable serializableExtra = getSerializableExtra("screen_params");
        if (serializableExtra == null) {
            hashMap = new HashMap();
        } else {
            hashMap = (HashMap) serializableExtra;
        }
        hashMap.put("params", str2);
        putExtra("screen_params", hashMap);
        putExtra("screen_name", str);
        putExtra("has_options", z);
        if (z) {
            putExtra("options_key", str2);
        }
    }
}
