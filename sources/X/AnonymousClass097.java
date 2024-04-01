package X;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.MediaData;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.097 */
/* loaded from: classes.dex */
public abstract class AnonymousClass097 extends AnonymousClass092 {
    public int A00;
    public long A01;
    public C09H A02;
    public C04030Id A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public abstract AnonymousClass097 A19(AnonymousClass094 anonymousClass094, long j, C09H c09h);

    public boolean A1G() {
        return false;
    }

    public AnonymousClass097(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
    }

    public AnonymousClass097(AnonymousClass097 anonymousClass097, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z, byte b) {
        super(anonymousClass097, anonymousClass094, j, z, b);
        this.A02 = c09h;
        this.A04 = anonymousClass097.A04;
        this.A00 = anonymousClass097.A00;
        this.A05 = anonymousClass097.A05;
        this.A06 = anonymousClass097.A06;
        this.A07 = anonymousClass097.A07;
        this.A08 = anonymousClass097.A08;
        this.A01 = anonymousClass097.A01;
        this.A09 = anonymousClass097.A09;
        this.A0A = anonymousClass097.A0A;
        C04030Id A18 = anonymousClass097.A18();
        if (A18 != null) {
            if (A18.A05()) {
                C04030Id A182 = A18();
                if (A182 != null) {
                    A182.A03(A18.A06(), A18.A07());
                    return;
                }
                throw null;
            }
            StringBuilder A0P = C000200d.A0P("FMessageVideo/Cloned message should have sidecar, but original message doesn't have it: sidecar=");
            A0P.append(this.A03);
            Log.e(A0P.toString());
        }
    }

    @Override // X.AnonymousClass092
    public int A04() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public long A08() {
        return this.A01;
    }

    @Override // X.AnonymousClass092
    public Object A0F() {
        C09H c09h = this.A02;
        if (c09h == null) {
            return null;
        }
        return c09h.A01();
    }

    @Override // X.AnonymousClass092
    public String A0H() {
        return this.A0A;
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        return this.A04;
    }

    @Override // X.AnonymousClass092
    public String A0K() {
        return this.A05;
    }

    @Override // X.AnonymousClass092
    public String A0L() {
        return this.A06;
    }

    @Override // X.AnonymousClass092
    public String A0M() {
        return this.A07;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        return this.A08;
    }

    @Override // X.AnonymousClass092
    public String A0O() {
        return this.A09;
    }

    @Override // X.AnonymousClass092
    public void A0W(int i) {
        this.A00 = i;
    }

    @Override // X.AnonymousClass092
    public void A0a(long j) {
        this.A01 = j;
    }

    @Override // X.AnonymousClass092
    public void A0k(Object obj) {
        if (obj instanceof C09H) {
            this.A02 = (C09H) obj;
        } else if (obj instanceof MediaData) {
            this.A02 = C09H.A00((MediaData) obj);
        } else {
            StringBuilder A0P = C000200d.A0P("FMessageMedia/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
            A0P.append(obj == null ? "null" : obj.getClass());
            Log.e(A0P.toString());
            this.A02 = new C09H();
        }
    }

    @Override // X.AnonymousClass092
    public void A0m(String str) {
        this.A0A = str;
        if (!TextUtils.isEmpty(str)) {
            A0U(64);
            return;
        }
        super.A05 = (64 ^ (-1)) & super.A05;
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        this.A04 = str;
    }

    @Override // X.AnonymousClass092
    public void A0p(String str) {
        this.A05 = str;
    }

    @Override // X.AnonymousClass092
    public void A0q(String str) {
        this.A06 = str;
    }

    @Override // X.AnonymousClass092
    public void A0r(String str) {
        this.A07 = str;
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        this.A08 = str;
    }

    @Override // X.AnonymousClass092
    public void A0t(String str) {
        this.A09 = str;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return this.A04;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        this.A04 = str;
    }

    public C04030Id A18() {
        C04030Id c04030Id;
        synchronized (this.A0o) {
            c04030Id = this.A03;
            if (c04030Id == null && C04030Id.A00(C0DC.A02(this))) {
                c04030Id = new C04030Id(this);
                this.A03 = c04030Id;
            }
        }
        return c04030Id;
    }

    public String A1A() {
        return this.A04;
    }

    public String A1B() {
        return this.A08;
    }

    public void A1C(Cursor cursor, C09H c09h) {
        this.A02 = c09h;
        A0m(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A09 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
    }

    public void A1D(Cursor cursor, C09H c09h) {
        this.A02 = c09h;
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A09 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
        C03900Hp A0E = A0E();
        if (A0E != null) {
            A0E.A04(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
        }
    }

    public void A1E(String str) {
        AnonymousClass094 anonymousClass094 = this.A0n;
        if (TextUtils.isEmpty(str)) {
            C000200d.A10("MessageUtil/isValidIncomingUrl/error empty media url received. message.key=", anonymousClass094);
        } else {
            Uri parse = Uri.parse(str);
            if (!"https".equalsIgnoreCase(parse.getScheme())) {
                StringBuilder sb = new StringBuilder("MessageUtil/isValidIncomingUrl/error invalid scheme on received media url; url=");
                sb.append(str);
                sb.append("; message.key=");
                sb.append(anonymousClass094);
                Log.w(sb.toString());
            } else if (!TextUtils.isEmpty(parse.getHost()) && parse.getHost().endsWith(".whatsapp.net")) {
                this.A09 = str;
                return;
            } else {
                StringBuilder sb2 = new StringBuilder("MessageUtil/isValidIncomingUrl/error invalid host on received media url; url=");
                sb2.append(str);
                sb2.append("; message.key=");
                sb2.append(anonymousClass094);
                Log.w(sb2.toString());
            }
        }
        throw new C22W(15);
    }

    public boolean A1F() {
        File file;
        C09H c09h = this.A02;
        return (c09h == null || (file = c09h.A0F) == null || !file.canRead()) ? false : true;
    }
}
