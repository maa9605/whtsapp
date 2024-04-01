package X;

import android.database.ContentObserver;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.2Gf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48672Gf extends ContentObserver {
    public final /* synthetic */ C48682Gg A00;

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48672Gf(C48682Gg c48682Gg) {
        super(null);
        this.A00 = c48682Gg;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        ((MediaViewBaseFragment) this.A00.A07).A09.post(new RunnableEBaseShape4S0100000_I0_4(this, 7));
    }
}
