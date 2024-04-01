package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Arrays;

/* renamed from: X.1ab */
/* loaded from: classes.dex */
public final class C30451ab extends C08G {
    public static final C30451ab A04 = new C30451ab(0);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.162
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            PendingIntent pendingIntent = null;
            String str = null;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i3 == 2) {
                    i2 = C07K.A0A(parcel, readInt);
                } else if (i3 == 3) {
                    pendingIntent = (PendingIntent) C07K.A0W(parcel, readInt, PendingIntent.CREATOR);
                } else if (i3 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C30451ab(i, i2, pendingIntent, str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C30451ab[i];
        }
    };
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public C30451ab(int i) {
        this.A00 = 1;
        this.A01 = i;
        this.A02 = null;
        this.A03 = null;
    }

    public C30451ab(int i, int i2, PendingIntent pendingIntent, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public C30451ab(int i, PendingIntent pendingIntent) {
        this.A00 = 1;
        this.A01 = i;
        this.A02 = pendingIntent;
        this.A03 = null;
    }

    public static String A00(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case C0M6.A01 /* 20 */:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            default:
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("UNKNOWN_ERROR_CODE(");
                                sb.append(i);
                                sb.append(")");
                                return sb.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean A01() {
        return (this.A01 == 0 || this.A02 == null) ? false : true;
    }

    public final boolean A02() {
        return this.A01 == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30451ab) {
            C30451ab c30451ab = (C30451ab) obj;
            return this.A01 == c30451ab.A01 && C07K.A1k(this.A02, c30451ab.A02) && C07K.A1k(this.A03, c30451ab.A03);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), this.A02, this.A03});
    }

    public final String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("statusCode", A00(this.A01));
        A0q.A00("resolution", this.A02);
        A0q.A00("message", this.A03);
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1G(parcel, 2, this.A01);
        AnonymousClass088.A1L(parcel, 3, this.A02, i, false);
        AnonymousClass088.A1M(parcel, 4, this.A03, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
