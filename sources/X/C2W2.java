package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.2W2  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2W2 extends C2W3 {
    public abstract void A0j(List list, boolean z);

    public abstract int getMaxAlbumSize();

    @Override // X.AbstractC48182Ef
    public abstract int getMessageCount();

    public abstract int getMinAlbumSize();

    public C2W2(Context context, AnonymousClass097 anonymousClass097) {
        super(context, anonymousClass097);
    }

    public static int A00(AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        return (b == 1 || b == 3) ? TextUtils.isEmpty(((AnonymousClass097) anonymousClass092).A1A()) ? 1 : -1 : b == 20 ? 2 : -1;
    }
}
