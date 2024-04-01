package X;

import java.net.InetAddress;

/* renamed from: X.0af  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08120af {
    public int A00;
    public boolean A01;
    public final C08180ar A02;
    public final boolean A03;
    public final InetAddress[] A04;

    public C08120af(C08180ar c08180ar, InetAddress inetAddress, int i, boolean z) {
        this.A00 = i;
        this.A02 = c08180ar;
        this.A04 = new InetAddress[]{inetAddress};
        this.A03 = z;
    }

    public C08120af(C08180ar c08180ar, InetAddress[] inetAddressArr) {
        this.A00 = -1;
        this.A02 = c08180ar;
        this.A04 = inetAddressArr;
        this.A03 = false;
    }
}
