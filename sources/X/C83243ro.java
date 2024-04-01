package X;

import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ro  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83243ro implements InterfaceC53992hs {
    public final /* synthetic */ StorageUsageGalleryActivity A00;

    @Override // X.InterfaceC53992hs
    public void AJG(AbstractC005302j abstractC005302j, C27631Od c27631Od) {
    }

    public C83243ro(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        this.A00 = storageUsageGalleryActivity;
    }

    @Override // X.InterfaceC53992hs
    public void AIM(C60092tu c60092tu) {
        ArrayList arrayList = c60092tu.A00;
        C018508q c018508q = ((ActivityC02290Ap) this.A00).A0A;
        c018508q.A02.post(new RunnableEBaseShape6S0200000_I1(this, arrayList, 16));
    }

    @Override // X.InterfaceC53992hs
    public void AIN(C60102tv c60102tv) {
        List list = c60102tv.A00;
        C018508q c018508q = ((ActivityC02290Ap) this.A00).A0A;
        c018508q.A02.post(new RunnableEBaseShape6S0200000_I1(this, list, 16));
    }
}
