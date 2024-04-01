package X;

import com.google.android.search.verification.client.R;
import java.util.HashMap;

/* renamed from: X.00W  reason: invalid class name */
/* loaded from: classes.dex */
public class C00W {
    public static final C00W A01 = new C00W();
    public final C07E A00;

    public C00W() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.whatsapp.intrumentation.sample", Integer.valueOf((int) R.string.instrumentation_sample_device_name));
        hashMap.put("com.facebook.assistantplayground", Integer.valueOf((int) R.string.assistant_playground_device_name));
        Integer valueOf = Integer.valueOf((int) R.string.stella_device_name);
        hashMap.put("com.facebook.stella_debug", valueOf);
        hashMap.put("com.facebook.stella", valueOf);
        this.A00 = new C07E(hashMap, null);
    }
}
