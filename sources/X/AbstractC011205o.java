package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.05o */
/* loaded from: classes.dex */
public abstract class AbstractC011205o extends AbstractC005302j implements Parcelable {
    public AbstractC011205o(Parcel parcel) {
        super(parcel);
    }

    public AbstractC011205o(String str) {
        super(str);
    }

    public static AbstractC011205o A05(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AbstractC011205o) {
                return (AbstractC011205o) jid;
            }
            throw new C011305p(str);
        } catch (C011305p unused) {
            return null;
        }
    }
}
