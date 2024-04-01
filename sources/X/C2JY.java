package X;

import com.whatsapp.invites.ViewGroupInviteActivity;

/* renamed from: X.2JY  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2JY implements InterfaceC06360St {
    public final /* synthetic */ ViewGroupInviteActivity A00;

    public C2JY(ViewGroupInviteActivity viewGroupInviteActivity) {
        this.A00 = viewGroupInviteActivity;
    }

    @Override // X.InterfaceC06360St
    public void AJp(int i) {
        C000200d.A0r("ViewGroupInviteActivity/failed-to-get-group-photo/", i);
    }

    @Override // X.InterfaceC06360St
    public void AKu(C011005l c011005l, String str, String str2, String str3, byte[] bArr) {
        C018508q c018508q = this.A00.A07;
        c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(this, bArr, 31));
    }
}
