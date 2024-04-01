package X;

import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3qB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82233qB extends C00T {
    public final /* synthetic */ StatusPlaybackContactFragment A00;

    public C82233qB(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        this.A00 = statusPlaybackContactFragment;
    }

    @Override // X.C00T
    public void A08(AnonymousClass092 anonymousClass092, int i) {
        C09H c09h;
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A00;
        if (statusPlaybackContactFragment.A0S == null || !C011405q.A03(statusPlaybackContactFragment.A0K) || anonymousClass092 == null) {
            return;
        }
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (C003101m.A0Z(anonymousClass094.A00) && anonymousClass094.A02) {
            C53962ho A14 = statusPlaybackContactFragment.A14();
            A14.A0C.A06.clear();
            int i2 = 0;
            for (AnonymousClass092 anonymousClass0922 : statusPlaybackContactFragment.A0S) {
                if ((anonymousClass0922 instanceof AnonymousClass097) && (c09h = ((AnonymousClass097) anonymousClass0922).A02) != null && !c09h.A0P && !c09h.A0a) {
                    A14.A0C.A06.add(Integer.valueOf(i2));
                }
                if (i2 == statusPlaybackContactFragment.A00 && anonymousClass0922.A0n.equals(anonymousClass094)) {
                    statusPlaybackContactFragment.A1C(anonymousClass092);
                }
                i2++;
            }
        }
    }

    @Override // X.C00T
    public void A0B(Collection collection, Map map, Map map2) {
        List list;
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A00;
        if (statusPlaybackContactFragment.A0S == null) {
            return;
        }
        int i = statusPlaybackContactFragment.A00;
        boolean z = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass094 anonymousClass094 = ((AnonymousClass092) it.next()).A0n;
            if (anonymousClass094.A02 && C003101m.A0Z(anonymousClass094.A00) && (list = statusPlaybackContactFragment.A0S) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        AnonymousClass092 anonymousClass092 = (AnonymousClass092) it2.next();
                        if (anonymousClass092.A0n.equals(anonymousClass094)) {
                            z = true;
                            int indexOf = statusPlaybackContactFragment.A0S.indexOf(anonymousClass092);
                            if (indexOf >= 0) {
                                statusPlaybackContactFragment.A0S.remove(indexOf);
                                if (indexOf < statusPlaybackContactFragment.A00) {
                                    i--;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            statusPlaybackContactFragment.A02.A02.post(new RunnableEBaseShape1S0201000_I1(this, i, collection, 4));
        }
    }
}
