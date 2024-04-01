package X;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* renamed from: X.1bY */
/* loaded from: classes.dex */
public class C31001bY extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15X
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            IBinder iBinder = null;
            Scope[] scopeArr = null;
            Bundle bundle = null;
            Account account = null;
            C30461ac[] c30461acArr = null;
            C30461ac[] c30461acArr2 = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 2:
                        i2 = C07K.A0A(parcel, readInt);
                        break;
                    case 3:
                        i3 = C07K.A0A(parcel, readInt);
                        break;
                    case 4:
                        str = C07K.A0u(parcel, readInt);
                        break;
                    case 5:
                        iBinder = C07K.A0U(parcel, readInt);
                        break;
                    case 6:
                        scopeArr = (Scope[]) C07K.A1r(parcel, readInt, Scope.CREATOR);
                        break;
                    case 7:
                        bundle = C07K.A0T(parcel, readInt);
                        break;
                    case 8:
                        account = (Account) C07K.A0W(parcel, readInt, Account.CREATOR);
                        break;
                    case 9:
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                    case 10:
                        c30461acArr = (C30461ac[]) C07K.A1r(parcel, readInt, C30461ac.CREATOR);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        c30461acArr2 = (C30461ac[]) C07K.A1r(parcel, readInt, C30461ac.CREATOR);
                        break;
                    case 12:
                        z = C07K.A1i(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new C31001bY(i, i2, i3, str, iBinder, scopeArr, bundle, account, c30461acArr, c30461acArr2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31001bY[i];
        }
    };
    public int A00;
    public Account A01;
    public Bundle A02;
    public IBinder A03;
    public String A04;
    public boolean A05;
    public C30461ac[] A06;
    public C30461ac[] A07;
    public Scope[] A08;
    public final int A09;
    public final int A0A;

    public C31001bY(int i) {
        this.A09 = 4;
        this.A00 = 12451000;
        this.A0A = i;
        this.A05 = true;
    }

    public C31001bY(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C30461ac[] c30461acArr, C30461ac[] c30461acArr2, boolean z) {
        IAccountAccessor c31011bZ;
        this.A09 = i;
        this.A0A = i2;
        this.A00 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A04 = "com.google.android.gms";
        } else {
            this.A04 = str;
        }
        if (i >= 2) {
            this.A03 = iBinder;
            this.A01 = account;
        } else {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof IAccountAccessor) {
                    c31011bZ = (IAccountAccessor) queryLocalInterface;
                } else {
                    c31011bZ = new C31011bZ(iBinder);
                }
                if (c31011bZ != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = c31011bZ.A8F();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                account2 = null;
            }
            this.A01 = account2;
        }
        this.A08 = scopeArr;
        this.A02 = bundle;
        this.A06 = c30461acArr;
        this.A07 = c30461acArr2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A09);
        AnonymousClass088.A1G(parcel, 2, this.A0A);
        AnonymousClass088.A1G(parcel, 3, this.A00);
        AnonymousClass088.A1M(parcel, 4, this.A04, false);
        AnonymousClass088.A1K(parcel, 5, this.A03);
        AnonymousClass088.A1R(parcel, 6, this.A08, i);
        AnonymousClass088.A1J(parcel, 7, this.A02);
        AnonymousClass088.A1L(parcel, 8, this.A01, i, false);
        AnonymousClass088.A1R(parcel, 10, this.A06, i);
        AnonymousClass088.A1R(parcel, 11, this.A07, i);
        AnonymousClass088.A1P(parcel, 12, this.A05);
        AnonymousClass088.A1D(parcel, A03);
    }
}
