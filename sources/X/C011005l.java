package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.05l */
/* loaded from: classes.dex */
public class C011005l extends GroupJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xX
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C011005l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C011005l[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "g.us";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 1;
    }

    public C011005l(Parcel parcel) {
        super(parcel);
    }

    public C011005l(String str) {
        super(str);
        String substring;
        int length;
        char charAt;
        char charAt2;
        int i;
        int indexOf = str.indexOf(45);
        if (indexOf == -1) {
            int length2 = str.length();
            if (length2 >= 1 && length2 <= 20 && (charAt2 = str.charAt(0)) >= '1' && charAt2 <= '9') {
                while (i < length2) {
                    char charAt3 = str.charAt(i);
                    i = (charAt3 >= '0' && charAt3 <= '9') ? i + 1 : 1;
                }
                return;
            }
        } else if (indexOf != 0 && indexOf != str.length() && UserJid.isValidRegularUser(str.substring(0, indexOf)) && (length = (substring = str.substring(indexOf + 1)).length()) == 10 && (charAt = substring.charAt(0)) >= '1' && charAt <= '9') {
            int i2 = 1;
            do {
                char charAt4 = substring.charAt(i2);
                if (charAt4 >= '0' && charAt4 <= '9') {
                    i2++;
                }
            } while (i2 < length);
            return;
        }
        throw new C011305p(str);
    }

    public static C011005l A03(Jid jid) {
        if (jid instanceof C011005l) {
            return (C011005l) jid;
        }
        return null;
    }

    public static C011005l A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof C011005l) {
                return (C011005l) jid;
            }
            throw new C011305p(str);
        } catch (C011305p unused) {
            return null;
        }
    }

    @Override // com.whatsapp.jid.Jid
    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass024.A0J(this.user, 15));
        sb.append('@');
        sb.append("g.us");
        return sb.toString();
    }
}
