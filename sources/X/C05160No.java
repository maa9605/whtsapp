package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0No */
/* loaded from: classes.dex */
public class C05160No extends GroupJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xW
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C05160No(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C05160No[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "temp";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 2;
    }

    public C05160No(Parcel parcel) {
        super(parcel);
    }

    public C05160No(String str) {
        super(str);
        if (!str.contains("-")) {
            throw new C011305p(C000200d.A0H("Invalid group id: ", str));
        }
    }

    public static C05160No A03(C02L c02l, String str) {
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            StringBuilder sb = new StringBuilder();
            String str2 = userJid.user;
            if (str2 != null) {
                C000200d.A1U(sb, str2, "-", str, "@");
                sb.append("temp");
                return A04(sb.toString());
            }
            throw null;
        }
        throw null;
    }

    public static C05160No A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof C05160No) {
                return (C05160No) jid;
            }
            throw new C011305p(str);
        } catch (C011305p unused) {
            return null;
        }
    }
}
