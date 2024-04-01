package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.02j */
/* loaded from: classes.dex */
public abstract class AbstractC005302j extends Jid implements Parcelable {
    public AbstractC005302j(Parcel parcel) {
        super(parcel);
    }

    public AbstractC005302j(String str) {
        super(str);
    }

    public static AbstractC005302j A00(Jid jid) {
        if (jid instanceof AbstractC005302j) {
            return (AbstractC005302j) jid;
        }
        return null;
    }

    public static AbstractC005302j A01(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof AbstractC005302j) {
            return (AbstractC005302j) jid;
        }
        throw new C011305p(str);
    }

    public static AbstractC005302j A02(String str) {
        AbstractC005302j abstractC005302j = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            abstractC005302j = A01(str);
            return abstractC005302j;
        } catch (C011305p unused) {
            return abstractC005302j;
        }
    }
}
