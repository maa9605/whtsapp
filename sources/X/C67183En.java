package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.util.WhatsAppLibLoader;

/* renamed from: X.3En  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67183En extends C2H2 {
    public C18E A00;
    public final /* synthetic */ LocationPicker2 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67183En(LocationPicker2 locationPicker2, C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C455822q c455822q, C018508q c018508q, C2MB c2mb, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C43871y8 c43871y8, C018608r c018608r, C47682Ce c47682Ce, C018308n c018308n, C41471ty c41471ty, C0L7 c0l7, C02E c02e, C40071rX c40071rX, C002301c c002301c, C0C9 c0c9, C62842ye c62842ye, WhatsAppLibLoader whatsAppLibLoader, C2MI c2mi, C41451tw c41451tw, C02F c02f, C000500h c000500h, C0IK c0ik, C41461tx c41461tx, C02O c02o, C0LF c0lf) {
        super(c001200o, anonymousClass012, c003701t, c455822q, c018508q, c2mb, abstractC000600i, c02l, interfaceC002901k, c40081rY, c43871y8, c018608r, c47682Ce, c018308n, c41471ty, c0l7, c02e, c40071rX, c002301c, c0c9, c62842ye, whatsAppLibLoader, c2mi, c41451tw, c02f, c000500h, c0ik, c41461tx, c02o, c0lf);
        this.A01 = locationPicker2;
        this.A00 = new C18E() { // from class: X.3Em
            @Override // X.C18E
            public void AID() {
            }

            @Override // X.C18E
            public void AKU() {
            }
        };
    }

    @Override // X.C2H2, android.location.LocationListener
    public void onLocationChanged(Location location) {
        C0S8 c0s8;
        if (location == null) {
            return;
        }
        LocationPicker2 locationPicker2 = this.A01;
        if (locationPicker2.A0N.A06 == null && (c0s8 = locationPicker2.A01) != null) {
            c0s8.A09(AnonymousClass088.A0U(new LatLng(location.getLatitude(), location.getLongitude())));
        }
        if (locationPicker2.A0N.A0s && locationPicker2.A01 != null) {
            if (locationPicker2.A05 == null) {
                A04();
            }
            LocationPicker2.A00(locationPicker2, new LatLng(location.getLatitude(), location.getLongitude()));
        }
        if (locationPicker2.A0N.A0r && locationPicker2.A01 != null) {
            locationPicker2.A01.A08(AnonymousClass088.A0U(new LatLng(location.getLatitude(), location.getLongitude())));
        }
        locationPicker2.A0M.A06 = location;
        super.onLocationChanged(location);
    }
}
