package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2uB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60252uB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uA
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C60252uB(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C60252uB[i];
        }
    };
    public final String A00;
    public final List A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C60252uB(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readStringList(arrayList);
    }

    public C60252uB(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public static C60252uB A00(C02590Ca c02590Ca) {
        C02590Ca A0D = c02590Ca.A0D("kyc-actions-requested");
        if (A0D != null) {
            ArrayList arrayList = new ArrayList();
            String A0G = A0D.A0G("obligation");
            for (C02590Ca c02590Ca2 : A0D.A0H("upload-document")) {
                String A0G2 = c02590Ca2.A0G("type");
                if ("PROOF_OF_IDENTITY".equals(A0G2)) {
                    arrayList.add("UPLOAD_DOC_IDENTITY");
                } else if ("PROOF_OF_ADDRESS".equals(A0G2)) {
                    arrayList.add("UPLOAD_DOC_ADDRESS");
                } else {
                    C000200d.A13("PAY: KycActionsRequested/fromProtocolTreeNode non-supported action type: ", A0G2);
                    return null;
                }
            }
            if (A0D.A0D("verify-card") != null) {
                arrayList.add("VERIFY_CARD");
            }
            if (A0D.A0D("provide-ssn-last4") != null) {
                arrayList.add("PROVIDE_SSN_LAST4");
            }
            return new C60252uB(A0G, arrayList);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }
}
