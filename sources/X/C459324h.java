package X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.24h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C459324h {
    public static final C07E A00;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("deleteChat", Arrays.asList("pin", "mute", "clearChat", "deleteChat", "archive", "star", "markChatAsRead", "deleteMessageForMe"));
        hashMap.put("clearChat", Arrays.asList("clearChat", "deleteChat", "star", "deleteMessageForMe"));
        hashMap.put("archive", Collections.singletonList("pin"));
        hashMap.put("deleteMessageForMe", Collections.singletonList("star"));
        A00 = new C07E(hashMap, null);
    }

    public static Pair A00(AbstractC44611zM abstractC44611zM) {
        AbstractC005302j A8o;
        AnonymousClass094 anonymousClass094;
        if (abstractC44611zM instanceof InterfaceC44781zd) {
            InterfaceC44781zd interfaceC44781zd = (InterfaceC44781zd) abstractC44611zM;
            A8o = interfaceC44781zd.A8o();
            anonymousClass094 = interfaceC44781zd.ABG();
        } else if (abstractC44611zM instanceof InterfaceC44621zN) {
            A8o = ((InterfaceC44621zN) abstractC44611zM).A8o();
            anonymousClass094 = null;
        } else {
            StringBuilder A0P = C000200d.A0P("SyncdCrossIndexDependencyUtil/getValues: ");
            A0P.append(abstractC44611zM.A03());
            A0P.append(" mutation needs to implement either MessageKeyProvider or ChatJidProvider");
            throw new IllegalArgumentException(A0P.toString());
        }
        return new Pair(A8o, anonymousClass094);
    }
}
