package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.0I1 */
/* loaded from: classes.dex */
public class C0I1 extends AbstractC011105n implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xS
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0I1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0I1[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "broadcast";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 3;
    }

    public C0I1(Parcel parcel) {
        super(parcel);
    }

    public C0I1(String str) {
        super(str);
        char charAt;
        int i;
        int length = str.length();
        if (length >= 1 && length <= 20 && (charAt = str.charAt(0)) >= '1' && charAt <= '9') {
            while (i < length) {
                char charAt2 = str.charAt(i);
                i = (charAt2 >= '0' && charAt2 <= '9') ? i + 1 : 1;
            }
            return;
        }
        throw new C011305p(str);
    }

    public static C0I1 A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof C0I1) {
                return (C0I1) jid;
            }
            throw new C011305p(str);
        } catch (C011305p unused) {
            return null;
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass024.A0J(this.user, 4));
        sb.append('@');
        sb.append("broadcast");
        return sb.toString();
    }
}
