package X;

import com.whatsapp.util.Log;

/* renamed from: X.35p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C650235p implements C1u7 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C49182Ix A01;
    public final /* synthetic */ String A02;

    public C650235p(C49182Ix c49182Ix, long j, String str) {
        this.A01 = c49182Ix;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // X.C1u7
    public void APT() {
        Log.i("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeleted");
        C49182Ix c49182Ix = this.A01;
        c49182Ix.A07.A07(true, this.A00);
        c49182Ix.A06.A01(this);
        C018508q c018508q = c49182Ix.A02;
        c018508q.A02.post(new RunnableEBaseShape1S1100000_I1(this, this.A02, 1));
    }

    @Override // X.C1u7
    public void APU() {
        Log.e("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeletionFailed");
        C49182Ix c49182Ix = this.A01;
        c49182Ix.A07.A07(false, this.A00);
        c49182Ix.A06.A01(this);
        C018508q c018508q = c49182Ix.A02;
        c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(c49182Ix.A0E, 15));
    }
}
