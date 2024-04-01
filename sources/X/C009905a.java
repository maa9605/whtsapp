package X;

import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.05a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C009905a {
    public static final C009905a A02 = new C009905a();
    public final List A00 = new ArrayList();
    public final Map A01 = new HashMap();

    public static final DeviceJid A00(AnonymousClass094 anonymousClass094, DeviceJid deviceJid) {
        if (deviceJid != null) {
            return deviceJid;
        }
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j instanceof UserJid) {
            DeviceJid of = DeviceJid.of(abstractC005302j);
            if (of != null) {
                return of;
            }
            throw null;
        }
        return null;
    }

    public void A01(AnonymousClass094 anonymousClass094, DeviceJid deviceJid) {
        Map map = this.A01;
        synchronized (map) {
            Set set = (Set) map.get(anonymousClass094);
            if (set == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("in-flight-messages/no message to remove: ");
                sb.append(anonymousClass094);
                sb.append(" : ");
                sb.append(deviceJid);
                Log.w(sb.toString());
                return;
            }
            if (!set.remove(A00(anonymousClass094, deviceJid))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("in-flight-messages/no message to remove for target: ");
                sb2.append(anonymousClass094);
                sb2.append(" : ");
                sb2.append(deviceJid);
                Log.w(sb2.toString());
            }
            if (set.isEmpty()) {
                map.remove(anonymousClass094);
            }
        }
    }

    public void A02(String str, Message message, boolean z) {
        List list = this.A00;
        synchronized (list) {
            list.add(new C0QW(str, message, z));
        }
    }
}
