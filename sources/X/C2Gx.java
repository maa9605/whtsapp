package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Gx  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Gx {
    public final Map A00 = new HashMap();

    public C2Gx() {
    }

    public C2Gx(C42611w2 c42611w2) {
        A04(c42611w2);
    }

    public Bundle A00() {
        Bundle bundle = new Bundle();
        A03(bundle);
        return bundle;
    }

    public C42611w2 A01(Uri uri) {
        Map map = this.A00;
        C42611w2 c42611w2 = (C42611w2) map.get(uri);
        if (c42611w2 == null) {
            Log.e("mediapreviewparams/get/item should be explicitly added");
            C42611w2 c42611w22 = new C42611w2(uri);
            map.put(uri, c42611w22);
            return c42611w22;
        }
        return c42611w2;
    }

    public void A02(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("media_preview_params");
        if (bundle2 != null) {
            Map map = this.A00;
            map.clear();
            ArrayList<C52322aX> parcelableArrayList = bundle2.getParcelableArrayList("items");
            if (parcelableArrayList != null) {
                for (C52322aX c52322aX : parcelableArrayList) {
                    C42611w2 c42611w2 = c52322aX.A00;
                    map.put(c42611w2.A0F, c42611w2);
                }
            }
        }
    }

    public final void A03(Bundle bundle) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C42611w2 c42611w2 : this.A00.values()) {
            arrayList.add(new C52322aX(c42611w2));
        }
        bundle.putParcelableArrayList("items", arrayList);
    }

    public void A04(C42611w2 c42611w2) {
        Map map = this.A00;
        Uri uri = c42611w2.A0F;
        if (map.containsKey(uri)) {
            Log.e("mediapreviewparams/add/item was already added");
        }
        map.put(uri, c42611w2);
    }
}
