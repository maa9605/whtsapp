package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2Hj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48912Hj extends C2GV {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48912Hj(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C2IY c2iy, C018308n c018308n, C0L5 c0l5, C41471ty c41471ty, C0L7 c0l7, C05W c05w, C018708s c018708s, C002301c c002301c, AnonymousClass008 anonymousClass008, C00A c00a, C03320Ff c03320Ff, C02F c02f, C0IK c0ik, C41461tx c41461tx, C0LF c0lf, C03360Fk c03360Fk, C2AX c2ax, C010605h c010605h) {
        super(anonymousClass012, c018508q, c02l, c2iy, c018308n, c0l5, c41471ty, c0l7, c05w, c018708s, c002301c, anonymousClass008, c00a, c03320Ff, c02f, c0ik, c41461tx, c0lf, c03360Fk, c2ax, c010605h);
        this.A00 = groupChatLiveLocationsActivity2;
    }

    @Override // X.C2GV
    public void A0B() {
        super.A0B();
        this.A00.A1R();
    }

    @Override // X.C2GV, android.location.LocationListener
    public void onLocationChanged(Location location) {
        super.onLocationChanged(location);
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        if (groupChatLiveLocationsActivity2.A0N.A0s && location != null) {
            if (groupChatLiveLocationsActivity2.A06 != null) {
                groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass088.A0U(new LatLng(location.getLatitude(), location.getLongitude())), groupChatLiveLocationsActivity2.A05);
            } else {
                throw null;
            }
        }
        groupChatLiveLocationsActivity2.A0M.A06 = location;
    }
}
