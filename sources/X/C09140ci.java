package X;

import android.graphics.BitmapFactory;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.0ci  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09140ci implements InterfaceC06360St {
    public final /* synthetic */ AcceptInviteLinkActivity A00;

    public C09140ci(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A00 = acceptInviteLinkActivity;
    }

    public /* synthetic */ void A00(byte[] bArr) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        if (acceptInviteLinkActivity.AFE()) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("AcceptInviteLinkActivity/fetchGroupProfilePicture: ");
        A0P.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
        Log.i(A0P.toString());
        if (bArr != null) {
            acceptInviteLinkActivity.A0A.A00(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        }
    }

    @Override // X.InterfaceC06360St
    public void AJp(int i) {
        C000200d.A0r("acceptlink/failed-to-get-group-photo/", i);
    }

    @Override // X.InterfaceC06360St
    public void AKu(C011005l c011005l, String str, String str2, String str3, final byte[] bArr) {
        C018508q c018508q = ((ActivityC02290Ap) this.A00).A0A;
        c018508q.A02.post(new Runnable() { // from class: X.1FN
            @Override // java.lang.Runnable
            public final void run() {
                C09140ci.this.A00(bArr);
            }
        });
    }
}
