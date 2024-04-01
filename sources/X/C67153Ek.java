package X;

import android.location.Location;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.util.WhatsAppLibLoader;

/* renamed from: X.3Ek  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67153Ek extends C2H2 {
    public InterfaceC18270tS A00;
    public final /* synthetic */ LocationPicker A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67153Ek(LocationPicker locationPicker, C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C455822q c455822q, C018508q c018508q, C2MB c2mb, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C43871y8 c43871y8, C018608r c018608r, C47682Ce c47682Ce, C018308n c018308n, C41471ty c41471ty, C0L7 c0l7, C02E c02e, C40071rX c40071rX, C002301c c002301c, C0C9 c0c9, C62842ye c62842ye, WhatsAppLibLoader whatsAppLibLoader, C2MI c2mi, C41451tw c41451tw, C02F c02f, C000500h c000500h, C0IK c0ik, C41461tx c41461tx, C02O c02o, C0LF c0lf) {
        super(c001200o, anonymousClass012, c003701t, c455822q, c018508q, c2mb, abstractC000600i, c02l, interfaceC002901k, c40081rY, c43871y8, c018608r, c47682Ce, c018308n, c41471ty, c0l7, c02e, c40071rX, c002301c, c0c9, c62842ye, whatsAppLibLoader, c2mi, c41451tw, c02f, c000500h, c0ik, c41461tx, c02o, c0lf);
        this.A01 = locationPicker;
        this.A00 = new InterfaceC18270tS() { // from class: X.3Ej
            @Override // X.InterfaceC18270tS
            public void AID() {
            }

            @Override // X.InterfaceC18270tS
            public void AKU() {
            }
        };
    }

    @Override // X.C2H2, android.location.LocationListener
    public void onLocationChanged(Location location) {
        C0T4 c0t4;
        if (location == null) {
            return;
        }
        LocationPicker locationPicker = this.A01;
        if (locationPicker.A0O.A06 == null && (c0t4 = locationPicker.A03) != null) {
            c0t4.A08(C07K.A0h(new C016007m(location.getLatitude(), location.getLongitude())), 0, null);
        }
        if (locationPicker.A0O.A0s && locationPicker.A03 != null) {
            if (locationPicker.A07 == null) {
                A04();
            }
            LocationPicker.A00(locationPicker, new C016007m(location.getLatitude(), location.getLongitude()));
        }
        if (locationPicker.A0O.A0r && locationPicker.A03 != null) {
            locationPicker.A03.A08(C07K.A0h(new C016007m(location.getLatitude(), location.getLongitude())), 1500, null);
        }
        super.onLocationChanged(location);
    }
}
