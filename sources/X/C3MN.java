package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* renamed from: X.3MN  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3MN {
    public final C001200o A00;
    public final C005102h A01;
    public final C002301c A02;

    public C3MN(C001200o c001200o, C002301c c002301c, C005102h c005102h) {
        this.A00 = c001200o;
        this.A02 = c002301c;
        this.A01 = c005102h;
    }

    public final C005402l A00() {
        C001200o c001200o = this.A00;
        Intent intent = new Intent(c001200o.A00, GoogleMigrateImporterActivity.class);
        intent.setAction(GoogleMigrateImporterActivity.A0F);
        C005402l A00 = C0DU.A00(c001200o.A00);
        A00.A0J = "other_notifications@1";
        int i = Build.VERSION.SDK_INT;
        A00.A03 = i >= 26 ? -1 : -2;
        A00.A09 = PendingIntent.getActivity(c001200o.A00, 0, intent, 0);
        A00.A07.icon = R.drawable.notifybar;
        if (i >= 21) {
            A00.A06 = 1;
        }
        return A00;
    }

    public final void A01(String str, String str2, int i, boolean z) {
        boolean z2 = i == -1;
        C005402l A00 = A00();
        int i2 = 100;
        if (z2) {
            i2 = 0;
            i = 0;
        }
        A00.A05 = i2;
        A00.A04 = i;
        A00.A0T = false;
        A00.A05(16, z);
        A00.A05(2, z2);
        A00.A0A(str);
        A00.A09(str2);
        this.A01.A03(null, 31, A00.A01());
    }
}
