package X;

import android.location.Address;
import android.location.Geocoder;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2yY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC62782yY extends RunnableEmptyBase implements Runnable {
    public double A00;
    public double A01;
    public final /* synthetic */ C2H2 A02;

    public RunnableC62782yY(C2H2 c2h2, double d, double d2) {
        this.A02 = c2h2;
        this.A00 = d;
        this.A01 = d2;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string;
        List<Address> fromLocation;
        C2H2 c2h2 = this.A02;
        Address address = null;
        try {
            fromLocation = new Geocoder(c2h2.A0X.getApplicationContext(), c2h2.A18.A0I()).getFromLocation(this.A00, this.A01, 1);
        } catch (Exception unused) {
        }
        if (fromLocation != null && !fromLocation.isEmpty()) {
            address = fromLocation.get(0);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(address.getAddressLine(i));
            }
            string = sb.toString();
            C018508q c018508q = c2h2.A0y;
            c018508q.A02.post(new RunnableEBaseShape1S1200000_I1(this, address, string, 1));
        }
        string = c2h2.A0X.getString(R.string.location_no_address);
        C018508q c018508q2 = c2h2.A0y;
        c018508q2.A02.post(new RunnableEBaseShape1S1200000_I1(this, address, string, 1));
    }
}
