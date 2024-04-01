package X;

import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2hr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53982hr implements InterfaceC53992hs {
    public final /* synthetic */ StorageUsageActivity A00;

    public C53982hr(StorageUsageActivity storageUsageActivity) {
        this.A00 = storageUsageActivity;
    }

    @Override // X.InterfaceC53992hs
    public void AIM(C60092tu c60092tu) {
        Log.i("storage-usage-activity/fetch chats/completed");
        StorageUsageActivity storageUsageActivity = this.A00;
        ArrayList arrayList = c60092tu.A00;
        storageUsageActivity.A0U = arrayList;
        StorageUsageActivity.A01(storageUsageActivity, arrayList, null, true);
        C018508q c018508q = storageUsageActivity.A04;
        c018508q.A02.post(new RunnableEBaseShape7S0100000_I0_7(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        r4.add(r5);
     */
    @Override // X.InterfaceC53992hs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AIN(X.C60102tv r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53982hr.AIN(X.2tv):void");
    }

    @Override // X.InterfaceC53992hs
    public void AJG(AbstractC005302j abstractC005302j, C27631Od c27631Od) {
        C018508q c018508q = this.A00.A04;
        c018508q.A02.post(new RunnableEBaseShape0S0300000_I0_0(this, abstractC005302j, c27631Od, 47));
    }
}
