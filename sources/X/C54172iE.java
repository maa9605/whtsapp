package X;

import com.whatsapp.Conversation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2iE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54172iE {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<C09750eh> set = this.A00;
        synchronized (set) {
            if (set.isEmpty()) {
                return;
            }
            for (C09750eh c09750eh : set) {
                Conversation conversation = c09750eh.A00;
                conversation.A3g.A0B(true);
                conversation.A3g.A09();
            }
        }
    }

    public void A01() {
        Set set = this.A00;
        synchronized (set) {
            if (set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
