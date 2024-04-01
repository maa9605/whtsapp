package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Kc */
/* loaded from: classes.dex */
public class C04420Kc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TX
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C04420Kc(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C04420Kc[i];
        }
    };
    public final long A00;
    public final Jid A01;
    public final Jid A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public C02590Ca A01() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C04420Kc(C04420Kc c04420Kc) {
        this.A01 = c04420Kc.A01;
        this.A05 = "call";
        this.A07 = c04420Kc.A07;
        this.A08 = c04420Kc.A08;
        this.A04 = null;
        this.A02 = c04420Kc.A02;
        this.A03 = c04420Kc.A03;
        this.A06 = null;
        this.A00 = c04420Kc.A00;
        List list = c04420Kc.A09;
        this.A09 = list != null ? new ArrayList(list) : null;
    }

    public C04420Kc(Parcel parcel) {
        this.A01 = (Jid) parcel.readParcelable(Jid.class.getClassLoader());
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A02 = (Jid) parcel.readParcelable(Jid.class.getClassLoader());
        this.A03 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A06 = parcel.readString();
        this.A09 = parcel.createTypedArrayList(C04P.CREATOR);
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
    }

    public C04420Kc(Jid jid, String str, String str2, String str3, String str4, Jid jid2, UserJid userJid, String str5, long j, List list) {
        this.A01 = jid;
        this.A05 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A04 = str4;
        this.A02 = jid2;
        this.A03 = userJid;
        this.A06 = str5;
        this.A00 = j;
        this.A09 = list;
    }

    public UserJid A00() {
        return UserJid.of(C003101m.A04(this.A02));
    }

    public C1Q5 A02() {
        C1Q5 c1q5 = new C1Q5();
        c1q5.A00 = this.A01;
        c1q5.A04 = this.A05;
        c1q5.A06 = this.A07;
        c1q5.A07 = this.A08;
        c1q5.A03 = this.A04;
        c1q5.A01 = this.A02;
        c1q5.A02 = this.A03;
        c1q5.A05 = this.A06;
        List<C04P> list = this.A09;
        if (list != null) {
            for (C04P c04p : list) {
                c1q5.A08.put(c04p.A02, c04p);
            }
        }
        return c1q5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C04420Kc c04420Kc = (C04420Kc) obj;
            String str = this.A05;
            if (str == null) {
                if (c04420Kc.A05 != null) {
                    return false;
                }
            } else if (!str.equals(c04420Kc.A05)) {
                return false;
            }
            Jid jid = this.A01;
            if (jid == null) {
                if (c04420Kc.A01 != null) {
                    return false;
                }
            } else if (!jid.equals(c04420Kc.A01)) {
                return false;
            }
            String str2 = this.A07;
            if (str2 == null) {
                if (c04420Kc.A07 != null) {
                    return false;
                }
            } else if (!str2.equals(c04420Kc.A07)) {
                return false;
            }
            Jid jid2 = this.A02;
            if (jid2 == null) {
                if (c04420Kc.A02 != null) {
                    return false;
                }
            } else if (!jid2.equals(c04420Kc.A02)) {
                return false;
            }
            UserJid userJid = this.A03;
            if (userJid == null) {
                if (c04420Kc.A03 != null) {
                    return false;
                }
            } else if (!userJid.equals(c04420Kc.A03)) {
                return false;
            }
            String str3 = this.A08;
            if (str3 == null) {
                if (c04420Kc.A08 != null) {
                    return false;
                }
            } else if (!str3.equals(c04420Kc.A08)) {
                return false;
            }
            String str4 = this.A06;
            if (str4 == null) {
                if (c04420Kc.A06 != null) {
                    return false;
                }
            } else if (!str4.equals(c04420Kc.A06)) {
                return false;
            }
            List list = this.A09;
            if (list == null) {
                if (c04420Kc.A09 != null) {
                    return false;
                }
            } else if (!list.equals(c04420Kc.A09)) {
                return false;
            }
            return AnonymousClass024.A0l(this.A04, c04420Kc.A04);
        }
        return false;
    }

    public int hashCode() {
        String str = this.A05;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Jid jid = this.A01;
        int hashCode2 = (hashCode + (jid == null ? 0 : jid.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Jid jid2 = this.A02;
        int hashCode4 = (hashCode3 + (jid2 == null ? 0 : jid2.hashCode())) * 31;
        UserJid userJid = this.A03;
        int hashCode5 = (hashCode4 + (userJid == null ? 0 : userJid.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.A09;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.A04;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6;
        String obj7;
        StringBuilder A0P = C000200d.A0P("[StanzaKey");
        Jid jid = this.A01;
        String str = "";
        if (jid == null) {
            obj = "";
        } else {
            StringBuilder A0P2 = C000200d.A0P(" from=");
            A0P2.append(jid);
            obj = A0P2.toString();
        }
        A0P.append(obj);
        String str2 = this.A05;
        if (str2 == null) {
            obj2 = "";
        } else {
            StringBuilder A0P3 = C000200d.A0P(" cls=");
            A0P3.append(str2);
            obj2 = A0P3.toString();
        }
        A0P.append(obj2);
        String str3 = this.A07;
        if (str3 == null) {
            obj3 = "";
        } else {
            StringBuilder A0P4 = C000200d.A0P(" id=");
            A0P4.append(str3);
            obj3 = A0P4.toString();
        }
        A0P.append(obj3);
        String str4 = this.A08;
        if (str4 == null) {
            obj4 = "";
        } else {
            StringBuilder A0P5 = C000200d.A0P(" type=");
            A0P5.append(str4);
            obj4 = A0P5.toString();
        }
        A0P.append(obj4);
        String str5 = this.A04;
        if (str5 == null) {
            obj5 = "";
        } else {
            StringBuilder A0P6 = C000200d.A0P(" category=");
            A0P6.append(str5);
            obj5 = A0P6.toString();
        }
        A0P.append(obj5);
        Jid jid2 = this.A02;
        if (jid2 == null) {
            obj6 = "";
        } else {
            StringBuilder A0P7 = C000200d.A0P(" participant=");
            A0P7.append(jid2);
            obj6 = A0P7.toString();
        }
        A0P.append(obj6);
        UserJid userJid = this.A03;
        if (userJid == null) {
            obj7 = "";
        } else {
            StringBuilder A0P8 = C000200d.A0P(" recipient=");
            A0P8.append(userJid);
            obj7 = A0P8.toString();
        }
        A0P.append(obj7);
        String str6 = this.A06;
        if (str6 != null) {
            StringBuilder A0P9 = C000200d.A0P(" editVersion=");
            A0P9.append(str6);
            str = A0P9.toString();
        }
        A0P.append(str);
        A0P.append(" loggableStanzaId=");
        A0P.append(this.A00);
        A0P.append("]");
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeTypedList(this.A09);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
    }
}
