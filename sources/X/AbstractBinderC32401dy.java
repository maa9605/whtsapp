package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.1dy */
/* loaded from: classes.dex */
public abstract class AbstractBinderC32401dy extends AnonymousClass182 implements InterfaceC241619s {
    @Override // X.AnonymousClass182
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                AnonymousClass183.A00(parcel, C32341ds.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                AnonymousClass183.A00(parcel, C32481e7.CREATOR);
                throw new UnsupportedOperationException();
            case 4:
                AnonymousClass183.A00(parcel, C32371dv.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                AnonymousClass183.A00(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            case 6:
                AnonymousClass183.A00(parcel, C32261dk.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                AnonymousClass183.A00(parcel, C32501e9.CREATOR);
                throw new UnsupportedOperationException();
            case 8:
                AnonymousClass183.A00(parcel, C32381dw.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                AnonymousClass183.A00(parcel, C32391dx.CREATOR);
                throw new UnsupportedOperationException();
            case 10:
                AWx((C32361du) AnonymousClass183.A00(parcel, C32361du.CREATOR));
                break;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                AWn((Status) AnonymousClass183.A00(parcel, Status.CREATOR));
                break;
            case 12:
                AnonymousClass183.A00(parcel, C32511eA.CREATOR);
                throw new UnsupportedOperationException();
            case 13:
                AnonymousClass183.A00(parcel, C32351dt.CREATOR);
                throw new UnsupportedOperationException();
            case 14:
                AnonymousClass183.A00(parcel, C32461e5.CREATOR);
                throw new UnsupportedOperationException();
            case 15:
                AnonymousClass183.A00(parcel, C32231dh.CREATOR);
                throw new UnsupportedOperationException();
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                AnonymousClass183.A00(parcel, C32231dh.CREATOR);
                throw new UnsupportedOperationException();
            case 17:
                AnonymousClass183.A00(parcel, C32291dn.CREATOR);
                throw new UnsupportedOperationException();
            case 18:
                AnonymousClass183.A00(parcel, C32301do.CREATOR);
                throw new UnsupportedOperationException();
            case 19:
                AnonymousClass183.A00(parcel, C32211df.CREATOR);
                throw new UnsupportedOperationException();
            case C0M6.A01 /* 20 */:
                AnonymousClass183.A00(parcel, C32221dg.CREATOR);
                throw new UnsupportedOperationException();
            case 21:
            case 24:
            case 25:
            default:
                return false;
            case 22:
                AnonymousClass183.A00(parcel, C32281dm.CREATOR);
                throw new UnsupportedOperationException();
            case 23:
                AnonymousClass183.A00(parcel, C32271dl.CREATOR);
                throw new UnsupportedOperationException();
            case 26:
                AnonymousClass183.A00(parcel, C32431e1.CREATOR);
                throw new UnsupportedOperationException();
            case 27:
                AnonymousClass183.A00(parcel, C32491e8.CREATOR);
                throw new UnsupportedOperationException();
            case 28:
                AnonymousClass183.A00(parcel, C32311dp.CREATOR);
                throw new UnsupportedOperationException();
            case 29:
                AnonymousClass183.A00(parcel, C32331dr.CREATOR);
                throw new UnsupportedOperationException();
            case 30:
                AnonymousClass183.A00(parcel, C32321dq.CREATOR);
                throw new UnsupportedOperationException();
        }
        parcel2.writeNoException();
        return true;
    }
}
