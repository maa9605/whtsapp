package X;

import android.location.Location;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2Hk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48922Hk extends C2GV {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48922Hk(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C2IY c2iy, C018308n c018308n, C0L5 c0l5, C41471ty c41471ty, C0L7 c0l7, C05W c05w, C018708s c018708s, C002301c c002301c, AnonymousClass008 anonymousClass008, C00A c00a, C03320Ff c03320Ff, C02F c02f, C0IK c0ik, C41461tx c41461tx, C0LF c0lf, C03360Fk c03360Fk, C2AX c2ax, C010605h c010605h) {
        super(anonymousClass012, c018508q, c02l, c2iy, c018308n, c0l5, c41471ty, c0l7, c05w, c018708s, c002301c, anonymousClass008, c00a, c03320Ff, c02f, c0ik, c41461tx, c0lf, c03360Fk, c2ax, c010605h);
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.C2GV
    public void A0B() {
        super.A0B();
        this.A00.A1R();
    }

    @Override // X.C2GV, android.location.LocationListener
    public void onLocationChanged(Location location) {
        super.onLocationChanged(location);
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        if (!groupChatLiveLocationsActivity.A0M.A0s || location == null) {
            return;
        }
        if (groupChatLiveLocationsActivity.A05 != null) {
            groupChatLiveLocationsActivity.A05.A08(C07K.A0h(new C016007m(location.getLatitude(), location.getLongitude())), 1500, null);
            return;
        }
        throw null;
    }
}
