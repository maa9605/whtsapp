package X;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.06o */
/* loaded from: classes.dex */
public interface InterfaceC013706o extends Parcelable {
    String A7z(C002301c c002301c, C014006r c014006r);

    String A80(C002301c c002301c, BigDecimal bigDecimal);

    String A81(C002301c c002301c, C014006r c014006r);

    String A82(C002301c c002301c, C014006r c014006r, int i);

    String A83(C002301c c002301c, BigDecimal bigDecimal);

    String A84(C002301c c002301c, BigDecimal bigDecimal, int i);

    BigDecimal A87(C002301c c002301c, String str);

    String A9K();

    CharSequence A9L(Context context);

    CharSequence A9M(Context context, int i);

    String A9O();

    String A9P(C002301c c002301c);

    int A9Q();

    int A9i();

    C014006r AB6();

    C014006r ABR();

    int ADP(C002301c c002301c);

    void ATK(C014006r c014006r);

    JSONObject AVY();

    @Override // android.os.Parcelable
    void writeToParcel(Parcel parcel, int i);
}
