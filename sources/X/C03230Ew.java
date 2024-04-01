package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.0Ew */
/* loaded from: classes.dex */
public class C03230Ew implements C08o {
    public static volatile C03230Ew A02;
    public final C018308n A00;
    public final C0ED A01;

    public C03230Ew(C018308n c018308n, C0ED c0ed) {
        this.A00 = c018308n;
        this.A01 = c0ed;
    }

    public static C03230Ew A00() {
        if (A02 == null) {
            synchronized (C03230Ew.class) {
                if (A02 == null) {
                    A02 = new C03230Ew(C018308n.A02(), C0ED.A01());
                }
            }
        }
        return A02;
    }

    @Override // X.C08o
    public void AS7(Context context, Uri uri) {
        if (uri == null) {
            Log.e("linklauncher/start-activity/uri-is-null");
            return;
        }
        String A00 = AcceptInviteLinkActivity.A00(uri);
        if (!TextUtils.isEmpty(A00)) {
            Intent intent = new Intent(context, AcceptInviteLinkActivity.class);
            intent.putExtra("code", A00);
            this.A00.A06(context, intent);
        } else if (this.A01.A04(uri) != 1) {
            Intent intent2 = new Intent(context, DeepLinkActivity.class);
            intent2.setData(uri);
            intent2.putExtra("source", 2);
            this.A00.A06(context, intent2);
        } else {
            final C4GE c4ge = (C4GE) ((C0C5) AnonymousClass029.A0X(context.getApplicationContext())).A1p();
            if (c4ge != null) {
                List list = c4ge.A05;
                if (!list.isEmpty() && ((C2Lo) c4ge.A01.get()).A00.A0E(C01C.A0U)) {
                    for (int i = 0; i < list.size(); i++) {
                        final Intent AQc = ((InterfaceC90374At) list.get(i)).AQc(context, uri);
                        if (AQc != null) {
                            final WeakReference weakReference = new WeakReference(context);
                            ((C2MU) c4ge.A04.get()).A00(context).A01(C50162Qh.class, c4ge, new C2Qk() { // from class: X.2Qj
                                @Override // X.C2Qk
                                public final void AK4(Object obj) {
                                    c4ge.A01(weakReference, AQc, (C50162Qh) obj);
                                }
                            });
                            c4ge.A00(context, AQc);
                            return;
                        }
                    }
                }
                this.A00.AS7(context, uri);
                return;
            }
            throw null;
        }
    }
}
