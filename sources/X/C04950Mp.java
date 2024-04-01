package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.0Mp */
/* loaded from: classes.dex */
public class C04950Mp {
    public static final int[] A03 = {1, 2, 3, 5, 14, 30};
    public static volatile C04950Mp A04;
    public final AnonymousClass012 A00;
    public final C000500h A01;
    public final C002301c A02;

    public C04950Mp(AnonymousClass012 anonymousClass012, C002301c c002301c, C000500h c000500h) {
        this.A00 = anonymousClass012;
        this.A02 = c002301c;
        this.A01 = c000500h;
    }

    public static C04950Mp A00() {
        if (A04 == null) {
            synchronized (C04950Mp.class) {
                if (A04 == null) {
                    A04 = new C04950Mp(AnonymousClass012.A00(), C002301c.A00(), C000500h.A00());
                }
            }
        }
        return A04;
    }

    public int A01(C005002g c005002g) {
        int[] iArr;
        C000500h c000500h = this.A01;
        long j = c000500h.A00.getLong("software_expiration_last_warned", 0L);
        long A05 = this.A00.A05();
        if (86400000 + j > A05) {
            Log.i("software/expiration/suppress/24h");
            return -1;
        }
        Date A02 = c005002g.A02();
        int time = ((int) ((A02.getTime() - A05) / 86400000)) + 1;
        int time2 = ((int) ((A02.getTime() - j) / 86400000)) + 1;
        for (int i : A03) {
            if (time <= i && time2 > i) {
                C000200d.A0h(c000500h, "software_expiration_last_warned", A05);
                return time;
            }
        }
        return -1;
    }

    public Dialog A02(final Activity activity, final C09I c09i, C005002g c005002g) {
        int time = ((int) ((c005002g.A02().getTime() - this.A00.A05()) / 86400000)) + 1;
        C019208x c019208x = new C019208x(activity);
        c019208x.A03(R.string.software_about_to_expire_title);
        c019208x.A01.A0E = this.A02.A0A(R.plurals.software_about_to_expire, time, Integer.valueOf(time));
        c019208x.A06(R.string.upgrade, new DialogInterface.OnClickListener() { // from class: X.1Ic
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Activity activity2 = activity;
                C09I c09i2 = c09i;
                C002701i.A18(activity2, 115);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(c09i2.A01());
                activity2.startActivity(intent);
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.1Id
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C002701i.A18(activity, 115);
            }
        });
        return c019208x.A00();
    }
}
