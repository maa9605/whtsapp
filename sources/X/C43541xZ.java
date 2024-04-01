package X;

import java.util.List;

/* renamed from: X.1xZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43541xZ {
    public final /* synthetic */ AbstractC43531xY A00;

    public C43541xZ(AbstractC43531xY abstractC43531xY) {
        this.A00 = abstractC43531xY;
    }

    public byte[] A00() {
        AbstractC43531xY abstractC43531xY = this.A00;
        C000700j.A07(abstractC43531xY.A02);
        List<Object> list = abstractC43531xY.A07;
        if (list.size() == 0) {
            return null;
        }
        int size = list.size();
        int i = abstractC43531xY.A03;
        byte[] bArr = new byte[size * i];
        int i2 = 0;
        for (Object obj : list) {
            System.arraycopy(obj, 0, bArr, i2, i);
            i2 += i;
        }
        return bArr;
    }
}
