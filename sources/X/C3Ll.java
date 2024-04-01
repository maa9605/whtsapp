package X;

import android.content.Context;
import android.location.Location;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.3Ll  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3Ll extends C2K5 {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Ll(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, Context context, C18350tb c18350tb) {
        super(context, c18350tb);
        this.A00 = groupChatLiveLocationsActivity;
    }

    @Override // X.C2K5
    public Location getMyLocation() {
        Location location;
        C2GV c2gv = this.A00.A0M;
        return (c2gv == null || (location = c2gv.A0J) == null) ? super.getMyLocation() : location;
    }
}
