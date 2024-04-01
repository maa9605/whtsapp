package X;

import android.os.Bundle;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3YS  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3YS extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ StorageUsageGalleryActivity A03;

    public /* synthetic */ C3YS(StorageUsageGalleryActivity storageUsageGalleryActivity, long j, long j2, int i) {
        this.A03 = storageUsageGalleryActivity;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StorageUsageGalleryActivity storageUsageGalleryActivity = this.A03;
        long j = this.A01;
        long j2 = this.A02;
        int i = this.A00;
        Log.i("storage-usage-gallery-activity/message delete completed");
        storageUsageGalleryActivity.ARS();
        storageUsageGalleryActivity.A02 += j;
        storageUsageGalleryActivity.A1Q();
        String str = storageUsageGalleryActivity.A0h;
        int i2 = storageUsageGalleryActivity.A00;
        AnonymousClass011 anonymousClass011 = storageUsageGalleryActivity.A0R;
        C09520eE c09520eE = new C09520eE();
        C40731sm.A0e(c09520eE, 6, str, i2);
        c09520eE.A04 = Long.valueOf(j2);
        c09520eE.A03 = Long.valueOf(i);
        anonymousClass011.A0B(c09520eE, null, false);
        C59232sQ c59232sQ = storageUsageGalleryActivity.A0G;
        if (c59232sQ != null) {
            c59232sQ.clear();
        }
        C0U0 c0u0 = storageUsageGalleryActivity.A06;
        if (c0u0 != null) {
            c0u0.A05();
        }
        if (j2 > 0) {
            StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = new StorageUsageDeleteCompleteDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("deleted_disk_size", j2);
            storageUsageDeleteCompleteDialogFragment.A0P(bundle);
            storageUsageDeleteCompleteDialogFragment.A14(storageUsageGalleryActivity.A0N(), null);
        }
        storageUsageGalleryActivity.A0f = null;
    }
}
