package X;

import android.app.Activity;
import com.whatsapp.storage.StorageUsageActivity;

/* renamed from: X.3kC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C78593kC implements InterfaceC06590Tz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C78593kC(Activity activity, String str, int i) {
        this.A01 = activity;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC06590Tz
    public final void AIT() {
        Activity activity = this.A01;
        activity.startActivity(StorageUsageActivity.A00(activity.getApplicationContext(), this.A02, this.A00));
    }
}
