package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1bt */
/* loaded from: classes.dex */
public class C31211bt extends C08G {
    public static final C231315i CREATOR = new Parcelable.Creator() { // from class: X.15i
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            String str2 = null;
            C31201bs c31201bs = null;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            boolean z2 = false;
            int i4 = 0;
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
                        z = C07K.A1i(parcel, readInt);
                        break;
                    case 4:
                        i3 = C07K.A0A(parcel, readInt);
                        break;
                    case 5:
                        z2 = C07K.A1i(parcel, readInt);
                        break;
                    case 6:
                        str = C07K.A0u(parcel, readInt);
                        break;
                    case 7:
                        i4 = C07K.A0A(parcel, readInt);
                        break;
                    case 8:
                        str2 = C07K.A0u(parcel, readInt);
                        break;
                    case 9:
                        c31201bs = (C31201bs) C07K.A0W(parcel, readInt, C31201bs.CREATOR);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new C31211bt(i, i2, z, i3, z2, str, i4, str2, c31201bs);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31211bt[i];
        }
    };
    public InterfaceC231115g A00;
    public C31231bv A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Class A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public C31211bt(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, C31201bs c31201bs) {
        this.A02 = i;
        this.A03 = i2;
        this.A09 = z;
        this.A04 = i3;
        this.A0A = z2;
        this.A07 = str;
        this.A05 = i4;
        if (str2 == null) {
            this.A06 = null;
            this.A08 = null;
        } else {
            this.A06 = C39691qX.class;
            this.A08 = str2;
        }
        if (c31201bs == null) {
            this.A00 = null;
            return;
        }
        C31191br c31191br = c31201bs.A01;
        if (c31191br == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.A00 = c31191br;
    }

    public C31211bt(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
        this.A02 = 1;
        this.A03 = i;
        this.A09 = z;
        this.A04 = i2;
        this.A0A = z2;
        this.A07 = str;
        this.A05 = i3;
        this.A06 = cls;
        if (cls == null) {
            this.A08 = null;
        } else {
            this.A08 = cls.getCanonicalName();
        }
        this.A00 = null;
    }

    public static C31211bt A00(String str, int i) {
        return new C31211bt(7, true, 7, true, str, i, null);
    }

    public String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("versionCode", Integer.valueOf(this.A02));
        A0q.A00("typeIn", Integer.valueOf(this.A03));
        A0q.A00("typeInArray", Boolean.valueOf(this.A09));
        A0q.A00("typeOut", Integer.valueOf(this.A04));
        A0q.A00("typeOutArray", Boolean.valueOf(this.A0A));
        A0q.A00("outputFieldName", this.A07);
        A0q.A00("safeParcelFieldId", Integer.valueOf(this.A05));
        String str = this.A08;
        if (str == null) {
            str = null;
        }
        A0q.A00("concreteTypeName", str);
        Class cls = this.A06;
        if (cls != null) {
            A0q.A00("concreteType.class", cls.getCanonicalName());
        }
        InterfaceC231115g interfaceC231115g = this.A00;
        if (interfaceC231115g != null) {
            A0q.A00("converterName", interfaceC231115g.getClass().getCanonicalName());
        }
        return A0q.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A02);
        AnonymousClass088.A1G(parcel, 2, this.A03);
        AnonymousClass088.A1P(parcel, 3, this.A09);
        AnonymousClass088.A1G(parcel, 4, this.A04);
        AnonymousClass088.A1P(parcel, 5, this.A0A);
        AnonymousClass088.A1M(parcel, 6, this.A07, false);
        AnonymousClass088.A1G(parcel, 7, this.A05);
        String str = this.A08;
        C31201bs c31201bs = null;
        if (str == null) {
            str = null;
        }
        AnonymousClass088.A1M(parcel, 8, str, false);
        InterfaceC231115g interfaceC231115g = this.A00;
        if (interfaceC231115g != null) {
            if (interfaceC231115g instanceof C31191br) {
                c31201bs = new C31201bs((C31191br) interfaceC231115g);
            } else {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
        }
        AnonymousClass088.A1L(parcel, 9, c31201bs, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
